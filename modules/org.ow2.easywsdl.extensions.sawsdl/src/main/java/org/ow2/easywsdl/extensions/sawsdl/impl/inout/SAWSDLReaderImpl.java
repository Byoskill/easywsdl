/**
 * easyWSDL - easyWSDL toolbox Platform.
 * Copyright (c) 2008,  eBM Websourcing
 * All rights reserved.
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the University of California, Berkeley nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE REGENTS AND CONTRIBUTORS BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.ow2.easywsdl.extensions.sawsdl.impl.inout;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.ow2.easywsdl.extensions.sawsdl.SAWSDLFactory;
import org.ow2.easywsdl.extensions.sawsdl.api.Description;
import org.ow2.easywsdl.extensions.sawsdl.api.SAWSDLException;
import org.ow2.easywsdl.extensions.sawsdl.api.SAWSDLReader;
import org.ow2.easywsdl.extensions.sawsdl.impl.SAWSDLJAXBContext;
import org.ow2.easywsdl.extensions.sawsdl.org.w3.ns.sawsdl.AttrExtensions;
import org.ow2.easywsdl.wsdl.WSDLFactory;
import org.ow2.easywsdl.wsdl.api.WSDLException;
import org.ow2.easywsdl.wsdl.api.WSDLReader;
import org.ow2.easywsdl.wsdl.api.WSDLReader.FeatureConstants;
import org.ow2.easywsdl.wsdl.api.abstractElmt.AbstractWSDLReaderImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;

/**
 * @author Nicolas Salatge - eBM WebSourcing
 */
public class SAWSDLReaderImpl implements SAWSDLReader {

    private WSDLReader reader = null;
    
    
    private SAWSDLJAXBContext jaxbcontext = null;


	public SAWSDLReaderImpl() throws SAWSDLException {
		try {
			WSDLFactory factory = WSDLFactory.newInstance();
			this.jaxbcontext = new SAWSDLJAXBContext();
			this.reader = factory.newWSDLReader();
			
		} catch (final WSDLException e) {
			throw new SAWSDLException(e);
		} 
	}

    public Object getFeature(final FeatureConstants name) {
        return this.reader.getFeature(name);
    }

    public Map<FeatureConstants, Object> getFeatures() {
        return this.reader.getFeatures();
    }

    public void setFeatures(final Map<FeatureConstants, Object> features) {
        ((AbstractWSDLReaderImpl) this.reader).setFeatures(features);
    }

    /**
     * {@inheritDoc} 
     * 
     */
    public Description read(final URL wsdlURL) throws SAWSDLException, IOException, URISyntaxException {
        try {
            InputSource inputSource = new InputSource(wsdlURL.openStream());
            inputSource.setSystemId(wsdlURL.toString());

            return this.read(inputSource);
        } catch (final MalformedURLException e) {
            throw new RuntimeException("The provided well-formed URL has been detected as malformed !!");
        } catch (final WSDLException e) {
            throw new SAWSDLException(e);
        }
    }

    /**
     * {@inheritDoc} 
     * 
     */
    public Description read(final Document wsdlDocument) throws SAWSDLException, URISyntaxException {
        try {
            // The DOM Document needs to be converted into an InputStource
            final ByteArrayOutputStream baos = new ByteArrayOutputStream();
            final StreamResult streamResult = new StreamResult(baos);
            // FIXME: The Transformer creation is not thread-safe
            final Transformer transformer = TransformerFactory.newInstance()
                    .newTransformer();
            transformer.transform(new DOMSource(wsdlDocument), streamResult);
            baos.flush();
            baos.close();

            final InputSource documentInputSource = new InputSource(
                    new ByteArrayInputStream(baos.toByteArray()));
            documentInputSource.setSystemId(wsdlDocument.getBaseURI());
            
            return this.read(documentInputSource);
        } catch (final TransformerConfigurationException e) {
            throw new SAWSDLException(e);
        } catch (final TransformerFactoryConfigurationError e) {
            throw new SAWSDLException(e);
        } catch (final TransformerException e) {
            throw new SAWSDLException(e);
        } catch (final IOException e) {
            throw new SAWSDLException(e);
        }
    }

    /**
     * {@inheritDoc} 
     * 
     */
    public Description read(final InputSource wsdlInputSource) throws SAWSDLException, MalformedURLException, URISyntaxException {
        try {
            final org.ow2.easywsdl.wsdl.api.Description desc = this.reader.read(wsdlInputSource);
            return SAWSDLFactory.newInstance().addSAWSDLElmt2Description(desc);
        } catch (final WSDLException e) {
            throw new SAWSDLException(e);
        }
    }

    public void setFeature(final FeatureConstants name, final Object value) throws WSDLException {
        this.reader.setFeature(name, value);
    }
    
    
    public JAXBElement<AttrExtensions> convertElement2AttrExtensions(final Element attExtElmt)
    throws WSDLException {
    	JAXBElement<AttrExtensions> res = null;
        try {
            res = this.jaxbcontext.getJaxbContext().createUnmarshaller().unmarshal(attExtElmt, AttrExtensions.class);
        } catch (final JAXBException e) {
            throw new WSDLException(
                    "Failed to build Java bindings from WSDL descriptor XML document", e);
        }
        return res;
    }

}

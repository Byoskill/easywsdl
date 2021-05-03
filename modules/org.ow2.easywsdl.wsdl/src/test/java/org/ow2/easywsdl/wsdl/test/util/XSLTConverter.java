/**
 * Dragon - SOA Governance Platform.
 * Copyright (c) 2008 EBM Websourcing, http://www.ebmwebsourcing.com/
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * -------------------------------------------------------------------------
 * XSLTConverter.java
 * -------------------------------------------------------------------------
 */

package org.ow2.easywsdl.wsdl.test.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.InputSource;

/**
 * @author ofabre - eBM WebSourcing
 * 
 */
public class XSLTConverter {

    private static final String CONVERTER_XSD = "/wsdl11to20.xsl";
    
    private final static XSLTConverter converter = new XSLTConverter();

    private Templates wsdl11to20;

    private XSLTConverter() {
        super();
    }

    static {
        XSLTConverter.converter.wsdl11to20 = XSLTConverter.generateTemplates();
    }
    
    public synchronized static XSLTConverter getInstance() {
        return XSLTConverter.converter;
    }

    public InputSource convert(final URL wsdlURL) {

        InputSource result = null;

        InputStream inputStream = null;
        try {
            inputStream = wsdlURL.openStream();
        } catch (final Exception e) {
            throw new RuntimeException("Can't read given WSDL URI - "
                    + e.getClass().getSimpleName() + " - " + e.getMessage());
        }

        final ByteArrayOutputStream outputStream = this.transform(new StreamSource(inputStream));

        final ByteArrayInputStream byteStream = new ByteArrayInputStream(outputStream.toByteArray());

        result = new InputSource(byteStream);

        return result;
    }

    private ByteArrayOutputStream transform(final Source xml) {
        try {
            final Transformer transformer = this.wsdl11to20.newTransformer();
            // TODO : Add possibility to use uri resolver if necessary
            // transformer.setURIResolver(uriResolver);
            final ByteArrayOutputStream outputStream = this.transformSource(xml, transformer);
            return outputStream;
        } catch (final TransformerConfigurationException e) {
            throw new RuntimeException("Can't create XSL transformer - "
                    + e.getClass().getSimpleName() + " - " + e.getMessage());
        } catch (final TransformerException e) {
            throw new RuntimeException(
                    "Can't transform XML content with the configured xsl sheet - "
                            + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }

    /**
     * 
     * @param xml
     * @param transformer
     * @param pipedInputStream
     * @return
     * @throws TransformerException
     */
    private ByteArrayOutputStream transformSource(final Source xml, final Transformer transformer)
            throws TransformerException {
        final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        final Result streamResult = new StreamResult(outputStream);
        transformer.transform(xml, streamResult);
        return outputStream;
    }

    private static Templates generateTemplates() {
        InputStream xslStream;
        // try to get the XSL from the filesystem
        xslStream = XSLTConverter.class.getResourceAsStream(CONVERTER_XSD);

        try {
            return XSLTConverter.getTemplates(xslStream);
        } catch (final TransformerConfigurationException e) {
            throw new RuntimeException("Failed to build XSL templates - "
                    + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }

    /**
     * Retrieve the Templates associated to this XSL
     * 
     * @param xslResourceInputStream
     * @return
     * @throws TransformerConfigurationException
     *             Failed to create the XSL template
     */
    private static Templates getTemplates(final InputStream xslResourceInputStream)
            throws TransformerConfigurationException {
        if (xslResourceInputStream == null) {
            return null;
        }
        final Source source = new StreamSource(xslResourceInputStream);
        final TransformerFactory transformerFactory = new net.sf.saxon.TransformerFactoryImpl(); // TransformerFactory
        // .
        // newInstance
        // (
        // )
        // ;
        return transformerFactory.newTemplates(source);
    }
}

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
package org.ow2.easywsdl.wsdl.impl.wsdl11;

import java.io.StringWriter;
import java.util.Map;

import javax.xml.XMLConstants;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.lang.NotImplementedException;
import org.ow2.easywsdl.wsdl.api.Description;
import org.ow2.easywsdl.wsdl.api.WSDLException;
import org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl.TDefinitions;
import org.ow2.easywsdl.wsdl.util.CustomPrefixMapper;
import org.ow2.easywsdl.wsdl.util.Util;
import org.w3c.dom.Document;

/**
 * @author Nicolas Salatge - eBM WebSourcing
 */
public class WSDLWriterImpl implements org.ow2.easywsdl.wsdl.api.WSDLWriter {

	private DocumentBuilderFactory builder = null;

	private CustomPrefixMapper mapper = null;
	
	/*
	 * Private object initializations
	 */
	public WSDLWriterImpl() throws WSDLException {
		WSDLJAXBContext.getInstance();

		builder = DocumentBuilderFactory.newInstance();
		builder.setNamespaceAware(true);
	}

	
	private final Marshaller createMarshaller(Description wsdlDef, String schemaLocation) throws WSDLException {
		try {
			Marshaller marshaller = WSDLJAXBContext.getInstance().getJaxbContext().createMarshaller();
			marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", 
								   new CustomPrefixMapper(wsdlDef.getNamespaces().getPreDeclaredNamespaceUris()));
			if (schemaLocation != null) {
				marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, schemaLocation);
			}			
			return marshaller;
		 } catch (JAXBException je) {
			 throw new WSDLException(je);
		 }
	}
	
	
	@SuppressWarnings("unchecked")
	// TODO: change visibility to private
	public Document convertWSDL11Definition2DOMElement(Description wsdlDef, String schemaLocation) throws WSDLException {
		final TDefinitions wsdlDescriptor = ((org.ow2.easywsdl.wsdl.impl.wsdl11.DescriptionImpl) wsdlDef).getModel();
		Document doc = null;
		try {
			// FIXME: Following instruction is not thread-safe
			doc = builder.newDocumentBuilder().newDocument();

			// TODO : Check if it is a Thread safe method
			final JAXBElement element = new JAXBElement(new QName(Constants.WSDL_11_NAMESPACE, Constants.WSDL11_ROOT_TAG), 
					wsdlDescriptor.getClass(), wsdlDescriptor);

			Marshaller marshaller = createMarshaller(wsdlDef, schemaLocation);
			marshaller.marshal(element, doc);

		} catch (final JAXBException ex) {
			throw new WSDLException("Failed to build XML binding from WSDL descriptor Java classes", ex);
		} catch (final ParserConfigurationException ex) {
			throw new WSDLException("Failed to build XML binding from WSDL descriptor Java classes", ex);

		}
		return doc;
	}

	@SuppressWarnings("unchecked")
	// TODO: change visibility to private
	public String convertWSDL11Definition2String(Description wsdlDef, String schemaLocation) throws WSDLException {
		final TDefinitions wsdlDescriptor = ((org.ow2.easywsdl.wsdl.impl.wsdl11.DescriptionImpl) wsdlDef).getModel();

		try {
			final StringWriter stringWriter = new StringWriter();
			// TODO : Check if it is a Thread safe method

			final JAXBElement element = new JAXBElement(new QName(Constants.WSDL_11_NAMESPACE, Constants.WSDL11_ROOT_TAG), 
					wsdlDescriptor.getClass(), wsdlDescriptor);

			Marshaller marshaller = createMarshaller(wsdlDef, schemaLocation);
			marshaller.marshal(element, stringWriter);

			return stringWriter.toString();
		} catch (final JAXBException e) {
			throw new WSDLException("Failed to build XML binding from Agreement descriptor Java classes", e);
		}
	}

	
	private static final void appendMissingOriginalNamespaceDeclarations(final Description wsdlDef, Document doc) {
		for (Map.Entry<String, String> namespaceDefinition : 
			wsdlDef.getNamespaces().getNamespaces().entrySet()) {
			final String namespacePrefix = namespaceDefinition.getKey();
			final String namespaceURI = namespaceDefinition.getValue();
			if (doc.lookupNamespaceURI(namespacePrefix) != null) continue;
			
	        doc.getDocumentElement().setAttributeNS(XMLConstants.XMLNS_ATTRIBUTE_NS_URI, 
	        		XMLConstants.XMLNS_ATTRIBUTE + ":" + namespacePrefix, namespaceURI);
		}
	}
	
	
	public Document getDocument(final Description wsdlDef) throws WSDLException {
		Document doc = null;
		if ((wsdlDef != null) && (wsdlDef instanceof org.ow2.easywsdl.wsdl.impl.wsdl11.DescriptionImpl)) {
			try {
				String schemaLocation = Util.convertSchemaLocationIntoString(wsdlDef);
				doc = this.convertWSDL11Definition2DOMElement(wsdlDef, schemaLocation);
				if (wsdlDef.getDocumentBaseURI() != null) {
					doc.setDocumentURI(wsdlDef.getDocumentBaseURI().toString());
				} else {
					doc.setDocumentURI(".");
				}
				appendMissingOriginalNamespaceDeclarations(wsdlDef, doc);
			} catch (final WSDLException e) {
				throw new WSDLException("Can not write wsdl description", e);
			} 
		}
		return doc;
	}

	public boolean getFeature(final String name) throws IllegalArgumentException {
		throw new NotImplementedException();
	}

	public void setFeature(final String name, final boolean value) throws IllegalArgumentException {
		throw new NotImplementedException();
	}

	public String writeWSDL(final Description wsdlDef) throws WSDLException {
		String res = null;
		if ((wsdlDef != null) && (wsdlDef instanceof org.ow2.easywsdl.wsdl.impl.wsdl11.DescriptionImpl)) {
			try {
				String schemaLocation = Util.convertSchemaLocationIntoString(wsdlDef);

				res = this.convertWSDL11Definition2String(wsdlDef, schemaLocation);
			} catch (final WSDLException e) {
				throw new WSDLException("Can not write wsdl description", e);
			} 
		}
		return res;
	}

}

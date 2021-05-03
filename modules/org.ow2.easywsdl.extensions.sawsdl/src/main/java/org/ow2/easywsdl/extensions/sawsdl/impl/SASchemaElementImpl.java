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
package org.ow2.easywsdl.extensions.sawsdl.impl;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.xml.namespace.QName;

import org.ow2.easywsdl.extensions.sawsdl.api.SASchemaElement;
import org.ow2.easywsdl.extensions.sawsdl.api.SAWSDLException;
import org.ow2.easywsdl.schema.api.SchemaElement;
import org.ow2.easywsdl.schema.api.XmlException;

/**
 * Abstract super class for all WSDL Elements, providing some basic
 * common functionality.
 */

/**
 * @author Nicolas Salatge - eBM WebSourcing
 */
public class SASchemaElementImpl<T extends SchemaElement> extends SAWSDLElementImpl<T> implements SASchemaElement {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public SASchemaElementImpl(final T t) throws SAWSDLException {
		super(t);
	}

	public List<URI> getLiftingSchemaMapping() throws SAWSDLException {
		final List<URI> res = new ArrayList<URI>();
		try {
			final String val = this.tag.getOtherAttributes().get(
					new QName("http://www.w3.org/ns/sawsdl", "liftingSchemaMapping"));
			if ((val != null) && (!val.trim().equals(""))) {
				final StringTokenizer st = new StringTokenizer(val, " ");

				while (st.hasMoreTokens()) {
					res.add(new URI(st.nextToken()));
				}
			}
		} catch (final URISyntaxException e) {
			throw new SAWSDLException(e);
		} catch (final XmlException e) {
			throw new SAWSDLException(e);
		}
		return res;
	}

	public List<URI> getLoweringSchemaMapping() throws SAWSDLException {
		final List<URI> res = new ArrayList<URI>();
		try {
			final String val = this.tag.getOtherAttributes().get(
					new QName("http://www.w3.org/ns/sawsdl", "loweringSchemaMapping"));
			if ((val != null) && (!val.trim().equals(""))) {
				final StringTokenizer st = new StringTokenizer(val, " ");

				while (st.hasMoreTokens()) {
					res.add(new URI(st.nextToken()));
				}
			}
		} catch (final URISyntaxException e) {
			throw new SAWSDLException(e);
		} catch (final XmlException e) {
			throw new SAWSDLException(e);
		}
		return res;
	}

	public void addLiftingSchemaMapping(final URI uri) throws SAWSDLException {
		try {
			String val = this.tag.getOtherAttributes().get(
					new QName("http://www.w3.org/ns/sawsdl", "liftingSchemaMapping"));
			if ((val != null) && (!val.trim().equals(""))) {
				val = val + " " + uri.toString();
			} else {
				val = uri.toString();
			}
			this.tag.getOtherAttributes().put(
					new QName("http://www.w3.org/ns/sawsdl", "liftingSchemaMapping"), val);
		} catch (final XmlException e) {
			throw new SAWSDLException(e);
		}
	}

	public void addLoweringSchemaMapping(final URI uri) throws SAWSDLException {
		try {
			String val = this.tag.getOtherAttributes().get(
					new QName("http://www.w3.org/ns/sawsdl", "loweringSchemaMapping"));
			if ((val != null) && (!val.trim().equals(""))) {
				val = val + " " + uri.toString();
			} else {
				val = uri.toString();
			}
			this.tag.getOtherAttributes().put(
					new QName("http://www.w3.org/ns/sawsdl", "loweringSchemaMapping"), val);
		} catch (final XmlException e) {
			throw new SAWSDLException(e);
		}
	}

	public List<URI> removeAllLiftingSchemaMappings() throws SAWSDLException {
		final List<URI> res = this.getLiftingSchemaMapping();
		try {
			this.tag.getOtherAttributes().remove(
					new QName("http://www.w3.org/ns/sawsdl", "liftingSchemaMapping"));
		} catch (final XmlException e) {
			throw new SAWSDLException(e);
		}
		return res;
	}

	public List<URI> removeAllLoweringSchemaMappings() throws SAWSDLException {
		final List<URI> res = this.getLoweringSchemaMapping();
		try {
			this.tag.getOtherAttributes().remove(
					new QName("http://www.w3.org/ns/sawsdl", "loweringSchemaMapping"));
		} catch (final XmlException e) {
			throw new SAWSDLException(e);
		}
		return res;
	}

	public URI removeLiftingSchemaMapping(final URI uri) throws SAWSDLException {
		URI res = null;
		try {
			final String val = this.tag.getOtherAttributes().get(
					new QName("http://www.w3.org/ns/sawsdl", "liftingSchemaMapping"));
			if ((val != null) && (!val.trim().equals(""))) {
				final StringTokenizer st = new StringTokenizer(val, " ");

				String newVal = null;
				String currentToken = null;
				while (st.hasMoreTokens()) {
					currentToken = st.nextToken();
					if (uri.toString().equals(currentToken)) {
						res = new URI(currentToken);
					} else {
						if (newVal == null) {
							newVal = currentToken;
						} else {
							newVal = newVal + " " + currentToken;
						}
					}
				}

				if (newVal == null) {
					this.tag.getOtherAttributes().remove(
							new QName("http://www.w3.org/ns/sawsdl", "liftingSchemaMapping"));
				}
			}
		} catch (final XmlException e) {
			throw new SAWSDLException(e);
		} catch (final URISyntaxException e) {
			throw new SAWSDLException(e);
		}
		return res;
	}

	public URI removeLoweringSchemaMapping(final URI uri) throws SAWSDLException {
		URI res = null;
		try {
			final String val = this.tag.getOtherAttributes().get(
					new QName("http://www.w3.org/ns/sawsdl", "loweringSchemaMapping"));
			if ((val != null) && (!val.trim().equals(""))) {
				final StringTokenizer st = new StringTokenizer(val, " ");

				String newVal = null;
				String currentToken = null;
				while (st.hasMoreTokens()) {
					currentToken = st.nextToken();
					if (uri.toString().equals(currentToken)) {
						res = new URI(currentToken);
					} else {
						if (newVal == null) {
							newVal = currentToken;
						} else {
							newVal = newVal + " " + currentToken;
						}
					}
				}

				if (newVal == null) {
					this.tag.getOtherAttributes().remove(
							new QName("http://www.w3.org/ns/sawsdl", "loweringSchemaMapping"));
				}
			}
		} catch (final XmlException e) {
			throw new SAWSDLException(e);
		} catch (final URISyntaxException e) {
			throw new SAWSDLException(e);
		}
		return res;
	}

}

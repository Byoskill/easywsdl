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
package org.ow2.easywsdl.wsdl.test.wsdl;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.apache.woden.wsdl20.BindingFaultReference;
import org.apache.woden.wsdl20.BindingMessageReference;
import org.apache.woden.wsdl20.enumeration.Direction;
import org.apache.woden.wsdl20.extensions.ExtensionElement;
import org.apache.woden.wsdl20.extensions.ExtensionProperty;
import org.apache.woden.wsdl20.extensions.http.HTTPHeader;
import org.apache.woden.wsdl20.extensions.soap.SOAPHeaderBlock;
import org.apache.woden.wsdl20.extensions.soap.SOAPModule;
import org.ow2.easywsdl.schema.api.XmlException;
import org.ow2.easywsdl.wsdl.WSDLFactory;
import org.ow2.easywsdl.wsdl.api.BindingFault;
import org.ow2.easywsdl.wsdl.api.BindingOperation;
import org.ow2.easywsdl.wsdl.api.Description;
import org.ow2.easywsdl.wsdl.api.Endpoint;
import org.ow2.easywsdl.wsdl.api.Fault;
import org.ow2.easywsdl.wsdl.api.InterfaceType;
import org.ow2.easywsdl.wsdl.api.Operation;
import org.ow2.easywsdl.wsdl.api.Service;
import org.ow2.easywsdl.wsdl.api.WSDLException;
import org.ow2.easywsdl.wsdl.api.WSDLReader;
import org.ow2.easywsdl.wsdl.api.abstractItf.AbsItfBindingParam;
import org.ow2.easywsdl.wsdl.api.abstractItf.AbsItfBinding.BindingConstants;
import org.ow2.easywsdl.wsdl.test.util.XSLTConverter;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;


/**
 * @author Nicolas Salatge - eBM WebSourcing
 */
public class TestWodenComparison extends TestCase {

	public void testWoden() throws URISyntaxException, WSDLException,
	    org.apache.woden.WSDLException, XmlException, IOException, SAXException,
	    ParserConfigurationException, javax.wsdl.WSDLException {
		
		WSDLReader readerDesc = WSDLFactory.newInstance().newWSDLReader();
		org.apache.woden.WSDLReader readerDef = org.apache.woden.WSDLFactory.newInstance().newWSDLReader();
		
		// WSDL 1.1
		for (final URL wsdlUrl : WSDLList.getWsdls11()) {

			final InputSource easyWsdlInputSource = XSLTConverter.getInstance().convert(wsdlUrl);
            easyWsdlInputSource.setSystemId(wsdlUrl.toString());
            final Description desc = readerDesc.read(easyWsdlInputSource);

            // WSDL 1.1 must converted to WSDL 2.0 to be parsed by Woden.
            final InputSource wodenInputSource = XSLTConverter.getInstance().convert(wsdlUrl);
			final org.apache.woden.wsdl20.Description def = readerDef.readWSDL(
					new org.ow2.easywsdl.wsdl.test.util.BaseWSDLSource(wodenInputSource, wsdlUrl.toURI()));

			this.assertWithWodenModel(desc, def);

//			System.out.println("Test on: " + wsdl + " => OK");
		}

		for (final URL wsdlUrl : WSDLList.getWsdls20()) {
			final Description desc = readerDesc.read(wsdlUrl);
			final org.apache.woden.wsdl20.Description def = readerDef.readWSDL(wsdlUrl.toString());
			this.assertWithWodenModel(desc, def);
//			System.out.println("Test on: " + wsdl + " => OK");
		}

	}

	private void assertWithWodenModel(final Description desc,
			final org.apache.woden.wsdl20.Description def) throws WSDLException, URISyntaxException {
		// assert on description
		Assert.assertNotNull(desc);

		Assert.assertEquals(def.toElement().getTargetNamespace().toString(), desc
				.getTargetNamespace());
		Assert.assertTrue(def.toElement().getDocumentBaseURI().toString().contains(
				desc.getDocumentBaseURI().toString()));
		Assert.assertNull(desc.getQName());

		// assert on service
		Assert.assertEquals(def.getServices().length, desc.getServices().size());
		for (final org.apache.woden.wsdl20.Service expectedService : def.getServices()) {

			final Service actualService = desc.getService(expectedService.getName());
			Assert.assertNotNull(actualService);
			Assert.assertEquals(expectedService.getName(), actualService.getQName());

			if (expectedService.getInterface() != null) {
				Assert.assertEquals(expectedService.getInterface().getName(), actualService
						.getInterface().getQName());
			} else {
				Assert.assertNull(actualService.getInterface());
			}

			// assert on endpoint
			Assert.assertEquals(expectedService.getEndpoints().length, actualService.getEndpoints()
					.size());
			for (final org.apache.woden.wsdl20.Endpoint expectedEp : expectedService.getEndpoints()) {

				final Endpoint actualEp = actualService
				.getEndpoint(expectedEp.getName().toString());
				Assert.assertNotNull(actualEp);

				Assert.assertEquals(expectedEp.getName().toString(), actualEp.getName());

				// assert on endpoint address
				if (expectedEp.getAddress() != null) {
					Assert.assertEquals(expectedEp.getAddress().toString(), actualEp.getAddress());
				} else {
					Assert.assertNull(actualEp.getAddress());
				}

				// assert on binding
				Assert.assertEquals(def.getBindings().length, desc.getBindings().size());
				Assert.assertEquals(expectedEp.getBinding().getName(), actualEp.getBinding()
						.getQName());

				// assert on binding type
				if (expectedEp.getBinding().getType() != null) {
					Assert.assertEquals(expectedEp.getBinding().getType().toString(), actualEp
							.getBinding().getTypeOfBinding().value().toString());
				} else {
					Assert.assertNull(actualEp.getBinding().getTypeOfBinding());
				}
				// assert on binding transport
				for (final ExtensionProperty prop : expectedEp.getBinding()
						.getExtensionProperties()) {
					if (((prop.getNamespace().toString()
							.equals(BindingConstants.SOAP_BINDING4WSDL20.value().toString()))
							|| (prop.getNamespace().toString()
									.equals(BindingConstants.HTTP_BINDING4WSDL20.value().toString())) || (prop
											.getNamespace().toString().equals(BindingConstants.RPC_BINDING4WSDL20
													.value().toString())))
													&& (prop.getContent() instanceof URI)) {
						Assert.assertEquals(prop.getContent().toString(), actualEp.getBinding()
								.getTransportProtocol());
					}
				}

				// assert on binding operation
				Assert.assertEquals(expectedEp.getBinding().getBindingOperations().length, actualEp
						.getBinding().getBindingOperations().size());
				for (final org.apache.woden.wsdl20.BindingOperation expectedbop : expectedEp
						.getBinding().getBindingOperations()) {
					final BindingOperation actualbop = actualEp.getBinding().getBindingOperation(
							expectedbop.toElement().getRef().getLocalPart());
					Assert.assertNotNull(actualbop);

					Assert.assertEquals(expectedbop.toElement().getRef(), actualbop.getQName());

					// assert on binding mep operation
					for (final ExtensionProperty prop : expectedbop.getExtensionProperties()) {

						if (((prop.getNamespace().toString()
								.equals(BindingConstants.SOAP_BINDING4WSDL20.value().toString()))
								|| (prop.getNamespace().toString()
										.equals(BindingConstants.HTTP_BINDING4WSDL20.value()
												.toString())) || (prop.getNamespace().toString()
														.equals(BindingConstants.RPC_BINDING4WSDL20.value().toString())))
														&& (prop.getContent() instanceof URI)) {
							Assert.assertEquals(prop.getContent().toString(), actualbop.getMEP()
									.value().toString());
						}
					}

					for (final BindingMessageReference item : expectedbop
							.getBindingMessageReferences()) {

						// assert on input binding
						if (item.toElement().getDirection().equals(Direction.IN)) {
							this.assertonBindingParam(item.toElement().getExtensionElements(),
									actualbop.getInput());
						}
						// assert on output binding
						if (item.toElement().getDirection().equals(Direction.OUT)) {
							this.assertonBindingParam(item.toElement().getExtensionElements(),
									actualbop.getOutput());
						}
					}

					for (final BindingFaultReference item : expectedbop.getBindingFaultReferences()) {

						// assert on fault binding
						final BindingFault actualfault = actualbop.getFault(item.toElement()
								.getMessageLabel().toString());
						Assert.assertNotNull(actualfault);

						Assert.assertEquals(item.toElement().getMessageLabel().toString(),
								actualfault.getName());
						this.assertonBindingParam(item.toElement().getExtensionElements(),
								actualfault);
					}

					// assert on interface
					Assert.assertEquals(def.getInterfaces().length, desc.getInterfaces().size());
					for (final org.apache.woden.wsdl20.Interface expecteditf : def.getInterfaces()) {
						final InterfaceType actualitf = desc.getInterface(expecteditf.getName());

						Assert.assertNotNull(actualitf);
						Assert.assertEquals(expecteditf.getName(), actualitf.getQName());

						// assert on operations
						Assert.assertEquals(expecteditf.getAllInterfaceOperations().length,
								actualitf.getOperations().size());
						for (final org.apache.woden.wsdl20.InterfaceOperation expectedop : expecteditf
								.getAllInterfaceOperations()) {

							final Operation actualop = actualitf.getOperation(expectedop.getName());
							Assert.assertNotNull(actualop);

							Assert.assertEquals(expectedop.getName(), actualop.getQName());

							// assert on pattern operation
							Assert.assertEquals(expectedop.getMessageExchangePattern().toString(),
									actualop.getPattern().value().toString());

							for (final org.apache.woden.wsdl20.InterfaceMessageReference msg : expectedop
									.getInterfaceMessageReferences()) {
								// assert on input operation
								if (msg.getDirection().equals(Direction.IN)) {
									Assert.assertNotNull(actualop.getInput());

									if (msg.getMessageLabel() != null) {
										Assert
										.assertEquals(msg.getMessageLabel().toString(),
												actualop.getInput().getMessageName()
												.getLocalPart());
									} else {
										Assert.assertNull(actualop.getInput().getMessageName());
									}
									Assert.assertEquals(null, actualop.getInput().getParts());

									if ((msg.toElement().getElement() != null)
											&& (msg.toElement().getElement().getQName() != null)) {
										Assert.assertEquals(
												msg.toElement().getElement().getQName(), actualop
												.getInput().getElement().getQName());
									} else {
										Assert.assertNull(actualop.getInput().getElement());
									}
								}

								// assert on output operation
								if (msg.getDirection().equals(Direction.OUT)) {
									Assert.assertNotNull(actualop.getOutput());
									Assert.assertEquals(msg.getMessageLabel().toString(), actualop
											.getOutput().getMessageName().getLocalPart());
									Assert.assertEquals(null, actualop.getOutput().getParts());

									if ((msg.toElement().getElement() != null)
											&& (msg.toElement().getElement().getQName() != null)) {
										Assert.assertEquals(
												msg.toElement().getElement().getQName(), actualop
												.getOutput().getElement().getQName());
									} else {
										Assert.assertNull(actualop.getOutput().getElement());
									}
								}
							}

							// assert on fault operation
							Assert.assertEquals(expectedop.getInterfaceFaultReferences().length,
									actualop.getFaults().size());
							for (final org.apache.woden.wsdl20.InterfaceFaultReference msg : expectedop
									.getInterfaceFaultReferences()) {

								final Fault actualFault = actualop.getFaultByElementName(msg
										.getInterfaceFault().getName());
								Assert.assertNotNull(actualFault);
								Assert.assertEquals(msg.getMessageLabel().toString(), actualFault
										.getMessageName().getLocalPart());
								Assert.assertEquals(null, actualFault.getParts());

								if (msg.getInterfaceFault() != null) {
									Assert.assertEquals(msg.getInterfaceFault().getName(),
											actualFault.getElement().getQName());
								} else {
									Assert.assertNull(actualFault.getElement());
								}
							}

						}
					}
				}
			}
		}
	}

	private void assertonBindingParam(final ExtensionElement[] items,
			final AbsItfBindingParam actualparam) {
		final List<org.apache.woden.wsdl20.extensions.http.HTTPHeader> httpHeaders = new ArrayList<org.apache.woden.wsdl20.extensions.http.HTTPHeader>();
		final List<org.apache.woden.wsdl20.extensions.soap.SOAPHeaderBlock> soapHeaders = new ArrayList<org.apache.woden.wsdl20.extensions.soap.SOAPHeaderBlock>();
		final List<org.apache.woden.wsdl20.extensions.soap.SOAPModule> soapModules = new ArrayList<org.apache.woden.wsdl20.extensions.soap.SOAPModule>();
		for (final ExtensionElement item : items) {

			if (item instanceof org.apache.woden.wsdl20.extensions.soap.SOAPModule) {
				soapModules.add((SOAPModule) item);
			} else if (item instanceof org.apache.woden.wsdl20.extensions.soap.SOAPHeaderBlock) {
				soapHeaders.add((SOAPHeaderBlock) item);
			} else if (item instanceof org.apache.woden.wsdl20.extensions.http.HTTPHeader) {
				httpHeaders.add((HTTPHeader) item);
			}
		}

		if ((soapModules.size() > 0) || (soapHeaders.size() > 0)) {
			Assert.assertNotNull(actualparam.getSOAP12Binding4Wsdl20());

			Assert.assertEquals(soapModules.size(), actualparam.getSOAP12Binding4Wsdl20()
					.getModules().size());
			Assert.assertEquals(soapHeaders.size(), actualparam.getSOAP12Binding4Wsdl20()
					.getHeaders().size());

		} else {
			Assert.assertNull(actualparam.getSOAP12Binding4Wsdl20());
		}
		if (httpHeaders.size() > 0) {
			Assert.assertNotNull(actualparam.getHTTPBinding4Wsdl20());

			Assert.assertEquals(httpHeaders.size(), actualparam.getHTTPBinding4Wsdl20()
					.getHeaders().size());

		} else {
			Assert.assertNull(actualparam.getHTTPBinding4Wsdl20());
		}
	}
}

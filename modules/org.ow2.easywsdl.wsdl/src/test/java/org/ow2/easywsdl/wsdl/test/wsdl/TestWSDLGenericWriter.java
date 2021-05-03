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
import java.net.URISyntaxException;
import java.net.URL;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.ow2.easywsdl.wsdl.WSDLFactory;
import org.ow2.easywsdl.wsdl.api.Description;
import org.ow2.easywsdl.wsdl.api.WSDLException;
import org.ow2.easywsdl.wsdl.api.WSDLReader;
import org.ow2.easywsdl.wsdl.api.WSDLWriter;
import org.w3c.dom.Document;


/**
 * WSDL Writer test cases
 *
 * @author Christophe DENEUX - Capgemini Sud
 */
public class TestWSDLGenericWriter extends TestCase {

    /**
     * The generic WSDL reader used to read WSDLs.
     */
    WSDLFactory wsdlFactory = null;
    WSDLReader genericReader = null;
    WSDLWriter genericWriter = null; 
    
    /*
     * (non-Javadoc)
     * 
     * @see junit.framework.TestCase#setUp()
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        this.wsdlFactory = WSDLFactory.newInstance();
        this.genericReader = this.wsdlFactory.newWSDLReader();
        this.genericWriter = this.wsdlFactory.newWSDLWriter();
    }

    /**
     * Test the generic WSDL writer to write a DOM document containing space in
     * its document URI.
     */
    public void testWriterWSDLGeneric_DocumentBaseURIContainingSpaces()
            throws WSDLException, IOException, URISyntaxException {

        final URL wsdlURL = Thread.currentThread().getContextClassLoader().getResource("descriptors/with space in name.wsdl");
        final Description descFromURL = this.genericReader.read(wsdlURL);

        Assert.assertFalse("The document base URI contains unencoded spaces",
                descFromURL.getDocumentBaseURI().toString().contains(" "));

        final Document doc = this.genericWriter.getDocument(descFromURL);
        
        Assert.assertFalse(
                "The DOM document base URI contains unencoded spaces", doc
                        .getDocumentURI().contains(" "));

        final Description descFromDoc = this.genericReader.read(doc);

        Assert.assertNotNull(descFromDoc);
        Assert.assertFalse("The document base URI contains unencoded spaces",
                descFromDoc.getDocumentBaseURI().toString().contains(" "));

    }
}

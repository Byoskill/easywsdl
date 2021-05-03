/**
 * easySchema - easyWSDL toolbox Platform.
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
package org.ow2.easywsdl.schema.test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.ow2.easywsdl.schema.SchemaFactory;
import org.ow2.easywsdl.schema.api.Schema;
import org.ow2.easywsdl.schema.api.SchemaException;
import org.w3c.dom.Document;



/**
 * @author Nicolas Salatge - eBM WebSourcing
 */
public class WriteSchemaDescriptorTestCase extends TestCase {

	public void testWriterSchema_Document() throws SchemaException, URISyntaxException, SchemaException, IOException {
		
		final URL xsdUrl = Thread.currentThread().getContextClassLoader().getResource(Environement.SAMPLE_XSD);
        Assert.assertNotNull(
                "XMLSchema '" + Environement.SAMPLE_XSD + "' not found in the classpath.", xsdUrl);
        final Schema desc = SchemaFactory.newInstance().newSchemaReader().read(xsdUrl);
		
		final Document doc = SchemaFactory.newInstance().newSchemaWriter().getDocument(desc);
		Assert.assertNotNull(doc);
		Assert.assertFalse(
                "The DOM document base URI contains unencoded spaces", doc
                        .getDocumentURI().contains(" "));
		
		// TODO: Has some assert about the document content
	}
	
	public void testWriterSchema_DocumentBaseURIContainingSpaces() throws SchemaException, URISyntaxException, SchemaException, IOException {
        
        final URL xsdUrl = Thread.currentThread().getContextClassLoader().getResource(Environement.SampleWithSpaceInItsName.XSD);
        Assert.assertNotNull(
                "XMLSchema '" + Environement.SampleWithSpaceInItsName.XSD + "' not found in the classpath.", xsdUrl);
        final Schema desc = SchemaFactory.newInstance().newSchemaReader().read(xsdUrl);
        
        final Document doc = SchemaFactory.newInstance().newSchemaWriter().getDocument(desc);
        Assert.assertNotNull(doc);
        Assert.assertFalse(
                "The DOM document base URI contains unencoded spaces", doc
                        .getDocumentURI().contains(" "));
    }
    
    public void testWriterSchema_OutputStream() throws SchemaException, URISyntaxException, SchemaException, IOException {
        
        final URL xsdUrl = Thread.currentThread().getContextClassLoader().getResource(Environement.SAMPLE_XSD);
        Assert.assertNotNull(
                "XMLSchema '" + Environement.SAMPLE_XSD + "' not found in the classpath.", xsdUrl);
        final Schema desc = SchemaFactory.newInstance().newSchemaReader().read(xsdUrl);
        
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        SchemaFactory.newInstance().newSchemaWriter().writeSchema(desc, baos);
        final String xsd = baos.toString();
        Assert.assertTrue("Nothing has been written.", xsd.length() > 0);
        Assert.assertTrue("Not enough bytes written.", xsd.length() > 3000);
    }
}

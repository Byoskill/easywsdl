/**
 * easySchema - easyWSDL toolbox Platform.
 * Copyright (c) 2009,  eBM Websourcing
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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import javax.xml.namespace.QName;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.ow2.easywsdl.schema.SchemaFactory;
import org.ow2.easywsdl.schema.api.ComplexContent;
import org.ow2.easywsdl.schema.api.ComplexType;
import org.ow2.easywsdl.schema.api.Element;
import org.ow2.easywsdl.schema.api.Enumeration;
import org.ow2.easywsdl.schema.api.Extension;
import org.ow2.easywsdl.schema.api.Import;
import org.ow2.easywsdl.schema.api.Include;
import org.ow2.easywsdl.schema.api.Restriction;
import org.ow2.easywsdl.schema.api.Schema;
import org.ow2.easywsdl.schema.api.SchemaException;
import org.ow2.easywsdl.schema.api.Sequence;
import org.ow2.easywsdl.schema.api.SimpleType;
import org.xml.sax.InputSource;



/**
 * @author Nicolas Salatge - eBM WebSourcing
 * @author Christophe DENEUX - Capgemini Sud
 */
public class CreateSchemaDescriptorTestCase extends TestCase {

	private String TARGET_NAMESPACE = "http://petals.ow2.org/";

	private QName cName(String name) {
		return new QName(TARGET_NAMESPACE, name);
	}

	public void testCreateSchema() throws URISyntaxException, SchemaException, MalformedURLException {
		// SchemaImpl
        final Schema createdSchema = SchemaFactory.newInstance().newSchema();
        Assert.assertNotNull("Unable to create a new Schema.", createdSchema);

        createdSchema.setTargetNamespace(TARGET_NAMESPACE);

		// create an import
        final Import impt = createdSchema.createImport();
		impt.setLocationURI(URI.create(Environement.RESERVATIONDETAILS_XSD));
        impt.setNamespaceURI(Environement.RESERVATIONDETAILS_NAMESPACE);
        // add import in schema
        createdSchema.addImport(impt);

        // create an include
        final Include incl = createdSchema.createInclude();
		incl.setLocationURI(URI.create("descriptors/wsdl20-instance.xsd"));
		// add include in schema
        createdSchema.addInclude(incl);

        // create an element
        final Element element = createdSchema.createElement();
		element.setQName(cName("count"));
		element.setType(SchemaFactory.getDefaultSchema().getTypeInt());
		// add element in schema
        createdSchema.addElement(element);
        
        // create a complexType
        final ComplexType ct = (ComplexType) createdSchema.createComplexType();
		ct.setQName(cName("Address"));
		// add complextype in schema
        createdSchema.addType(ct);
        
        // create a simpleType with enumerations
        final SimpleType st = (SimpleType) createdSchema.createSimpleType();
        final Restriction rest = st.createRestriction();
        rest.setBase(SchemaFactory.getDefaultSchema().getTypeString().getQName());
        final Enumeration enum1 = rest.createEnumeration();
        enum1.setValue("Paris");
        rest.addEnumeration(enum1);
        final Enumeration enum2 = rest.createEnumeration();
        enum2.setValue("London");
        rest.addEnumeration(enum2);
        st.setRestriction(rest);

        // create a sequence
		final Sequence seq = ct.createSequence();
		// add element in seq
		final Element elmt1 = seq.createElement();
		elmt1.setQName(cName("city"));
		elmt1.setType(st);
		elmt1.setMinOccurs(0);
		elmt1.setMaxOccurs("unbounded");
		seq.addElement(elmt1);
		// add sequence in complextype
		ct.setSequence(seq);

		// create a complexType by extension
        final ComplexType ctEx = (ComplexType) createdSchema.createComplexType();
		ctEx.setQName(cName("AddressExtended"));
		final ComplexContent cc = ctEx.createComplexContent();
		ctEx.setComplexContent(cc);
		final Extension ex = cc.createExtension();
		ex.setBase(ct);
		cc.setExtension(ex);
		final Sequence s = ex.createSequence();
		ex.setSequence(s);
		final Element e = s.createElement();
		e.setQName(cName("postcode"));
		e.setType(SchemaFactory.getDefaultSchema().getTypeInt());
		s.addElement(e);
		// add extended complexType in schema
        createdSchema.addType(ctEx);

		// Flush the created schema into an outputstream
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        SchemaFactory.newInstance().newSchemaWriter().writeSchema(
                createdSchema, baos);

        // To read and parse it for verifications
        final InputSource xsdInputSource = new InputSource(
                new ByteArrayInputStream(baos.toByteArray()));
        // We consider that the created shema is relative to the test ressources path (ie. file:///${basedir}/src/test/resources)
        final URL xsdUrl = Thread.currentThread().getContextClassLoader()
                .getResource("descriptors");
        xsdInputSource.setSystemId(xsdUrl.toString());
        final Schema readSchema = SchemaFactory.newInstance().newSchemaReader()
                .read(xsdInputSource);

        Assert.assertNotNull("Unable to read the previous created Schema.",
                readSchema);
        Assert
                .assertEquals(
                        "The expected import number isn't correct in the create schema.",
                        1, readSchema.getImports().size());
        Assert
                .assertEquals(
                        "The expected include number isn't correct in the create schema.",
                        1, readSchema.getIncludes().size());
        Assert.assertEquals(
                "The expected type number isn't correct in the create schema.",
                3, readSchema.getTypes().size());
        Assert
                .assertEquals(
                        "The expected element number isn't correct in the create schema.",
                        7, readSchema.getElements().size());
        Assert
                .assertEquals(
                        "The expected attribute number isn't correct in the create schema.",
                        1, readSchema.getAttributes().size());
        
      
	}
}

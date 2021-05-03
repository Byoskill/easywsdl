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
package org.ow2.easywsdl.extensions.sawsdl.test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.ow2.easywsdl.extensions.sawsdl.SAWSDLFactory;
import org.ow2.easywsdl.extensions.sawsdl.api.SAWSDLException;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.SimpleType;
import org.ow2.easywsdl.wsdl.WSDLFactory;
import org.ow2.easywsdl.wsdl.api.WSDLException;


/**
 * @author Nicolas Salatge - eBM WebSourcing
 */
public class TestSAWSDLDescriptor extends TestCase {

    public void testReaderSAWSDLForWSDL20() throws URISyntaxException, WSDLException, IOException {

        final URL sawsdlURL = Thread.currentThread().getContextClassLoader().getResource("descriptors/purchase.wsdl");
        Assert.assertNotNull("Source SAWSDL not found.", sawsdlURL);
        final org.ow2.easywsdl.wsdl.api.Description wsdlDesc = WSDLFactory.newInstance()
                .newWSDLReader().read(sawsdlURL);

        final org.ow2.easywsdl.extensions.sawsdl.api.Description sawsdlDesc = SAWSDLFactory.newInstance()
                .addSAWSDLElmt2Description(wsdlDesc);

        // assert on description
        Assert.assertNotNull(sawsdlDesc);

        // assert on level 1
        Assert.assertEquals(
                "[http://www.w3.org/2002/ws/sawsdl/spec/ontology/purchaseorder#OrderConfirmation]",
                sawsdlDesc.getServices().get(0).getModelReference().toString());
        Assert.assertEquals(
                "[http://www.w3.org/2002/ws/sawsdl/spec/ontology/purchaseorder#OrderConfirmation]",
                sawsdlDesc.getBindings().get(0).getModelReference().toString());
        Assert.assertEquals("[http://example.org/categorization/products/electronics]", sawsdlDesc
                .getInterfaces().get(0).getModelReference().toString());
        Assert.assertEquals(
                "[http://www.w3.org/2002/ws/sawsdl/spec/ontology/purchaseorder#OrderConfirmation]",
                sawsdlDesc.getBindings().get(0).getModelReference().toString());
        Assert.assertEquals(
                "[http://www.w3.org/2002/ws/sawsdl/spec/ontology/purchaseorder#OrderConfirmation]",
                sawsdlDesc.getTypes().getModelReference().toString());

        // assert on level 2
        Assert.assertEquals("[http://example.org/categorization/products/electronics]", sawsdlDesc
                .getServices().get(0).getEndpoints().get(0).getModelReference().toString());
        Assert.assertEquals(
                "[http://www.w3.org/2002/ws/sawsdl/spec/ontology/purchaseorder#RequestPurchaseOrder]",
                sawsdlDesc.getInterfaces().get(0).getOperations().get(0).getModelReference()
                        .toString());
        Assert.assertEquals(
                "[http://www.w3.org/2002/ws/sawsdl/spec/ontology/purchaseorder#OrderConfirmation]",
                sawsdlDesc.getBindings().get(0).getBindingOperations().get(0).getModelReference()
                        .toString());
        
        // assert on level 3
        Assert.assertEquals(
                "[http://www.w3.org/2002/ws/sawsdl/spec/ontology/purchaseorder#OrderConfirmation]",
                sawsdlDesc.getInterfaces().get(0).getOperations().get(0).getInput()
                        .getModelReference().toString());
        Assert.assertEquals(
                "[http://www.w3.org/2002/ws/sawsdl/spec/ontology/purchaseorder#OrderConfirmation]",
                sawsdlDesc.getInterfaces().get(0).getOperations().get(0).getOutput()
                        .getModelReference().toString());

        // assert on schema
        Assert.assertEquals("[http://www.w3.org/2002/ws/sawsdl/spec/ontology/purchaseorder#OrderRequest]",
                sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(0).getModelReference()
                        .toString());
        Assert.assertEquals("[http://www.w3.org/2002/ws/sawsdl/spec/mapping/RDFOnt2Request.xml]",
                sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(0)
                        .getLoweringSchemaMapping().toString());
        Assert.assertEquals(
                "[http://www.w3.org/2002/ws/sawsdl/spec/ontology/purchaseorder#OrderConfirmation]",
                sawsdlDesc.getTypes().getSchemas().get(0).getTypes().get(1).getModelReference()
                        .toString());
        Assert.assertEquals(
                "[http://www.w3.org/2002/ws/sawsdl/spec/ontology/purchaseorder#ConfirmationConfirmed]",
                ((SimpleType)sawsdlDesc.getTypes().getSchemas().get(0).getTypes().get(1)).getRestriction().getEnumerations().get(0).getModelReference()
                        .toString());
        
        // assert other methods: add, remove, removeAll
        Assert.assertEquals("[]", sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(1)
                .getModelReference().toString());
        sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(1).addModelReference(
                new URI("http://www.w3.org/2002/ws/sawsdl/spec/mapping/RDFOnt2Request.xml"));
        Assert.assertEquals("[http://www.w3.org/2002/ws/sawsdl/spec/mapping/RDFOnt2Request.xml]",
                sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(1).getModelReference()
                        .toString());
        sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(1).removeModelReference(
                new URI("http://www.w3.org/2002/ws/sawsdl/spec/mapping/RDFOnt2Request.xml"));
        Assert.assertEquals("[]", sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(1)
                .getModelReference().toString());
        sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(0).addModelReference(
                new URI("http://www.w3.org/2002/ws/sawsdl/spec/mapping/RDFOnt2Request.xml"));
        Assert.assertEquals(
                "[http://www.w3.org/2002/ws/sawsdl/spec/ontology/purchaseorder#OrderRequest, http://www.w3.org/2002/ws/sawsdl/spec/mapping/RDFOnt2Request.xml]",
                sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(0).getModelReference()
                        .toString());
        sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(0).removeAllModelReferences();
        Assert.assertEquals("[]", sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(0)
                .getModelReference().toString());

        Assert.assertEquals("[]", sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(1)
                .getLoweringSchemaMapping().toString());
        sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(1).addLoweringSchemaMapping(
                new URI("http://www.w3.org/2002/ws/sawsdl/spec/mapping/RDFOnt2Request.xml"));
        Assert.assertEquals("[http://www.w3.org/2002/ws/sawsdl/spec/mapping/RDFOnt2Request.xml]",
                sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(1)
                        .getLoweringSchemaMapping().toString());
        sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(1).removeLoweringSchemaMapping(
                new URI("http://www.w3.org/2002/ws/sawsdl/spec/mapping/RDFOnt2Request.xml"));
        Assert.assertEquals("[]", sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(1)
                .getLoweringSchemaMapping().toString());
        sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(0).addLoweringSchemaMapping(
                new URI("http://www.w3.org/2002/ws/sawsdl/spec/mapping/RDFOnt2Request.xml"));
        Assert.assertEquals(
                "[http://www.w3.org/2002/ws/sawsdl/spec/mapping/RDFOnt2Request.xml, http://www.w3.org/2002/ws/sawsdl/spec/mapping/RDFOnt2Request.xml]",
                sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(0)
                        .getLoweringSchemaMapping().toString());
        sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(0)
                .removeAllLoweringSchemaMappings();
        Assert.assertEquals("[]", sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(0)
                .getLoweringSchemaMapping().toString());

        Assert.assertEquals("[]", sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(1)
                .getLiftingSchemaMapping().toString());
        sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(1).addLiftingSchemaMapping(
                new URI("http://www.w3.org/2002/ws/sawsdl/spec/mapping/RDFOnt2Request.xml"));
        Assert.assertEquals("[http://www.w3.org/2002/ws/sawsdl/spec/mapping/RDFOnt2Request.xml]",
                sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(1)
                        .getLiftingSchemaMapping().toString());
        sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(1).removeLiftingSchemaMapping(
                new URI("http://www.w3.org/2002/ws/sawsdl/spec/mapping/RDFOnt2Request.xml"));
        Assert.assertEquals("[]", sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(1)
                .getLiftingSchemaMapping().toString());
        sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(0).addLiftingSchemaMapping(
                new URI("http://www.w3.org/2002/ws/sawsdl/spec/mapping/RDFOnt2Request.xml"));
        Assert.assertEquals("[http://www.w3.org/2002/ws/sawsdl/spec/mapping/RDFOnt2Request.xml]",
                sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(0)
                        .getLiftingSchemaMapping().toString());
        sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(0)
                .removeAllLiftingSchemaMappings();
        Assert.assertEquals("[]", sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(0)
                .getLiftingSchemaMapping().toString());

        Assert.assertNotNull(sawsdlDesc.getInterfaces().get(0).getOperations().get(0).getSignature());
        
//        System.out.println(sawsdlDesc.getInterfaces().get(0).getModelReference());
//        System.out.println(sawsdlDesc.getServices().get(0).getModelReference());
//        System.out.println(sawsdlDesc.getServices().get(0).getEndpoints().get(0)
//                .getModelReference());
//        System.out.println(sawsdlDesc.getInterfaces().get(0).getOperations().get(0)
//                .getModelReference());
//        System.out.println(sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(0)
//                .getModelReference());
//        System.out.println(sawsdlDesc.getTypes().getSchemas().get(0).getElements().get(0)
//                .getLoweringSchemaMapping());
//        System.out.println(sawsdlDesc.getTypes().getSchemas().get(0).getTypes().get(1)
//                .getModelReference());
    }
    
    
    public void testReaderSAWSDLForWSDL11() throws URISyntaxException, WSDLException, IOException {

        final URL sawsdlURL = Thread.currentThread().getContextClassLoader().getResource("descriptors/processArtifacts.wsdl");
        Assert.assertNotNull("Source SAWSDL not found.", sawsdlURL);
        Assert.assertNotNull("Source SAWSDL not found.", sawsdlURL);
        final org.ow2.easywsdl.wsdl.api.Description wsdlDesc = WSDLFactory.newInstance()
                .newWSDLReader().read(sawsdlURL);

        final org.ow2.easywsdl.extensions.sawsdl.api.Description sawsdlDesc = SAWSDLFactory.newInstance()
                .addSAWSDLElmt2Description(wsdlDesc);

        // assert on description
        Assert.assertNotNull(sawsdlDesc);

        // assert on level 1
        Assert.assertEquals(
                "[http://www.w3.org/2002/ws/sawsdl/spec/ontology/purchaseorder#OrderConfirmation]",
                sawsdlDesc.getAttrExtensions().getModelReference().toString());
        Assert.assertEquals(
                "[http://www.w3.org/2002/ws/sawsdl/spec/ontology/purchaseorder#OrderConfirmation]",
                sawsdlDesc.getInterfaces().get(0).getModelReference().toString());


//        System.out.println(sawsdlDesc.getAttrExtensions().getModelReference());
//
//        System.out.println(sawsdlDesc.getInterfaces().get(0).getModelReference());

    }

    public void testReaderAndWriterSAWSDL() throws SAWSDLException, URISyntaxException,
            WSDLException, IOException {
        // WSDL 2.0
        final URL sawsdlURL = Thread.currentThread().getContextClassLoader().getResource("descriptors/purchase.wsdl");
        Assert.assertNotNull("Source SAWSDL not found.", sawsdlURL);
        final org.ow2.easywsdl.extensions.sawsdl.api.Description desc = SAWSDLFactory.newInstance()
                .newSAWSDLReader().read(sawsdlURL);
        final String res = SAWSDLFactory.newInstance().newSAWSDLWriter().writeSAWSDL(desc);
        Assert.assertNotNull(res);

//        System.out.println(res);
    }
}

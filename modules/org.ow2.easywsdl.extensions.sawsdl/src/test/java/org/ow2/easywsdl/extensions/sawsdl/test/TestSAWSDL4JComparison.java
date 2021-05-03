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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.wsdl.PortType;
import javax.wsdl.WSDLException;
import javax.wsdl.extensions.UnknownExtensibilityElement;
import javax.xml.namespace.QName;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.ow2.easywsdl.extensions.sawsdl.SAWSDLFactory;
import org.ow2.easywsdl.extensions.sawsdl.api.Description;
import org.ow2.easywsdl.extensions.sawsdl.api.Fault;
import org.ow2.easywsdl.extensions.sawsdl.api.InterfaceType;
import org.ow2.easywsdl.extensions.sawsdl.api.Operation;
import org.ow2.easywsdl.extensions.sawsdl.api.SASchemaElement;
import org.ow2.easywsdl.extensions.sawsdl.api.SAWSDLElement;
import org.ow2.easywsdl.extensions.sawsdl.api.SAWSDLException;
import org.ow2.easywsdl.extensions.sawsdl.api.Types;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.Attribute;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.ComplexType;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.Element;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.Schema;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.Type;
import org.ow2.easywsdl.extensions.sawsdl.test.util.XMLUtil;
import org.ow2.easywsdl.wsdl.WSDLFactory;
import org.ow2.easywsdl.wsdl.api.WSDLReader;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import edu.uga.cs.lsdis.sawsdl.Definition;
import edu.uga.cs.lsdis.sawsdl.impl.util.SchemaUtils;
import edu.uga.cs.lsdis.sawsdl.util.SAWSDLUtility;

/**
 * @author Nicolas Boissel-Dallier - eBM WebSourcing
 */
public class TestSAWSDL4JComparison extends TestCase {

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
        System.setProperty("javax.wsdl.factory.WSDLFactory",
        "edu.uga.cs.lsdis.sawsdl.impl.factory.WSDLFactoryImpl");
	}
	
	public void testSAWSDL4J() throws java.io.IOException, WSDLException, org.ow2.easywsdl.wsdl.api.WSDLException, URISyntaxException {
		String filePath = "./src/test/resources/sawsdl/";
		
		File directory = new File(filePath);
		File[] fileList = directory.listFiles(new FileFilter() {
            
            public boolean accept(File pathname) {
                // TODO Auto-generated method stub
                return pathname.isFile() && pathname.getName().endsWith(".wsdl");
            }
        });
		
		WSDLReader readerDesc = WSDLFactory.newInstance().newWSDLReader();
		
		for(int i = 0; i < fileList.length ; i++) {
			
			//System.out.println("----- Test nb" + (i+1) + " (" + fileName + ") -----");
			
			// Easy-SAWSDL part
			String sawsdl = readFileAsString(fileList[i]);
			Document sawsdlDoc = XMLUtil.createDocumentFromString(sawsdl);
			sawsdlDoc.setDocumentURI(fileList[i].toURI().toURL().toString());
			
			final org.ow2.easywsdl.wsdl.api.Description wsdlDesc = readerDesc.read(sawsdlDoc);
	        final org.ow2.easywsdl.extensions.sawsdl.api.Description sawsdlDesc = SAWSDLFactory.newInstance()
            .addSAWSDLElmt2Description(wsdlDesc);
			
	        // assert on description
	        Assert.assertNotNull(sawsdlDesc);
	        
	        if(sawsdlDesc.getVersion().toString() == "http://schemas.xmlsoap.org/wsdl/") {
//		        	System.out.println("--> WSDL 1.1");
	        	
		        // SAWSDL4J part
		        final Definition sawsdlDef = SAWSDLUtility.getDefinitionFromFile(fileList[i]);

		        // assert on definition 
		        Assert.assertNotNull("WSDL not loaded by SAWSDL4J",sawsdlDef);

				assertWithSAWSDL4JModel(sawsdlDesc, sawsdlDef);
				
//			        System.out.println("--> Test : OK");
//			        
//		        } else if(sawsdlDesc.getVersion().toString() == "http://www.w3.org/ns/wsdl") {
//		        	System.out.println("--> WSDL 2.0");
//			        System.out.println("--> No test");
//
//		        } else {
//		        	System.out.println("--> unknowed WSDL version");
			}
		}	
	}
	
	
	private void assertWithSAWSDL4JModel(Description sawsdlDesc, Definition sawsdlDef) throws SAWSDLException {
		
		/*
		 * Types
		 */

		Types typesDesc = sawsdlDesc.getTypes();
		javax.wsdl.Types typesDef = sawsdlDef.getTypes();

		List<Schema> schemasDesc = typesDesc.getSchemas();
		List<edu.uga.cs.lsdis.sawsdl.extensions.schema.Schema> schemasDef = SchemaUtils.getSchemas(typesDef);
		
		Assert.assertEquals(schemasDef.size(),schemasDesc.size());
		
		Iterator<Schema> iSchemasDesc = schemasDesc.iterator();
		Iterator<edu.uga.cs.lsdis.sawsdl.extensions.schema.Schema> iSchemasDef = schemasDef.iterator();
		
		while(iSchemasDesc.hasNext()) {
			assertSchema(iSchemasDef.next(),(Schema)iSchemasDesc.next());
		}
		
		
		/*
		 * Messages
		 */
		
//		List<MessageImpl> messagesDesc = ((DescriptionImpl)((DecoratorDescriptionImpl)sawsdlDesc).getFirstDescription()).getMessages();
//		Map messagesDef = sawsdlDef.getMessages();
//		
//		Assert.assertEquals(messagesDef.size(), messagesDesc.size());
//		
//		Iterator<MessageImpl> iMessagesDesc = messagesDesc.iterator();
//		
//		while(iMessagesDesc.hasNext()) {
//			String messModelDesc = "[]";
//			String messModelDef = "[]";
//			
//			MessageImpl messDesc = iMessagesDesc.next();
//			Message messDef = (Message)messagesDef.get(messDesc.getQName());
//			
//			messModelDesc = ((SAWSDLElement)messDesc).getModelReference().toString();
//			QName messModelDefQ = (QName)messDef.getExtensionAttribute(new QName("http://www.w3.org/ns/sawsdl","modelReference"));
//			
//			if(messModelDefQ != null) {
//				messModelDef = messModelDefQ.toString();
//				messModelDef = multipleURI4j2easy(messModelDef);
//			}
//			
//			Assert.assertEquals(messModelDef,messModelDesc);
//			
//		}
		
		/*
		 * Interfaces
		 */
		List<InterfaceType> interfacesDesc = sawsdlDesc.getInterfaces();
		Iterator<InterfaceType> iInterfacesDesc = interfacesDesc.iterator();
		
		Map<QName, PortType> interfacesDef = sawsdlDef.getPortTypes();
		
		Assert.assertEquals(interfacesDef.size(), interfacesDesc.size());
		
		while(iInterfacesDesc.hasNext()){
			String interModelDesc = "[]";
			String interModelDef = "[]";
			
			// easy-SAWSDL
			InterfaceType interDesc = iInterfacesDesc.next();
			QName interQName = interDesc.getQName();
			interModelDesc  = interDesc.getModelReference().toString();
			
			// SAWSDL4J
			PortType interDef = sawsdlDef.getSemanticPortType(interQName);
			QName interModelDefQ = (QName)interDef.getExtensionAttribute(new QName("http://www.w3.org/ns/sawsdl","modelReference"));
			
			if(interModelDefQ != null) {
				interModelDef = interModelDefQ.toString();
				interModelDef = multipleURI4j2easy(interModelDef);
			}
		
			// Compare
			//System.out.println("Test interface : " + interQName.getLocalPart());
			Assert.assertEquals(interModelDef,interModelDesc);
			
			
			/*
			 * Operations
			 */
			
			List<Operation> operations = interDesc.getOperations();
			Iterator<Operation> iOperations = operations.iterator();
			
			while(iOperations.hasNext()){
				String opModelDesc = "[]";
				String opModelDef = "[]";
				
				
				
				// easy-SAWSDL
				Operation opDesc = iOperations.next();
				String opName = opDesc.getQName().getLocalPart();				
				if(opDesc.getAttrExtensions() != null) {
					opModelDesc = opDesc.getAttrExtensions().getModelReference().toString();
				}
				
				// SAWSDL4J
				javax.wsdl.Operation opDef = interDef.getOperation(opName, opDesc.getInput().getName(), opDesc.getOutput().getName());
				if(!opDef.getExtensibilityElements().isEmpty()){
					
					org.w3c.dom.Element extElement = (org.w3c.dom.Element)((UnknownExtensibilityElement)opDef.getExtensibilityElements().get(0)).getElement();
					opModelDef = extElement.getAttributeNS("http://www.w3.org/ns/sawsdl","modelReference");
						
					opModelDef = multipleURI4j2easy(opModelDef);

				}
				
				// Compare
				//System.out.println("Test operation : " + opName);
				//System.out.println(opModelDef + opModelDesc);
				Assert.assertEquals(opModelDef, opModelDesc);
				
				/*
				 * Faults
				 */
				
				List<Fault> faults = opDesc.getFaults();
				Iterator<Fault> iFaults = faults.iterator();
				
				while(iFaults.hasNext()) {
					String fModelDesc = "[]";
					String fModelDef = "[]";
					
					// easy-SAWSDL
					Fault fDesc = iFaults.next();
					String fName = fDesc.getName();
					interModelDesc  = interDesc.getModelReference().toString();
					
					// SAWSDL4J
					javax.wsdl.Fault fDef = opDef.getFault(fName);
					QName fModelDefQ = (QName)fDef.getExtensionAttribute(new QName("http://www.w3.org/ns/sawsdl","modelReference"));
					
					if(fModelDefQ != null) {
						fModelDef = interModelDefQ.toString();
						
						fModelDef = multipleURI4j2easy(interModelDef);
					}
					
					// Compare
					//System.out.println("Test fault : " + fName);
					Assert.assertEquals(fModelDef,fModelDesc);
					
				}
				
			}

		}
		
	}
	
	
	private void assertSchema(edu.uga.cs.lsdis.sawsdl.extensions.schema.Schema schemaDefAbs, Schema schemaDesc) throws SAWSDLException{
		
		org.w3c.dom.Element schemaDef = schemaDefAbs.getElement();
		
		// Tests on schemas
		assertSchemaTest(schemaDef, schemaDesc);
		
		// Exploration
			// sawsdl4j
		NodeList childDef = schemaDef.getChildNodes();
		List<org.w3c.dom.Element> elemChildDef = new ArrayList<org.w3c.dom.Element>();
		List<org.w3c.dom.Element> typeChildDef = new ArrayList<org.w3c.dom.Element>();
		List<org.w3c.dom.Element> attrChildDef = new ArrayList<org.w3c.dom.Element>();
		
		for(int i = 0 ; i < (childDef.getLength()/2) ; i++) {
			// Only odd items contain elements
			Node childNode = childDef.item(((i*2)+1));
			String childName = childNode.getNodeName();
			
			if(childName.contains("element")){
				elemChildDef.add((org.w3c.dom.Element)childNode);
			} else if(childName.contains("simpleType") || childName.contains("complexType")) {
				typeChildDef.add((org.w3c.dom.Element)childNode);
			} else if(childName.contains("attribute")){
				attrChildDef.add((org.w3c.dom.Element)childNode);
			} else {
				
			}
		}
		
			// easy-sawsdl
		List<Element> elemChildDesc = schemaDesc.getElements();
		List<Type> typeChildDesc = schemaDesc.getTypes();
		List<Attribute> attrChildDesc = schemaDesc.getAttributes();
		
			// Recursion script
				// Elements
		Assert.assertEquals(elemChildDef.size(), elemChildDesc.size());
		Iterator<org.w3c.dom.Element> iElemDef = elemChildDef.iterator();
		Iterator<Element> iElemDesc = elemChildDesc.iterator();
		
		while(iElemDesc.hasNext()) {
			assertSchemaElement(iElemDef.next(),iElemDesc.next());
		}
		
				// Types
		Assert.assertEquals(typeChildDef.size(), typeChildDesc.size());
		Iterator<org.w3c.dom.Element> iTypeDef = typeChildDef.iterator();
		Iterator<Type> iTypeDesc = typeChildDesc.iterator();
		
		while(iTypeDesc.hasNext()) {
			assertSchemaElement(iTypeDef.next(),iTypeDesc.next());
		}
		
				// Attributes
		Assert.assertEquals(attrChildDef.size(), attrChildDesc.size());
		Iterator<org.w3c.dom.Element> iAttrDef = attrChildDef.iterator();
		Iterator<Attribute> iAttrDesc = attrChildDesc.iterator();
		
		while(iAttrDesc.hasNext()) {
			assertSchemaElement(iAttrDef.next(),iAttrDesc.next());
		}
		
	}
	
	private void assertSchemaElement(org.w3c.dom.Element elemDef, SAWSDLElement elemDesc) throws SAWSDLException {
		
		assertSchemaTest(elemDef, (SAWSDLElement)elemDesc);
		
		if(elemDesc instanceof Element) {
			
			Type typeElemDesc = ((Element)elemDesc).getType();
			
			if((typeElemDesc instanceof ComplexType) && (typeElemDesc.getQName() == null)) {
				Node typeElemDef = elemDef.getChildNodes().item(1);	
				Assert.assertNotNull(typeElemDef);
				assertSchemaElement((org.w3c.dom.Element)typeElemDef,typeElemDesc);
			}
			
		} else if (elemDesc instanceof ComplexType) {
			
			// Attributes
			List<Attribute> elemAttrDesc = null;
			elemAttrDesc = ((ComplexType)elemDesc).getAttributes();
			
			NodeList elemAttrDef = elemDef.getElementsByTagNameNS("http://www.w3.org/2001/XMLSchema", "attribute");
			
			Assert.assertEquals(elemAttrDef.getLength(), elemAttrDesc.size());
			
			for(int i = 0 ; i < elemAttrDef.getLength() ; i++){
				assertSchemaElement((org.w3c.dom.Element)elemAttrDef.item(i),elemAttrDesc.get(i));
			}
			
			
			// Sequence, All and Choice
			List<SAWSDLElement> elemChildDesc = new ArrayList<SAWSDLElement>();
			List<org.w3c.dom.Element> elemChildDef = new ArrayList<org.w3c.dom.Element>();
			NodeList elemNodeDef = null;
			
			if(((ComplexType)elemDesc).hasAll()){
				elemChildDesc.addAll((Collection<Element>)((ComplexType)elemDesc).getAll().getElements());
				elemNodeDef = elemDef.getElementsByTagNameNS("http://www.w3.org/2001/XMLSchema", "element");
			} else if(((ComplexType)elemDesc).hasSequence()){
				elemChildDesc.addAll((Collection<Element>)((ComplexType)elemDesc).getSequence().getElements());
				elemNodeDef = elemDef.getElementsByTagNameNS("http://www.w3.org/2001/XMLSchema", "sequence").item(0).getChildNodes();
			} else if(((ComplexType)elemDesc).hasChoice()){
				elemChildDesc.addAll((Collection<Element>)((ComplexType)elemDesc).getChoice().getElements());
				elemNodeDef = elemDef.getElementsByTagNameNS("http://www.w3.org/2001/XMLSchema", "choice")
								.item(0).getChildNodes();
			}
			
			if(elemNodeDef != null) {
				for(int i = 0 ; i < elemNodeDef.getLength() ; i++){
					if(elemNodeDef.item(i).getNodeName().contains("element")) {
						elemChildDef.add((org.w3c.dom.Element)elemNodeDef.item(i));
					}
				}
			}

			Assert.assertEquals(elemChildDef.size(), elemChildDesc.size());
				
			for(int i = 0 ; i < elemChildDesc.size() ; i++){
				assertSchemaElement(elemChildDef.get(i),elemChildDesc.get(i));
			}
				
		}
		
		// simpleType, attribute or unrecognized element don't require other treatment
		
	}

	private void assertSchemaTest(org.w3c.dom.Element elemDef, SAWSDLElement elemDesc) throws SAWSDLException {
		
		//System.out.println("Test of " + elemDef.getNodeName() + " " + elemDef.getAttribute("name"));
		
		// ModelReference
		String modelDef = "[]";
		String modelDesc = "[]";
		modelDesc = elemDesc.getModelReference().toString();
		modelDef = elemDef.getAttributeNS("http://www.w3.org/ns/sawsdl","modelReference").toString();
		modelDef = multipleURI4j2easy(modelDef);
		//System.out.println("model : " + modelDef + " vs " + modelDesc);
		Assert.assertEquals(modelDef, modelDesc);
		
		if(elemDesc instanceof SASchemaElement) {
			// LiftingSchemaMapping
			String liftDef = "[]";
			String liftDesc = "[]";
			liftDesc = ((SASchemaElement)elemDesc).getLiftingSchemaMapping().toString();
			liftDef = elemDef.getAttributeNS("http://www.w3.org/ns/sawsdl","liftingSchemaMapping").toString();
			liftDef = multipleURI4j2easy(liftDef);
			//System.out.println("model : " + liftDef + " vs " + liftDesc);
			Assert.assertEquals(liftDef, liftDesc);
	
			// LoweringSchemaMapping
			String lowerDef = "[]";
			String lowerDesc = "[]";
			lowerDesc = ((SASchemaElement)elemDesc).getLoweringSchemaMapping().toString();
			lowerDef = elemDef.getAttributeNS("http://www.w3.org/ns/sawsdl","loweringSchemaMapping").toString();
			lowerDef = multipleURI4j2easy(lowerDef);
			//System.out.println("model : " + lowerDef + " vs " + lowerDesc);
			Assert.assertEquals(lowerDef, lowerDesc);
		}
	}

	private String readFileAsString(File filePath) throws java.io.IOException {
		StringBuffer fileData = new StringBuffer(1000);
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		char[] buf = new char[1024];
		int numRead = 0;
		while ((numRead = reader.read(buf)) != -1) {
			String readData = String.valueOf(buf, 0, numRead);
			fileData.append(readData);
			buf = new char[1024];
		}
		reader.close();
		return fileData.toString();
	}
	
	
	private String multipleURI4j2easy(String str) {
		String result = str;
		result = result.replaceAll("\\s+", ", ");
		result = '[' + result + ']';
		return result;
	}
	
}

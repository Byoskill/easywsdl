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

import javax.wsdl.Definition;
import javax.xml.parsers.ParserConfigurationException;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.ow2.easywsdl.wsdl.WSDLFactory;
import org.ow2.easywsdl.wsdl.api.Description;
import org.ow2.easywsdl.wsdl.api.WSDLException;
import org.ow2.easywsdl.wsdl.api.WSDLReader;
import org.ow2.easywsdl.wsdl.test.util.XSLTConverter;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;


/**
 * @author Nicolas Boissel-Dallier - eBM WebSourcing
 */
public class TestPerformances  extends TestCase {

    public void testWSDL4JComparaison() throws WSDLException, URISyntaxException, javax.wsdl.WSDLException {
		
		long start;
		long middle;
		long end;
		
		long timeWSDL4J;
		long totalTimeWSDL4J = 0;
		long timeEasyWSDL;
		long totalTimeEasyWSDL = 0;
		int nbTests = 0;
		
		WSDLReader readerDesc = WSDLFactory.newInstance().newWSDLReader();
		javax.wsdl.xml.WSDLReader readerDef = javax.wsdl.factory.WSDLFactory.newInstance().newWSDLReader();
		readerDef.setFeature("javax.wsdl.verbose", false);
		
//		System.out.println("##  Performance test vs WSDL4J  ##\n");
//		System.out.println("|nb   | WSDL4J     | EasyWSDL   | Diff");
		
		for (final URL wsdl : WSDLList.getWsdls11()) {
			
			start = System.currentTimeMillis();
			
			try {
                final Description desc = readerDesc.read(wsdl);
            } catch (final IOException e) {
                e.printStackTrace();
            }
            middle = System.currentTimeMillis();
			
			final Definition def = readerDef.readWSDL(wsdl.toString());
			
			end = System.currentTimeMillis();
			
			timeEasyWSDL = middle - start;
			totalTimeEasyWSDL += timeEasyWSDL;
			timeWSDL4J = end - middle;
			totalTimeWSDL4J += timeWSDL4J;
			nbTests++;
			
//			System.out.printf("|%2d   |%8d ms |%8d ms |\n", nbTests, timeWSDL4J, timeEasyWSDL);
		}
		
//		System.out.printf("|Avg  |%8d ms |%8d ms |\n\n", (totalTimeWSDL4J/nbTests), (totalTimeEasyWSDL/nbTests));
		
		Assert.assertTrue("Performance tests are too slow", (totalTimeEasyWSDL/nbTests) < 200);
	}
	
	public void testWodenComparaison() throws URISyntaxException, IOException, SAXException, ParserConfigurationException, WSDLException, org.apache.woden.WSDLException, javax.wsdl.WSDLException {
		
		long start;
		long middle;
		long end;
		
		long timeWoden;
		long totalTimeWoden = 0;
		long timeEasyWSDL;
		long totalTimeEasyWSDL = 0;
		int nbTests = 0;
		
		WSDLReader reader = WSDLFactory.newInstance().newWSDLReader();
		org.apache.woden.WSDLReader readerDef = org.apache.woden.WSDLFactory.newInstance().newWSDLReader();
		
//		System.out.println("##  Performance test vs Woden  ##");
//		System.out.println("#         WSDL2.0 tests         #\n");
//		System.out.println("|nb   | Woden      | EasyWSDL   |");
		for (final URL wsdlUrl : WSDLList.getWsdls11()) {

			final InputSource easyWsdlInputSource = new InputSource(wsdlUrl.openStream());
			easyWsdlInputSource.setSystemId(wsdlUrl.toString());
            // WSDL 1.1 must converted to WSDL 2.0 to be parsed by Woden. The
            // transformation must not be included in processing duration
            final InputSource wodenInputSource = XSLTConverter.getInstance().convert(wsdlUrl);
            
			start = System.currentTimeMillis();
			
			final Description desc = reader.read(easyWsdlInputSource);
			
			middle = System.currentTimeMillis();
	
			final org.apache.woden.wsdl20.Description def = readerDef.readWSDL(
					new org.ow2.easywsdl.wsdl.test.util.BaseWSDLSource(wodenInputSource, wsdlUrl.toURI()));
			
			end = System.currentTimeMillis();
			
			timeEasyWSDL = middle - start;
			totalTimeEasyWSDL += timeEasyWSDL;
			timeWoden = end - middle;
			totalTimeWoden += timeWoden;
			nbTests++;
			
//			System.out.printf("|%2d   |%8d ms |%8d ms |\n", nbTests, timeWoden, timeEasyWSDL);
		}
		
//		System.out.printf("|Avg  |%8d ms |%8d ms |\n\n", (totalTimeWoden/nbTests), (totalTimeEasyWSDL/nbTests));
		
		Assert.assertTrue("Performance tests too slow", (totalTimeEasyWSDL/nbTests) < 100);
	}

	
//	public void testLargeScaled() throws URISyntaxException, IOException, SAXException, ParserConfigurationException, WSDLException, org.apache.woden.WSDLException, javax.wsdl.WSDLException {
//		
//		// Time variables
//		long start;
//		long end;
//		
//		long totalTimeWSDL4J = 0;
//		long totalTimeWoden = 0;
//		long timeEasyWSDL;
//		long totalTimeEasyWSDL11 = 0;
//		long totalTimeEasyWSDL20 = 0;
//		int nbTests11 = 0;
//		int nbTests20 = 0;
//		int nbErrorsWSDL4J = 0;
//		int nbErrorsWoden = 0;
//		int nbErrorsEasyWSDL = 0;
//		
//		// Readers 
//		WSDLReader reader = WSDLFactory.newInstance().newWSDLReader();
//		org.apache.woden.WSDLReader readerWoden = org.apache.woden.WSDLFactory.newInstance().newWSDLReader();
//		javax.wsdl.xml.WSDLReader readerWSDL4J = javax.wsdl.factory.WSDLFactory.newInstance().newWSDLReader();
//		readerWSDL4J.setFeature("javax.wsdl.verbose", false);
//		
//		String filePath = "./src/test/resources/large-scale";
//		//String filePath = "W:/Workspace/dev/seekda";
//		
//		File directory = new File(filePath);
//		File[] fileList = directory.listFiles();
//		
//		for(int i = 0; i < fileList.length ; i++) {
//			
//			String fileName = fileList[i].getName();
//
//			if(fileList[i].isFile() && fileName.endsWith(".wsdl")){
//				
//				URI wsdlURI = fileList[i].toURI();
//				
//				//EasyWSDL
//				start = System.currentTimeMillis();
//				try{
//					Description desc = reader.readWSDL(wsdlURI);
//
//					end = System.currentTimeMillis();
//					
//					Assert.assertNotNull(desc);
//					timeEasyWSDL = (end - start);
//					
//					// If WSDL 1.1
//					if(desc instanceof org.ow2.easywsdl.wsdl.impl.wsdl11.DescriptionImpl) {
//						
//						//WSDL4J
//						start = System.currentTimeMillis();
//						javax.wsdl.Definition defWSDL4J = readerWSDL4J.readWSDL(wsdlURI.toString());
//						end = System.currentTimeMillis();
//						
//						Assert.assertNotNull(defWSDL4J);
//						totalTimeEasyWSDL11 += timeEasyWSDL;
//						totalTimeWSDL4J += (end - start);
//						
//						nbTests11++;
//						
//					//If WSDL 2.0
//					} else if(desc instanceof org.ow2.easywsdl.wsdl.impl.wsdl20.DescriptionImpl) {
//						
//						//Woden
//						start = System.currentTimeMillis();
//						org.apache.woden.wsdl20.Description descWoden = readerWoden.readWSDL(wsdlURI.toString());
//						end = System.currentTimeMillis();
//						
//						Assert.assertNotNull(descWoden);
//						totalTimeEasyWSDL20 += timeEasyWSDL;
//						totalTimeWoden += (end - start);
//						
//						nbTests20++;
//					}
//				} catch (WSDLException e){
//					nbErrorsEasyWSDL++;
//					//System.out.println("Error EasyWSDL: " + e.getMessage());
//				} catch (javax.wsdl.WSDLException e) {
//					nbErrorsWSDL4J++;
//					//System.out.println("Error WSDL4J: " + e.getMessage());
//				} catch (org.apache.woden.WSDLException e){
//					nbErrorsWoden++;
//					//System.out.println("Error Woden: " + e.getMessage());
//				}
//			}
//
//		}
//		
//		System.out.println("##  Large-scaled performance test  ##\n");
//		
//		if(nbTests11 != 0) {
//			System.out.println("##    Tests en WSDL 1.1, WSDL4J    ##");
//			System.out.println(" ___________________________________");
//			System.out.println("| Nb    | WSDL4J      | EasyWSDL    |");
//			System.out.printf("| %5d | %8d ms | %8d ms |\n", nbTests11, (totalTimeWSDL4J/nbTests11), (totalTimeEasyWSDL11/nbTests11));
//			System.out.println(" -----------------------------------\n\n");
//		}
//		if(nbTests20 != 0) {
//			System.out.println("##    Tests en WSDL 2.0, Woden     ##");
//			System.out.println(" ___________________________________");
//			System.out.println("| Nb    | Woden       | EasyWSDL    |");
//			System.out.printf("| %5d | %8d ms | %8d ms |\n", nbTests20, (totalTimeWoden/nbTests20), (totalTimeEasyWSDL20/nbTests20));
//			System.out.println(" -----------------------------------\n\n");
//		}
//		System.out.println("Nb errors EasyWSDL: "+nbErrorsEasyWSDL);
//		System.out.println("Nb errors WSDL4J: "+nbErrorsWSDL4J);
//		System.out.println("Nb errors Woden: "+nbErrorsWoden);
//	}

}

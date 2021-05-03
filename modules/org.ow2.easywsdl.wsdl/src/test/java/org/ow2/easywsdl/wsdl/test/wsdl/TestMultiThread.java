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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

import org.ow2.easywsdl.wsdl.WSDLFactory;
import org.ow2.easywsdl.wsdl.api.Description;
import org.ow2.easywsdl.wsdl.api.WSDLException;
import org.ow2.easywsdl.wsdl.api.WSDLReader;


/**
 * @author Nicolas Boissel-Dallier - eBM WebSourcing
 */
public class TestMultiThread  extends TestCase {

	public void testMultiThread() throws WSDLException, URISyntaxException, javax.wsdl.WSDLException, InterruptedException, Throwable {


		WSDLReader readerDesc = WSDLFactory.newInstance().newWSDLReader();
		javax.wsdl.xml.WSDLReader readerDef = javax.wsdl.factory.WSDLFactory.newInstance().newWSDLReader();
		readerDef.setFeature("javax.wsdl.verbose", false);

		List<ThreadWSDLReader> readers = new ArrayList<ThreadWSDLReader>();
		List<URL> wsdls = null;
		Iterator<URL> it = WSDLList.getWsdls11().iterator();
		while(it.hasNext()) {
			wsdls = new ArrayList<URL>();
			if(it.hasNext()) {
				wsdls.add(it.next());
			}
			if(it.hasNext()) {
				wsdls.add(it.next());
			}
			if(it.hasNext()) {
				wsdls.add(it.next());
			}
			readers.add(new ThreadWSDLReader(readerDesc, readerDef, wsdls));
		}

		for(ThreadWSDLReader reader: readers) {
			reader.start();
		}

		for(ThreadWSDLReader reader: readers) {
				reader.join();
		}
		
		for(ThreadWSDLReader reader: readers) {
            if (reader.error != null) {
                throw reader.error;
            }
		}
		
	}

	private static class ThreadWSDLReader extends Thread {

		private WSDLReader reader;
		
		private Throwable error = null;

		private List<URL> wsdls;

		public ThreadWSDLReader(WSDLReader reader, javax.wsdl.xml.WSDLReader readerDef, List<URL> wsdls) {
			this.reader = reader;
			this.wsdls = wsdls;
		}

		@Override
		public void run() {
			Description desc = null;
			try {
				for(int i = 0; i < 10; i++) {
					for(URL url: wsdls) {
						desc = reader.read(url);
						//System.out.println("desc.getQName() = " + desc.getQName());
						if(desc == null){
							throw new AssertionFailedError();
						}
					}
				}
			} catch (WSDLException e) {
				this.error = e;
			} catch (IOException e) {
                this.error = e;
            } catch (URISyntaxException e) {
                this.error = e;
            } catch (AssertionFailedError e) {
                this.error = e;
            }
		}
	}
}

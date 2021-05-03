/**
 * PETALS - PETALS Services Platform.
 * Copyright (c) 2008 OW2 Consortium, http://www.ow2.org/
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * -------------------------------------------------------------------------
 * $Id$
 * -------------------------------------------------------------------------
 */

package org.ow2.easywsdl.wsdl.test.util;

import java.io.IOException;
import java.io.InputStream;

import junit.framework.TestCase;

import org.ow2.easywsdl.wsdl.util.InputStreamForker;

/**
 * Initial developer(s): Christophe DENEUX
 * 
 * @author cdeneux - Capgemini Sud
 * 
 */
public class InputStreamForkerTest extends TestCase {
    
    private static final String AVAILABLE_FILE = "org/ow2/easywsdl/wsdl/test/util/inputstreamforker/available-file.txt";

    public void testAvailableWithReading() {

        try {
            final InputStream isOriginal = Thread
                    .currentThread()
                    .getContextClassLoader()
                    .getResourceAsStream(AVAILABLE_FILE);

            final InputStreamForker isf = new InputStreamForker(isOriginal);

            final InputStream isOne = isf.getInputStreamOne();
            final byte[] bufferOne = new byte[3];
            int bytesRead = isOne.read(bufferOne);
            TestCase.assertEquals(3, bytesRead);
            TestCase.assertEquals("Hi,", new String(bufferOne));

            int availableOne = isOne.available();
            int availableTwo = isf.getInputStreamTwo().available();

            TestCase.assertEquals(24, availableOne);
            TestCase.assertEquals(27, availableTwo);

        } catch (IOException e) {
            e.printStackTrace();
            TestCase.fail();
        }

    }

    public void testReadFullAtOnce() {

        try {
            final InputStream isOriginal = Thread
                    .currentThread()
                    .getContextClassLoader()
                    .getResourceAsStream(AVAILABLE_FILE);

            final InputStreamForker isf = new InputStreamForker(isOriginal);

            final InputStream isOne = isf.getInputStreamOne();
            final byte[] bufferOne = new byte[1024];
            int bytesReadOne = isOne.read(bufferOne);
            TestCase.assertEquals(27, bytesReadOne);

            TestCase.assertEquals(0, isOne.available());
            TestCase.assertEquals(27, isf.getInputStreamTwo().available());

            final InputStream isTwo = isf.getInputStreamTwo();
            final byte[] bufferTwo = new byte[1024];
            final int bytesReadTwo = isTwo.read(bufferTwo);
            TestCase.assertEquals(27, bytesReadTwo);

            TestCase.assertEquals(0, isOne.available());
            TestCase.assertEquals(0, isf.getInputStreamTwo().available());

        } catch (IOException e) {
            e.printStackTrace();
            TestCase.fail();
        }

    }

    public void testReadPartial() {

        try {
            final InputStream isOriginal = Thread
                    .currentThread()
                    .getContextClassLoader()
                    .getResourceAsStream(AVAILABLE_FILE);

            final InputStreamForker isf = new InputStreamForker(isOriginal);

            final InputStream isOne = isf.getInputStreamOne();
            final InputStream isTwo = isf.getInputStreamTwo();

            final byte[] bufferOneOne = new byte[10];
            int bytesReadOneOne = isOne.read(bufferOneOne);
            TestCase.assertEquals(10, bytesReadOneOne);
            TestCase.assertEquals(17, isOne.available());

            TestCase.assertEquals(27, isTwo.available());

            final byte[] bufferOneTwo = new byte[10];
            int bytesReadOneTwo = isOne.read(bufferOneTwo);
            TestCase.assertEquals(10, bytesReadOneTwo);
            TestCase.assertEquals(7, isOne.available());

            TestCase.assertEquals(27, isTwo.available());

            final byte[] bufferOneThree = new byte[10];
            int bytesReadOneThree = isOne.read(bufferOneThree);
            TestCase.assertEquals(7, bytesReadOneThree);
            TestCase.assertEquals(0, isOne.available());

            TestCase.assertEquals(27, isTwo.available());
            TestCase.assertEquals("Hi,\n\nMy length is 27 bytes.", new String(
                    bufferOneOne)
                    + new String(bufferOneTwo)
                    + new String(bufferOneThree, 0, bytesReadOneThree));

            final byte[] bufferTwoOne = new byte[15];
            int bytesReadTwoOne = isTwo.read(bufferTwoOne);
            TestCase.assertEquals(15, bytesReadTwoOne);
            TestCase.assertEquals(12, isTwo.available());

            final byte[] bufferTwoTwo = new byte[15];
            int bytesReadTwoTwo = isTwo.read(bufferTwoTwo);
            TestCase.assertEquals(12, bytesReadTwoTwo);
            TestCase.assertEquals(0, isTwo.available());

            TestCase.assertEquals("Hi,\n\nMy length is 27 bytes.", new String(
                    bufferTwoOne)
                    + new String(bufferTwoTwo, 0, bytesReadTwoTwo));
            
            final byte[] bufferTwoThree = new byte[150];
            int bytesReadTwoThree = isTwo.read(bufferTwoThree);
            TestCase.assertEquals("EOF must be reached", -1, bytesReadTwoThree);

        } catch (IOException e) {
            e.printStackTrace();
            TestCase.fail();
        }

    }

    public void testPartialReadAndClose() {

        try {
            final InputStream isOriginal = Thread
                    .currentThread()
                    .getContextClassLoader()
                    .getResourceAsStream(AVAILABLE_FILE);

            final InputStreamForker isf = new InputStreamForker(isOriginal);

            final InputStream isOne = isf.getInputStreamOne();
            final InputStream isTwo = isf.getInputStreamTwo();

            final byte[] bufferOneOne = new byte[10];
            int bytesReadOneOne = isOne.read(bufferOneOne);
            TestCase.assertEquals(10, bytesReadOneOne);
            TestCase.assertEquals(17, isOne.available());

            TestCase.assertEquals(27, isTwo.available());

            final byte[] bufferOneTwo = new byte[10];
            int bytesReadOneTwo = isOne.read(bufferOneTwo);
            TestCase.assertEquals(10, bytesReadOneTwo);
            TestCase.assertEquals(7, isOne.available());
            
            isOne.close();
            // As the forked input stream 'isOne' is closed, available bytes of
            // the orihinal input stream are no more available for this forked
            // input stream.
            TestCase.assertEquals(0, isOne.available());

            TestCase.assertEquals(27, isTwo.available());

            TestCase.assertEquals(27, isTwo.available());
            TestCase.assertEquals("Hi,\n\nMy length is 27", new String(
                    bufferOneOne)
                    + new String(bufferOneTwo));

            final byte[] bufferTwoOne = new byte[15];
            int bytesReadTwoOne = isTwo.read(bufferTwoOne);
            TestCase.assertEquals(15, bytesReadTwoOne);
            TestCase.assertEquals(12, isTwo.available());

            final byte[] bufferTwoTwo = new byte[15];
            int bytesReadTwoTwo = isTwo.read(bufferTwoTwo);
            TestCase.assertEquals(12, bytesReadTwoTwo);
            TestCase.assertEquals(0, isTwo.available());

            TestCase.assertEquals("Hi,\n\nMy length is 27 bytes.", new String(
                    bufferTwoOne)
                    + new String(bufferTwoTwo, 0, bytesReadTwoTwo));

        } catch (IOException e) {
            e.printStackTrace();
            TestCase.fail();
        }

    }

    public void testClosedInputStreamNoException() {
        try {
            final InputStream isOriginal = Thread
                    .currentThread()
                    .getContextClassLoader()
                    .getResourceAsStream(AVAILABLE_FILE);

            final InputStreamForker isf = new InputStreamForker(isOriginal);

            final InputStream isOne = isf.getInputStreamOne();
            final InputStream isTwo = isf.getInputStreamTwo();

            final byte[] bufferOneOne = new byte[1024];
            int bytesReadOneOne = isOne.read(bufferOneOne);
            TestCase.assertEquals(27, bytesReadOneOne);
            TestCase.assertEquals(0, isOne.available());
            TestCase.assertEquals(27, isTwo.available());
            TestCase.assertEquals("Hi,\n\nMy length is 27 bytes.", new String(
                    bufferOneOne, 0, bytesReadOneOne));

            isOriginal.close();

            final byte[] bufferTwoOne = new byte[27];
            int bytesReadTwoOne = isTwo.read(bufferTwoOne);
            TestCase.assertEquals(27, bytesReadTwoOne);
            try {
                TestCase.assertEquals(0, isTwo.available());
                TestCase.assertEquals("Not thrown IOException", true, false);
            } catch (final IOException e) {
                // NOP. It is the expected case.
            }
            TestCase.assertEquals("Hi,\n\nMy length is 27 bytes.", new String(
                    bufferTwoOne, 0, bytesReadTwoOne));

        } catch (IOException e) {
            e.printStackTrace();
            TestCase.fail();
        }
    }
    
    public void testClosedInputStreamWithException() {
        try {
            final InputStream isOriginal = Thread
                    .currentThread()
                    .getContextClassLoader()
                    .getResourceAsStream(AVAILABLE_FILE);

            final InputStreamForker isf = new InputStreamForker(isOriginal);

            final InputStream isOne = isf.getInputStreamOne();
            final InputStream isTwo = isf.getInputStreamTwo();

            final byte[] bufferOneOne = new byte[10];
            int bytesReadOneOne = isOne.read(bufferOneOne);
            TestCase.assertEquals(10, bytesReadOneOne);
            TestCase.assertEquals(17, isOne.available());
            TestCase.assertEquals(27, isTwo.available());
            TestCase.assertEquals("Hi,\n\nMy le", new String(
                    bufferOneOne, 0, bytesReadOneOne));

            isOriginal.close();

            final byte[] bufferTwoOne = new byte[1024];
            isTwo.read(bufferTwoOne);
            TestCase.assertEquals("Not thrown IOException", true, false);

        } catch (IOException e) {
            // NOP. It is the expected case. A IOEXception is thrown when calling read of the second forked stream
        }
    }

}

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

import javax.xml.namespace.QName;

import org.ow2.easywsdl.schema.impl.Constants;

/**
 * Define the unit test environement
 * 
 * @author Christophe DENEUX - Capgemini Sud
 */
public class Environement {
    
    protected final static String DESCRIPTOR_CTX = "descriptors";
    
    protected final static String DESCRIPTOR_IN_JAR_CTX = "descriptors-in-jar";
    
    protected final static String SAMPLE_XSD = DESCRIPTOR_CTX + "/sample.xsd";
    
    protected final static String SAMPLE_XSD_EQUALS = DESCRIPTOR_CTX + "/sample_equals.xsd";
    
    protected final static String RESERVATIONLIST_XSD = DESCRIPTOR_CTX + "/reservationList.xsd";

    protected final static String RESERVATIONLIST_XSD_IN_JAR = DESCRIPTOR_IN_JAR_CTX + "/reservationList.xsd";

    protected final static String RESERVATIONDETAILS_XSD = DESCRIPTOR_CTX + "/reservationDetails.xsd";
    
    protected static class SampleWithSpaceInItsName {
        
        protected final static String XSD = DESCRIPTOR_CTX + "/sample with space in its name.xsd";
        
    }
    
    protected static class EltRefWithoutImport {
        
        protected final static String XSD = DESCRIPTOR_CTX + "/element-ref without import.xsd";
        
        protected final static String NAMESPACE = "http://foo.example.com/myNamespace";
        
        protected final static QName MYELT_ELT = new QName(NAMESPACE, "myElt");
        
        protected final static QName SCHEMA_ELT = new QName(Constants.SCHEMA_NAMESPACE, "schema");
            
    }
    
    
    protected final static String RESERVATIONDETAILS_NAMESPACE = "http://greath.example.com/2004/schemas/reservationDetails";
    
    protected final static QName RESERVATIONDETAILS_CONFNUMBER_ELT = new QName(RESERVATIONDETAILS_NAMESPACE, "confirmationNumber");
    
    protected final static String RESERVATIONLIST_NAMESPACE = "http://greath.example.com/2004/schemas/reservationList";
    
    protected final static QName RESERVATIONLIST_RESERVATION_ELT = new QName(RESERVATIONLIST_NAMESPACE, "reservation");

    
}

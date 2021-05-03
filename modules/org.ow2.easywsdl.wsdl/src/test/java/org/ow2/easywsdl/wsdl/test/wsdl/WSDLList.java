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

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Nicolas Salatge - eBM WebSourcing
 */
public class WSDLList {

    private final static List<URL> wsdls11 = new ArrayList<URL>();

    private final static List<URL> wsdls20 = new ArrayList<URL>();
    
    static {
        /* WSDL 1.1 */
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/WeatherForecast.wsdl"));
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/tuxDroid-CXF.wsdl"));
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/importwsdl/CustomerSearch.wsdl"));
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/GoogleSearch.wsdl"));
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/AmazonWebServices.wsdl"));
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/ValidateEmail.wsdl"));
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/usweather.wsdl"));
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/luhnchecker.wsdl"));
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/stockquote.wsdl"));

        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/muller.wsdl"));
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/ZipCode.wsdl"));
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/CurrencyExchange.wsdl"));
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/delayedstockquote.wsdl"));
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/country.wsdl"));

        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/sendsmsworld.wsdl"));
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/CurrencyConverter.wsdl"));
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/soap.wsdl"));
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/Artist.wsdl"));
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/textgraphic.wsdl"));

        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/webclock.wsdl"));
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/PasswordGeneratorService.wsdl"));
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/WorldTimeWebService.wsdl"));
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/server.wsdl"));
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/addresslookup.wsdl"));
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/companyInfo.wsdl"));

        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/medicareSupplier.wsdl"));
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/xstatistics.wsdl"));
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/NED.wsdl"));
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/CaptchaService.wsdl"));
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/exchangerates.wsdl"));
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/CalculateAccurateMass.wsdl"));
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherElmts/wsdl11/wsdl66.wsdl"));

        //Usecase armee air
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/armee-wsdlsiga.wsdl"));
        WSDLList.wsdls11.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/otherswsdl/armee-wsdl.wsdl"));

        /* WSDL 2.0 */
        WSDLList.wsdls20.add(Thread.currentThread().getContextClassLoader().getResource(
                "descriptors/reservationList.wsdl"));

    }

    /**
     * @return the wsdls11
     */
    public static List<URL> getWsdls11() {
        return WSDLList.wsdls11;
    }

    /**
     * @return the wsdls20
     */
    public static List<URL> getWsdls20() {
        return WSDLList.wsdls20;
    }

}

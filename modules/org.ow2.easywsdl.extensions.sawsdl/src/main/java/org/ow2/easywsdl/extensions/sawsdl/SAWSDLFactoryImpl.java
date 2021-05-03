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
package org.ow2.easywsdl.extensions.sawsdl;

import java.util.Map;

import org.ow2.easywsdl.extensions.sawsdl.api.Description;
import org.ow2.easywsdl.extensions.sawsdl.api.SAWSDLException;
import org.ow2.easywsdl.extensions.sawsdl.api.SAWSDLReader;
import org.ow2.easywsdl.extensions.sawsdl.api.SAWSDLWriter;
import org.ow2.easywsdl.extensions.sawsdl.impl.converter.WSDLConverter;
import org.ow2.easywsdl.extensions.sawsdl.impl.inout.SAWSDLReaderImpl;
import org.ow2.easywsdl.extensions.sawsdl.impl.inout.SAWSDLWriterImpl;
import org.ow2.easywsdl.wsdl.api.WSDLException;
import org.ow2.easywsdl.wsdl.api.WSDLReader.FeatureConstants;
import org.ow2.easywsdl.wsdl.api.abstractItf.AbsItfDescription;


/**
 * This class is a concrete implementation of the abstract class WSDLFactory.
 * Some ideas used here have been shamelessly copied from the wonderful JAXP and
 * Xerces work.
 * 
 * @author Nicolas Salatge - eBM WebSourcing
 */
public class SAWSDLFactoryImpl extends SAWSDLFactory {

    @SuppressWarnings("unchecked")
    @Override
    public Description addSAWSDLElmt2Description(final AbsItfDescription desc) throws SAWSDLException {
        Description newDesc = null;
        try {
            newDesc = WSDLConverter.getIntance().convertDescription(desc);
        } catch (final WSDLException e) {
            throw new SAWSDLException(e);
        }
        return newDesc;
    }

    @Override
    public Description addExtElmt2Description(final AbsItfDescription desc) throws SAWSDLException {
        return addSAWSDLElmt2Description(desc);
    }
    
    @Override
    public SAWSDLReader newSAWSDLReader() throws SAWSDLException {
        return new SAWSDLReaderImpl();
    }

    @Override
    public SAWSDLReader newSAWSDLReader(final Map<FeatureConstants, Object> features)
            throws SAWSDLException {
        final SAWSDLReader reader = new SAWSDLReaderImpl();
        ((SAWSDLReaderImpl) reader).setFeatures(features);
        return reader;
    }

    @Override
    public SAWSDLWriter newSAWSDLWriter() throws SAWSDLException {
        return new SAWSDLWriterImpl();
    }

	@Override
	public Class getDescriptionType() {
		return Description.class;
	}
    
    

}

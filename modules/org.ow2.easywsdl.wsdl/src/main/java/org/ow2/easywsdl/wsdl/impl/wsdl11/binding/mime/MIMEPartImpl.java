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
package org.ow2.easywsdl.wsdl.impl.wsdl11.binding.mime;

import java.util.List;

import javax.xml.namespace.QName;

import org.apache.commons.lang.NotImplementedException;
import org.ow2.easywsdl.wsdl.api.abstractElmt.AbstractBindingOperationImpl;
import org.ow2.easywsdl.wsdl.api.abstractElmt.AbstractBindingParamImpl;
import org.ow2.easywsdl.wsdl.api.abstractItf.AbsItfBindingParam;
import org.ow2.easywsdl.wsdl.api.binding.BindingProtocol;
import org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl.mime.TPart;

/**
 * @author Nicolas Salatge - eBM WebSourcing
 */
public class MIMEPartImpl implements
        org.ow2.easywsdl.wsdl.api.binding.wsdl11.mime.MIMEPart {

    private final TPart part;

    private final AbsItfBindingParam param;

    private final BindingProtocol bindingProtocol;

    /**
     * 
     * @param part
     * @param elmt
     * @param param
     */
    @SuppressWarnings("unchecked")
    public MIMEPartImpl(final TPart part, final AbsItfBindingParam param) {
        this.part = part;
        this.param = param;

        // get the binding protocol
        this.bindingProtocol = AbstractBindingParamImpl.extractBindingProtocol((List) this.part
                .getAny(), (AbstractBindingParamImpl) this.param);
    }

    @SuppressWarnings("unchecked")
    public QName getPartQName() {
        QName res = null;
        if (this.part.getName() != null) {
            res = new QName(((AbstractBindingOperationImpl) ((AbstractBindingParamImpl) this.param)
                    .getBindingOperation()).getQName().getNamespaceURI(), this.part.getName());
        }
        return res;
    }

    public void setPartQName(final QName name) {
        throw new NotImplementedException();
    }

    public BindingProtocol getBindingProtocol() {
        return this.bindingProtocol;
    }

}

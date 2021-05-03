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
package org.ow2.easywsdl.extensions.sawsdl.impl;

import java.net.URI;
import java.util.List;

import org.ow2.easywsdl.extensions.sawsdl.api.AttrExtensions;
import org.ow2.easywsdl.extensions.sawsdl.api.Binding;
import org.ow2.easywsdl.extensions.sawsdl.api.Description;
import org.ow2.easywsdl.extensions.sawsdl.api.Endpoint;
import org.ow2.easywsdl.extensions.sawsdl.api.Import;
import org.ow2.easywsdl.extensions.sawsdl.api.Include;
import org.ow2.easywsdl.extensions.sawsdl.api.InterfaceType;
import org.ow2.easywsdl.extensions.sawsdl.api.SAWSDLElement;
import org.ow2.easywsdl.extensions.sawsdl.api.SAWSDLException;
import org.ow2.easywsdl.extensions.sawsdl.api.Service;
import org.ow2.easywsdl.extensions.sawsdl.api.Types;
import org.ow2.easywsdl.wsdl.api.WSDLException;
import org.ow2.easywsdl.wsdl.api.abstractItf.AbsItfDescription;
import org.ow2.easywsdl.wsdl.decorator.DecoratorDescriptionImpl;

/**
 * @author Nicolas Salatge - eBM WebSourcing
 */

public class DescriptionImpl extends
DecoratorDescriptionImpl<Service, Endpoint, Binding, InterfaceType, Include, Import, Types> implements
Description {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private SAWSDLElement elmt = null;

	@SuppressWarnings("unchecked")
	public DescriptionImpl(final AbsItfDescription wsdl) throws WSDLException {
		super(wsdl, TypesImpl.class);

		this.elmt = new SAWSDLElementImpl<AbsItfDescription>(wsdl);
	}

	public List<URI> getModelReference() throws SAWSDLException {
		return this.elmt.getModelReference();
	}
	
	public void addModelReference(final URI uri) throws SAWSDLException {
		this.elmt.addModelReference(uri);
	}

	public List<URI> removeAllModelReferences() throws SAWSDLException {
		return this.elmt.removeAllModelReferences();
	}

	public URI removeModelReference(final URI uri) throws SAWSDLException {
		return this.elmt.removeModelReference(uri);
	}

//	@Override
//	public void setTypes(Types type) {
//		if((type instanceof DecoratorTypesImpl)&&(this.wsdl instanceof AbstractDescriptionImpl)) {
//			((AbstractDescriptionImpl)this.wsdl).setTypes( (AbsItfTypes) ((DecoratorTypesImpl)type).getDecorator());
//		} else {
//			super.setTypes(type);
//		}
//	}

	public AttrExtensions getAttrExtensions() throws SAWSDLException {
		return this.elmt.getAttrExtensions();
	}

//	@Override
//	public Types getTypes() {
//		Types types = null;
//		try {
//			types = new TypesImpl(this.wsdl.getTypes());
//		} catch (WSDLException e) {
//			// do nothing
//			e.printStackTrace();
//		}
//		return types;
//	}

}

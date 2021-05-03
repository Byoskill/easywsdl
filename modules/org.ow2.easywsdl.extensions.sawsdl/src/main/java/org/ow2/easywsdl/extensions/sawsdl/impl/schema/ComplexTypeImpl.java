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
package org.ow2.easywsdl.extensions.sawsdl.impl.schema;

import java.net.URI;
import java.util.List;

import org.ow2.easywsdl.extensions.sawsdl.api.AttrExtensions;
import org.ow2.easywsdl.extensions.sawsdl.api.SASchemaElement;
import org.ow2.easywsdl.extensions.sawsdl.api.SAWSDLException;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.All;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.Attribute;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.Choice;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.ComplexContent;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.ComplexType;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.Sequence;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.SimpleContent;
import org.ow2.easywsdl.extensions.sawsdl.impl.SASchemaElementImpl;
import org.ow2.easywsdl.schema.api.SchemaException;
import org.ow2.easywsdl.schema.api.absItf.AbsItfComplexType;
import org.ow2.easywsdl.schema.decorator.DecoratorComplexTypeImpl;
import org.ow2.easywsdl.wsdl.api.WSDLException;


/**
 * @author Nicolas Salatge - eBM WebSourcing
 */
public class ComplexTypeImpl extends DecoratorComplexTypeImpl<Attribute, Sequence, All, Choice, ComplexContent, SimpleContent> implements ComplexType {

    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;

    private SASchemaElement elmt = null;

    @SuppressWarnings("unchecked")
    public ComplexTypeImpl(final AbsItfComplexType complexType) throws WSDLException, SchemaException {
        super(complexType, AttributeImpl.class, SequenceImpl.class, AllImpl.class, ChoiceImpl.class, ComplexContentImpl.class, SimpleContentImpl.class);

        this.elmt = new SASchemaElementImpl<AbsItfComplexType>(complexType);
    }

    public List<URI> getLiftingSchemaMapping() throws SAWSDLException {
        return this.elmt.getLiftingSchemaMapping();
    }

    public List<URI> getLoweringSchemaMapping() throws SAWSDLException {
        return this.elmt.getLoweringSchemaMapping();
    }

    public List<URI> getModelReference() throws SAWSDLException {
        return this.elmt.getModelReference();
    }

    public void addLiftingSchemaMapping(final URI uri) throws SAWSDLException {
        this.elmt.addLiftingSchemaMapping(uri);
    }

    public void addLoweringSchemaMapping(final URI uri) throws SAWSDLException {
        this.elmt.addLoweringSchemaMapping(uri);
    }

    public void addModelReference(final URI uri) throws SAWSDLException {
        this.elmt.addModelReference(uri);
    }

    public List<URI> removeAllLiftingSchemaMappings() throws SAWSDLException {
        return this.elmt.removeAllLiftingSchemaMappings();
    }

    public List<URI> removeAllLoweringSchemaMappings() throws SAWSDLException {
        return this.elmt.removeAllLoweringSchemaMappings();
    }

    public List<URI> removeAllModelReferences() throws SAWSDLException {
        return this.elmt.removeAllModelReferences();
    }

    public URI removeLiftingSchemaMapping(final URI uri) throws SAWSDLException {
        return this.elmt.removeLiftingSchemaMapping(uri);
    }

    public URI removeLoweringSchemaMapping(final URI uri) throws SAWSDLException {
        return this.elmt.removeLoweringSchemaMapping(uri);
    }

    public URI removeModelReference(final URI uri) throws SAWSDLException {
        return this.elmt.removeModelReference(uri);
    }

	public AttrExtensions getAttrExtensions() throws SAWSDLException {
		return this.elmt.getAttrExtensions();
	}
}

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
package org.ow2.easywsdl.extensions.sawsdl.impl.converter;

import org.ow2.easywsdl.extensions.sawsdl.api.Binding;
import org.ow2.easywsdl.extensions.sawsdl.api.BindingFault;
import org.ow2.easywsdl.extensions.sawsdl.api.BindingInput;
import org.ow2.easywsdl.extensions.sawsdl.api.BindingOperation;
import org.ow2.easywsdl.extensions.sawsdl.api.BindingOutput;
import org.ow2.easywsdl.extensions.sawsdl.api.Description;
import org.ow2.easywsdl.extensions.sawsdl.api.Endpoint;
import org.ow2.easywsdl.extensions.sawsdl.api.Fault;
import org.ow2.easywsdl.extensions.sawsdl.api.Import;
import org.ow2.easywsdl.extensions.sawsdl.api.Include;
import org.ow2.easywsdl.extensions.sawsdl.api.Input;
import org.ow2.easywsdl.extensions.sawsdl.api.InterfaceType;
import org.ow2.easywsdl.extensions.sawsdl.api.Operation;
import org.ow2.easywsdl.extensions.sawsdl.api.Output;
import org.ow2.easywsdl.extensions.sawsdl.api.Service;
import org.ow2.easywsdl.extensions.sawsdl.api.Types;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.Annotation;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.Attribute;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.AttributeGroup;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.ComplexType;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.Element;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.Group;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.Notation;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.Redefine;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.Schema;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.SimpleType;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.Type;
import org.ow2.easywsdl.extensions.sawsdl.impl.BindingFaultImpl;
import org.ow2.easywsdl.extensions.sawsdl.impl.BindingImpl;
import org.ow2.easywsdl.extensions.sawsdl.impl.BindingInputImpl;
import org.ow2.easywsdl.extensions.sawsdl.impl.BindingOperationImpl;
import org.ow2.easywsdl.extensions.sawsdl.impl.BindingOutputImpl;
import org.ow2.easywsdl.extensions.sawsdl.impl.DescriptionImpl;
import org.ow2.easywsdl.extensions.sawsdl.impl.EndpointImpl;
import org.ow2.easywsdl.extensions.sawsdl.impl.FaultImpl;
import org.ow2.easywsdl.extensions.sawsdl.impl.ImportImpl;
import org.ow2.easywsdl.extensions.sawsdl.impl.IncludeImpl;
import org.ow2.easywsdl.extensions.sawsdl.impl.InputImpl;
import org.ow2.easywsdl.extensions.sawsdl.impl.InterfaceTypeImpl;
import org.ow2.easywsdl.extensions.sawsdl.impl.OperationImpl;
import org.ow2.easywsdl.extensions.sawsdl.impl.OutputImpl;
import org.ow2.easywsdl.extensions.sawsdl.impl.ServiceImpl;
import org.ow2.easywsdl.extensions.sawsdl.impl.TypesImpl;
import org.ow2.easywsdl.extensions.sawsdl.impl.schema.AnnotationImpl;
import org.ow2.easywsdl.extensions.sawsdl.impl.schema.AttributeGroupImpl;
import org.ow2.easywsdl.extensions.sawsdl.impl.schema.AttributeImpl;
import org.ow2.easywsdl.extensions.sawsdl.impl.schema.ComplexTypeImpl;
import org.ow2.easywsdl.extensions.sawsdl.impl.schema.ElementImpl;
import org.ow2.easywsdl.extensions.sawsdl.impl.schema.GroupImpl;
import org.ow2.easywsdl.extensions.sawsdl.impl.schema.NotationImpl;
import org.ow2.easywsdl.extensions.sawsdl.impl.schema.RedefineImpl;
import org.ow2.easywsdl.extensions.sawsdl.impl.schema.SchemaImpl;
import org.ow2.easywsdl.extensions.sawsdl.impl.schema.SimpleTypeImpl;
import org.ow2.easywsdl.extensions.sawsdl.impl.schema.TypeImpl;
import org.ow2.easywsdl.wsdl.api.WSDLException;
import org.ow2.easywsdl.wsdl.api.abstractItf.AbsItfDescription;
import org.ow2.easywsdl.wsdl.decorator.AbstractWSDLConverter;


/**
 * @author Nicolas Salatge - eBM WebSourcing
 */
public class WSDLConverter
        extends
        AbstractWSDLConverter<Description, DescriptionImpl, Service, ServiceImpl, Binding, BindingImpl, InterfaceType, InterfaceTypeImpl, Include, IncludeImpl, Import, ImportImpl, Types, TypesImpl, Endpoint, EndpointImpl, Operation, OperationImpl, Input, InputImpl, Output, OutputImpl, Fault, FaultImpl, BindingOperation, BindingOperationImpl, BindingInput, BindingInputImpl, BindingOutput, BindingOutputImpl, BindingFault, BindingFaultImpl,

        Schema, SchemaImpl, Annotation, AnnotationImpl, AttributeGroup, AttributeGroupImpl, Attribute, AttributeImpl, ComplexType, ComplexTypeImpl, Element, ElementImpl, Group, GroupImpl, org.ow2.easywsdl.extensions.sawsdl.api.schema.Import, org.ow2.easywsdl.extensions.sawsdl.impl.schema.ImportImpl, org.ow2.easywsdl.extensions.sawsdl.api.schema.Include, org.ow2.easywsdl.extensions.sawsdl.impl.schema.IncludeImpl, Notation, NotationImpl, Redefine, RedefineImpl, SimpleType, SimpleTypeImpl, Type, TypeImpl> {

    private static WSDLConverter wsdlConverter = new WSDLConverter();

    private WSDLConverter() {
        this.schemaConverter = new SchemaConverter();
    }

    public static WSDLConverter getIntance() {
        return WSDLConverter.wsdlConverter;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Description convertDescription(final AbsItfDescription oldDesc) throws WSDLException {
        return this.convertDescription(oldDesc, DescriptionImpl.class, ServiceImpl.class,
                BindingImpl.class, InterfaceTypeImpl.class, IncludeImpl.class, ImportImpl.class,
                TypesImpl.class, EndpointImpl.class, OperationImpl.class, InputImpl.class,
                OutputImpl.class, FaultImpl.class, BindingOperationImpl.class,
                BindingInputImpl.class, BindingOutputImpl.class, BindingFaultImpl.class);
    }
}

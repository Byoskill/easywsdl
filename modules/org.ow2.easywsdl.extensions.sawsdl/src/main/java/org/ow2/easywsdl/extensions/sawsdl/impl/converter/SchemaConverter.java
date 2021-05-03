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

import org.ow2.easywsdl.extensions.sawsdl.api.schema.Annotation;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.Attribute;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.AttributeGroup;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.ComplexType;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.Element;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.Group;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.Import;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.Notation;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.Redefine;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.Schema;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.SimpleType;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.Type;
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
import org.ow2.easywsdl.schema.api.SchemaException;
import org.ow2.easywsdl.schema.api.absItf.AbsItfImport;
import org.ow2.easywsdl.schema.api.absItf.AbsItfSchema;
import org.ow2.easywsdl.schema.decorator.AbstractSchemaConverter;


/**
 * @author Nicolas Salatge - eBM WebSourcing
 */
public class SchemaConverter
        extends
        AbstractSchemaConverter<Schema, SchemaImpl, Annotation, AnnotationImpl, AttributeGroup, AttributeGroupImpl, Attribute, AttributeImpl, ComplexType, ComplexTypeImpl, Element, ElementImpl, Group, GroupImpl, org.ow2.easywsdl.extensions.sawsdl.api.schema.Import, org.ow2.easywsdl.extensions.sawsdl.impl.schema.ImportImpl, org.ow2.easywsdl.extensions.sawsdl.api.schema.Include, org.ow2.easywsdl.extensions.sawsdl.impl.schema.IncludeImpl, Notation, NotationImpl, Redefine, RedefineImpl, SimpleType, SimpleTypeImpl, Type, TypeImpl> {

    @SuppressWarnings("unchecked")
    @Override
    public Import convertImport(final AbsItfImport desc) throws SchemaException {
        return this.convertImport(desc,
                org.ow2.easywsdl.extensions.sawsdl.impl.schema.ImportImpl.class);
    }

    @SuppressWarnings("unchecked")
    @Override
    public Schema convertSchema(final AbsItfSchema oldDesc) throws SchemaException {
        return this.convertSchema(oldDesc, SchemaImpl.class, AnnotationImpl.class,
                AttributeGroupImpl.class, AttributeImpl.class, ComplexTypeImpl.class,
                ElementImpl.class, GroupImpl.class,
                org.ow2.easywsdl.extensions.sawsdl.impl.schema.ImportImpl.class,
                org.ow2.easywsdl.extensions.sawsdl.impl.schema.IncludeImpl.class,
                NotationImpl.class, RedefineImpl.class, SimpleTypeImpl.class, TypeImpl.class);

    }

}

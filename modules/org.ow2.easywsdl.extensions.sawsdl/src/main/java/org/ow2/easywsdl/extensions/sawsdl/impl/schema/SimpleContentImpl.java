package org.ow2.easywsdl.extensions.sawsdl.impl.schema;

import java.net.URI;
import java.util.List;

import org.ow2.easywsdl.extensions.sawsdl.api.AttrExtensions;
import org.ow2.easywsdl.extensions.sawsdl.api.SAWSDLElement;
import org.ow2.easywsdl.extensions.sawsdl.api.SAWSDLException;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.Extension;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.SimpleContent;
import org.ow2.easywsdl.extensions.sawsdl.impl.SAWSDLElementImpl;
import org.ow2.easywsdl.schema.api.SchemaException;
import org.ow2.easywsdl.schema.api.absItf.AbsItfSimpleContent;
import org.ow2.easywsdl.schema.decorator.DecoratorSimpleContentImpl;
import org.ow2.easywsdl.wsdl.api.WSDLException;

/**
 * @author Nicolas Boissel-Dallier - eBM WebSourcing
 */
public class SimpleContentImpl extends DecoratorSimpleContentImpl<Extension> implements SimpleContent {

    private static final long serialVersionUID = 1L;

    private SAWSDLElement elmt = null;

    @SuppressWarnings("unchecked")
    public SimpleContentImpl(final AbsItfSimpleContent simpleContent) throws WSDLException, SchemaException {
        super(simpleContent, ExtensionImpl.class);

        this.elmt = new SAWSDLElementImpl<AbsItfSimpleContent>(simpleContent);
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

	public AttrExtensions getAttrExtensions() throws SAWSDLException {
		return this.elmt.getAttrExtensions();
	}

}

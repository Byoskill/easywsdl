package org.ow2.easywsdl.extensions.sawsdl.impl.schema;

import java.net.URI;
import java.util.List;

import org.ow2.easywsdl.extensions.sawsdl.api.AttrExtensions;
import org.ow2.easywsdl.extensions.sawsdl.api.SAWSDLElement;
import org.ow2.easywsdl.extensions.sawsdl.api.SAWSDLException;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.Enumeration;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.Restriction;
import org.ow2.easywsdl.extensions.sawsdl.impl.SAWSDLElementImpl;
import org.ow2.easywsdl.schema.api.SchemaException;
import org.ow2.easywsdl.schema.api.absItf.AbsItfRestriction;
import org.ow2.easywsdl.schema.decorator.DecoratorRestrictionImpl;
import org.ow2.easywsdl.wsdl.api.WSDLException;

/**
 * @author Nicolas Boissel-Dallier - eBM WebSourcing
 */
public class RestrictionImpl extends DecoratorRestrictionImpl<Enumeration> implements Restriction {

    private static final long serialVersionUID = 1L;

    private SAWSDLElement elmt = null;

    @SuppressWarnings("unchecked")
    public RestrictionImpl(final AbsItfRestriction restriction) throws WSDLException, SchemaException {
        super(restriction, EnumerationImpl.class);

        this.elmt = new SAWSDLElementImpl<AbsItfRestriction>(restriction);
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

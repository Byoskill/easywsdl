package org.ow2.easywsdl.extensions.sawsdl.impl.schema;

import java.net.URI;
import java.util.List;

import org.ow2.easywsdl.extensions.sawsdl.api.AttrExtensions;
import org.ow2.easywsdl.extensions.sawsdl.api.SAWSDLElement;
import org.ow2.easywsdl.extensions.sawsdl.api.SAWSDLException;
import org.ow2.easywsdl.extensions.sawsdl.api.schema.Choice;
import org.ow2.easywsdl.extensions.sawsdl.impl.SAWSDLElementImpl;
import org.ow2.easywsdl.schema.api.SchemaException;
import org.ow2.easywsdl.schema.api.absItf.AbsItfChoice;
import org.ow2.easywsdl.schema.decorator.DecoratorChoiceImpl;
import org.ow2.easywsdl.wsdl.api.WSDLException;

/**
 * @author Nicolas Boissel-Dallier - eBM WebSourcing
 */
public class ChoiceImpl extends DecoratorChoiceImpl<org.ow2.easywsdl.extensions.sawsdl.api.schema.Element> implements Choice {

    private static final long serialVersionUID = 1L;

    private SAWSDLElement elmt = null;

    @SuppressWarnings("unchecked")
    public ChoiceImpl(final AbsItfChoice choice) throws WSDLException, SchemaException {
        super(choice, ElementImpl.class);

        this.elmt = new SAWSDLElementImpl<AbsItfChoice>(choice);
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

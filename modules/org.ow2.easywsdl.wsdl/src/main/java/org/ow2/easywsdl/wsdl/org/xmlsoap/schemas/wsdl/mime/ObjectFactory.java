//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.03 à 03:26:13 PM CEST 
//


package org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl.mime;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl.mime package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Content_QNAME = new QName("http://schemas.xmlsoap.org/wsdl/mime/", "content");
    private final static QName _MultipartRelated_QNAME = new QName("http://schemas.xmlsoap.org/wsdl/mime/", "multipartRelated");
    private final static QName _MimeXml_QNAME = new QName("http://schemas.xmlsoap.org/wsdl/mime/", "mimeXml");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl.mime
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContentType }
     * 
     */
    public ContentType createContentType() {
        return new ContentType();
    }

    /**
     * Create an instance of {@link MultipartRelatedType }
     * 
     */
    public MultipartRelatedType createMultipartRelatedType() {
        return new MultipartRelatedType();
    }

    /**
     * Create an instance of {@link TMimeXml }
     * 
     */
    public TMimeXml createTMimeXml() {
        return new TMimeXml();
    }

    /**
     * Create an instance of {@link TPart }
     * 
     */
    public TPart createTPart() {
        return new TPart();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/wsdl/mime/", name = "content")
    public JAXBElement<ContentType> createContent(ContentType value) {
        return new JAXBElement<ContentType>(_Content_QNAME, ContentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipartRelatedType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MultipartRelatedType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/wsdl/mime/", name = "multipartRelated")
    public JAXBElement<MultipartRelatedType> createMultipartRelated(MultipartRelatedType value) {
        return new JAXBElement<MultipartRelatedType>(_MultipartRelated_QNAME, MultipartRelatedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMimeXml }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TMimeXml }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/wsdl/mime/", name = "mimeXml")
    public JAXBElement<TMimeXml> createMimeXml(TMimeXml value) {
        return new JAXBElement<TMimeXml>(_MimeXml_QNAME, TMimeXml.class, null, value);
    }

}

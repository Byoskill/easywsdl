//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.03 à 03:26:13 PM CEST 
//


package org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl.http;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl.http package. 
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

    private final static QName _Address_QNAME = new QName("http://schemas.xmlsoap.org/wsdl/http/", "address");
    private final static QName _Binding_QNAME = new QName("http://schemas.xmlsoap.org/wsdl/http/", "binding");
    private final static QName _Operation_QNAME = new QName("http://schemas.xmlsoap.org/wsdl/http/", "operation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl.http
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link BindingType }
     * 
     */
    public BindingType createBindingType() {
        return new BindingType();
    }

    /**
     * Create an instance of {@link OperationType }
     * 
     */
    public OperationType createOperationType() {
        return new OperationType();
    }

    /**
     * Create an instance of {@link UrlEncoded }
     * 
     */
    public UrlEncoded createUrlEncoded() {
        return new UrlEncoded();
    }

    /**
     * Create an instance of {@link UrlReplacement }
     * 
     */
    public UrlReplacement createUrlReplacement() {
        return new UrlReplacement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/wsdl/http/", name = "address")
    public JAXBElement<AddressType> createAddress(AddressType value) {
        return new JAXBElement<AddressType>(_Address_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BindingType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BindingType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/wsdl/http/", name = "binding")
    public JAXBElement<BindingType> createBinding(BindingType value) {
        return new JAXBElement<BindingType>(_Binding_QNAME, BindingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/wsdl/http/", name = "operation")
    public JAXBElement<OperationType> createOperation(OperationType value) {
        return new JAXBElement<OperationType>(_Operation_QNAME, OperationType.class, null, value);
    }

}

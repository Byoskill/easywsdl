//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.03 à 03:26:13 PM CEST 
//


package org.ow2.easywsdl.wsdl.org.w3.ns.wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.ow2.easywsdl.wsdl.org.w3.ns.wsdl package. 
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

    private final static QName _Documentation_QNAME = new QName("http://www.w3.org/ns/wsdl", "documentation");
    private final static QName _Description_QNAME = new QName("http://www.w3.org/ns/wsdl", "description");
    private final static QName _Import_QNAME = new QName("http://www.w3.org/ns/wsdl", "import");
    private final static QName _Include_QNAME = new QName("http://www.w3.org/ns/wsdl", "include");
    private final static QName _Types_QNAME = new QName("http://www.w3.org/ns/wsdl", "types");
    private final static QName _Interface_QNAME = new QName("http://www.w3.org/ns/wsdl", "interface");
    private final static QName _Binding_QNAME = new QName("http://www.w3.org/ns/wsdl", "binding");
    private final static QName _Service_QNAME = new QName("http://www.w3.org/ns/wsdl", "service");
    private final static QName _Endpoint_QNAME = new QName("http://www.w3.org/ns/wsdl", "endpoint");
    private final static QName _BindingOperationTypeInput_QNAME = new QName("http://www.w3.org/ns/wsdl", "input");
    private final static QName _BindingOperationTypeOutput_QNAME = new QName("http://www.w3.org/ns/wsdl", "output");
    private final static QName _BindingOperationTypeInfault_QNAME = new QName("http://www.w3.org/ns/wsdl", "infault");
    private final static QName _BindingOperationTypeOutfault_QNAME = new QName("http://www.w3.org/ns/wsdl", "outfault");
    private final static QName _BindingTypeOperation_QNAME = new QName("http://www.w3.org/ns/wsdl", "operation");
    private final static QName _BindingTypeFault_QNAME = new QName("http://www.w3.org/ns/wsdl", "fault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.ow2.easywsdl.wsdl.org.w3.ns.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DocumentedType }
     * 
     */
    public DocumentedType createDocumentedType() {
        return new DocumentedType();
    }

    /**
     * Create an instance of {@link DocumentationType }
     * 
     */
    public DocumentationType createDocumentationType() {
        return new DocumentationType();
    }

    /**
     * Create an instance of {@link DescriptionType }
     * 
     */
    public DescriptionType createDescriptionType() {
        return new DescriptionType();
    }

    /**
     * Create an instance of {@link ImportType }
     * 
     */
    public ImportType createImportType() {
        return new ImportType();
    }

    /**
     * Create an instance of {@link IncludeType }
     * 
     */
    public IncludeType createIncludeType() {
        return new IncludeType();
    }

    /**
     * Create an instance of {@link TypesType }
     * 
     */
    public TypesType createTypesType() {
        return new TypesType();
    }

    /**
     * Create an instance of {@link InterfaceType }
     * 
     */
    public InterfaceType createInterfaceType() {
        return new InterfaceType();
    }

    /**
     * Create an instance of {@link BindingType }
     * 
     */
    public BindingType createBindingType() {
        return new BindingType();
    }

    /**
     * Create an instance of {@link ServiceType }
     * 
     */
    public ServiceType createServiceType() {
        return new ServiceType();
    }

    /**
     * Create an instance of {@link EndpointType }
     * 
     */
    public EndpointType createEndpointType() {
        return new EndpointType();
    }

    /**
     * Create an instance of {@link InterfaceOperationType }
     * 
     */
    public InterfaceOperationType createInterfaceOperationType() {
        return new InterfaceOperationType();
    }

    /**
     * Create an instance of {@link MessageRefType }
     * 
     */
    public MessageRefType createMessageRefType() {
        return new MessageRefType();
    }

    /**
     * Create an instance of {@link MessageRefFaultType }
     * 
     */
    public MessageRefFaultType createMessageRefFaultType() {
        return new MessageRefFaultType();
    }

    /**
     * Create an instance of {@link InterfaceFaultType }
     * 
     */
    public InterfaceFaultType createInterfaceFaultType() {
        return new InterfaceFaultType();
    }

    /**
     * Create an instance of {@link BindingOperationType }
     * 
     */
    public BindingOperationType createBindingOperationType() {
        return new BindingOperationType();
    }

    /**
     * Create an instance of {@link BindingOperationMessageType }
     * 
     */
    public BindingOperationMessageType createBindingOperationMessageType() {
        return new BindingOperationMessageType();
    }

    /**
     * Create an instance of {@link BindingOperationFaultType }
     * 
     */
    public BindingOperationFaultType createBindingOperationFaultType() {
        return new BindingOperationFaultType();
    }

    /**
     * Create an instance of {@link BindingFaultType }
     * 
     */
    public BindingFaultType createBindingFaultType() {
        return new BindingFaultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/wsdl", name = "documentation")
    public JAXBElement<DocumentationType> createDocumentation(DocumentationType value) {
        return new JAXBElement<DocumentationType>(_Documentation_QNAME, DocumentationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescriptionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DescriptionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/wsdl", name = "description")
    public JAXBElement<DescriptionType> createDescription(DescriptionType value) {
        return new JAXBElement<DescriptionType>(_Description_QNAME, DescriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/wsdl", name = "import")
    public JAXBElement<ImportType> createImport(ImportType value) {
        return new JAXBElement<ImportType>(_Import_QNAME, ImportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncludeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncludeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/wsdl", name = "include")
    public JAXBElement<IncludeType> createInclude(IncludeType value) {
        return new JAXBElement<IncludeType>(_Include_QNAME, IncludeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TypesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/wsdl", name = "types")
    public JAXBElement<TypesType> createTypes(TypesType value) {
        return new JAXBElement<TypesType>(_Types_QNAME, TypesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InterfaceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/wsdl", name = "interface")
    public JAXBElement<InterfaceType> createInterface(InterfaceType value) {
        return new JAXBElement<InterfaceType>(_Interface_QNAME, InterfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BindingType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BindingType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/wsdl", name = "binding")
    public JAXBElement<BindingType> createBinding(BindingType value) {
        return new JAXBElement<BindingType>(_Binding_QNAME, BindingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/wsdl", name = "service")
    public JAXBElement<ServiceType> createService(ServiceType value) {
        return new JAXBElement<ServiceType>(_Service_QNAME, ServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndpointType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EndpointType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/wsdl", name = "endpoint")
    public JAXBElement<EndpointType> createEndpoint(EndpointType value) {
        return new JAXBElement<EndpointType>(_Endpoint_QNAME, EndpointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BindingOperationMessageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BindingOperationMessageType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/wsdl", name = "input", scope = BindingOperationType.class)
    public JAXBElement<BindingOperationMessageType> createBindingOperationTypeInput(BindingOperationMessageType value) {
        return new JAXBElement<BindingOperationMessageType>(_BindingOperationTypeInput_QNAME, BindingOperationMessageType.class, BindingOperationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BindingOperationMessageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BindingOperationMessageType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/wsdl", name = "output", scope = BindingOperationType.class)
    public JAXBElement<BindingOperationMessageType> createBindingOperationTypeOutput(BindingOperationMessageType value) {
        return new JAXBElement<BindingOperationMessageType>(_BindingOperationTypeOutput_QNAME, BindingOperationMessageType.class, BindingOperationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BindingOperationFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BindingOperationFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/wsdl", name = "infault", scope = BindingOperationType.class)
    public JAXBElement<BindingOperationFaultType> createBindingOperationTypeInfault(BindingOperationFaultType value) {
        return new JAXBElement<BindingOperationFaultType>(_BindingOperationTypeInfault_QNAME, BindingOperationFaultType.class, BindingOperationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BindingOperationFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BindingOperationFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/wsdl", name = "outfault", scope = BindingOperationType.class)
    public JAXBElement<BindingOperationFaultType> createBindingOperationTypeOutfault(BindingOperationFaultType value) {
        return new JAXBElement<BindingOperationFaultType>(_BindingOperationTypeOutfault_QNAME, BindingOperationFaultType.class, BindingOperationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageRefType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MessageRefType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/wsdl", name = "input", scope = InterfaceOperationType.class)
    public JAXBElement<MessageRefType> createInterfaceOperationTypeInput(MessageRefType value) {
        return new JAXBElement<MessageRefType>(_BindingOperationTypeInput_QNAME, MessageRefType.class, InterfaceOperationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageRefType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MessageRefType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/wsdl", name = "output", scope = InterfaceOperationType.class)
    public JAXBElement<MessageRefType> createInterfaceOperationTypeOutput(MessageRefType value) {
        return new JAXBElement<MessageRefType>(_BindingOperationTypeOutput_QNAME, MessageRefType.class, InterfaceOperationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageRefFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MessageRefFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/wsdl", name = "infault", scope = InterfaceOperationType.class)
    public JAXBElement<MessageRefFaultType> createInterfaceOperationTypeInfault(MessageRefFaultType value) {
        return new JAXBElement<MessageRefFaultType>(_BindingOperationTypeInfault_QNAME, MessageRefFaultType.class, InterfaceOperationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageRefFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MessageRefFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/wsdl", name = "outfault", scope = InterfaceOperationType.class)
    public JAXBElement<MessageRefFaultType> createInterfaceOperationTypeOutfault(MessageRefFaultType value) {
        return new JAXBElement<MessageRefFaultType>(_BindingOperationTypeOutfault_QNAME, MessageRefFaultType.class, InterfaceOperationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BindingOperationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BindingOperationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/wsdl", name = "operation", scope = BindingType.class)
    public JAXBElement<BindingOperationType> createBindingTypeOperation(BindingOperationType value) {
        return new JAXBElement<BindingOperationType>(_BindingTypeOperation_QNAME, BindingOperationType.class, BindingType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BindingFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BindingFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/wsdl", name = "fault", scope = BindingType.class)
    public JAXBElement<BindingFaultType> createBindingTypeFault(BindingFaultType value) {
        return new JAXBElement<BindingFaultType>(_BindingTypeFault_QNAME, BindingFaultType.class, BindingType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceOperationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InterfaceOperationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/wsdl", name = "operation", scope = InterfaceType.class)
    public JAXBElement<InterfaceOperationType> createInterfaceTypeOperation(InterfaceOperationType value) {
        return new JAXBElement<InterfaceOperationType>(_BindingTypeOperation_QNAME, InterfaceOperationType.class, InterfaceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InterfaceFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/wsdl", name = "fault", scope = InterfaceType.class)
    public JAXBElement<InterfaceFaultType> createInterfaceTypeFault(InterfaceFaultType value) {
        return new JAXBElement<InterfaceFaultType>(_BindingTypeFault_QNAME, InterfaceFaultType.class, InterfaceType.class, value);
    }

}

//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.03 à 03:26:13 PM CEST 
//


package org.ow2.easywsdl.wsdl.org.w3.ns.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy2;
import org.jvnet.jaxb2_commons.lang.CopyTo2;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;
import org.w3c.dom.Element;


/**
 * 
 *         Although correct, this type declaration does not capture
 *         all the constraints on the contents of the wsdl:description
 *         element as defined by the WSDL 2.0 specification.
 * 
 *         In particular, the ordering constraints wrt elements preceding
 *         and following the wsdl:types child element are not captured, as
 *         attempts to incorporate such restrictions in the schema
 *         ran afoul of the UPA (Unique Particle Attribution) rule
 *         in the XML Schema language.
 * 
 *         Please refer to the WSDL 2.0 specification for
 * 	additional information on the contents of this type.
 *       
 * 
 * <p>Classe Java pour DescriptionType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.w3.org/ns/wsdl}ExtensibleDocumentedType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{http://www.w3.org/ns/wsdl}import"/&gt;
 *         &lt;element ref="{http://www.w3.org/ns/wsdl}include"/&gt;
 *         &lt;element ref="{http://www.w3.org/ns/wsdl}types"/&gt;
 *         &lt;element ref="{http://www.w3.org/ns/wsdl}interface"/&gt;
 *         &lt;element ref="{http://www.w3.org/ns/wsdl}binding"/&gt;
 *         &lt;element ref="{http://www.w3.org/ns/wsdl}service"/&gt;
 *         &lt;any processContents='lax' namespace='##other'/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="targetNamespace" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescriptionType", propOrder = {
    "importOrIncludeOrTypes"
})
public class DescriptionType
    extends ExtensibleDocumentedType
    implements Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    @XmlElementRefs({
        @XmlElementRef(name = "import", namespace = "http://www.w3.org/ns/wsdl", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "include", namespace = "http://www.w3.org/ns/wsdl", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "types", namespace = "http://www.w3.org/ns/wsdl", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "interface", namespace = "http://www.w3.org/ns/wsdl", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "binding", namespace = "http://www.w3.org/ns/wsdl", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "service", namespace = "http://www.w3.org/ns/wsdl", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> importOrIncludeOrTypes;
    @XmlAttribute(name = "targetNamespace", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String targetNamespace;

    /**
     * Gets the value of the importOrIncludeOrTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importOrIncludeOrTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportOrIncludeOrTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ImportType }{@code >}
     * {@link JAXBElement }{@code <}{@link IncludeType }{@code >}
     * {@link JAXBElement }{@code <}{@link TypesType }{@code >}
     * {@link JAXBElement }{@code <}{@link InterfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link BindingType }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceType }{@code >}
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getImportOrIncludeOrTypes() {
        if (importOrIncludeOrTypes == null) {
            importOrIncludeOrTypes = new ArrayList<Object>();
        }
        return this.importOrIncludeOrTypes;
    }

    /**
     * Obtient la valeur de la propriété targetNamespace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetNamespace() {
        return targetNamespace;
    }

    /**
     * Définit la valeur de la propriété targetNamespace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetNamespace(String value) {
        this.targetNamespace = value;
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            List<Object> theImportOrIncludeOrTypes;
            theImportOrIncludeOrTypes = (((this.importOrIncludeOrTypes!= null)&&(!this.importOrIncludeOrTypes.isEmpty()))?this.getImportOrIncludeOrTypes():null);
            strategy.appendField(locator, this, "importOrIncludeOrTypes", buffer, theImportOrIncludeOrTypes, ((this.importOrIncludeOrTypes!= null)&&(!this.importOrIncludeOrTypes.isEmpty())));
        }
        {
            String theTargetNamespace;
            theTargetNamespace = this.getTargetNamespace();
            strategy.appendField(locator, this, "targetNamespace", buffer, theTargetNamespace, (this.targetNamespace!= null));
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DescriptionType that = ((DescriptionType) object);
        {
            List<Object> lhsImportOrIncludeOrTypes;
            lhsImportOrIncludeOrTypes = (((this.importOrIncludeOrTypes!= null)&&(!this.importOrIncludeOrTypes.isEmpty()))?this.getImportOrIncludeOrTypes():null);
            List<Object> rhsImportOrIncludeOrTypes;
            rhsImportOrIncludeOrTypes = (((that.importOrIncludeOrTypes!= null)&&(!that.importOrIncludeOrTypes.isEmpty()))?that.getImportOrIncludeOrTypes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "importOrIncludeOrTypes", lhsImportOrIncludeOrTypes), LocatorUtils.property(thatLocator, "importOrIncludeOrTypes", rhsImportOrIncludeOrTypes), lhsImportOrIncludeOrTypes, rhsImportOrIncludeOrTypes, ((this.importOrIncludeOrTypes!= null)&&(!this.importOrIncludeOrTypes.isEmpty())), ((that.importOrIncludeOrTypes!= null)&&(!that.importOrIncludeOrTypes.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsTargetNamespace;
            lhsTargetNamespace = this.getTargetNamespace();
            String rhsTargetNamespace;
            rhsTargetNamespace = that.getTargetNamespace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "targetNamespace", lhsTargetNamespace), LocatorUtils.property(thatLocator, "targetNamespace", rhsTargetNamespace), lhsTargetNamespace, rhsTargetNamespace, (this.targetNamespace!= null), (that.targetNamespace!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            List<Object> theImportOrIncludeOrTypes;
            theImportOrIncludeOrTypes = (((this.importOrIncludeOrTypes!= null)&&(!this.importOrIncludeOrTypes.isEmpty()))?this.getImportOrIncludeOrTypes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "importOrIncludeOrTypes", theImportOrIncludeOrTypes), currentHashCode, theImportOrIncludeOrTypes, ((this.importOrIncludeOrTypes!= null)&&(!this.importOrIncludeOrTypes.isEmpty())));
        }
        {
            String theTargetNamespace;
            theTargetNamespace = this.getTargetNamespace();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "targetNamespace", theTargetNamespace), currentHashCode, theTargetNamespace, (this.targetNamespace!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE2;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof DescriptionType) {
            final DescriptionType copy = ((DescriptionType) draftCopy);
            {
                Boolean importOrIncludeOrTypesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.importOrIncludeOrTypes!= null)&&(!this.importOrIncludeOrTypes.isEmpty())));
                if (importOrIncludeOrTypesShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Object> sourceImportOrIncludeOrTypes;
                    sourceImportOrIncludeOrTypes = (((this.importOrIncludeOrTypes!= null)&&(!this.importOrIncludeOrTypes.isEmpty()))?this.getImportOrIncludeOrTypes():null);
                    @SuppressWarnings("unchecked")
                    List<Object> copyImportOrIncludeOrTypes = ((List<Object> ) strategy.copy(LocatorUtils.property(locator, "importOrIncludeOrTypes", sourceImportOrIncludeOrTypes), sourceImportOrIncludeOrTypes, ((this.importOrIncludeOrTypes!= null)&&(!this.importOrIncludeOrTypes.isEmpty()))));
                    copy.importOrIncludeOrTypes = null;
                    if (copyImportOrIncludeOrTypes!= null) {
                        List<Object> uniqueImportOrIncludeOrTypesl = copy.getImportOrIncludeOrTypes();
                        uniqueImportOrIncludeOrTypesl.addAll(copyImportOrIncludeOrTypes);
                    }
                } else {
                    if (importOrIncludeOrTypesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.importOrIncludeOrTypes = null;
                    }
                }
            }
            {
                Boolean targetNamespaceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.targetNamespace!= null));
                if (targetNamespaceShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTargetNamespace;
                    sourceTargetNamespace = this.getTargetNamespace();
                    String copyTargetNamespace = ((String) strategy.copy(LocatorUtils.property(locator, "targetNamespace", sourceTargetNamespace), sourceTargetNamespace, (this.targetNamespace!= null)));
                    copy.setTargetNamespace(copyTargetNamespace);
                } else {
                    if (targetNamespaceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.targetNamespace = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DescriptionType();
    }

}

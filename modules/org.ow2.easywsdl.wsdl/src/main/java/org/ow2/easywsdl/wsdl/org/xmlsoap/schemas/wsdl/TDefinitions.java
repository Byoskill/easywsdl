//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.03 à 03:26:13 PM CEST 
//


package org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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


/**
 * <p>Classe Java pour tDefinitions complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="tDefinitions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.xmlsoap.org/wsdl/}tExtensibleDocumented"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://schemas.xmlsoap.org/wsdl/}anyTopLevelOptionalElement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="targetNamespace" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tDefinitions", propOrder = {
    "anyTopLevelOptionalElement"
})
public class TDefinitions
    extends TExtensibleDocumented
    implements Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    @XmlElements({
        @XmlElement(name = "import", type = TImport.class),
        @XmlElement(name = "types", type = TTypes.class),
        @XmlElement(name = "message", type = TMessage.class),
        @XmlElement(name = "portType", type = TPortType.class),
        @XmlElement(name = "binding", type = TBinding.class),
        @XmlElement(name = "service", type = TService.class)
    })
    protected List<TDocumented> anyTopLevelOptionalElement;
    @XmlAttribute(name = "targetNamespace")
    @XmlSchemaType(name = "anyURI")
    protected String targetNamespace;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;

    /**
     * Gets the value of the anyTopLevelOptionalElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anyTopLevelOptionalElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnyTopLevelOptionalElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TImport }
     * {@link TTypes }
     * {@link TMessage }
     * {@link TPortType }
     * {@link TBinding }
     * {@link TService }
     * 
     * 
     */
    public List<TDocumented> getAnyTopLevelOptionalElement() {
        if (anyTopLevelOptionalElement == null) {
            anyTopLevelOptionalElement = new ArrayList<TDocumented>();
        }
        return this.anyTopLevelOptionalElement;
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

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
            List<TDocumented> theAnyTopLevelOptionalElement;
            theAnyTopLevelOptionalElement = (((this.anyTopLevelOptionalElement!= null)&&(!this.anyTopLevelOptionalElement.isEmpty()))?this.getAnyTopLevelOptionalElement():null);
            strategy.appendField(locator, this, "anyTopLevelOptionalElement", buffer, theAnyTopLevelOptionalElement, ((this.anyTopLevelOptionalElement!= null)&&(!this.anyTopLevelOptionalElement.isEmpty())));
        }
        {
            String theTargetNamespace;
            theTargetNamespace = this.getTargetNamespace();
            strategy.appendField(locator, this, "targetNamespace", buffer, theTargetNamespace, (this.targetNamespace!= null));
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
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
        final TDefinitions that = ((TDefinitions) object);
        {
            List<TDocumented> lhsAnyTopLevelOptionalElement;
            lhsAnyTopLevelOptionalElement = (((this.anyTopLevelOptionalElement!= null)&&(!this.anyTopLevelOptionalElement.isEmpty()))?this.getAnyTopLevelOptionalElement():null);
            List<TDocumented> rhsAnyTopLevelOptionalElement;
            rhsAnyTopLevelOptionalElement = (((that.anyTopLevelOptionalElement!= null)&&(!that.anyTopLevelOptionalElement.isEmpty()))?that.getAnyTopLevelOptionalElement():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anyTopLevelOptionalElement", lhsAnyTopLevelOptionalElement), LocatorUtils.property(thatLocator, "anyTopLevelOptionalElement", rhsAnyTopLevelOptionalElement), lhsAnyTopLevelOptionalElement, rhsAnyTopLevelOptionalElement, ((this.anyTopLevelOptionalElement!= null)&&(!this.anyTopLevelOptionalElement.isEmpty())), ((that.anyTopLevelOptionalElement!= null)&&(!that.anyTopLevelOptionalElement.isEmpty())))) {
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
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
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
            List<TDocumented> theAnyTopLevelOptionalElement;
            theAnyTopLevelOptionalElement = (((this.anyTopLevelOptionalElement!= null)&&(!this.anyTopLevelOptionalElement.isEmpty()))?this.getAnyTopLevelOptionalElement():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anyTopLevelOptionalElement", theAnyTopLevelOptionalElement), currentHashCode, theAnyTopLevelOptionalElement, ((this.anyTopLevelOptionalElement!= null)&&(!this.anyTopLevelOptionalElement.isEmpty())));
        }
        {
            String theTargetNamespace;
            theTargetNamespace = this.getTargetNamespace();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "targetNamespace", theTargetNamespace), currentHashCode, theTargetNamespace, (this.targetNamespace!= null));
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
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
        if (draftCopy instanceof TDefinitions) {
            final TDefinitions copy = ((TDefinitions) draftCopy);
            {
                Boolean anyTopLevelOptionalElementShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.anyTopLevelOptionalElement!= null)&&(!this.anyTopLevelOptionalElement.isEmpty())));
                if (anyTopLevelOptionalElementShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<TDocumented> sourceAnyTopLevelOptionalElement;
                    sourceAnyTopLevelOptionalElement = (((this.anyTopLevelOptionalElement!= null)&&(!this.anyTopLevelOptionalElement.isEmpty()))?this.getAnyTopLevelOptionalElement():null);
                    @SuppressWarnings("unchecked")
                    List<TDocumented> copyAnyTopLevelOptionalElement = ((List<TDocumented> ) strategy.copy(LocatorUtils.property(locator, "anyTopLevelOptionalElement", sourceAnyTopLevelOptionalElement), sourceAnyTopLevelOptionalElement, ((this.anyTopLevelOptionalElement!= null)&&(!this.anyTopLevelOptionalElement.isEmpty()))));
                    copy.anyTopLevelOptionalElement = null;
                    if (copyAnyTopLevelOptionalElement!= null) {
                        List<TDocumented> uniqueAnyTopLevelOptionalElementl = copy.getAnyTopLevelOptionalElement();
                        uniqueAnyTopLevelOptionalElementl.addAll(copyAnyTopLevelOptionalElement);
                    }
                } else {
                    if (anyTopLevelOptionalElementShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anyTopLevelOptionalElement = null;
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
            {
                Boolean nameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.name!= null));
                if (nameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceName;
                    sourceName = this.getName();
                    String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName, (this.name!= null)));
                    copy.setName(copyName);
                } else {
                    if (nameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.name = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TDefinitions();
    }

}

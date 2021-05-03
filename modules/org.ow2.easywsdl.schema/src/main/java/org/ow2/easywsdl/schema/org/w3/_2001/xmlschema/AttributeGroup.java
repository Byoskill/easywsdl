//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.03 à 03:39:56 PM CEST 
//


package org.ow2.easywsdl.schema.org.w3._2001.xmlschema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
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
 * <p>Classe Java pour attributeGroup complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="attributeGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.w3.org/2001/XMLSchema}annotated"&gt;
 *       &lt;group ref="{http://www.w3.org/2001/XMLSchema}attrDecls"/&gt;
 *       &lt;attGroup ref="{http://www.w3.org/2001/XMLSchema}defRef"/&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attributeGroup", propOrder = {
    "attributeOrAttributeGroup",
    "anyAttribute"
})
@XmlSeeAlso({
    NamedAttributeGroup.class,
    AttributeGroupRef.class
})
public abstract class AttributeGroup
    extends Annotated
    implements Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    @XmlElements({
        @XmlElement(name = "attribute", type = Attribute.class),
        @XmlElement(name = "attributeGroup", type = AttributeGroupRef.class)
    })
    protected List<Annotated> attributeOrAttributeGroup;
    protected Wildcard anyAttribute;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(name = "ref")
    protected QName ref;

    /**
     * Gets the value of the attributeOrAttributeGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeOrAttributeGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeOrAttributeGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attribute }
     * {@link AttributeGroupRef }
     * 
     * 
     */
    public List<Annotated> getAttributeOrAttributeGroup() {
        if (attributeOrAttributeGroup == null) {
            attributeOrAttributeGroup = new ArrayList<Annotated>();
        }
        return this.attributeOrAttributeGroup;
    }

    /**
     * Obtient la valeur de la propriété anyAttribute.
     * 
     * @return
     *     possible object is
     *     {@link Wildcard }
     *     
     */
    public Wildcard getAnyAttribute() {
        return anyAttribute;
    }

    /**
     * Définit la valeur de la propriété anyAttribute.
     * 
     * @param value
     *     allowed object is
     *     {@link Wildcard }
     *     
     */
    public void setAnyAttribute(Wildcard value) {
        this.anyAttribute = value;
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

    /**
     * Obtient la valeur de la propriété ref.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getRef() {
        return ref;
    }

    /**
     * Définit la valeur de la propriété ref.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setRef(QName value) {
        this.ref = value;
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
            List<Annotated> theAttributeOrAttributeGroup;
            theAttributeOrAttributeGroup = (((this.attributeOrAttributeGroup!= null)&&(!this.attributeOrAttributeGroup.isEmpty()))?this.getAttributeOrAttributeGroup():null);
            strategy.appendField(locator, this, "attributeOrAttributeGroup", buffer, theAttributeOrAttributeGroup, ((this.attributeOrAttributeGroup!= null)&&(!this.attributeOrAttributeGroup.isEmpty())));
        }
        {
            Wildcard theAnyAttribute;
            theAnyAttribute = this.getAnyAttribute();
            strategy.appendField(locator, this, "anyAttribute", buffer, theAnyAttribute, (this.anyAttribute!= null));
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            QName theRef;
            theRef = this.getRef();
            strategy.appendField(locator, this, "ref", buffer, theRef, (this.ref!= null));
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
        final AttributeGroup that = ((AttributeGroup) object);
        {
            List<Annotated> lhsAttributeOrAttributeGroup;
            lhsAttributeOrAttributeGroup = (((this.attributeOrAttributeGroup!= null)&&(!this.attributeOrAttributeGroup.isEmpty()))?this.getAttributeOrAttributeGroup():null);
            List<Annotated> rhsAttributeOrAttributeGroup;
            rhsAttributeOrAttributeGroup = (((that.attributeOrAttributeGroup!= null)&&(!that.attributeOrAttributeGroup.isEmpty()))?that.getAttributeOrAttributeGroup():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attributeOrAttributeGroup", lhsAttributeOrAttributeGroup), LocatorUtils.property(thatLocator, "attributeOrAttributeGroup", rhsAttributeOrAttributeGroup), lhsAttributeOrAttributeGroup, rhsAttributeOrAttributeGroup, ((this.attributeOrAttributeGroup!= null)&&(!this.attributeOrAttributeGroup.isEmpty())), ((that.attributeOrAttributeGroup!= null)&&(!that.attributeOrAttributeGroup.isEmpty())))) {
                return false;
            }
        }
        {
            Wildcard lhsAnyAttribute;
            lhsAnyAttribute = this.getAnyAttribute();
            Wildcard rhsAnyAttribute;
            rhsAnyAttribute = that.getAnyAttribute();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anyAttribute", lhsAnyAttribute), LocatorUtils.property(thatLocator, "anyAttribute", rhsAnyAttribute), lhsAnyAttribute, rhsAnyAttribute, (this.anyAttribute!= null), (that.anyAttribute!= null))) {
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
        {
            QName lhsRef;
            lhsRef = this.getRef();
            QName rhsRef;
            rhsRef = that.getRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ref", lhsRef), LocatorUtils.property(thatLocator, "ref", rhsRef), lhsRef, rhsRef, (this.ref!= null), (that.ref!= null))) {
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
            List<Annotated> theAttributeOrAttributeGroup;
            theAttributeOrAttributeGroup = (((this.attributeOrAttributeGroup!= null)&&(!this.attributeOrAttributeGroup.isEmpty()))?this.getAttributeOrAttributeGroup():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attributeOrAttributeGroup", theAttributeOrAttributeGroup), currentHashCode, theAttributeOrAttributeGroup, ((this.attributeOrAttributeGroup!= null)&&(!this.attributeOrAttributeGroup.isEmpty())));
        }
        {
            Wildcard theAnyAttribute;
            theAnyAttribute = this.getAnyAttribute();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anyAttribute", theAnyAttribute), currentHashCode, theAnyAttribute, (this.anyAttribute!= null));
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            QName theRef;
            theRef = this.getRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ref", theRef), currentHashCode, theRef, (this.ref!= null));
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        if (target instanceof AttributeGroup) {
            final AttributeGroup copy = ((AttributeGroup) target);
            {
                Boolean attributeOrAttributeGroupShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.attributeOrAttributeGroup!= null)&&(!this.attributeOrAttributeGroup.isEmpty())));
                if (attributeOrAttributeGroupShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Annotated> sourceAttributeOrAttributeGroup;
                    sourceAttributeOrAttributeGroup = (((this.attributeOrAttributeGroup!= null)&&(!this.attributeOrAttributeGroup.isEmpty()))?this.getAttributeOrAttributeGroup():null);
                    @SuppressWarnings("unchecked")
                    List<Annotated> copyAttributeOrAttributeGroup = ((List<Annotated> ) strategy.copy(LocatorUtils.property(locator, "attributeOrAttributeGroup", sourceAttributeOrAttributeGroup), sourceAttributeOrAttributeGroup, ((this.attributeOrAttributeGroup!= null)&&(!this.attributeOrAttributeGroup.isEmpty()))));
                    copy.attributeOrAttributeGroup = null;
                    if (copyAttributeOrAttributeGroup!= null) {
                        List<Annotated> uniqueAttributeOrAttributeGroupl = copy.getAttributeOrAttributeGroup();
                        uniqueAttributeOrAttributeGroupl.addAll(copyAttributeOrAttributeGroup);
                    }
                } else {
                    if (attributeOrAttributeGroupShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.attributeOrAttributeGroup = null;
                    }
                }
            }
            {
                Boolean anyAttributeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anyAttribute!= null));
                if (anyAttributeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Wildcard sourceAnyAttribute;
                    sourceAnyAttribute = this.getAnyAttribute();
                    Wildcard copyAnyAttribute = ((Wildcard) strategy.copy(LocatorUtils.property(locator, "anyAttribute", sourceAnyAttribute), sourceAnyAttribute, (this.anyAttribute!= null)));
                    copy.setAnyAttribute(copyAnyAttribute);
                } else {
                    if (anyAttributeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anyAttribute = null;
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
            {
                Boolean refShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ref!= null));
                if (refShouldBeCopiedAndSet == Boolean.TRUE) {
                    QName sourceRef;
                    sourceRef = this.getRef();
                    QName copyRef = ((QName) strategy.copy(LocatorUtils.property(locator, "ref", sourceRef), sourceRef, (this.ref!= null)));
                    copy.setRef(copyRef);
                } else {
                    if (refShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ref = null;
                    }
                }
            }
        }
        return target;
    }

}

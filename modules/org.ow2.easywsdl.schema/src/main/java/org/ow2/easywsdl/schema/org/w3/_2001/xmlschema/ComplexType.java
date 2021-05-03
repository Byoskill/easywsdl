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
 * <p>Classe Java pour complexType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="complexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.w3.org/2001/XMLSchema}annotated"&gt;
 *       &lt;group ref="{http://www.w3.org/2001/XMLSchema}complexTypeModel"/&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="mixed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="abstract" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="final" type="{http://www.w3.org/2001/XMLSchema}derivationSet" /&gt;
 *       &lt;attribute name="block" type="{http://www.w3.org/2001/XMLSchema}derivationSet" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complexType", propOrder = {
    "simpleContent",
    "complexContent",
    "group",
    "all",
    "choice",
    "sequence",
    "attributeOrAttributeGroup",
    "anyAttribute"
})
@XmlSeeAlso({
    TopLevelComplexType.class,
    LocalComplexType.class
})
public abstract class ComplexType
    extends Annotated
    implements Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    protected SimpleContent simpleContent;
    protected ComplexContent complexContent;
    protected GroupRef group;
    protected All all;
    protected ExplicitGroup choice;
    protected ExplicitGroup sequence;
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
    @XmlAttribute(name = "mixed")
    protected Boolean mixed;
    @XmlAttribute(name = "abstract")
    protected Boolean _abstract;
    @XmlAttribute(name = "final")
    @XmlSchemaType(name = "derivationSet")
    protected List<String> _final;
    @XmlAttribute(name = "block")
    @XmlSchemaType(name = "derivationSet")
    protected List<String> block;

    /**
     * Obtient la valeur de la propriété simpleContent.
     * 
     * @return
     *     possible object is
     *     {@link SimpleContent }
     *     
     */
    public SimpleContent getSimpleContent() {
        return simpleContent;
    }

    /**
     * Définit la valeur de la propriété simpleContent.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleContent }
     *     
     */
    public void setSimpleContent(SimpleContent value) {
        this.simpleContent = value;
    }

    /**
     * Obtient la valeur de la propriété complexContent.
     * 
     * @return
     *     possible object is
     *     {@link ComplexContent }
     *     
     */
    public ComplexContent getComplexContent() {
        return complexContent;
    }

    /**
     * Définit la valeur de la propriété complexContent.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexContent }
     *     
     */
    public void setComplexContent(ComplexContent value) {
        this.complexContent = value;
    }

    /**
     * Obtient la valeur de la propriété group.
     * 
     * @return
     *     possible object is
     *     {@link GroupRef }
     *     
     */
    public GroupRef getGroup() {
        return group;
    }

    /**
     * Définit la valeur de la propriété group.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupRef }
     *     
     */
    public void setGroup(GroupRef value) {
        this.group = value;
    }

    /**
     * Obtient la valeur de la propriété all.
     * 
     * @return
     *     possible object is
     *     {@link All }
     *     
     */
    public All getAll() {
        return all;
    }

    /**
     * Définit la valeur de la propriété all.
     * 
     * @param value
     *     allowed object is
     *     {@link All }
     *     
     */
    public void setAll(All value) {
        this.all = value;
    }

    /**
     * Obtient la valeur de la propriété choice.
     * 
     * @return
     *     possible object is
     *     {@link ExplicitGroup }
     *     
     */
    public ExplicitGroup getChoice() {
        return choice;
    }

    /**
     * Définit la valeur de la propriété choice.
     * 
     * @param value
     *     allowed object is
     *     {@link ExplicitGroup }
     *     
     */
    public void setChoice(ExplicitGroup value) {
        this.choice = value;
    }

    /**
     * Obtient la valeur de la propriété sequence.
     * 
     * @return
     *     possible object is
     *     {@link ExplicitGroup }
     *     
     */
    public ExplicitGroup getSequence() {
        return sequence;
    }

    /**
     * Définit la valeur de la propriété sequence.
     * 
     * @param value
     *     allowed object is
     *     {@link ExplicitGroup }
     *     
     */
    public void setSequence(ExplicitGroup value) {
        this.sequence = value;
    }

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
     * Obtient la valeur de la propriété mixed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMixed() {
        if (mixed == null) {
            return false;
        } else {
            return mixed;
        }
    }

    /**
     * Définit la valeur de la propriété mixed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMixed(Boolean value) {
        this.mixed = value;
    }

    /**
     * Obtient la valeur de la propriété abstract.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAbstract() {
        if (_abstract == null) {
            return false;
        } else {
            return _abstract;
        }
    }

    /**
     * Définit la valeur de la propriété abstract.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAbstract(Boolean value) {
        this._abstract = value;
    }

    /**
     * Gets the value of the final property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the final property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFinal() {
        if (_final == null) {
            _final = new ArrayList<String>();
        }
        return this._final;
    }

    /**
     * Gets the value of the block property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the block property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBlock() {
        if (block == null) {
            block = new ArrayList<String>();
        }
        return this.block;
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
            SimpleContent theSimpleContent;
            theSimpleContent = this.getSimpleContent();
            strategy.appendField(locator, this, "simpleContent", buffer, theSimpleContent, (this.simpleContent!= null));
        }
        {
            ComplexContent theComplexContent;
            theComplexContent = this.getComplexContent();
            strategy.appendField(locator, this, "complexContent", buffer, theComplexContent, (this.complexContent!= null));
        }
        {
            GroupRef theGroup;
            theGroup = this.getGroup();
            strategy.appendField(locator, this, "group", buffer, theGroup, (this.group!= null));
        }
        {
            All theAll;
            theAll = this.getAll();
            strategy.appendField(locator, this, "all", buffer, theAll, (this.all!= null));
        }
        {
            ExplicitGroup theChoice;
            theChoice = this.getChoice();
            strategy.appendField(locator, this, "choice", buffer, theChoice, (this.choice!= null));
        }
        {
            ExplicitGroup theSequence;
            theSequence = this.getSequence();
            strategy.appendField(locator, this, "sequence", buffer, theSequence, (this.sequence!= null));
        }
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
            boolean theMixed;
            theMixed = ((this.mixed!= null)?this.isMixed():false);
            strategy.appendField(locator, this, "mixed", buffer, theMixed, (this.mixed!= null));
        }
        {
            boolean theAbstract;
            theAbstract = ((this._abstract!= null)?this.isAbstract():false);
            strategy.appendField(locator, this, "_abstract", buffer, theAbstract, (this._abstract!= null));
        }
        {
            List<String> theFinal;
            theFinal = (((this._final!= null)&&(!this._final.isEmpty()))?this.getFinal():null);
            strategy.appendField(locator, this, "_final", buffer, theFinal, ((this._final!= null)&&(!this._final.isEmpty())));
        }
        {
            List<String> theBlock;
            theBlock = (((this.block!= null)&&(!this.block.isEmpty()))?this.getBlock():null);
            strategy.appendField(locator, this, "block", buffer, theBlock, ((this.block!= null)&&(!this.block.isEmpty())));
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
        final ComplexType that = ((ComplexType) object);
        {
            SimpleContent lhsSimpleContent;
            lhsSimpleContent = this.getSimpleContent();
            SimpleContent rhsSimpleContent;
            rhsSimpleContent = that.getSimpleContent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "simpleContent", lhsSimpleContent), LocatorUtils.property(thatLocator, "simpleContent", rhsSimpleContent), lhsSimpleContent, rhsSimpleContent, (this.simpleContent!= null), (that.simpleContent!= null))) {
                return false;
            }
        }
        {
            ComplexContent lhsComplexContent;
            lhsComplexContent = this.getComplexContent();
            ComplexContent rhsComplexContent;
            rhsComplexContent = that.getComplexContent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "complexContent", lhsComplexContent), LocatorUtils.property(thatLocator, "complexContent", rhsComplexContent), lhsComplexContent, rhsComplexContent, (this.complexContent!= null), (that.complexContent!= null))) {
                return false;
            }
        }
        {
            GroupRef lhsGroup;
            lhsGroup = this.getGroup();
            GroupRef rhsGroup;
            rhsGroup = that.getGroup();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "group", lhsGroup), LocatorUtils.property(thatLocator, "group", rhsGroup), lhsGroup, rhsGroup, (this.group!= null), (that.group!= null))) {
                return false;
            }
        }
        {
            All lhsAll;
            lhsAll = this.getAll();
            All rhsAll;
            rhsAll = that.getAll();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "all", lhsAll), LocatorUtils.property(thatLocator, "all", rhsAll), lhsAll, rhsAll, (this.all!= null), (that.all!= null))) {
                return false;
            }
        }
        {
            ExplicitGroup lhsChoice;
            lhsChoice = this.getChoice();
            ExplicitGroup rhsChoice;
            rhsChoice = that.getChoice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "choice", lhsChoice), LocatorUtils.property(thatLocator, "choice", rhsChoice), lhsChoice, rhsChoice, (this.choice!= null), (that.choice!= null))) {
                return false;
            }
        }
        {
            ExplicitGroup lhsSequence;
            lhsSequence = this.getSequence();
            ExplicitGroup rhsSequence;
            rhsSequence = that.getSequence();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sequence", lhsSequence), LocatorUtils.property(thatLocator, "sequence", rhsSequence), lhsSequence, rhsSequence, (this.sequence!= null), (that.sequence!= null))) {
                return false;
            }
        }
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
            boolean lhsMixed;
            lhsMixed = ((this.mixed!= null)?this.isMixed():false);
            boolean rhsMixed;
            rhsMixed = ((that.mixed!= null)?that.isMixed():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mixed", lhsMixed), LocatorUtils.property(thatLocator, "mixed", rhsMixed), lhsMixed, rhsMixed, (this.mixed!= null), (that.mixed!= null))) {
                return false;
            }
        }
        {
            boolean lhsAbstract;
            lhsAbstract = ((this._abstract!= null)?this.isAbstract():false);
            boolean rhsAbstract;
            rhsAbstract = ((that._abstract!= null)?that.isAbstract():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_abstract", lhsAbstract), LocatorUtils.property(thatLocator, "_abstract", rhsAbstract), lhsAbstract, rhsAbstract, (this._abstract!= null), (that._abstract!= null))) {
                return false;
            }
        }
        {
            List<String> lhsFinal;
            lhsFinal = (((this._final!= null)&&(!this._final.isEmpty()))?this.getFinal():null);
            List<String> rhsFinal;
            rhsFinal = (((that._final!= null)&&(!that._final.isEmpty()))?that.getFinal():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_final", lhsFinal), LocatorUtils.property(thatLocator, "_final", rhsFinal), lhsFinal, rhsFinal, ((this._final!= null)&&(!this._final.isEmpty())), ((that._final!= null)&&(!that._final.isEmpty())))) {
                return false;
            }
        }
        {
            List<String> lhsBlock;
            lhsBlock = (((this.block!= null)&&(!this.block.isEmpty()))?this.getBlock():null);
            List<String> rhsBlock;
            rhsBlock = (((that.block!= null)&&(!that.block.isEmpty()))?that.getBlock():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "block", lhsBlock), LocatorUtils.property(thatLocator, "block", rhsBlock), lhsBlock, rhsBlock, ((this.block!= null)&&(!this.block.isEmpty())), ((that.block!= null)&&(!that.block.isEmpty())))) {
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
            SimpleContent theSimpleContent;
            theSimpleContent = this.getSimpleContent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "simpleContent", theSimpleContent), currentHashCode, theSimpleContent, (this.simpleContent!= null));
        }
        {
            ComplexContent theComplexContent;
            theComplexContent = this.getComplexContent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "complexContent", theComplexContent), currentHashCode, theComplexContent, (this.complexContent!= null));
        }
        {
            GroupRef theGroup;
            theGroup = this.getGroup();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "group", theGroup), currentHashCode, theGroup, (this.group!= null));
        }
        {
            All theAll;
            theAll = this.getAll();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "all", theAll), currentHashCode, theAll, (this.all!= null));
        }
        {
            ExplicitGroup theChoice;
            theChoice = this.getChoice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "choice", theChoice), currentHashCode, theChoice, (this.choice!= null));
        }
        {
            ExplicitGroup theSequence;
            theSequence = this.getSequence();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sequence", theSequence), currentHashCode, theSequence, (this.sequence!= null));
        }
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
            boolean theMixed;
            theMixed = ((this.mixed!= null)?this.isMixed():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mixed", theMixed), currentHashCode, theMixed, (this.mixed!= null));
        }
        {
            boolean theAbstract;
            theAbstract = ((this._abstract!= null)?this.isAbstract():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_abstract", theAbstract), currentHashCode, theAbstract, (this._abstract!= null));
        }
        {
            List<String> theFinal;
            theFinal = (((this._final!= null)&&(!this._final.isEmpty()))?this.getFinal():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_final", theFinal), currentHashCode, theFinal, ((this._final!= null)&&(!this._final.isEmpty())));
        }
        {
            List<String> theBlock;
            theBlock = (((this.block!= null)&&(!this.block.isEmpty()))?this.getBlock():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "block", theBlock), currentHashCode, theBlock, ((this.block!= null)&&(!this.block.isEmpty())));
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
        if (target instanceof ComplexType) {
            final ComplexType copy = ((ComplexType) target);
            {
                Boolean simpleContentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.simpleContent!= null));
                if (simpleContentShouldBeCopiedAndSet == Boolean.TRUE) {
                    SimpleContent sourceSimpleContent;
                    sourceSimpleContent = this.getSimpleContent();
                    SimpleContent copySimpleContent = ((SimpleContent) strategy.copy(LocatorUtils.property(locator, "simpleContent", sourceSimpleContent), sourceSimpleContent, (this.simpleContent!= null)));
                    copy.setSimpleContent(copySimpleContent);
                } else {
                    if (simpleContentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.simpleContent = null;
                    }
                }
            }
            {
                Boolean complexContentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.complexContent!= null));
                if (complexContentShouldBeCopiedAndSet == Boolean.TRUE) {
                    ComplexContent sourceComplexContent;
                    sourceComplexContent = this.getComplexContent();
                    ComplexContent copyComplexContent = ((ComplexContent) strategy.copy(LocatorUtils.property(locator, "complexContent", sourceComplexContent), sourceComplexContent, (this.complexContent!= null)));
                    copy.setComplexContent(copyComplexContent);
                } else {
                    if (complexContentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.complexContent = null;
                    }
                }
            }
            {
                Boolean groupShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.group!= null));
                if (groupShouldBeCopiedAndSet == Boolean.TRUE) {
                    GroupRef sourceGroup;
                    sourceGroup = this.getGroup();
                    GroupRef copyGroup = ((GroupRef) strategy.copy(LocatorUtils.property(locator, "group", sourceGroup), sourceGroup, (this.group!= null)));
                    copy.setGroup(copyGroup);
                } else {
                    if (groupShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.group = null;
                    }
                }
            }
            {
                Boolean allShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.all!= null));
                if (allShouldBeCopiedAndSet == Boolean.TRUE) {
                    All sourceAll;
                    sourceAll = this.getAll();
                    All copyAll = ((All) strategy.copy(LocatorUtils.property(locator, "all", sourceAll), sourceAll, (this.all!= null)));
                    copy.setAll(copyAll);
                } else {
                    if (allShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.all = null;
                    }
                }
            }
            {
                Boolean choiceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.choice!= null));
                if (choiceShouldBeCopiedAndSet == Boolean.TRUE) {
                    ExplicitGroup sourceChoice;
                    sourceChoice = this.getChoice();
                    ExplicitGroup copyChoice = ((ExplicitGroup) strategy.copy(LocatorUtils.property(locator, "choice", sourceChoice), sourceChoice, (this.choice!= null)));
                    copy.setChoice(copyChoice);
                } else {
                    if (choiceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.choice = null;
                    }
                }
            }
            {
                Boolean sequenceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sequence!= null));
                if (sequenceShouldBeCopiedAndSet == Boolean.TRUE) {
                    ExplicitGroup sourceSequence;
                    sourceSequence = this.getSequence();
                    ExplicitGroup copySequence = ((ExplicitGroup) strategy.copy(LocatorUtils.property(locator, "sequence", sourceSequence), sourceSequence, (this.sequence!= null)));
                    copy.setSequence(copySequence);
                } else {
                    if (sequenceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sequence = null;
                    }
                }
            }
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
                Boolean mixedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mixed!= null));
                if (mixedShouldBeCopiedAndSet == Boolean.TRUE) {
                    boolean sourceMixed;
                    sourceMixed = ((this.mixed!= null)?this.isMixed():false);
                    boolean copyMixed = strategy.copy(LocatorUtils.property(locator, "mixed", sourceMixed), sourceMixed, (this.mixed!= null));
                    copy.setMixed(copyMixed);
                } else {
                    if (mixedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mixed = null;
                    }
                }
            }
            {
                Boolean _abstractShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this._abstract!= null));
                if (_abstractShouldBeCopiedAndSet == Boolean.TRUE) {
                    boolean sourceAbstract;
                    sourceAbstract = ((this._abstract!= null)?this.isAbstract():false);
                    boolean copyAbstract = strategy.copy(LocatorUtils.property(locator, "_abstract", sourceAbstract), sourceAbstract, (this._abstract!= null));
                    copy.setAbstract(copyAbstract);
                } else {
                    if (_abstractShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy._abstract = null;
                    }
                }
            }
            {
                Boolean _finalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this._final!= null)&&(!this._final.isEmpty())));
                if (_finalShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<String> sourceFinal;
                    sourceFinal = (((this._final!= null)&&(!this._final.isEmpty()))?this.getFinal():null);
                    @SuppressWarnings("unchecked")
                    List<String> copyFinal = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "_final", sourceFinal), sourceFinal, ((this._final!= null)&&(!this._final.isEmpty()))));
                    copy._final = null;
                    if (copyFinal!= null) {
                        List<String> uniqueFinall = copy.getFinal();
                        uniqueFinall.addAll(copyFinal);
                    }
                } else {
                    if (_finalShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy._final = null;
                    }
                }
            }
            {
                Boolean blockShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.block!= null)&&(!this.block.isEmpty())));
                if (blockShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<String> sourceBlock;
                    sourceBlock = (((this.block!= null)&&(!this.block.isEmpty()))?this.getBlock():null);
                    @SuppressWarnings("unchecked")
                    List<String> copyBlock = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "block", sourceBlock), sourceBlock, ((this.block!= null)&&(!this.block.isEmpty()))));
                    copy.block = null;
                    if (copyBlock!= null) {
                        List<String> uniqueBlockl = copy.getBlock();
                        uniqueBlockl.addAll(copyBlock);
                    }
                } else {
                    if (blockShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.block = null;
                    }
                }
            }
        }
        return target;
    }

}

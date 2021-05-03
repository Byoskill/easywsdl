//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.03 à 03:39:56 PM CEST 
//


package org.ow2.easywsdl.schema.org.w3._2001.xmlschema;

import java.util.ArrayList;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 * <p>Classe Java pour simpleType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="simpleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.w3.org/2001/XMLSchema}annotated"&gt;
 *       &lt;group ref="{http://www.w3.org/2001/XMLSchema}simpleDerivation"/&gt;
 *       &lt;attribute name="final" type="{http://www.w3.org/2001/XMLSchema}simpleDerivationSet" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simpleType", propOrder = {
    "restriction",
    "list",
    "union"
})
@XmlSeeAlso({
    TopLevelSimpleType.class,
    LocalSimpleType.class
})
public abstract class SimpleType
    extends Annotated
    implements Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    protected Restriction restriction;
    protected org.ow2.easywsdl.schema.org.w3._2001.xmlschema.List list;
    protected Union union;
    @XmlAttribute(name = "final")
    @XmlSchemaType(name = "simpleDerivationSet")
    protected java.util.List<String> _final;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;

    /**
     * Obtient la valeur de la propriété restriction.
     * 
     * @return
     *     possible object is
     *     {@link Restriction }
     *     
     */
    public Restriction getRestriction() {
        return restriction;
    }

    /**
     * Définit la valeur de la propriété restriction.
     * 
     * @param value
     *     allowed object is
     *     {@link Restriction }
     *     
     */
    public void setRestriction(Restriction value) {
        this.restriction = value;
    }

    /**
     * Obtient la valeur de la propriété list.
     * 
     * @return
     *     possible object is
     *     {@link org.ow2.easywsdl.schema.org.w3._2001.xmlschema.List }
     *     
     */
    public org.ow2.easywsdl.schema.org.w3._2001.xmlschema.List getList() {
        return list;
    }

    /**
     * Définit la valeur de la propriété list.
     * 
     * @param value
     *     allowed object is
     *     {@link org.ow2.easywsdl.schema.org.w3._2001.xmlschema.List }
     *     
     */
    public void setList(org.ow2.easywsdl.schema.org.w3._2001.xmlschema.List value) {
        this.list = value;
    }

    /**
     * Obtient la valeur de la propriété union.
     * 
     * @return
     *     possible object is
     *     {@link Union }
     *     
     */
    public Union getUnion() {
        return union;
    }

    /**
     * Définit la valeur de la propriété union.
     * 
     * @param value
     *     allowed object is
     *     {@link Union }
     *     
     */
    public void setUnion(Union value) {
        this.union = value;
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
    public java.util.List<String> getFinal() {
        if (_final == null) {
            _final = new ArrayList<String>();
        }
        return this._final;
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
            Restriction theRestriction;
            theRestriction = this.getRestriction();
            strategy.appendField(locator, this, "restriction", buffer, theRestriction, (this.restriction!= null));
        }
        {
            org.ow2.easywsdl.schema.org.w3._2001.xmlschema.List theList;
            theList = this.getList();
            strategy.appendField(locator, this, "list", buffer, theList, (this.list!= null));
        }
        {
            Union theUnion;
            theUnion = this.getUnion();
            strategy.appendField(locator, this, "union", buffer, theUnion, (this.union!= null));
        }
        {
            java.util.List<String> theFinal;
            theFinal = (((this._final!= null)&&(!this._final.isEmpty()))?this.getFinal():null);
            strategy.appendField(locator, this, "_final", buffer, theFinal, ((this._final!= null)&&(!this._final.isEmpty())));
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
        final SimpleType that = ((SimpleType) object);
        {
            Restriction lhsRestriction;
            lhsRestriction = this.getRestriction();
            Restriction rhsRestriction;
            rhsRestriction = that.getRestriction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "restriction", lhsRestriction), LocatorUtils.property(thatLocator, "restriction", rhsRestriction), lhsRestriction, rhsRestriction, (this.restriction!= null), (that.restriction!= null))) {
                return false;
            }
        }
        {
            org.ow2.easywsdl.schema.org.w3._2001.xmlschema.List lhsList;
            lhsList = this.getList();
            org.ow2.easywsdl.schema.org.w3._2001.xmlschema.List rhsList;
            rhsList = that.getList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "list", lhsList), LocatorUtils.property(thatLocator, "list", rhsList), lhsList, rhsList, (this.list!= null), (that.list!= null))) {
                return false;
            }
        }
        {
            Union lhsUnion;
            lhsUnion = this.getUnion();
            Union rhsUnion;
            rhsUnion = that.getUnion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "union", lhsUnion), LocatorUtils.property(thatLocator, "union", rhsUnion), lhsUnion, rhsUnion, (this.union!= null), (that.union!= null))) {
                return false;
            }
        }
        {
            java.util.List<String> lhsFinal;
            lhsFinal = (((this._final!= null)&&(!this._final.isEmpty()))?this.getFinal():null);
            java.util.List<String> rhsFinal;
            rhsFinal = (((that._final!= null)&&(!that._final.isEmpty()))?that.getFinal():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_final", lhsFinal), LocatorUtils.property(thatLocator, "_final", rhsFinal), lhsFinal, rhsFinal, ((this._final!= null)&&(!this._final.isEmpty())), ((that._final!= null)&&(!that._final.isEmpty())))) {
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
            Restriction theRestriction;
            theRestriction = this.getRestriction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "restriction", theRestriction), currentHashCode, theRestriction, (this.restriction!= null));
        }
        {
            org.ow2.easywsdl.schema.org.w3._2001.xmlschema.List theList;
            theList = this.getList();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "list", theList), currentHashCode, theList, (this.list!= null));
        }
        {
            Union theUnion;
            theUnion = this.getUnion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "union", theUnion), currentHashCode, theUnion, (this.union!= null));
        }
        {
            java.util.List<String> theFinal;
            theFinal = (((this._final!= null)&&(!this._final.isEmpty()))?this.getFinal():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_final", theFinal), currentHashCode, theFinal, ((this._final!= null)&&(!this._final.isEmpty())));
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        if (target instanceof SimpleType) {
            final SimpleType copy = ((SimpleType) target);
            {
                Boolean restrictionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.restriction!= null));
                if (restrictionShouldBeCopiedAndSet == Boolean.TRUE) {
                    Restriction sourceRestriction;
                    sourceRestriction = this.getRestriction();
                    Restriction copyRestriction = ((Restriction) strategy.copy(LocatorUtils.property(locator, "restriction", sourceRestriction), sourceRestriction, (this.restriction!= null)));
                    copy.setRestriction(copyRestriction);
                } else {
                    if (restrictionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.restriction = null;
                    }
                }
            }
            {
                Boolean listShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.list!= null));
                if (listShouldBeCopiedAndSet == Boolean.TRUE) {
                    org.ow2.easywsdl.schema.org.w3._2001.xmlschema.List sourceList;
                    sourceList = this.getList();
                    org.ow2.easywsdl.schema.org.w3._2001.xmlschema.List copyList = ((org.ow2.easywsdl.schema.org.w3._2001.xmlschema.List) strategy.copy(LocatorUtils.property(locator, "list", sourceList), sourceList, (this.list!= null)));
                    copy.setList(copyList);
                } else {
                    if (listShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.list = null;
                    }
                }
            }
            {
                Boolean unionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.union!= null));
                if (unionShouldBeCopiedAndSet == Boolean.TRUE) {
                    Union sourceUnion;
                    sourceUnion = this.getUnion();
                    Union copyUnion = ((Union) strategy.copy(LocatorUtils.property(locator, "union", sourceUnion), sourceUnion, (this.union!= null)));
                    copy.setUnion(copyUnion);
                } else {
                    if (unionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.union = null;
                    }
                }
            }
            {
                Boolean _finalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this._final!= null)&&(!this._final.isEmpty())));
                if (_finalShouldBeCopiedAndSet == Boolean.TRUE) {
                    java.util.List<String> sourceFinal;
                    sourceFinal = (((this._final!= null)&&(!this._final.isEmpty()))?this.getFinal():null);
                    @SuppressWarnings("unchecked")
                    java.util.List<String> copyFinal = ((java.util.List<String> ) strategy.copy(LocatorUtils.property(locator, "_final", sourceFinal), sourceFinal, ((this._final!= null)&&(!this._final.isEmpty()))));
                    copy._final = null;
                    if (copyFinal!= null) {
                        java.util.List<String> uniqueFinall = copy.getFinal();
                        uniqueFinall.addAll(copyFinal);
                    }
                } else {
                    if (_finalShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy._final = null;
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
        return target;
    }

}

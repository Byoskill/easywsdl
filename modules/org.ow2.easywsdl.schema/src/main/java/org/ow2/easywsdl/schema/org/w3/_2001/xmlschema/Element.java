//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.03 à 03:39:56 PM CEST 
//


package org.ow2.easywsdl.schema.org.w3._2001.xmlschema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
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
 * 
 *    The element element can be used either
 *    at the top level to define an element-type binding globally,
 *    or within a content model to either reference a globally-defined
 *    element or type or declare an element-type binding locally.
 *    The ref form is not allowed at the top level.
 * 
 * <p>Classe Java pour element complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="element"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.w3.org/2001/XMLSchema}annotated"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="simpleType" type="{http://www.w3.org/2001/XMLSchema}localSimpleType"/&gt;
 *           &lt;element name="complexType" type="{http://www.w3.org/2001/XMLSchema}localComplexType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;group ref="{http://www.w3.org/2001/XMLSchema}identityConstraint" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.w3.org/2001/XMLSchema}defRef"/&gt;
 *       &lt;attGroup ref="{http://www.w3.org/2001/XMLSchema}occurs"/&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;attribute name="substitutionGroup" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="fixed" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="nillable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="abstract" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="final" type="{http://www.w3.org/2001/XMLSchema}derivationSet" /&gt;
 *       &lt;attribute name="block" type="{http://www.w3.org/2001/XMLSchema}blockSet" /&gt;
 *       &lt;attribute name="form" type="{http://www.w3.org/2001/XMLSchema}formChoice" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "element", propOrder = {
    "simpleType",
    "complexType",
    "identityConstraint"
})
@XmlSeeAlso({
    TopLevelElement.class,
    LocalElement.class
})
public abstract class Element
    extends Annotated
    implements Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    protected LocalSimpleType simpleType;
    protected LocalComplexType complexType;
    @XmlElementRefs({
        @XmlElementRef(name = "unique", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "key", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "keyref", namespace = "http://www.w3.org/2001/XMLSchema", type = Keyref.class, required = false)
    })
    protected List<Object> identityConstraint;
    @XmlAttribute(name = "type")
    protected QName type;
    @XmlAttribute(name = "substitutionGroup")
    protected QName substitutionGroup;
    @XmlAttribute(name = "default")
    protected String _default;
    @XmlAttribute(name = "fixed")
    protected String fixed;
    @XmlAttribute(name = "nillable")
    protected Boolean nillable;
    @XmlAttribute(name = "abstract")
    protected Boolean _abstract;
    @XmlAttribute(name = "final")
    @XmlSchemaType(name = "derivationSet")
    protected List<String> _final;
    @XmlAttribute(name = "block")
    @XmlSchemaType(name = "blockSet")
    protected List<String> block;
    @XmlAttribute(name = "form")
    protected FormChoice form;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(name = "ref")
    protected QName ref;
    @XmlAttribute(name = "minOccurs")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minOccurs;
    @XmlAttribute(name = "maxOccurs")
    @XmlSchemaType(name = "allNNI")
    protected String maxOccurs;

    /**
     * Obtient la valeur de la propriété simpleType.
     * 
     * @return
     *     possible object is
     *     {@link LocalSimpleType }
     *     
     */
    public LocalSimpleType getSimpleType() {
        return simpleType;
    }

    /**
     * Définit la valeur de la propriété simpleType.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalSimpleType }
     *     
     */
    public void setSimpleType(LocalSimpleType value) {
        this.simpleType = value;
    }

    /**
     * Obtient la valeur de la propriété complexType.
     * 
     * @return
     *     possible object is
     *     {@link LocalComplexType }
     *     
     */
    public LocalComplexType getComplexType() {
        return complexType;
    }

    /**
     * Définit la valeur de la propriété complexType.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalComplexType }
     *     
     */
    public void setComplexType(LocalComplexType value) {
        this.complexType = value;
    }

    /**
     * Gets the value of the identityConstraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identityConstraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentityConstraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Keybase }{@code >}
     * {@link JAXBElement }{@code <}{@link Keybase }{@code >}
     * {@link Keyref }
     * 
     * 
     */
    public List<Object> getIdentityConstraint() {
        if (identityConstraint == null) {
            identityConstraint = new ArrayList<Object>();
        }
        return this.identityConstraint;
    }

    /**
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getType() {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setType(QName value) {
        this.type = value;
    }

    /**
     * Obtient la valeur de la propriété substitutionGroup.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getSubstitutionGroup() {
        return substitutionGroup;
    }

    /**
     * Définit la valeur de la propriété substitutionGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setSubstitutionGroup(QName value) {
        this.substitutionGroup = value;
    }

    /**
     * Obtient la valeur de la propriété default.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefault() {
        return _default;
    }

    /**
     * Définit la valeur de la propriété default.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefault(String value) {
        this._default = value;
    }

    /**
     * Obtient la valeur de la propriété fixed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixed() {
        return fixed;
    }

    /**
     * Définit la valeur de la propriété fixed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixed(String value) {
        this.fixed = value;
    }

    /**
     * Obtient la valeur de la propriété nillable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNillable() {
        if (nillable == null) {
            return false;
        } else {
            return nillable;
        }
    }

    /**
     * Définit la valeur de la propriété nillable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNillable(Boolean value) {
        this.nillable = value;
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

    /**
     * Obtient la valeur de la propriété form.
     * 
     * @return
     *     possible object is
     *     {@link FormChoice }
     *     
     */
    public FormChoice getForm() {
        return form;
    }

    /**
     * Définit la valeur de la propriété form.
     * 
     * @param value
     *     allowed object is
     *     {@link FormChoice }
     *     
     */
    public void setForm(FormChoice value) {
        this.form = value;
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

    /**
     * Obtient la valeur de la propriété minOccurs.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinOccurs() {
        if (minOccurs == null) {
            return new BigInteger("1");
        } else {
            return minOccurs;
        }
    }

    /**
     * Définit la valeur de la propriété minOccurs.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinOccurs(BigInteger value) {
        this.minOccurs = value;
    }

    /**
     * Obtient la valeur de la propriété maxOccurs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxOccurs() {
        if (maxOccurs == null) {
            return "1";
        } else {
            return maxOccurs;
        }
    }

    /**
     * Définit la valeur de la propriété maxOccurs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxOccurs(String value) {
        this.maxOccurs = value;
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
            LocalSimpleType theSimpleType;
            theSimpleType = this.getSimpleType();
            strategy.appendField(locator, this, "simpleType", buffer, theSimpleType, (this.simpleType!= null));
        }
        {
            LocalComplexType theComplexType;
            theComplexType = this.getComplexType();
            strategy.appendField(locator, this, "complexType", buffer, theComplexType, (this.complexType!= null));
        }
        {
            List<Object> theIdentityConstraint;
            theIdentityConstraint = (((this.identityConstraint!= null)&&(!this.identityConstraint.isEmpty()))?this.getIdentityConstraint():null);
            strategy.appendField(locator, this, "identityConstraint", buffer, theIdentityConstraint, ((this.identityConstraint!= null)&&(!this.identityConstraint.isEmpty())));
        }
        {
            QName theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType, (this.type!= null));
        }
        {
            QName theSubstitutionGroup;
            theSubstitutionGroup = this.getSubstitutionGroup();
            strategy.appendField(locator, this, "substitutionGroup", buffer, theSubstitutionGroup, (this.substitutionGroup!= null));
        }
        {
            String theDefault;
            theDefault = this.getDefault();
            strategy.appendField(locator, this, "_default", buffer, theDefault, (this._default!= null));
        }
        {
            String theFixed;
            theFixed = this.getFixed();
            strategy.appendField(locator, this, "fixed", buffer, theFixed, (this.fixed!= null));
        }
        {
            boolean theNillable;
            theNillable = ((this.nillable!= null)?this.isNillable():false);
            strategy.appendField(locator, this, "nillable", buffer, theNillable, (this.nillable!= null));
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
        {
            FormChoice theForm;
            theForm = this.getForm();
            strategy.appendField(locator, this, "form", buffer, theForm, (this.form!= null));
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
        {
            BigInteger theMinOccurs;
            theMinOccurs = this.getMinOccurs();
            strategy.appendField(locator, this, "minOccurs", buffer, theMinOccurs, (this.minOccurs!= null));
        }
        {
            String theMaxOccurs;
            theMaxOccurs = this.getMaxOccurs();
            strategy.appendField(locator, this, "maxOccurs", buffer, theMaxOccurs, (this.maxOccurs!= null));
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
        final Element that = ((Element) object);
        {
            LocalSimpleType lhsSimpleType;
            lhsSimpleType = this.getSimpleType();
            LocalSimpleType rhsSimpleType;
            rhsSimpleType = that.getSimpleType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "simpleType", lhsSimpleType), LocatorUtils.property(thatLocator, "simpleType", rhsSimpleType), lhsSimpleType, rhsSimpleType, (this.simpleType!= null), (that.simpleType!= null))) {
                return false;
            }
        }
        {
            LocalComplexType lhsComplexType;
            lhsComplexType = this.getComplexType();
            LocalComplexType rhsComplexType;
            rhsComplexType = that.getComplexType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "complexType", lhsComplexType), LocatorUtils.property(thatLocator, "complexType", rhsComplexType), lhsComplexType, rhsComplexType, (this.complexType!= null), (that.complexType!= null))) {
                return false;
            }
        }
        {
            List<Object> lhsIdentityConstraint;
            lhsIdentityConstraint = (((this.identityConstraint!= null)&&(!this.identityConstraint.isEmpty()))?this.getIdentityConstraint():null);
            List<Object> rhsIdentityConstraint;
            rhsIdentityConstraint = (((that.identityConstraint!= null)&&(!that.identityConstraint.isEmpty()))?that.getIdentityConstraint():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identityConstraint", lhsIdentityConstraint), LocatorUtils.property(thatLocator, "identityConstraint", rhsIdentityConstraint), lhsIdentityConstraint, rhsIdentityConstraint, ((this.identityConstraint!= null)&&(!this.identityConstraint.isEmpty())), ((that.identityConstraint!= null)&&(!that.identityConstraint.isEmpty())))) {
                return false;
            }
        }
        {
            QName lhsType;
            lhsType = this.getType();
            QName rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType, (this.type!= null), (that.type!= null))) {
                return false;
            }
        }
        {
            QName lhsSubstitutionGroup;
            lhsSubstitutionGroup = this.getSubstitutionGroup();
            QName rhsSubstitutionGroup;
            rhsSubstitutionGroup = that.getSubstitutionGroup();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "substitutionGroup", lhsSubstitutionGroup), LocatorUtils.property(thatLocator, "substitutionGroup", rhsSubstitutionGroup), lhsSubstitutionGroup, rhsSubstitutionGroup, (this.substitutionGroup!= null), (that.substitutionGroup!= null))) {
                return false;
            }
        }
        {
            String lhsDefault;
            lhsDefault = this.getDefault();
            String rhsDefault;
            rhsDefault = that.getDefault();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_default", lhsDefault), LocatorUtils.property(thatLocator, "_default", rhsDefault), lhsDefault, rhsDefault, (this._default!= null), (that._default!= null))) {
                return false;
            }
        }
        {
            String lhsFixed;
            lhsFixed = this.getFixed();
            String rhsFixed;
            rhsFixed = that.getFixed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fixed", lhsFixed), LocatorUtils.property(thatLocator, "fixed", rhsFixed), lhsFixed, rhsFixed, (this.fixed!= null), (that.fixed!= null))) {
                return false;
            }
        }
        {
            boolean lhsNillable;
            lhsNillable = ((this.nillable!= null)?this.isNillable():false);
            boolean rhsNillable;
            rhsNillable = ((that.nillable!= null)?that.isNillable():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nillable", lhsNillable), LocatorUtils.property(thatLocator, "nillable", rhsNillable), lhsNillable, rhsNillable, (this.nillable!= null), (that.nillable!= null))) {
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
        {
            FormChoice lhsForm;
            lhsForm = this.getForm();
            FormChoice rhsForm;
            rhsForm = that.getForm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "form", lhsForm), LocatorUtils.property(thatLocator, "form", rhsForm), lhsForm, rhsForm, (this.form!= null), (that.form!= null))) {
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
        {
            BigInteger lhsMinOccurs;
            lhsMinOccurs = this.getMinOccurs();
            BigInteger rhsMinOccurs;
            rhsMinOccurs = that.getMinOccurs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minOccurs", lhsMinOccurs), LocatorUtils.property(thatLocator, "minOccurs", rhsMinOccurs), lhsMinOccurs, rhsMinOccurs, (this.minOccurs!= null), (that.minOccurs!= null))) {
                return false;
            }
        }
        {
            String lhsMaxOccurs;
            lhsMaxOccurs = this.getMaxOccurs();
            String rhsMaxOccurs;
            rhsMaxOccurs = that.getMaxOccurs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxOccurs", lhsMaxOccurs), LocatorUtils.property(thatLocator, "maxOccurs", rhsMaxOccurs), lhsMaxOccurs, rhsMaxOccurs, (this.maxOccurs!= null), (that.maxOccurs!= null))) {
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
            LocalSimpleType theSimpleType;
            theSimpleType = this.getSimpleType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "simpleType", theSimpleType), currentHashCode, theSimpleType, (this.simpleType!= null));
        }
        {
            LocalComplexType theComplexType;
            theComplexType = this.getComplexType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "complexType", theComplexType), currentHashCode, theComplexType, (this.complexType!= null));
        }
        {
            List<Object> theIdentityConstraint;
            theIdentityConstraint = (((this.identityConstraint!= null)&&(!this.identityConstraint.isEmpty()))?this.getIdentityConstraint():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identityConstraint", theIdentityConstraint), currentHashCode, theIdentityConstraint, ((this.identityConstraint!= null)&&(!this.identityConstraint.isEmpty())));
        }
        {
            QName theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType, (this.type!= null));
        }
        {
            QName theSubstitutionGroup;
            theSubstitutionGroup = this.getSubstitutionGroup();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "substitutionGroup", theSubstitutionGroup), currentHashCode, theSubstitutionGroup, (this.substitutionGroup!= null));
        }
        {
            String theDefault;
            theDefault = this.getDefault();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_default", theDefault), currentHashCode, theDefault, (this._default!= null));
        }
        {
            String theFixed;
            theFixed = this.getFixed();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fixed", theFixed), currentHashCode, theFixed, (this.fixed!= null));
        }
        {
            boolean theNillable;
            theNillable = ((this.nillable!= null)?this.isNillable():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nillable", theNillable), currentHashCode, theNillable, (this.nillable!= null));
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
        {
            FormChoice theForm;
            theForm = this.getForm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "form", theForm), currentHashCode, theForm, (this.form!= null));
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
        {
            BigInteger theMinOccurs;
            theMinOccurs = this.getMinOccurs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minOccurs", theMinOccurs), currentHashCode, theMinOccurs, (this.minOccurs!= null));
        }
        {
            String theMaxOccurs;
            theMaxOccurs = this.getMaxOccurs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxOccurs", theMaxOccurs), currentHashCode, theMaxOccurs, (this.maxOccurs!= null));
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
        if (target instanceof Element) {
            final Element copy = ((Element) target);
            {
                Boolean simpleTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.simpleType!= null));
                if (simpleTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    LocalSimpleType sourceSimpleType;
                    sourceSimpleType = this.getSimpleType();
                    LocalSimpleType copySimpleType = ((LocalSimpleType) strategy.copy(LocatorUtils.property(locator, "simpleType", sourceSimpleType), sourceSimpleType, (this.simpleType!= null)));
                    copy.setSimpleType(copySimpleType);
                } else {
                    if (simpleTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.simpleType = null;
                    }
                }
            }
            {
                Boolean complexTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.complexType!= null));
                if (complexTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    LocalComplexType sourceComplexType;
                    sourceComplexType = this.getComplexType();
                    LocalComplexType copyComplexType = ((LocalComplexType) strategy.copy(LocatorUtils.property(locator, "complexType", sourceComplexType), sourceComplexType, (this.complexType!= null)));
                    copy.setComplexType(copyComplexType);
                } else {
                    if (complexTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.complexType = null;
                    }
                }
            }
            {
                Boolean identityConstraintShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.identityConstraint!= null)&&(!this.identityConstraint.isEmpty())));
                if (identityConstraintShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Object> sourceIdentityConstraint;
                    sourceIdentityConstraint = (((this.identityConstraint!= null)&&(!this.identityConstraint.isEmpty()))?this.getIdentityConstraint():null);
                    @SuppressWarnings("unchecked")
                    List<Object> copyIdentityConstraint = ((List<Object> ) strategy.copy(LocatorUtils.property(locator, "identityConstraint", sourceIdentityConstraint), sourceIdentityConstraint, ((this.identityConstraint!= null)&&(!this.identityConstraint.isEmpty()))));
                    copy.identityConstraint = null;
                    if (copyIdentityConstraint!= null) {
                        List<Object> uniqueIdentityConstraintl = copy.getIdentityConstraint();
                        uniqueIdentityConstraintl.addAll(copyIdentityConstraint);
                    }
                } else {
                    if (identityConstraintShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.identityConstraint = null;
                    }
                }
            }
            {
                Boolean typeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.type!= null));
                if (typeShouldBeCopiedAndSet == Boolean.TRUE) {
                    QName sourceType;
                    sourceType = this.getType();
                    QName copyType = ((QName) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType, (this.type!= null)));
                    copy.setType(copyType);
                } else {
                    if (typeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.type = null;
                    }
                }
            }
            {
                Boolean substitutionGroupShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.substitutionGroup!= null));
                if (substitutionGroupShouldBeCopiedAndSet == Boolean.TRUE) {
                    QName sourceSubstitutionGroup;
                    sourceSubstitutionGroup = this.getSubstitutionGroup();
                    QName copySubstitutionGroup = ((QName) strategy.copy(LocatorUtils.property(locator, "substitutionGroup", sourceSubstitutionGroup), sourceSubstitutionGroup, (this.substitutionGroup!= null)));
                    copy.setSubstitutionGroup(copySubstitutionGroup);
                } else {
                    if (substitutionGroupShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.substitutionGroup = null;
                    }
                }
            }
            {
                Boolean _defaultShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this._default!= null));
                if (_defaultShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDefault;
                    sourceDefault = this.getDefault();
                    String copyDefault = ((String) strategy.copy(LocatorUtils.property(locator, "_default", sourceDefault), sourceDefault, (this._default!= null)));
                    copy.setDefault(copyDefault);
                } else {
                    if (_defaultShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy._default = null;
                    }
                }
            }
            {
                Boolean fixedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fixed!= null));
                if (fixedShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFixed;
                    sourceFixed = this.getFixed();
                    String copyFixed = ((String) strategy.copy(LocatorUtils.property(locator, "fixed", sourceFixed), sourceFixed, (this.fixed!= null)));
                    copy.setFixed(copyFixed);
                } else {
                    if (fixedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fixed = null;
                    }
                }
            }
            {
                Boolean nillableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nillable!= null));
                if (nillableShouldBeCopiedAndSet == Boolean.TRUE) {
                    boolean sourceNillable;
                    sourceNillable = ((this.nillable!= null)?this.isNillable():false);
                    boolean copyNillable = strategy.copy(LocatorUtils.property(locator, "nillable", sourceNillable), sourceNillable, (this.nillable!= null));
                    copy.setNillable(copyNillable);
                } else {
                    if (nillableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nillable = null;
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
            {
                Boolean formShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.form!= null));
                if (formShouldBeCopiedAndSet == Boolean.TRUE) {
                    FormChoice sourceForm;
                    sourceForm = this.getForm();
                    FormChoice copyForm = ((FormChoice) strategy.copy(LocatorUtils.property(locator, "form", sourceForm), sourceForm, (this.form!= null)));
                    copy.setForm(copyForm);
                } else {
                    if (formShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.form = null;
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
            {
                Boolean minOccursShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.minOccurs!= null));
                if (minOccursShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceMinOccurs;
                    sourceMinOccurs = this.getMinOccurs();
                    BigInteger copyMinOccurs = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "minOccurs", sourceMinOccurs), sourceMinOccurs, (this.minOccurs!= null)));
                    copy.setMinOccurs(copyMinOccurs);
                } else {
                    if (minOccursShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.minOccurs = null;
                    }
                }
            }
            {
                Boolean maxOccursShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maxOccurs!= null));
                if (maxOccursShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceMaxOccurs;
                    sourceMaxOccurs = this.getMaxOccurs();
                    String copyMaxOccurs = ((String) strategy.copy(LocatorUtils.property(locator, "maxOccurs", sourceMaxOccurs), sourceMaxOccurs, (this.maxOccurs!= null)));
                    copy.setMaxOccurs(copyMaxOccurs);
                } else {
                    if (maxOccursShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maxOccurs = null;
                    }
                }
            }
        }
        return target;
    }

}

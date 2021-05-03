//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.03 à 03:39:56 PM CEST 
//


package org.ow2.easywsdl.schema.org.w3._2001.xmlschema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 * <p>Classe Java pour attribute complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="attribute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.w3.org/2001/XMLSchema}annotated"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="simpleType" type="{http://www.w3.org/2001/XMLSchema}localSimpleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.w3.org/2001/XMLSchema}defRef"/&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;attribute name="use" default="optional"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="prohibited"/&gt;
 *             &lt;enumeration value="optional"/&gt;
 *             &lt;enumeration value="required"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="fixed" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "attribute", propOrder = {
    "simpleType"
})
@XmlSeeAlso({
    TopLevelAttribute.class
})
public class Attribute
    extends Annotated
    implements Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    protected LocalSimpleType simpleType;
    @XmlAttribute(name = "type")
    protected QName type;
    @XmlAttribute(name = "use")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String use;
    @XmlAttribute(name = "default")
    protected String _default;
    @XmlAttribute(name = "fixed")
    protected String fixed;
    @XmlAttribute(name = "form")
    protected FormChoice form;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(name = "ref")
    protected QName ref;

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
     * Obtient la valeur de la propriété use.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUse() {
        if (use == null) {
            return "optional";
        } else {
            return use;
        }
    }

    /**
     * Définit la valeur de la propriété use.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUse(String value) {
        this.use = value;
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
            QName theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType, (this.type!= null));
        }
        {
            String theUse;
            theUse = this.getUse();
            strategy.appendField(locator, this, "use", buffer, theUse, (this.use!= null));
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
        final Attribute that = ((Attribute) object);
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
            QName lhsType;
            lhsType = this.getType();
            QName rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType, (this.type!= null), (that.type!= null))) {
                return false;
            }
        }
        {
            String lhsUse;
            lhsUse = this.getUse();
            String rhsUse;
            rhsUse = that.getUse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "use", lhsUse), LocatorUtils.property(thatLocator, "use", rhsUse), lhsUse, rhsUse, (this.use!= null), (that.use!= null))) {
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
            QName theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType, (this.type!= null));
        }
        {
            String theUse;
            theUse = this.getUse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "use", theUse), currentHashCode, theUse, (this.use!= null));
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
        if (draftCopy instanceof Attribute) {
            final Attribute copy = ((Attribute) draftCopy);
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
                Boolean useShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.use!= null));
                if (useShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceUse;
                    sourceUse = this.getUse();
                    String copyUse = ((String) strategy.copy(LocatorUtils.property(locator, "use", sourceUse), sourceUse, (this.use!= null)));
                    copy.setUse(copyUse);
                } else {
                    if (useShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.use = null;
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
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Attribute();
    }

}

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
 * <p>Classe Java pour keybase complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="keybase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.w3.org/2001/XMLSchema}annotated"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.w3.org/2001/XMLSchema}selector"/&gt;
 *         &lt;element ref="{http://www.w3.org/2001/XMLSchema}field" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "keybase", propOrder = {
    "selector",
    "field"
})
@XmlSeeAlso({
    Keyref.class
})
public class Keybase
    extends Annotated
    implements Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    @XmlElement(required = true)
    protected Selector selector;
    @XmlElement(required = true)
    protected List<Field> field;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;

    /**
     * Obtient la valeur de la propriété selector.
     * 
     * @return
     *     possible object is
     *     {@link Selector }
     *     
     */
    public Selector getSelector() {
        return selector;
    }

    /**
     * Définit la valeur de la propriété selector.
     * 
     * @param value
     *     allowed object is
     *     {@link Selector }
     *     
     */
    public void setSelector(Selector value) {
        this.selector = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the field property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Field }
     * 
     * 
     */
    public List<Field> getField() {
        if (field == null) {
            field = new ArrayList<Field>();
        }
        return this.field;
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
            Selector theSelector;
            theSelector = this.getSelector();
            strategy.appendField(locator, this, "selector", buffer, theSelector, (this.selector!= null));
        }
        {
            List<Field> theField;
            theField = (((this.field!= null)&&(!this.field.isEmpty()))?this.getField():null);
            strategy.appendField(locator, this, "field", buffer, theField, ((this.field!= null)&&(!this.field.isEmpty())));
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
        final Keybase that = ((Keybase) object);
        {
            Selector lhsSelector;
            lhsSelector = this.getSelector();
            Selector rhsSelector;
            rhsSelector = that.getSelector();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "selector", lhsSelector), LocatorUtils.property(thatLocator, "selector", rhsSelector), lhsSelector, rhsSelector, (this.selector!= null), (that.selector!= null))) {
                return false;
            }
        }
        {
            List<Field> lhsField;
            lhsField = (((this.field!= null)&&(!this.field.isEmpty()))?this.getField():null);
            List<Field> rhsField;
            rhsField = (((that.field!= null)&&(!that.field.isEmpty()))?that.getField():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "field", lhsField), LocatorUtils.property(thatLocator, "field", rhsField), lhsField, rhsField, ((this.field!= null)&&(!this.field.isEmpty())), ((that.field!= null)&&(!that.field.isEmpty())))) {
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
            Selector theSelector;
            theSelector = this.getSelector();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "selector", theSelector), currentHashCode, theSelector, (this.selector!= null));
        }
        {
            List<Field> theField;
            theField = (((this.field!= null)&&(!this.field.isEmpty()))?this.getField():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "field", theField), currentHashCode, theField, ((this.field!= null)&&(!this.field.isEmpty())));
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
        if (draftCopy instanceof Keybase) {
            final Keybase copy = ((Keybase) draftCopy);
            {
                Boolean selectorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.selector!= null));
                if (selectorShouldBeCopiedAndSet == Boolean.TRUE) {
                    Selector sourceSelector;
                    sourceSelector = this.getSelector();
                    Selector copySelector = ((Selector) strategy.copy(LocatorUtils.property(locator, "selector", sourceSelector), sourceSelector, (this.selector!= null)));
                    copy.setSelector(copySelector);
                } else {
                    if (selectorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.selector = null;
                    }
                }
            }
            {
                Boolean fieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.field!= null)&&(!this.field.isEmpty())));
                if (fieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Field> sourceField;
                    sourceField = (((this.field!= null)&&(!this.field.isEmpty()))?this.getField():null);
                    @SuppressWarnings("unchecked")
                    List<Field> copyField = ((List<Field> ) strategy.copy(LocatorUtils.property(locator, "field", sourceField), sourceField, ((this.field!= null)&&(!this.field.isEmpty()))));
                    copy.field = null;
                    if (copyField!= null) {
                        List<Field> uniqueFieldl = copy.getField();
                        uniqueFieldl.addAll(copyField);
                    }
                } else {
                    if (fieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.field = null;
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
        return new Keybase();
    }

}

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
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
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
 *           itemType attribute and simpleType child are mutually
 *           exclusive, but one or other is required
 *         
 * 
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.w3.org/2001/XMLSchema}annotated"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="simpleType" type="{http://www.w3.org/2001/XMLSchema}localSimpleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="itemType" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "simpleType"
})
@XmlRootElement(name = "list")
public class List
    extends Annotated
    implements Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    protected LocalSimpleType simpleType;
    @XmlAttribute(name = "itemType")
    protected QName itemType;

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
     * Obtient la valeur de la propriété itemType.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getItemType() {
        return itemType;
    }

    /**
     * Définit la valeur de la propriété itemType.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setItemType(QName value) {
        this.itemType = value;
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
            QName theItemType;
            theItemType = this.getItemType();
            strategy.appendField(locator, this, "itemType", buffer, theItemType, (this.itemType!= null));
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
        final List that = ((List) object);
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
            QName lhsItemType;
            lhsItemType = this.getItemType();
            QName rhsItemType;
            rhsItemType = that.getItemType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemType", lhsItemType), LocatorUtils.property(thatLocator, "itemType", rhsItemType), lhsItemType, rhsItemType, (this.itemType!= null), (that.itemType!= null))) {
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
            QName theItemType;
            theItemType = this.getItemType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemType", theItemType), currentHashCode, theItemType, (this.itemType!= null));
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
        if (draftCopy instanceof List) {
            final List copy = ((List) draftCopy);
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
                Boolean itemTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.itemType!= null));
                if (itemTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    QName sourceItemType;
                    sourceItemType = this.getItemType();
                    QName copyItemType = ((QName) strategy.copy(LocatorUtils.property(locator, "itemType", sourceItemType), sourceItemType, (this.itemType!= null)));
                    copy.setItemType(copyItemType);
                } else {
                    if (itemTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.itemType = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new List();
    }

}

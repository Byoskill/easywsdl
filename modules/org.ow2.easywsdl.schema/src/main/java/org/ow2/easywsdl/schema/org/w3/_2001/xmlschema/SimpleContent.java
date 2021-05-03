//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.03 à 03:39:56 PM CEST 
//


package org.ow2.easywsdl.schema.org.w3._2001.xmlschema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
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


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.w3.org/2001/XMLSchema}annotated"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="restriction" type="{http://www.w3.org/2001/XMLSchema}simpleRestrictionType"/&gt;
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}simpleExtensionType"/&gt;
 *       &lt;/choice&gt;
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
    "restriction",
    "extension"
})
@XmlRootElement(name = "simpleContent")
public class SimpleContent
    extends Annotated
    implements Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    protected SimpleRestrictionType restriction;
    protected SimpleExtensionType extension;

    /**
     * Obtient la valeur de la propriété restriction.
     * 
     * @return
     *     possible object is
     *     {@link SimpleRestrictionType }
     *     
     */
    public SimpleRestrictionType getRestriction() {
        return restriction;
    }

    /**
     * Définit la valeur de la propriété restriction.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleRestrictionType }
     *     
     */
    public void setRestriction(SimpleRestrictionType value) {
        this.restriction = value;
    }

    /**
     * Obtient la valeur de la propriété extension.
     * 
     * @return
     *     possible object is
     *     {@link SimpleExtensionType }
     *     
     */
    public SimpleExtensionType getExtension() {
        return extension;
    }

    /**
     * Définit la valeur de la propriété extension.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleExtensionType }
     *     
     */
    public void setExtension(SimpleExtensionType value) {
        this.extension = value;
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
            SimpleRestrictionType theRestriction;
            theRestriction = this.getRestriction();
            strategy.appendField(locator, this, "restriction", buffer, theRestriction, (this.restriction!= null));
        }
        {
            SimpleExtensionType theExtension;
            theExtension = this.getExtension();
            strategy.appendField(locator, this, "extension", buffer, theExtension, (this.extension!= null));
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
        final SimpleContent that = ((SimpleContent) object);
        {
            SimpleRestrictionType lhsRestriction;
            lhsRestriction = this.getRestriction();
            SimpleRestrictionType rhsRestriction;
            rhsRestriction = that.getRestriction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "restriction", lhsRestriction), LocatorUtils.property(thatLocator, "restriction", rhsRestriction), lhsRestriction, rhsRestriction, (this.restriction!= null), (that.restriction!= null))) {
                return false;
            }
        }
        {
            SimpleExtensionType lhsExtension;
            lhsExtension = this.getExtension();
            SimpleExtensionType rhsExtension;
            rhsExtension = that.getExtension();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extension", lhsExtension), LocatorUtils.property(thatLocator, "extension", rhsExtension), lhsExtension, rhsExtension, (this.extension!= null), (that.extension!= null))) {
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
            SimpleRestrictionType theRestriction;
            theRestriction = this.getRestriction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "restriction", theRestriction), currentHashCode, theRestriction, (this.restriction!= null));
        }
        {
            SimpleExtensionType theExtension;
            theExtension = this.getExtension();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extension", theExtension), currentHashCode, theExtension, (this.extension!= null));
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
        if (draftCopy instanceof SimpleContent) {
            final SimpleContent copy = ((SimpleContent) draftCopy);
            {
                Boolean restrictionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.restriction!= null));
                if (restrictionShouldBeCopiedAndSet == Boolean.TRUE) {
                    SimpleRestrictionType sourceRestriction;
                    sourceRestriction = this.getRestriction();
                    SimpleRestrictionType copyRestriction = ((SimpleRestrictionType) strategy.copy(LocatorUtils.property(locator, "restriction", sourceRestriction), sourceRestriction, (this.restriction!= null)));
                    copy.setRestriction(copyRestriction);
                } else {
                    if (restrictionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.restriction = null;
                    }
                }
            }
            {
                Boolean extensionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.extension!= null));
                if (extensionShouldBeCopiedAndSet == Boolean.TRUE) {
                    SimpleExtensionType sourceExtension;
                    sourceExtension = this.getExtension();
                    SimpleExtensionType copyExtension = ((SimpleExtensionType) strategy.copy(LocatorUtils.property(locator, "extension", sourceExtension), sourceExtension, (this.extension!= null)));
                    copy.setExtension(copyExtension);
                } else {
                    if (extensionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.extension = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new SimpleContent();
    }

}

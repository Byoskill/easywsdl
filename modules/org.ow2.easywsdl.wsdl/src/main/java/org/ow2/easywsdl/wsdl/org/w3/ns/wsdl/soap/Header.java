//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.03 à 03:26:13 PM CEST 
//


package org.ow2.easywsdl.wsdl.org.w3.ns.wsdl.soap;

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
import org.ow2.easywsdl.wsdl.org.w3.ns.wsdl.ExtensibleDocumentedType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.w3.org/ns/wsdl}ExtensibleDocumentedType"&gt;
 *       &lt;attribute name="element" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;attribute name="mustUnderstand" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "header")
public class Header
    extends ExtensibleDocumentedType
    implements Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    @XmlAttribute(name = "element", required = true)
    protected QName element;
    @XmlAttribute(name = "mustUnderstand")
    protected Boolean mustUnderstand;
    @XmlAttribute(name = "required")
    protected Boolean required;

    /**
     * Obtient la valeur de la propriété element.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getElement() {
        return element;
    }

    /**
     * Définit la valeur de la propriété element.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setElement(QName value) {
        this.element = value;
    }

    /**
     * Obtient la valeur de la propriété mustUnderstand.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMustUnderstand() {
        return mustUnderstand;
    }

    /**
     * Définit la valeur de la propriété mustUnderstand.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMustUnderstand(Boolean value) {
        this.mustUnderstand = value;
    }

    /**
     * Obtient la valeur de la propriété required.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * Définit la valeur de la propriété required.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
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
            QName theElement;
            theElement = this.getElement();
            strategy.appendField(locator, this, "element", buffer, theElement, (this.element!= null));
        }
        {
            Boolean theMustUnderstand;
            theMustUnderstand = this.isMustUnderstand();
            strategy.appendField(locator, this, "mustUnderstand", buffer, theMustUnderstand, (this.mustUnderstand!= null));
        }
        {
            Boolean theRequired;
            theRequired = this.isRequired();
            strategy.appendField(locator, this, "required", buffer, theRequired, (this.required!= null));
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
        final Header that = ((Header) object);
        {
            QName lhsElement;
            lhsElement = this.getElement();
            QName rhsElement;
            rhsElement = that.getElement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "element", lhsElement), LocatorUtils.property(thatLocator, "element", rhsElement), lhsElement, rhsElement, (this.element!= null), (that.element!= null))) {
                return false;
            }
        }
        {
            Boolean lhsMustUnderstand;
            lhsMustUnderstand = this.isMustUnderstand();
            Boolean rhsMustUnderstand;
            rhsMustUnderstand = that.isMustUnderstand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mustUnderstand", lhsMustUnderstand), LocatorUtils.property(thatLocator, "mustUnderstand", rhsMustUnderstand), lhsMustUnderstand, rhsMustUnderstand, (this.mustUnderstand!= null), (that.mustUnderstand!= null))) {
                return false;
            }
        }
        {
            Boolean lhsRequired;
            lhsRequired = this.isRequired();
            Boolean rhsRequired;
            rhsRequired = that.isRequired();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "required", lhsRequired), LocatorUtils.property(thatLocator, "required", rhsRequired), lhsRequired, rhsRequired, (this.required!= null), (that.required!= null))) {
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
            QName theElement;
            theElement = this.getElement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "element", theElement), currentHashCode, theElement, (this.element!= null));
        }
        {
            Boolean theMustUnderstand;
            theMustUnderstand = this.isMustUnderstand();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mustUnderstand", theMustUnderstand), currentHashCode, theMustUnderstand, (this.mustUnderstand!= null));
        }
        {
            Boolean theRequired;
            theRequired = this.isRequired();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "required", theRequired), currentHashCode, theRequired, (this.required!= null));
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
        if (draftCopy instanceof Header) {
            final Header copy = ((Header) draftCopy);
            {
                Boolean elementShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.element!= null));
                if (elementShouldBeCopiedAndSet == Boolean.TRUE) {
                    QName sourceElement;
                    sourceElement = this.getElement();
                    QName copyElement = ((QName) strategy.copy(LocatorUtils.property(locator, "element", sourceElement), sourceElement, (this.element!= null)));
                    copy.setElement(copyElement);
                } else {
                    if (elementShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.element = null;
                    }
                }
            }
            {
                Boolean mustUnderstandShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mustUnderstand!= null));
                if (mustUnderstandShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceMustUnderstand;
                    sourceMustUnderstand = this.isMustUnderstand();
                    Boolean copyMustUnderstand = ((Boolean) strategy.copy(LocatorUtils.property(locator, "mustUnderstand", sourceMustUnderstand), sourceMustUnderstand, (this.mustUnderstand!= null)));
                    copy.setMustUnderstand(copyMustUnderstand);
                } else {
                    if (mustUnderstandShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mustUnderstand = null;
                    }
                }
            }
            {
                Boolean requiredShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.required!= null));
                if (requiredShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceRequired;
                    sourceRequired = this.isRequired();
                    Boolean copyRequired = ((Boolean) strategy.copy(LocatorUtils.property(locator, "required", sourceRequired), sourceRequired, (this.required!= null)));
                    copy.setRequired(copyRequired);
                } else {
                    if (requiredShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.required = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Header();
    }

}

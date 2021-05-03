//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.03 à 03:26:13 PM CEST 
//


package org.ow2.easywsdl.wsdl.org.w3.ns.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
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
import org.w3c.dom.Element;


/**
 * <p>Classe Java pour MessageRefType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MessageRefType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.w3.org/ns/wsdl}ExtensibleDocumentedType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;any processContents='lax' namespace='##other'/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="messageLabel" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="element" type="{http://www.w3.org/ns/wsdl}ElementReferenceType" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageRefType", propOrder = {
    "any"
})
public class MessageRefType
    extends ExtensibleDocumentedType
    implements Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "messageLabel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String messageLabel;
    @XmlAttribute(name = "element")
    protected String element;

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Obtient la valeur de la propriété messageLabel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageLabel() {
        return messageLabel;
    }

    /**
     * Définit la valeur de la propriété messageLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageLabel(String value) {
        this.messageLabel = value;
    }

    /**
     * Obtient la valeur de la propriété element.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElement() {
        return element;
    }

    /**
     * Définit la valeur de la propriété element.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElement(String value) {
        this.element = value;
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
            List<Object> theAny;
            theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
            strategy.appendField(locator, this, "any", buffer, theAny, ((this.any!= null)&&(!this.any.isEmpty())));
        }
        {
            String theMessageLabel;
            theMessageLabel = this.getMessageLabel();
            strategy.appendField(locator, this, "messageLabel", buffer, theMessageLabel, (this.messageLabel!= null));
        }
        {
            String theElement;
            theElement = this.getElement();
            strategy.appendField(locator, this, "element", buffer, theElement, (this.element!= null));
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
        final MessageRefType that = ((MessageRefType) object);
        {
            List<Object> lhsAny;
            lhsAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
            List<Object> rhsAny;
            rhsAny = (((that.any!= null)&&(!that.any.isEmpty()))?that.getAny():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny, ((this.any!= null)&&(!this.any.isEmpty())), ((that.any!= null)&&(!that.any.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsMessageLabel;
            lhsMessageLabel = this.getMessageLabel();
            String rhsMessageLabel;
            rhsMessageLabel = that.getMessageLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "messageLabel", lhsMessageLabel), LocatorUtils.property(thatLocator, "messageLabel", rhsMessageLabel), lhsMessageLabel, rhsMessageLabel, (this.messageLabel!= null), (that.messageLabel!= null))) {
                return false;
            }
        }
        {
            String lhsElement;
            lhsElement = this.getElement();
            String rhsElement;
            rhsElement = that.getElement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "element", lhsElement), LocatorUtils.property(thatLocator, "element", rhsElement), lhsElement, rhsElement, (this.element!= null), (that.element!= null))) {
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
            List<Object> theAny;
            theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny, ((this.any!= null)&&(!this.any.isEmpty())));
        }
        {
            String theMessageLabel;
            theMessageLabel = this.getMessageLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "messageLabel", theMessageLabel), currentHashCode, theMessageLabel, (this.messageLabel!= null));
        }
        {
            String theElement;
            theElement = this.getElement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "element", theElement), currentHashCode, theElement, (this.element!= null));
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
        if (draftCopy instanceof MessageRefType) {
            final MessageRefType copy = ((MessageRefType) draftCopy);
            {
                Boolean anyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.any!= null)&&(!this.any.isEmpty())));
                if (anyShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Object> sourceAny;
                    sourceAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
                    @SuppressWarnings("unchecked")
                    List<Object> copyAny = ((List<Object> ) strategy.copy(LocatorUtils.property(locator, "any", sourceAny), sourceAny, ((this.any!= null)&&(!this.any.isEmpty()))));
                    copy.any = null;
                    if (copyAny!= null) {
                        List<Object> uniqueAnyl = copy.getAny();
                        uniqueAnyl.addAll(copyAny);
                    }
                } else {
                    if (anyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.any = null;
                    }
                }
            }
            {
                Boolean messageLabelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.messageLabel!= null));
                if (messageLabelShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceMessageLabel;
                    sourceMessageLabel = this.getMessageLabel();
                    String copyMessageLabel = ((String) strategy.copy(LocatorUtils.property(locator, "messageLabel", sourceMessageLabel), sourceMessageLabel, (this.messageLabel!= null)));
                    copy.setMessageLabel(copyMessageLabel);
                } else {
                    if (messageLabelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.messageLabel = null;
                    }
                }
            }
            {
                Boolean elementShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.element!= null));
                if (elementShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceElement;
                    sourceElement = this.getElement();
                    String copyElement = ((String) strategy.copy(LocatorUtils.property(locator, "element", sourceElement), sourceElement, (this.element!= null)));
                    copy.setElement(copyElement);
                } else {
                    if (elementShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.element = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MessageRefType();
    }

}

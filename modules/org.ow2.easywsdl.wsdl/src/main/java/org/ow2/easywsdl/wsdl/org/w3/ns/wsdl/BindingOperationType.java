//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.03 à 03:26:13 PM CEST 
//


package org.ow2.easywsdl.wsdl.org.w3.ns.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
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
import org.w3c.dom.Element;


/**
 * <p>Classe Java pour BindingOperationType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BindingOperationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.w3.org/ns/wsdl}ExtensibleDocumentedType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="input" type="{http://www.w3.org/ns/wsdl}BindingOperationMessageType"/&gt;
 *         &lt;element name="output" type="{http://www.w3.org/ns/wsdl}BindingOperationMessageType"/&gt;
 *         &lt;element name="infault" type="{http://www.w3.org/ns/wsdl}BindingOperationFaultType"/&gt;
 *         &lt;element name="outfault" type="{http://www.w3.org/ns/wsdl}BindingOperationFaultType"/&gt;
 *         &lt;any processContents='lax' namespace='##other'/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BindingOperationType", propOrder = {
    "inputOrOutputOrInfault"
})
public class BindingOperationType
    extends ExtensibleDocumentedType
    implements Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    @XmlElementRefs({
        @XmlElementRef(name = "input", namespace = "http://www.w3.org/ns/wsdl", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "output", namespace = "http://www.w3.org/ns/wsdl", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "infault", namespace = "http://www.w3.org/ns/wsdl", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "outfault", namespace = "http://www.w3.org/ns/wsdl", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> inputOrOutputOrInfault;
    @XmlAttribute(name = "ref", required = true)
    protected QName ref;

    /**
     * Gets the value of the inputOrOutputOrInfault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputOrOutputOrInfault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputOrOutputOrInfault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BindingOperationMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link BindingOperationMessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link BindingOperationFaultType }{@code >}
     * {@link JAXBElement }{@code <}{@link BindingOperationFaultType }{@code >}
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getInputOrOutputOrInfault() {
        if (inputOrOutputOrInfault == null) {
            inputOrOutputOrInfault = new ArrayList<Object>();
        }
        return this.inputOrOutputOrInfault;
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
            List<Object> theInputOrOutputOrInfault;
            theInputOrOutputOrInfault = (((this.inputOrOutputOrInfault!= null)&&(!this.inputOrOutputOrInfault.isEmpty()))?this.getInputOrOutputOrInfault():null);
            strategy.appendField(locator, this, "inputOrOutputOrInfault", buffer, theInputOrOutputOrInfault, ((this.inputOrOutputOrInfault!= null)&&(!this.inputOrOutputOrInfault.isEmpty())));
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
        final BindingOperationType that = ((BindingOperationType) object);
        {
            List<Object> lhsInputOrOutputOrInfault;
            lhsInputOrOutputOrInfault = (((this.inputOrOutputOrInfault!= null)&&(!this.inputOrOutputOrInfault.isEmpty()))?this.getInputOrOutputOrInfault():null);
            List<Object> rhsInputOrOutputOrInfault;
            rhsInputOrOutputOrInfault = (((that.inputOrOutputOrInfault!= null)&&(!that.inputOrOutputOrInfault.isEmpty()))?that.getInputOrOutputOrInfault():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inputOrOutputOrInfault", lhsInputOrOutputOrInfault), LocatorUtils.property(thatLocator, "inputOrOutputOrInfault", rhsInputOrOutputOrInfault), lhsInputOrOutputOrInfault, rhsInputOrOutputOrInfault, ((this.inputOrOutputOrInfault!= null)&&(!this.inputOrOutputOrInfault.isEmpty())), ((that.inputOrOutputOrInfault!= null)&&(!that.inputOrOutputOrInfault.isEmpty())))) {
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
            List<Object> theInputOrOutputOrInfault;
            theInputOrOutputOrInfault = (((this.inputOrOutputOrInfault!= null)&&(!this.inputOrOutputOrInfault.isEmpty()))?this.getInputOrOutputOrInfault():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inputOrOutputOrInfault", theInputOrOutputOrInfault), currentHashCode, theInputOrOutputOrInfault, ((this.inputOrOutputOrInfault!= null)&&(!this.inputOrOutputOrInfault.isEmpty())));
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
        if (draftCopy instanceof BindingOperationType) {
            final BindingOperationType copy = ((BindingOperationType) draftCopy);
            {
                Boolean inputOrOutputOrInfaultShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.inputOrOutputOrInfault!= null)&&(!this.inputOrOutputOrInfault.isEmpty())));
                if (inputOrOutputOrInfaultShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Object> sourceInputOrOutputOrInfault;
                    sourceInputOrOutputOrInfault = (((this.inputOrOutputOrInfault!= null)&&(!this.inputOrOutputOrInfault.isEmpty()))?this.getInputOrOutputOrInfault():null);
                    @SuppressWarnings("unchecked")
                    List<Object> copyInputOrOutputOrInfault = ((List<Object> ) strategy.copy(LocatorUtils.property(locator, "inputOrOutputOrInfault", sourceInputOrOutputOrInfault), sourceInputOrOutputOrInfault, ((this.inputOrOutputOrInfault!= null)&&(!this.inputOrOutputOrInfault.isEmpty()))));
                    copy.inputOrOutputOrInfault = null;
                    if (copyInputOrOutputOrInfault!= null) {
                        List<Object> uniqueInputOrOutputOrInfaultl = copy.getInputOrOutputOrInfault();
                        uniqueInputOrOutputOrInfaultl.addAll(copyInputOrOutputOrInfault);
                    }
                } else {
                    if (inputOrOutputOrInfaultShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.inputOrOutputOrInfault = null;
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
        return new BindingOperationType();
    }

}

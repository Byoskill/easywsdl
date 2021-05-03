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
import jakarta.xml.bind.annotation.XmlSchemaType;
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
import org.w3c.dom.Element;


/**
 * <p>Classe Java pour BindingType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BindingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.w3.org/ns/wsdl}ExtensibleDocumentedType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="operation" type="{http://www.w3.org/ns/wsdl}BindingOperationType"/&gt;
 *         &lt;element name="fault" type="{http://www.w3.org/ns/wsdl}BindingFaultType"/&gt;
 *         &lt;any processContents='lax' namespace='##other'/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="interface" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BindingType", propOrder = {
    "operationOrFaultOrAny"
})
public class BindingType
    extends ExtensibleDocumentedType
    implements Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    @XmlElementRefs({
        @XmlElementRef(name = "operation", namespace = "http://www.w3.org/ns/wsdl", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fault", namespace = "http://www.w3.org/ns/wsdl", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> operationOrFaultOrAny;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(name = "type", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String type;
    @XmlAttribute(name = "interface")
    protected QName _interface;

    /**
     * Gets the value of the operationOrFaultOrAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationOrFaultOrAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationOrFaultOrAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BindingOperationType }{@code >}
     * {@link JAXBElement }{@code <}{@link BindingFaultType }{@code >}
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getOperationOrFaultOrAny() {
        if (operationOrFaultOrAny == null) {
            operationOrFaultOrAny = new ArrayList<Object>();
        }
        return this.operationOrFaultOrAny;
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
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtient la valeur de la propriété interface.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getInterface() {
        return _interface;
    }

    /**
     * Définit la valeur de la propriété interface.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setInterface(QName value) {
        this._interface = value;
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
            List<Object> theOperationOrFaultOrAny;
            theOperationOrFaultOrAny = (((this.operationOrFaultOrAny!= null)&&(!this.operationOrFaultOrAny.isEmpty()))?this.getOperationOrFaultOrAny():null);
            strategy.appendField(locator, this, "operationOrFaultOrAny", buffer, theOperationOrFaultOrAny, ((this.operationOrFaultOrAny!= null)&&(!this.operationOrFaultOrAny.isEmpty())));
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            String theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType, (this.type!= null));
        }
        {
            QName theInterface;
            theInterface = this.getInterface();
            strategy.appendField(locator, this, "_interface", buffer, theInterface, (this._interface!= null));
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
        final BindingType that = ((BindingType) object);
        {
            List<Object> lhsOperationOrFaultOrAny;
            lhsOperationOrFaultOrAny = (((this.operationOrFaultOrAny!= null)&&(!this.operationOrFaultOrAny.isEmpty()))?this.getOperationOrFaultOrAny():null);
            List<Object> rhsOperationOrFaultOrAny;
            rhsOperationOrFaultOrAny = (((that.operationOrFaultOrAny!= null)&&(!that.operationOrFaultOrAny.isEmpty()))?that.getOperationOrFaultOrAny():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operationOrFaultOrAny", lhsOperationOrFaultOrAny), LocatorUtils.property(thatLocator, "operationOrFaultOrAny", rhsOperationOrFaultOrAny), lhsOperationOrFaultOrAny, rhsOperationOrFaultOrAny, ((this.operationOrFaultOrAny!= null)&&(!this.operationOrFaultOrAny.isEmpty())), ((that.operationOrFaultOrAny!= null)&&(!that.operationOrFaultOrAny.isEmpty())))) {
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
            String lhsType;
            lhsType = this.getType();
            String rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType, (this.type!= null), (that.type!= null))) {
                return false;
            }
        }
        {
            QName lhsInterface;
            lhsInterface = this.getInterface();
            QName rhsInterface;
            rhsInterface = that.getInterface();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_interface", lhsInterface), LocatorUtils.property(thatLocator, "_interface", rhsInterface), lhsInterface, rhsInterface, (this._interface!= null), (that._interface!= null))) {
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
            List<Object> theOperationOrFaultOrAny;
            theOperationOrFaultOrAny = (((this.operationOrFaultOrAny!= null)&&(!this.operationOrFaultOrAny.isEmpty()))?this.getOperationOrFaultOrAny():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operationOrFaultOrAny", theOperationOrFaultOrAny), currentHashCode, theOperationOrFaultOrAny, ((this.operationOrFaultOrAny!= null)&&(!this.operationOrFaultOrAny.isEmpty())));
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            String theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType, (this.type!= null));
        }
        {
            QName theInterface;
            theInterface = this.getInterface();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_interface", theInterface), currentHashCode, theInterface, (this._interface!= null));
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
        if (draftCopy instanceof BindingType) {
            final BindingType copy = ((BindingType) draftCopy);
            {
                Boolean operationOrFaultOrAnyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.operationOrFaultOrAny!= null)&&(!this.operationOrFaultOrAny.isEmpty())));
                if (operationOrFaultOrAnyShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Object> sourceOperationOrFaultOrAny;
                    sourceOperationOrFaultOrAny = (((this.operationOrFaultOrAny!= null)&&(!this.operationOrFaultOrAny.isEmpty()))?this.getOperationOrFaultOrAny():null);
                    @SuppressWarnings("unchecked")
                    List<Object> copyOperationOrFaultOrAny = ((List<Object> ) strategy.copy(LocatorUtils.property(locator, "operationOrFaultOrAny", sourceOperationOrFaultOrAny), sourceOperationOrFaultOrAny, ((this.operationOrFaultOrAny!= null)&&(!this.operationOrFaultOrAny.isEmpty()))));
                    copy.operationOrFaultOrAny = null;
                    if (copyOperationOrFaultOrAny!= null) {
                        List<Object> uniqueOperationOrFaultOrAnyl = copy.getOperationOrFaultOrAny();
                        uniqueOperationOrFaultOrAnyl.addAll(copyOperationOrFaultOrAny);
                    }
                } else {
                    if (operationOrFaultOrAnyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.operationOrFaultOrAny = null;
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
                Boolean typeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.type!= null));
                if (typeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceType;
                    sourceType = this.getType();
                    String copyType = ((String) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType, (this.type!= null)));
                    copy.setType(copyType);
                } else {
                    if (typeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.type = null;
                    }
                }
            }
            {
                Boolean _interfaceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this._interface!= null));
                if (_interfaceShouldBeCopiedAndSet == Boolean.TRUE) {
                    QName sourceInterface;
                    sourceInterface = this.getInterface();
                    QName copyInterface = ((QName) strategy.copy(LocatorUtils.property(locator, "_interface", sourceInterface), sourceInterface, (this._interface!= null)));
                    copy.setInterface(copyInterface);
                } else {
                    if (_interfaceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy._interface = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new BindingType();
    }

}

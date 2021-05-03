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
 * <p>Classe Java pour ServiceType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.w3.org/ns/wsdl}ExtensibleDocumentedType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{http://www.w3.org/ns/wsdl}endpoint"/&gt;
 *         &lt;any processContents='lax' namespace='##other'/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="interface" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceType", propOrder = {
    "endpointOrAny"
})
public class ServiceType
    extends ExtensibleDocumentedType
    implements Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "endpoint", namespace = "http://www.w3.org/ns/wsdl", type = JAXBElement.class, required = false)
    @XmlAnyElement(lax = true)
    protected List<Object> endpointOrAny;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(name = "interface", required = true)
    protected QName _interface;

    /**
     * Gets the value of the endpointOrAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endpointOrAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndpointOrAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link EndpointType }{@code >}
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getEndpointOrAny() {
        if (endpointOrAny == null) {
            endpointOrAny = new ArrayList<Object>();
        }
        return this.endpointOrAny;
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
            List<Object> theEndpointOrAny;
            theEndpointOrAny = (((this.endpointOrAny!= null)&&(!this.endpointOrAny.isEmpty()))?this.getEndpointOrAny():null);
            strategy.appendField(locator, this, "endpointOrAny", buffer, theEndpointOrAny, ((this.endpointOrAny!= null)&&(!this.endpointOrAny.isEmpty())));
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
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
        final ServiceType that = ((ServiceType) object);
        {
            List<Object> lhsEndpointOrAny;
            lhsEndpointOrAny = (((this.endpointOrAny!= null)&&(!this.endpointOrAny.isEmpty()))?this.getEndpointOrAny():null);
            List<Object> rhsEndpointOrAny;
            rhsEndpointOrAny = (((that.endpointOrAny!= null)&&(!that.endpointOrAny.isEmpty()))?that.getEndpointOrAny():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endpointOrAny", lhsEndpointOrAny), LocatorUtils.property(thatLocator, "endpointOrAny", rhsEndpointOrAny), lhsEndpointOrAny, rhsEndpointOrAny, ((this.endpointOrAny!= null)&&(!this.endpointOrAny.isEmpty())), ((that.endpointOrAny!= null)&&(!that.endpointOrAny.isEmpty())))) {
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
            List<Object> theEndpointOrAny;
            theEndpointOrAny = (((this.endpointOrAny!= null)&&(!this.endpointOrAny.isEmpty()))?this.getEndpointOrAny():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endpointOrAny", theEndpointOrAny), currentHashCode, theEndpointOrAny, ((this.endpointOrAny!= null)&&(!this.endpointOrAny.isEmpty())));
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
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
        if (draftCopy instanceof ServiceType) {
            final ServiceType copy = ((ServiceType) draftCopy);
            {
                Boolean endpointOrAnyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.endpointOrAny!= null)&&(!this.endpointOrAny.isEmpty())));
                if (endpointOrAnyShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Object> sourceEndpointOrAny;
                    sourceEndpointOrAny = (((this.endpointOrAny!= null)&&(!this.endpointOrAny.isEmpty()))?this.getEndpointOrAny():null);
                    @SuppressWarnings("unchecked")
                    List<Object> copyEndpointOrAny = ((List<Object> ) strategy.copy(LocatorUtils.property(locator, "endpointOrAny", sourceEndpointOrAny), sourceEndpointOrAny, ((this.endpointOrAny!= null)&&(!this.endpointOrAny.isEmpty()))));
                    copy.endpointOrAny = null;
                    if (copyEndpointOrAny!= null) {
                        List<Object> uniqueEndpointOrAnyl = copy.getEndpointOrAny();
                        uniqueEndpointOrAnyl.addAll(copyEndpointOrAny);
                    }
                } else {
                    if (endpointOrAnyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.endpointOrAny = null;
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
        return new ServiceType();
    }

}

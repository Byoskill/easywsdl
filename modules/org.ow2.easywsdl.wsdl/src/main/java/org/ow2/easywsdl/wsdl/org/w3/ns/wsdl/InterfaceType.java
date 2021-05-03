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
 * <p>Classe Java pour InterfaceType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="InterfaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.w3.org/ns/wsdl}ExtensibleDocumentedType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="operation" type="{http://www.w3.org/ns/wsdl}InterfaceOperationType"/&gt;
 *         &lt;element name="fault" type="{http://www.w3.org/ns/wsdl}InterfaceFaultType"/&gt;
 *         &lt;any processContents='lax' namespace='##other'/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="extends"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="styleDefault"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceType", propOrder = {
    "operationOrFaultOrAny"
})
public class InterfaceType
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
    @XmlAttribute(name = "extends")
    protected List<QName> _extends;
    @XmlAttribute(name = "styleDefault")
    protected List<String> styleDefault;

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
     * {@link JAXBElement }{@code <}{@link InterfaceOperationType }{@code >}
     * {@link JAXBElement }{@code <}{@link InterfaceFaultType }{@code >}
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
     * Gets the value of the extends property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extends property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtends().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     * 
     * 
     */
    public List<QName> getExtends() {
        if (_extends == null) {
            _extends = new ArrayList<QName>();
        }
        return this._extends;
    }

    /**
     * Gets the value of the styleDefault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the styleDefault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStyleDefault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStyleDefault() {
        if (styleDefault == null) {
            styleDefault = new ArrayList<String>();
        }
        return this.styleDefault;
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
            List<QName> theExtends;
            theExtends = (((this._extends!= null)&&(!this._extends.isEmpty()))?this.getExtends():null);
            strategy.appendField(locator, this, "_extends", buffer, theExtends, ((this._extends!= null)&&(!this._extends.isEmpty())));
        }
        {
            List<String> theStyleDefault;
            theStyleDefault = (((this.styleDefault!= null)&&(!this.styleDefault.isEmpty()))?this.getStyleDefault():null);
            strategy.appendField(locator, this, "styleDefault", buffer, theStyleDefault, ((this.styleDefault!= null)&&(!this.styleDefault.isEmpty())));
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
        final InterfaceType that = ((InterfaceType) object);
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
            List<QName> lhsExtends;
            lhsExtends = (((this._extends!= null)&&(!this._extends.isEmpty()))?this.getExtends():null);
            List<QName> rhsExtends;
            rhsExtends = (((that._extends!= null)&&(!that._extends.isEmpty()))?that.getExtends():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_extends", lhsExtends), LocatorUtils.property(thatLocator, "_extends", rhsExtends), lhsExtends, rhsExtends, ((this._extends!= null)&&(!this._extends.isEmpty())), ((that._extends!= null)&&(!that._extends.isEmpty())))) {
                return false;
            }
        }
        {
            List<String> lhsStyleDefault;
            lhsStyleDefault = (((this.styleDefault!= null)&&(!this.styleDefault.isEmpty()))?this.getStyleDefault():null);
            List<String> rhsStyleDefault;
            rhsStyleDefault = (((that.styleDefault!= null)&&(!that.styleDefault.isEmpty()))?that.getStyleDefault():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "styleDefault", lhsStyleDefault), LocatorUtils.property(thatLocator, "styleDefault", rhsStyleDefault), lhsStyleDefault, rhsStyleDefault, ((this.styleDefault!= null)&&(!this.styleDefault.isEmpty())), ((that.styleDefault!= null)&&(!that.styleDefault.isEmpty())))) {
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
            List<QName> theExtends;
            theExtends = (((this._extends!= null)&&(!this._extends.isEmpty()))?this.getExtends():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_extends", theExtends), currentHashCode, theExtends, ((this._extends!= null)&&(!this._extends.isEmpty())));
        }
        {
            List<String> theStyleDefault;
            theStyleDefault = (((this.styleDefault!= null)&&(!this.styleDefault.isEmpty()))?this.getStyleDefault():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "styleDefault", theStyleDefault), currentHashCode, theStyleDefault, ((this.styleDefault!= null)&&(!this.styleDefault.isEmpty())));
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
        if (draftCopy instanceof InterfaceType) {
            final InterfaceType copy = ((InterfaceType) draftCopy);
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
                Boolean _extendsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this._extends!= null)&&(!this._extends.isEmpty())));
                if (_extendsShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<QName> sourceExtends;
                    sourceExtends = (((this._extends!= null)&&(!this._extends.isEmpty()))?this.getExtends():null);
                    @SuppressWarnings("unchecked")
                    List<QName> copyExtends = ((List<QName> ) strategy.copy(LocatorUtils.property(locator, "_extends", sourceExtends), sourceExtends, ((this._extends!= null)&&(!this._extends.isEmpty()))));
                    copy._extends = null;
                    if (copyExtends!= null) {
                        List<QName> uniqueExtendsl = copy.getExtends();
                        uniqueExtendsl.addAll(copyExtends);
                    }
                } else {
                    if (_extendsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy._extends = null;
                    }
                }
            }
            {
                Boolean styleDefaultShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.styleDefault!= null)&&(!this.styleDefault.isEmpty())));
                if (styleDefaultShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<String> sourceStyleDefault;
                    sourceStyleDefault = (((this.styleDefault!= null)&&(!this.styleDefault.isEmpty()))?this.getStyleDefault():null);
                    @SuppressWarnings("unchecked")
                    List<String> copyStyleDefault = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "styleDefault", sourceStyleDefault), sourceStyleDefault, ((this.styleDefault!= null)&&(!this.styleDefault.isEmpty()))));
                    copy.styleDefault = null;
                    if (copyStyleDefault!= null) {
                        List<String> uniqueStyleDefaultl = copy.getStyleDefault();
                        uniqueStyleDefaultl.addAll(copyStyleDefault);
                    }
                } else {
                    if (styleDefaultShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.styleDefault = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new InterfaceType();
    }

}

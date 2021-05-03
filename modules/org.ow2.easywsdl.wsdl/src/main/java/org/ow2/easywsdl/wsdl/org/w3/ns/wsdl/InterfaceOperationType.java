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
 * <p>Classe Java pour InterfaceOperationType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="InterfaceOperationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.w3.org/ns/wsdl}ExtensibleDocumentedType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="input" type="{http://www.w3.org/ns/wsdl}MessageRefType"/&gt;
 *         &lt;element name="output" type="{http://www.w3.org/ns/wsdl}MessageRefType"/&gt;
 *         &lt;element name="infault" type="{http://www.w3.org/ns/wsdl}MessageRefFaultType"/&gt;
 *         &lt;element name="outfault" type="{http://www.w3.org/ns/wsdl}MessageRefFaultType"/&gt;
 *         &lt;any processContents='lax' namespace='##other'/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="pattern" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="safe" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="style" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceOperationType", propOrder = {
    "inputOrOutputOrInfault"
})
public class InterfaceOperationType
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
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(name = "pattern")
    @XmlSchemaType(name = "anyURI")
    protected String pattern;
    @XmlAttribute(name = "safe")
    protected Boolean safe;
    @XmlAttribute(name = "style")
    @XmlSchemaType(name = "anyURI")
    protected String style;

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
     * {@link JAXBElement }{@code <}{@link MessageRefType }{@code >}
     * {@link JAXBElement }{@code <}{@link MessageRefType }{@code >}
     * {@link JAXBElement }{@code <}{@link MessageRefFaultType }{@code >}
     * {@link JAXBElement }{@code <}{@link MessageRefFaultType }{@code >}
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
     * Obtient la valeur de la propriété pattern.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Définit la valeur de la propriété pattern.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * Obtient la valeur de la propriété safe.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSafe() {
        return safe;
    }

    /**
     * Définit la valeur de la propriété safe.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSafe(Boolean value) {
        this.safe = value;
    }

    /**
     * Obtient la valeur de la propriété style.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Définit la valeur de la propriété style.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
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
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            String thePattern;
            thePattern = this.getPattern();
            strategy.appendField(locator, this, "pattern", buffer, thePattern, (this.pattern!= null));
        }
        {
            Boolean theSafe;
            theSafe = this.isSafe();
            strategy.appendField(locator, this, "safe", buffer, theSafe, (this.safe!= null));
        }
        {
            String theStyle;
            theStyle = this.getStyle();
            strategy.appendField(locator, this, "style", buffer, theStyle, (this.style!= null));
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
        final InterfaceOperationType that = ((InterfaceOperationType) object);
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
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            String lhsPattern;
            lhsPattern = this.getPattern();
            String rhsPattern;
            rhsPattern = that.getPattern();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pattern", lhsPattern), LocatorUtils.property(thatLocator, "pattern", rhsPattern), lhsPattern, rhsPattern, (this.pattern!= null), (that.pattern!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSafe;
            lhsSafe = this.isSafe();
            Boolean rhsSafe;
            rhsSafe = that.isSafe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "safe", lhsSafe), LocatorUtils.property(thatLocator, "safe", rhsSafe), lhsSafe, rhsSafe, (this.safe!= null), (that.safe!= null))) {
                return false;
            }
        }
        {
            String lhsStyle;
            lhsStyle = this.getStyle();
            String rhsStyle;
            rhsStyle = that.getStyle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "style", lhsStyle), LocatorUtils.property(thatLocator, "style", rhsStyle), lhsStyle, rhsStyle, (this.style!= null), (that.style!= null))) {
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
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            String thePattern;
            thePattern = this.getPattern();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pattern", thePattern), currentHashCode, thePattern, (this.pattern!= null));
        }
        {
            Boolean theSafe;
            theSafe = this.isSafe();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "safe", theSafe), currentHashCode, theSafe, (this.safe!= null));
        }
        {
            String theStyle;
            theStyle = this.getStyle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "style", theStyle), currentHashCode, theStyle, (this.style!= null));
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
        if (draftCopy instanceof InterfaceOperationType) {
            final InterfaceOperationType copy = ((InterfaceOperationType) draftCopy);
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
                Boolean patternShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pattern!= null));
                if (patternShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePattern;
                    sourcePattern = this.getPattern();
                    String copyPattern = ((String) strategy.copy(LocatorUtils.property(locator, "pattern", sourcePattern), sourcePattern, (this.pattern!= null)));
                    copy.setPattern(copyPattern);
                } else {
                    if (patternShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pattern = null;
                    }
                }
            }
            {
                Boolean safeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.safe!= null));
                if (safeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceSafe;
                    sourceSafe = this.isSafe();
                    Boolean copySafe = ((Boolean) strategy.copy(LocatorUtils.property(locator, "safe", sourceSafe), sourceSafe, (this.safe!= null)));
                    copy.setSafe(copySafe);
                } else {
                    if (safeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.safe = null;
                    }
                }
            }
            {
                Boolean styleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.style!= null));
                if (styleShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceStyle;
                    sourceStyle = this.getStyle();
                    String copyStyle = ((String) strategy.copy(LocatorUtils.property(locator, "style", sourceStyle), sourceStyle, (this.style!= null)));
                    copy.setStyle(copyStyle);
                } else {
                    if (styleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.style = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new InterfaceOperationType();
    }

}

//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.03 à 03:26:13 PM CEST 
//


package org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl.soap12;

import java.util.HashMap;
import java.util.Map;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
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


/**
 * <p>Classe Java pour tHeaderFault complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="tHeaderFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{http://schemas.xmlsoap.org/wsdl/soap12/}tHeaderAttributes"/&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tHeaderFault")
public class THeaderFault implements Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    @XmlAttribute(name = "message", required = true)
    protected QName message;
    @XmlAttribute(name = "part", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String part;
    @XmlAttribute(name = "use", required = true)
    protected UseChoice use;
    @XmlAttribute(name = "encodingStyle")
    @XmlSchemaType(name = "anyURI")
    protected String encodingStyle;
    @XmlAttribute(name = "namespace")
    @XmlSchemaType(name = "anyURI")
    protected String namespace;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Obtient la valeur de la propriété message.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getMessage() {
        return message;
    }

    /**
     * Définit la valeur de la propriété message.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setMessage(QName value) {
        this.message = value;
    }

    /**
     * Obtient la valeur de la propriété part.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPart() {
        return part;
    }

    /**
     * Définit la valeur de la propriété part.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPart(String value) {
        this.part = value;
    }

    /**
     * Obtient la valeur de la propriété use.
     * 
     * @return
     *     possible object is
     *     {@link UseChoice }
     *     
     */
    public UseChoice getUse() {
        return use;
    }

    /**
     * Définit la valeur de la propriété use.
     * 
     * @param value
     *     allowed object is
     *     {@link UseChoice }
     *     
     */
    public void setUse(UseChoice value) {
        this.use = value;
    }

    /**
     * Obtient la valeur de la propriété encodingStyle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncodingStyle() {
        return encodingStyle;
    }

    /**
     * Définit la valeur de la propriété encodingStyle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncodingStyle(String value) {
        this.encodingStyle = value;
    }

    /**
     * Obtient la valeur de la propriété namespace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Définit la valeur de la propriété namespace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespace(String value) {
        this.namespace = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
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
        {
            QName theMessage;
            theMessage = this.getMessage();
            strategy.appendField(locator, this, "message", buffer, theMessage, (this.message!= null));
        }
        {
            String thePart;
            thePart = this.getPart();
            strategy.appendField(locator, this, "part", buffer, thePart, (this.part!= null));
        }
        {
            UseChoice theUse;
            theUse = this.getUse();
            strategy.appendField(locator, this, "use", buffer, theUse, (this.use!= null));
        }
        {
            String theEncodingStyle;
            theEncodingStyle = this.getEncodingStyle();
            strategy.appendField(locator, this, "encodingStyle", buffer, theEncodingStyle, (this.encodingStyle!= null));
        }
        {
            String theNamespace;
            theNamespace = this.getNamespace();
            strategy.appendField(locator, this, "namespace", buffer, theNamespace, (this.namespace!= null));
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
        final THeaderFault that = ((THeaderFault) object);
        {
            QName lhsMessage;
            lhsMessage = this.getMessage();
            QName rhsMessage;
            rhsMessage = that.getMessage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "message", lhsMessage), LocatorUtils.property(thatLocator, "message", rhsMessage), lhsMessage, rhsMessage, (this.message!= null), (that.message!= null))) {
                return false;
            }
        }
        {
            String lhsPart;
            lhsPart = this.getPart();
            String rhsPart;
            rhsPart = that.getPart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "part", lhsPart), LocatorUtils.property(thatLocator, "part", rhsPart), lhsPart, rhsPart, (this.part!= null), (that.part!= null))) {
                return false;
            }
        }
        {
            UseChoice lhsUse;
            lhsUse = this.getUse();
            UseChoice rhsUse;
            rhsUse = that.getUse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "use", lhsUse), LocatorUtils.property(thatLocator, "use", rhsUse), lhsUse, rhsUse, (this.use!= null), (that.use!= null))) {
                return false;
            }
        }
        {
            String lhsEncodingStyle;
            lhsEncodingStyle = this.getEncodingStyle();
            String rhsEncodingStyle;
            rhsEncodingStyle = that.getEncodingStyle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "encodingStyle", lhsEncodingStyle), LocatorUtils.property(thatLocator, "encodingStyle", rhsEncodingStyle), lhsEncodingStyle, rhsEncodingStyle, (this.encodingStyle!= null), (that.encodingStyle!= null))) {
                return false;
            }
        }
        {
            String lhsNamespace;
            lhsNamespace = this.getNamespace();
            String rhsNamespace;
            rhsNamespace = that.getNamespace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "namespace", lhsNamespace), LocatorUtils.property(thatLocator, "namespace", rhsNamespace), lhsNamespace, rhsNamespace, (this.namespace!= null), (that.namespace!= null))) {
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
        int currentHashCode = 1;
        {
            QName theMessage;
            theMessage = this.getMessage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "message", theMessage), currentHashCode, theMessage, (this.message!= null));
        }
        {
            String thePart;
            thePart = this.getPart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "part", thePart), currentHashCode, thePart, (this.part!= null));
        }
        {
            UseChoice theUse;
            theUse = this.getUse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "use", theUse), currentHashCode, theUse, (this.use!= null));
        }
        {
            String theEncodingStyle;
            theEncodingStyle = this.getEncodingStyle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "encodingStyle", theEncodingStyle), currentHashCode, theEncodingStyle, (this.encodingStyle!= null));
        }
        {
            String theNamespace;
            theNamespace = this.getNamespace();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "namespace", theNamespace), currentHashCode, theNamespace, (this.namespace!= null));
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
        if (draftCopy instanceof THeaderFault) {
            final THeaderFault copy = ((THeaderFault) draftCopy);
            {
                Boolean messageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.message!= null));
                if (messageShouldBeCopiedAndSet == Boolean.TRUE) {
                    QName sourceMessage;
                    sourceMessage = this.getMessage();
                    QName copyMessage = ((QName) strategy.copy(LocatorUtils.property(locator, "message", sourceMessage), sourceMessage, (this.message!= null)));
                    copy.setMessage(copyMessage);
                } else {
                    if (messageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.message = null;
                    }
                }
            }
            {
                Boolean partShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.part!= null));
                if (partShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePart;
                    sourcePart = this.getPart();
                    String copyPart = ((String) strategy.copy(LocatorUtils.property(locator, "part", sourcePart), sourcePart, (this.part!= null)));
                    copy.setPart(copyPart);
                } else {
                    if (partShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.part = null;
                    }
                }
            }
            {
                Boolean useShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.use!= null));
                if (useShouldBeCopiedAndSet == Boolean.TRUE) {
                    UseChoice sourceUse;
                    sourceUse = this.getUse();
                    UseChoice copyUse = ((UseChoice) strategy.copy(LocatorUtils.property(locator, "use", sourceUse), sourceUse, (this.use!= null)));
                    copy.setUse(copyUse);
                } else {
                    if (useShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.use = null;
                    }
                }
            }
            {
                Boolean encodingStyleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.encodingStyle!= null));
                if (encodingStyleShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEncodingStyle;
                    sourceEncodingStyle = this.getEncodingStyle();
                    String copyEncodingStyle = ((String) strategy.copy(LocatorUtils.property(locator, "encodingStyle", sourceEncodingStyle), sourceEncodingStyle, (this.encodingStyle!= null)));
                    copy.setEncodingStyle(copyEncodingStyle);
                } else {
                    if (encodingStyleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.encodingStyle = null;
                    }
                }
            }
            {
                Boolean namespaceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.namespace!= null));
                if (namespaceShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceNamespace;
                    sourceNamespace = this.getNamespace();
                    String copyNamespace = ((String) strategy.copy(LocatorUtils.property(locator, "namespace", sourceNamespace), sourceNamespace, (this.namespace!= null)));
                    copy.setNamespace(copyNamespace);
                } else {
                    if (namespaceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.namespace = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new THeaderFault();
    }

}

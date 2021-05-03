//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.03 à 03:26:13 PM CEST 
//


package org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
import org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl.TExtensibilityElement;


/**
 * <p>Classe Java pour tBinding complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="tBinding"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.xmlsoap.org/wsdl/}tExtensibilityElement"&gt;
 *       &lt;attribute name="transport" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="style" type="{http://schemas.xmlsoap.org/wsdl/soap/}tStyleChoice" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tBinding")
public class TBinding
    extends TExtensibilityElement
    implements Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    @XmlAttribute(name = "transport", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String transport;
    @XmlAttribute(name = "style")
    protected TStyleChoice style;

    /**
     * Obtient la valeur de la propriété transport.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransport() {
        return transport;
    }

    /**
     * Définit la valeur de la propriété transport.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransport(String value) {
        this.transport = value;
    }

    /**
     * Obtient la valeur de la propriété style.
     * 
     * @return
     *     possible object is
     *     {@link TStyleChoice }
     *     
     */
    public TStyleChoice getStyle() {
        return style;
    }

    /**
     * Définit la valeur de la propriété style.
     * 
     * @param value
     *     allowed object is
     *     {@link TStyleChoice }
     *     
     */
    public void setStyle(TStyleChoice value) {
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
            String theTransport;
            theTransport = this.getTransport();
            strategy.appendField(locator, this, "transport", buffer, theTransport, (this.transport!= null));
        }
        {
            TStyleChoice theStyle;
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
        final TBinding that = ((TBinding) object);
        {
            String lhsTransport;
            lhsTransport = this.getTransport();
            String rhsTransport;
            rhsTransport = that.getTransport();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transport", lhsTransport), LocatorUtils.property(thatLocator, "transport", rhsTransport), lhsTransport, rhsTransport, (this.transport!= null), (that.transport!= null))) {
                return false;
            }
        }
        {
            TStyleChoice lhsStyle;
            lhsStyle = this.getStyle();
            TStyleChoice rhsStyle;
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
            String theTransport;
            theTransport = this.getTransport();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transport", theTransport), currentHashCode, theTransport, (this.transport!= null));
        }
        {
            TStyleChoice theStyle;
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
        if (draftCopy instanceof TBinding) {
            final TBinding copy = ((TBinding) draftCopy);
            {
                Boolean transportShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.transport!= null));
                if (transportShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTransport;
                    sourceTransport = this.getTransport();
                    String copyTransport = ((String) strategy.copy(LocatorUtils.property(locator, "transport", sourceTransport), sourceTransport, (this.transport!= null)));
                    copy.setTransport(copyTransport);
                } else {
                    if (transportShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.transport = null;
                    }
                }
            }
            {
                Boolean styleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.style!= null));
                if (styleShouldBeCopiedAndSet == Boolean.TRUE) {
                    TStyleChoice sourceStyle;
                    sourceStyle = this.getStyle();
                    TStyleChoice copyStyle = ((TStyleChoice) strategy.copy(LocatorUtils.property(locator, "style", sourceStyle), sourceStyle, (this.style!= null)));
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
        return new TBinding();
    }

}

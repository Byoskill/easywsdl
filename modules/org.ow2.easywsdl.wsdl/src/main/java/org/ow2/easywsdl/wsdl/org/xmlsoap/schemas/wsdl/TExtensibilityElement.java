//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.03 à 03:26:13 PM CEST 
//


package org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
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
import org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl.http.AddressType;
import org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl.http.BindingType;
import org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl.http.OperationType;
import org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl.mime.ContentType;
import org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl.mime.MultipartRelatedType;
import org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl.mime.TMimeXml;
import org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl.soap.TAddress;
import org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl.soap.TBinding;
import org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl.soap.TBody;
import org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl.soap.THeader;
import org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl.soap.TOperation;
import org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl.soap12.TExtensibilityElementOpenAttrs;


/**
 * <p>Classe Java pour tExtensibilityElement complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="tExtensibilityElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute ref="{http://schemas.xmlsoap.org/wsdl/}required"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tExtensibilityElement")
@XmlSeeAlso({
    TBinding.class,
    TOperation.class,
    THeader.class,
    TAddress.class,
    TBody.class,
    AddressType.class,
    BindingType.class,
    OperationType.class,
    ContentType.class,
    MultipartRelatedType.class,
    TMimeXml.class,
    TExtensibilityElementOpenAttrs.class
})
public abstract class TExtensibilityElement implements Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    @XmlAttribute(name = "required", namespace = "http://schemas.xmlsoap.org/wsdl/")
    protected Boolean required;

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
        final TExtensibilityElement that = ((TExtensibilityElement) object);
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
        int currentHashCode = 1;
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        if (target instanceof TExtensibilityElement) {
            final TExtensibilityElement copy = ((TExtensibilityElement) target);
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
        return target;
    }

}

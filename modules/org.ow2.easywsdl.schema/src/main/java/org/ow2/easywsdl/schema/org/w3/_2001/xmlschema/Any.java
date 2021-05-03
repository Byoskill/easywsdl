//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.03 à 03:39:56 PM CEST 
//


package org.ow2.easywsdl.schema.org.w3._2001.xmlschema;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
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


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.w3.org/2001/XMLSchema}wildcard"&gt;
 *       &lt;attGroup ref="{http://www.w3.org/2001/XMLSchema}occurs"/&gt;
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
@XmlRootElement(name = "any")
public class Any
    extends Wildcard
    implements Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    @XmlAttribute(name = "minOccurs")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minOccurs;
    @XmlAttribute(name = "maxOccurs")
    @XmlSchemaType(name = "allNNI")
    protected String maxOccurs;

    /**
     * Obtient la valeur de la propriété minOccurs.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinOccurs() {
        if (minOccurs == null) {
            return new BigInteger("1");
        } else {
            return minOccurs;
        }
    }

    /**
     * Définit la valeur de la propriété minOccurs.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinOccurs(BigInteger value) {
        this.minOccurs = value;
    }

    /**
     * Obtient la valeur de la propriété maxOccurs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxOccurs() {
        if (maxOccurs == null) {
            return "1";
        } else {
            return maxOccurs;
        }
    }

    /**
     * Définit la valeur de la propriété maxOccurs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxOccurs(String value) {
        this.maxOccurs = value;
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
            BigInteger theMinOccurs;
            theMinOccurs = this.getMinOccurs();
            strategy.appendField(locator, this, "minOccurs", buffer, theMinOccurs, (this.minOccurs!= null));
        }
        {
            String theMaxOccurs;
            theMaxOccurs = this.getMaxOccurs();
            strategy.appendField(locator, this, "maxOccurs", buffer, theMaxOccurs, (this.maxOccurs!= null));
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
        final Any that = ((Any) object);
        {
            BigInteger lhsMinOccurs;
            lhsMinOccurs = this.getMinOccurs();
            BigInteger rhsMinOccurs;
            rhsMinOccurs = that.getMinOccurs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minOccurs", lhsMinOccurs), LocatorUtils.property(thatLocator, "minOccurs", rhsMinOccurs), lhsMinOccurs, rhsMinOccurs, (this.minOccurs!= null), (that.minOccurs!= null))) {
                return false;
            }
        }
        {
            String lhsMaxOccurs;
            lhsMaxOccurs = this.getMaxOccurs();
            String rhsMaxOccurs;
            rhsMaxOccurs = that.getMaxOccurs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxOccurs", lhsMaxOccurs), LocatorUtils.property(thatLocator, "maxOccurs", rhsMaxOccurs), lhsMaxOccurs, rhsMaxOccurs, (this.maxOccurs!= null), (that.maxOccurs!= null))) {
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
            BigInteger theMinOccurs;
            theMinOccurs = this.getMinOccurs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minOccurs", theMinOccurs), currentHashCode, theMinOccurs, (this.minOccurs!= null));
        }
        {
            String theMaxOccurs;
            theMaxOccurs = this.getMaxOccurs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxOccurs", theMaxOccurs), currentHashCode, theMaxOccurs, (this.maxOccurs!= null));
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
        if (draftCopy instanceof Any) {
            final Any copy = ((Any) draftCopy);
            {
                Boolean minOccursShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.minOccurs!= null));
                if (minOccursShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceMinOccurs;
                    sourceMinOccurs = this.getMinOccurs();
                    BigInteger copyMinOccurs = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "minOccurs", sourceMinOccurs), sourceMinOccurs, (this.minOccurs!= null)));
                    copy.setMinOccurs(copyMinOccurs);
                } else {
                    if (minOccursShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.minOccurs = null;
                    }
                }
            }
            {
                Boolean maxOccursShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maxOccurs!= null));
                if (maxOccursShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceMaxOccurs;
                    sourceMaxOccurs = this.getMaxOccurs();
                    String copyMaxOccurs = ((String) strategy.copy(LocatorUtils.property(locator, "maxOccurs", sourceMaxOccurs), sourceMaxOccurs, (this.maxOccurs!= null)));
                    copy.setMaxOccurs(copyMaxOccurs);
                } else {
                    if (maxOccursShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maxOccurs = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Any();
    }

}

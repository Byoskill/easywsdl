//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.03 à 03:39:56 PM CEST 
//


package org.ow2.easywsdl.schema.org.w3._2001.xmlschema;

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
 *     &lt;extension base="{http://www.w3.org/2001/XMLSchema}annotated"&gt;
 *       &lt;attribute name="namespace" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="schemaLocation" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
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
@XmlRootElement(name = "import")
public class Import
    extends Annotated
    implements Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    @XmlAttribute(name = "namespace")
    @XmlSchemaType(name = "anyURI")
    protected String namespace;
    @XmlAttribute(name = "schemaLocation")
    @XmlSchemaType(name = "anyURI")
    protected String schemaLocation;

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
     * Obtient la valeur de la propriété schemaLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaLocation() {
        return schemaLocation;
    }

    /**
     * Définit la valeur de la propriété schemaLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaLocation(String value) {
        this.schemaLocation = value;
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
            String theNamespace;
            theNamespace = this.getNamespace();
            strategy.appendField(locator, this, "namespace", buffer, theNamespace, (this.namespace!= null));
        }
        {
            String theSchemaLocation;
            theSchemaLocation = this.getSchemaLocation();
            strategy.appendField(locator, this, "schemaLocation", buffer, theSchemaLocation, (this.schemaLocation!= null));
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
        final Import that = ((Import) object);
        {
            String lhsNamespace;
            lhsNamespace = this.getNamespace();
            String rhsNamespace;
            rhsNamespace = that.getNamespace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "namespace", lhsNamespace), LocatorUtils.property(thatLocator, "namespace", rhsNamespace), lhsNamespace, rhsNamespace, (this.namespace!= null), (that.namespace!= null))) {
                return false;
            }
        }
        {
            String lhsSchemaLocation;
            lhsSchemaLocation = this.getSchemaLocation();
            String rhsSchemaLocation;
            rhsSchemaLocation = that.getSchemaLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schemaLocation", lhsSchemaLocation), LocatorUtils.property(thatLocator, "schemaLocation", rhsSchemaLocation), lhsSchemaLocation, rhsSchemaLocation, (this.schemaLocation!= null), (that.schemaLocation!= null))) {
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
            String theNamespace;
            theNamespace = this.getNamespace();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "namespace", theNamespace), currentHashCode, theNamespace, (this.namespace!= null));
        }
        {
            String theSchemaLocation;
            theSchemaLocation = this.getSchemaLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schemaLocation", theSchemaLocation), currentHashCode, theSchemaLocation, (this.schemaLocation!= null));
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
        if (draftCopy instanceof Import) {
            final Import copy = ((Import) draftCopy);
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
            {
                Boolean schemaLocationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.schemaLocation!= null));
                if (schemaLocationShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSchemaLocation;
                    sourceSchemaLocation = this.getSchemaLocation();
                    String copySchemaLocation = ((String) strategy.copy(LocatorUtils.property(locator, "schemaLocation", sourceSchemaLocation), sourceSchemaLocation, (this.schemaLocation!= null)));
                    copy.setSchemaLocation(copySchemaLocation);
                } else {
                    if (schemaLocationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.schemaLocation = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Import();
    }

}

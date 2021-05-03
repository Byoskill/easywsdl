//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.03 à 03:39:56 PM CEST 
//


package org.ow2.easywsdl.schema.org.w3._2001.xmlschema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
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
 * 
 *    group type for explicit groups, named top-level groups and
 *    group references
 * 
 * <p>Classe Java pour group complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="group"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.w3.org/2001/XMLSchema}annotated"&gt;
 *       &lt;group ref="{http://www.w3.org/2001/XMLSchema}particle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;attGroup ref="{http://www.w3.org/2001/XMLSchema}defRef"/&gt;
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
@XmlType(name = "group", propOrder = {
    "particle"
})
@XmlSeeAlso({
    RealGroup.class,
    ExplicitGroup.class
})
public abstract class Group
    extends Annotated
    implements Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    @XmlElementRefs({
        @XmlElementRef(name = "element", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "group", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "all", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "choice", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sequence", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "any", namespace = "http://www.w3.org/2001/XMLSchema", type = Any.class, required = false)
    })
    protected List<Object> particle;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(name = "ref")
    protected QName ref;
    @XmlAttribute(name = "minOccurs")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minOccurs;
    @XmlAttribute(name = "maxOccurs")
    @XmlSchemaType(name = "allNNI")
    protected String maxOccurs;

    /**
     * Gets the value of the particle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the particle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link LocalElement }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupRef }{@code >}
     * {@link JAXBElement }{@code <}{@link All }{@code >}
     * {@link JAXBElement }{@code <}{@link ExplicitGroup }{@code >}
     * {@link JAXBElement }{@code <}{@link ExplicitGroup }{@code >}
     * {@link Any }
     * 
     * 
     */
    public List<Object> getParticle() {
        if (particle == null) {
            particle = new ArrayList<Object>();
        }
        return this.particle;
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
            List<Object> theParticle;
            theParticle = (((this.particle!= null)&&(!this.particle.isEmpty()))?this.getParticle():null);
            strategy.appendField(locator, this, "particle", buffer, theParticle, ((this.particle!= null)&&(!this.particle.isEmpty())));
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            QName theRef;
            theRef = this.getRef();
            strategy.appendField(locator, this, "ref", buffer, theRef, (this.ref!= null));
        }
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
        final Group that = ((Group) object);
        {
            List<Object> lhsParticle;
            lhsParticle = (((this.particle!= null)&&(!this.particle.isEmpty()))?this.getParticle():null);
            List<Object> rhsParticle;
            rhsParticle = (((that.particle!= null)&&(!that.particle.isEmpty()))?that.getParticle():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "particle", lhsParticle), LocatorUtils.property(thatLocator, "particle", rhsParticle), lhsParticle, rhsParticle, ((this.particle!= null)&&(!this.particle.isEmpty())), ((that.particle!= null)&&(!that.particle.isEmpty())))) {
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
            QName lhsRef;
            lhsRef = this.getRef();
            QName rhsRef;
            rhsRef = that.getRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ref", lhsRef), LocatorUtils.property(thatLocator, "ref", rhsRef), lhsRef, rhsRef, (this.ref!= null), (that.ref!= null))) {
                return false;
            }
        }
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
            List<Object> theParticle;
            theParticle = (((this.particle!= null)&&(!this.particle.isEmpty()))?this.getParticle():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "particle", theParticle), currentHashCode, theParticle, ((this.particle!= null)&&(!this.particle.isEmpty())));
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            QName theRef;
            theRef = this.getRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ref", theRef), currentHashCode, theRef, (this.ref!= null));
        }
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        if (target instanceof Group) {
            final Group copy = ((Group) target);
            {
                Boolean particleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.particle!= null)&&(!this.particle.isEmpty())));
                if (particleShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Object> sourceParticle;
                    sourceParticle = (((this.particle!= null)&&(!this.particle.isEmpty()))?this.getParticle():null);
                    @SuppressWarnings("unchecked")
                    List<Object> copyParticle = ((List<Object> ) strategy.copy(LocatorUtils.property(locator, "particle", sourceParticle), sourceParticle, ((this.particle!= null)&&(!this.particle.isEmpty()))));
                    copy.particle = null;
                    if (copyParticle!= null) {
                        List<Object> uniqueParticlel = copy.getParticle();
                        uniqueParticlel.addAll(copyParticle);
                    }
                } else {
                    if (particleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.particle = null;
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
        return target;
    }

}

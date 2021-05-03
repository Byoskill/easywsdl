//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.03 à 03:39:56 PM CEST 
//


package org.ow2.easywsdl.schema.org.w3._2001.xmlschema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
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
 *           base attribute and simpleType child are mutually
 *           exclusive, but one or other is required
 *         
 * 
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.w3.org/2001/XMLSchema}annotated"&gt;
 *       &lt;group ref="{http://www.w3.org/2001/XMLSchema}simpleRestrictionModel"/&gt;
 *       &lt;attribute name="base" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "simpleType",
    "facets"
})
@XmlRootElement(name = "restriction")
public class Restriction
    extends Annotated
    implements Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    protected LocalSimpleType simpleType;
    @XmlElementRefs({
        @XmlElementRef(name = "minExclusive", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "minInclusive", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "maxExclusive", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "maxInclusive", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "totalDigits", namespace = "http://www.w3.org/2001/XMLSchema", type = TotalDigits.class, required = false),
        @XmlElementRef(name = "fractionDigits", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "length", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "minLength", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "maxLength", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "enumeration", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "whiteSpace", namespace = "http://www.w3.org/2001/XMLSchema", type = WhiteSpace.class, required = false),
        @XmlElementRef(name = "pattern", namespace = "http://www.w3.org/2001/XMLSchema", type = Pattern.class, required = false)
    })
    protected List<Object> facets;
    @XmlAttribute(name = "base")
    protected QName base;

    /**
     * Obtient la valeur de la propriété simpleType.
     * 
     * @return
     *     possible object is
     *     {@link LocalSimpleType }
     *     
     */
    public LocalSimpleType getSimpleType() {
        return simpleType;
    }

    /**
     * Définit la valeur de la propriété simpleType.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalSimpleType }
     *     
     */
    public void setSimpleType(LocalSimpleType value) {
        this.simpleType = value;
    }

    /**
     * Gets the value of the facets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Facet }{@code >}
     * {@link JAXBElement }{@code <}{@link Facet }{@code >}
     * {@link JAXBElement }{@code <}{@link Facet }{@code >}
     * {@link JAXBElement }{@code <}{@link Facet }{@code >}
     * {@link TotalDigits }
     * {@link JAXBElement }{@code <}{@link NumFacet }{@code >}
     * {@link JAXBElement }{@code <}{@link NumFacet }{@code >}
     * {@link JAXBElement }{@code <}{@link NumFacet }{@code >}
     * {@link JAXBElement }{@code <}{@link NumFacet }{@code >}
     * {@link JAXBElement }{@code <}{@link NoFixedFacet }{@code >}
     * {@link WhiteSpace }
     * {@link Pattern }
     * 
     * 
     */
    public List<Object> getFacets() {
        if (facets == null) {
            facets = new ArrayList<Object>();
        }
        return this.facets;
    }

    /**
     * Obtient la valeur de la propriété base.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getBase() {
        return base;
    }

    /**
     * Définit la valeur de la propriété base.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setBase(QName value) {
        this.base = value;
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
            LocalSimpleType theSimpleType;
            theSimpleType = this.getSimpleType();
            strategy.appendField(locator, this, "simpleType", buffer, theSimpleType, (this.simpleType!= null));
        }
        {
            List<Object> theFacets;
            theFacets = (((this.facets!= null)&&(!this.facets.isEmpty()))?this.getFacets():null);
            strategy.appendField(locator, this, "facets", buffer, theFacets, ((this.facets!= null)&&(!this.facets.isEmpty())));
        }
        {
            QName theBase;
            theBase = this.getBase();
            strategy.appendField(locator, this, "base", buffer, theBase, (this.base!= null));
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
        final Restriction that = ((Restriction) object);
        {
            LocalSimpleType lhsSimpleType;
            lhsSimpleType = this.getSimpleType();
            LocalSimpleType rhsSimpleType;
            rhsSimpleType = that.getSimpleType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "simpleType", lhsSimpleType), LocatorUtils.property(thatLocator, "simpleType", rhsSimpleType), lhsSimpleType, rhsSimpleType, (this.simpleType!= null), (that.simpleType!= null))) {
                return false;
            }
        }
        {
            List<Object> lhsFacets;
            lhsFacets = (((this.facets!= null)&&(!this.facets.isEmpty()))?this.getFacets():null);
            List<Object> rhsFacets;
            rhsFacets = (((that.facets!= null)&&(!that.facets.isEmpty()))?that.getFacets():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "facets", lhsFacets), LocatorUtils.property(thatLocator, "facets", rhsFacets), lhsFacets, rhsFacets, ((this.facets!= null)&&(!this.facets.isEmpty())), ((that.facets!= null)&&(!that.facets.isEmpty())))) {
                return false;
            }
        }
        {
            QName lhsBase;
            lhsBase = this.getBase();
            QName rhsBase;
            rhsBase = that.getBase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "base", lhsBase), LocatorUtils.property(thatLocator, "base", rhsBase), lhsBase, rhsBase, (this.base!= null), (that.base!= null))) {
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
            LocalSimpleType theSimpleType;
            theSimpleType = this.getSimpleType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "simpleType", theSimpleType), currentHashCode, theSimpleType, (this.simpleType!= null));
        }
        {
            List<Object> theFacets;
            theFacets = (((this.facets!= null)&&(!this.facets.isEmpty()))?this.getFacets():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "facets", theFacets), currentHashCode, theFacets, ((this.facets!= null)&&(!this.facets.isEmpty())));
        }
        {
            QName theBase;
            theBase = this.getBase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "base", theBase), currentHashCode, theBase, (this.base!= null));
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
        if (draftCopy instanceof Restriction) {
            final Restriction copy = ((Restriction) draftCopy);
            {
                Boolean simpleTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.simpleType!= null));
                if (simpleTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    LocalSimpleType sourceSimpleType;
                    sourceSimpleType = this.getSimpleType();
                    LocalSimpleType copySimpleType = ((LocalSimpleType) strategy.copy(LocatorUtils.property(locator, "simpleType", sourceSimpleType), sourceSimpleType, (this.simpleType!= null)));
                    copy.setSimpleType(copySimpleType);
                } else {
                    if (simpleTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.simpleType = null;
                    }
                }
            }
            {
                Boolean facetsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.facets!= null)&&(!this.facets.isEmpty())));
                if (facetsShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Object> sourceFacets;
                    sourceFacets = (((this.facets!= null)&&(!this.facets.isEmpty()))?this.getFacets():null);
                    @SuppressWarnings("unchecked")
                    List<Object> copyFacets = ((List<Object> ) strategy.copy(LocatorUtils.property(locator, "facets", sourceFacets), sourceFacets, ((this.facets!= null)&&(!this.facets.isEmpty()))));
                    copy.facets = null;
                    if (copyFacets!= null) {
                        List<Object> uniqueFacetsl = copy.getFacets();
                        uniqueFacetsl.addAll(copyFacets);
                    }
                } else {
                    if (facetsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.facets = null;
                    }
                }
            }
            {
                Boolean baseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.base!= null));
                if (baseShouldBeCopiedAndSet == Boolean.TRUE) {
                    QName sourceBase;
                    sourceBase = this.getBase();
                    QName copyBase = ((QName) strategy.copy(LocatorUtils.property(locator, "base", sourceBase), sourceBase, (this.base!= null)));
                    copy.setBase(copyBase);
                } else {
                    if (baseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.base = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Restriction();
    }

}

//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.03 à 03:39:56 PM CEST 
//


package org.ow2.easywsdl.schema.org.w3._2001.xmlschema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlRootElement;
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


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.w3.org/2001/XMLSchema}openAttrs"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{http://www.w3.org/2001/XMLSchema}annotation"/&gt;
 *         &lt;group ref="{http://www.w3.org/2001/XMLSchema}redefinable"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="schemaLocation" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
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
    "annotationOrSimpleTypeOrComplexType"
})
@XmlRootElement(name = "redefine")
public class Redefine
    extends OpenAttrs
    implements Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    @XmlElements({
        @XmlElement(name = "annotation", type = Annotation.class),
        @XmlElement(name = "simpleType", type = TopLevelSimpleType.class),
        @XmlElement(name = "complexType", type = TopLevelComplexType.class),
        @XmlElement(name = "group", type = NamedGroup.class),
        @XmlElement(name = "attributeGroup", type = NamedAttributeGroup.class)
    })
    protected List<OpenAttrs> annotationOrSimpleTypeOrComplexType;
    @XmlAttribute(name = "schemaLocation", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String schemaLocation;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the annotationOrSimpleTypeOrComplexType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotationOrSimpleTypeOrComplexType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotationOrSimpleTypeOrComplexType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Annotation }
     * {@link TopLevelSimpleType }
     * {@link TopLevelComplexType }
     * {@link NamedGroup }
     * {@link NamedAttributeGroup }
     * 
     * 
     */
    public List<OpenAttrs> getAnnotationOrSimpleTypeOrComplexType() {
        if (annotationOrSimpleTypeOrComplexType == null) {
            annotationOrSimpleTypeOrComplexType = new ArrayList<OpenAttrs>();
        }
        return this.annotationOrSimpleTypeOrComplexType;
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

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
            List<OpenAttrs> theAnnotationOrSimpleTypeOrComplexType;
            theAnnotationOrSimpleTypeOrComplexType = (((this.annotationOrSimpleTypeOrComplexType!= null)&&(!this.annotationOrSimpleTypeOrComplexType.isEmpty()))?this.getAnnotationOrSimpleTypeOrComplexType():null);
            strategy.appendField(locator, this, "annotationOrSimpleTypeOrComplexType", buffer, theAnnotationOrSimpleTypeOrComplexType, ((this.annotationOrSimpleTypeOrComplexType!= null)&&(!this.annotationOrSimpleTypeOrComplexType.isEmpty())));
        }
        {
            String theSchemaLocation;
            theSchemaLocation = this.getSchemaLocation();
            strategy.appendField(locator, this, "schemaLocation", buffer, theSchemaLocation, (this.schemaLocation!= null));
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
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
        final Redefine that = ((Redefine) object);
        {
            List<OpenAttrs> lhsAnnotationOrSimpleTypeOrComplexType;
            lhsAnnotationOrSimpleTypeOrComplexType = (((this.annotationOrSimpleTypeOrComplexType!= null)&&(!this.annotationOrSimpleTypeOrComplexType.isEmpty()))?this.getAnnotationOrSimpleTypeOrComplexType():null);
            List<OpenAttrs> rhsAnnotationOrSimpleTypeOrComplexType;
            rhsAnnotationOrSimpleTypeOrComplexType = (((that.annotationOrSimpleTypeOrComplexType!= null)&&(!that.annotationOrSimpleTypeOrComplexType.isEmpty()))?that.getAnnotationOrSimpleTypeOrComplexType():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "annotationOrSimpleTypeOrComplexType", lhsAnnotationOrSimpleTypeOrComplexType), LocatorUtils.property(thatLocator, "annotationOrSimpleTypeOrComplexType", rhsAnnotationOrSimpleTypeOrComplexType), lhsAnnotationOrSimpleTypeOrComplexType, rhsAnnotationOrSimpleTypeOrComplexType, ((this.annotationOrSimpleTypeOrComplexType!= null)&&(!this.annotationOrSimpleTypeOrComplexType.isEmpty())), ((that.annotationOrSimpleTypeOrComplexType!= null)&&(!that.annotationOrSimpleTypeOrComplexType.isEmpty())))) {
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
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId, (this.id!= null), (that.id!= null))) {
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
            List<OpenAttrs> theAnnotationOrSimpleTypeOrComplexType;
            theAnnotationOrSimpleTypeOrComplexType = (((this.annotationOrSimpleTypeOrComplexType!= null)&&(!this.annotationOrSimpleTypeOrComplexType.isEmpty()))?this.getAnnotationOrSimpleTypeOrComplexType():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "annotationOrSimpleTypeOrComplexType", theAnnotationOrSimpleTypeOrComplexType), currentHashCode, theAnnotationOrSimpleTypeOrComplexType, ((this.annotationOrSimpleTypeOrComplexType!= null)&&(!this.annotationOrSimpleTypeOrComplexType.isEmpty())));
        }
        {
            String theSchemaLocation;
            theSchemaLocation = this.getSchemaLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schemaLocation", theSchemaLocation), currentHashCode, theSchemaLocation, (this.schemaLocation!= null));
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId, (this.id!= null));
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
        if (draftCopy instanceof Redefine) {
            final Redefine copy = ((Redefine) draftCopy);
            {
                Boolean annotationOrSimpleTypeOrComplexTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.annotationOrSimpleTypeOrComplexType!= null)&&(!this.annotationOrSimpleTypeOrComplexType.isEmpty())));
                if (annotationOrSimpleTypeOrComplexTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<OpenAttrs> sourceAnnotationOrSimpleTypeOrComplexType;
                    sourceAnnotationOrSimpleTypeOrComplexType = (((this.annotationOrSimpleTypeOrComplexType!= null)&&(!this.annotationOrSimpleTypeOrComplexType.isEmpty()))?this.getAnnotationOrSimpleTypeOrComplexType():null);
                    @SuppressWarnings("unchecked")
                    List<OpenAttrs> copyAnnotationOrSimpleTypeOrComplexType = ((List<OpenAttrs> ) strategy.copy(LocatorUtils.property(locator, "annotationOrSimpleTypeOrComplexType", sourceAnnotationOrSimpleTypeOrComplexType), sourceAnnotationOrSimpleTypeOrComplexType, ((this.annotationOrSimpleTypeOrComplexType!= null)&&(!this.annotationOrSimpleTypeOrComplexType.isEmpty()))));
                    copy.annotationOrSimpleTypeOrComplexType = null;
                    if (copyAnnotationOrSimpleTypeOrComplexType!= null) {
                        List<OpenAttrs> uniqueAnnotationOrSimpleTypeOrComplexTypel = copy.getAnnotationOrSimpleTypeOrComplexType();
                        uniqueAnnotationOrSimpleTypeOrComplexTypel.addAll(copyAnnotationOrSimpleTypeOrComplexType);
                    }
                } else {
                    if (annotationOrSimpleTypeOrComplexTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.annotationOrSimpleTypeOrComplexType = null;
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
            {
                Boolean idShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.id!= null));
                if (idShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceId;
                    sourceId = this.getId();
                    String copyId = ((String) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId, (this.id!= null)));
                    copy.setId(copyId);
                } else {
                    if (idShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.id = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Redefine();
    }

}

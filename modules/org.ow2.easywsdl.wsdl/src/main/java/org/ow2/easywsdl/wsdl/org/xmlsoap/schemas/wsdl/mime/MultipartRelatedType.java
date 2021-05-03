//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.03 à 03:26:13 PM CEST 
//


package org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl.mime;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 * <p>Classe Java pour multipartRelatedType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="multipartRelatedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.xmlsoap.org/wsdl/}tExtensibilityElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="part" type="{http://schemas.xmlsoap.org/wsdl/mime/}tPart" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multipartRelatedType", propOrder = {
    "part"
})
public class MultipartRelatedType
    extends TExtensibilityElement
    implements Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    protected List<TPart> part;

    /**
     * Gets the value of the part property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the part property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TPart }
     * 
     * 
     */
    public List<TPart> getPart() {
        if (part == null) {
            part = new ArrayList<TPart>();
        }
        return this.part;
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
            List<TPart> thePart;
            thePart = (((this.part!= null)&&(!this.part.isEmpty()))?this.getPart():null);
            strategy.appendField(locator, this, "part", buffer, thePart, ((this.part!= null)&&(!this.part.isEmpty())));
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
        final MultipartRelatedType that = ((MultipartRelatedType) object);
        {
            List<TPart> lhsPart;
            lhsPart = (((this.part!= null)&&(!this.part.isEmpty()))?this.getPart():null);
            List<TPart> rhsPart;
            rhsPart = (((that.part!= null)&&(!that.part.isEmpty()))?that.getPart():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "part", lhsPart), LocatorUtils.property(thatLocator, "part", rhsPart), lhsPart, rhsPart, ((this.part!= null)&&(!this.part.isEmpty())), ((that.part!= null)&&(!that.part.isEmpty())))) {
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
            List<TPart> thePart;
            thePart = (((this.part!= null)&&(!this.part.isEmpty()))?this.getPart():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "part", thePart), currentHashCode, thePart, ((this.part!= null)&&(!this.part.isEmpty())));
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
        if (draftCopy instanceof MultipartRelatedType) {
            final MultipartRelatedType copy = ((MultipartRelatedType) draftCopy);
            {
                Boolean partShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.part!= null)&&(!this.part.isEmpty())));
                if (partShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<TPart> sourcePart;
                    sourcePart = (((this.part!= null)&&(!this.part.isEmpty()))?this.getPart():null);
                    @SuppressWarnings("unchecked")
                    List<TPart> copyPart = ((List<TPart> ) strategy.copy(LocatorUtils.property(locator, "part", sourcePart), sourcePart, ((this.part!= null)&&(!this.part.isEmpty()))));
                    copy.part = null;
                    if (copyPart!= null) {
                        List<TPart> uniquePartl = copy.getPart();
                        uniquePartl.addAll(copyPart);
                    }
                } else {
                    if (partShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.part = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MultipartRelatedType();
    }

}

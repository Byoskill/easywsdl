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
 *           memberTypes attribute must be non-empty or there must be
 *           at least one simpleType child
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
 *       &lt;sequence&gt;
 *         &lt;element name="simpleType" type="{http://www.w3.org/2001/XMLSchema}localSimpleType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="memberTypes"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
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
    "simpleType"
})
@XmlRootElement(name = "union")
public class Union
    extends Annotated
    implements Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    protected List<LocalSimpleType> simpleType;
    @XmlAttribute(name = "memberTypes")
    protected List<QName> memberTypes;

    /**
     * Gets the value of the simpleType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simpleType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimpleType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalSimpleType }
     * 
     * 
     */
    public List<LocalSimpleType> getSimpleType() {
        if (simpleType == null) {
            simpleType = new ArrayList<LocalSimpleType>();
        }
        return this.simpleType;
    }

    /**
     * Gets the value of the memberTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memberTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     * 
     * 
     */
    public List<QName> getMemberTypes() {
        if (memberTypes == null) {
            memberTypes = new ArrayList<QName>();
        }
        return this.memberTypes;
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
            List<LocalSimpleType> theSimpleType;
            theSimpleType = (((this.simpleType!= null)&&(!this.simpleType.isEmpty()))?this.getSimpleType():null);
            strategy.appendField(locator, this, "simpleType", buffer, theSimpleType, ((this.simpleType!= null)&&(!this.simpleType.isEmpty())));
        }
        {
            List<QName> theMemberTypes;
            theMemberTypes = (((this.memberTypes!= null)&&(!this.memberTypes.isEmpty()))?this.getMemberTypes():null);
            strategy.appendField(locator, this, "memberTypes", buffer, theMemberTypes, ((this.memberTypes!= null)&&(!this.memberTypes.isEmpty())));
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
        final Union that = ((Union) object);
        {
            List<LocalSimpleType> lhsSimpleType;
            lhsSimpleType = (((this.simpleType!= null)&&(!this.simpleType.isEmpty()))?this.getSimpleType():null);
            List<LocalSimpleType> rhsSimpleType;
            rhsSimpleType = (((that.simpleType!= null)&&(!that.simpleType.isEmpty()))?that.getSimpleType():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "simpleType", lhsSimpleType), LocatorUtils.property(thatLocator, "simpleType", rhsSimpleType), lhsSimpleType, rhsSimpleType, ((this.simpleType!= null)&&(!this.simpleType.isEmpty())), ((that.simpleType!= null)&&(!that.simpleType.isEmpty())))) {
                return false;
            }
        }
        {
            List<QName> lhsMemberTypes;
            lhsMemberTypes = (((this.memberTypes!= null)&&(!this.memberTypes.isEmpty()))?this.getMemberTypes():null);
            List<QName> rhsMemberTypes;
            rhsMemberTypes = (((that.memberTypes!= null)&&(!that.memberTypes.isEmpty()))?that.getMemberTypes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "memberTypes", lhsMemberTypes), LocatorUtils.property(thatLocator, "memberTypes", rhsMemberTypes), lhsMemberTypes, rhsMemberTypes, ((this.memberTypes!= null)&&(!this.memberTypes.isEmpty())), ((that.memberTypes!= null)&&(!that.memberTypes.isEmpty())))) {
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
            List<LocalSimpleType> theSimpleType;
            theSimpleType = (((this.simpleType!= null)&&(!this.simpleType.isEmpty()))?this.getSimpleType():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "simpleType", theSimpleType), currentHashCode, theSimpleType, ((this.simpleType!= null)&&(!this.simpleType.isEmpty())));
        }
        {
            List<QName> theMemberTypes;
            theMemberTypes = (((this.memberTypes!= null)&&(!this.memberTypes.isEmpty()))?this.getMemberTypes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "memberTypes", theMemberTypes), currentHashCode, theMemberTypes, ((this.memberTypes!= null)&&(!this.memberTypes.isEmpty())));
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
        if (draftCopy instanceof Union) {
            final Union copy = ((Union) draftCopy);
            {
                Boolean simpleTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.simpleType!= null)&&(!this.simpleType.isEmpty())));
                if (simpleTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<LocalSimpleType> sourceSimpleType;
                    sourceSimpleType = (((this.simpleType!= null)&&(!this.simpleType.isEmpty()))?this.getSimpleType():null);
                    @SuppressWarnings("unchecked")
                    List<LocalSimpleType> copySimpleType = ((List<LocalSimpleType> ) strategy.copy(LocatorUtils.property(locator, "simpleType", sourceSimpleType), sourceSimpleType, ((this.simpleType!= null)&&(!this.simpleType.isEmpty()))));
                    copy.simpleType = null;
                    if (copySimpleType!= null) {
                        List<LocalSimpleType> uniqueSimpleTypel = copy.getSimpleType();
                        uniqueSimpleTypel.addAll(copySimpleType);
                    }
                } else {
                    if (simpleTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.simpleType = null;
                    }
                }
            }
            {
                Boolean memberTypesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.memberTypes!= null)&&(!this.memberTypes.isEmpty())));
                if (memberTypesShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<QName> sourceMemberTypes;
                    sourceMemberTypes = (((this.memberTypes!= null)&&(!this.memberTypes.isEmpty()))?this.getMemberTypes():null);
                    @SuppressWarnings("unchecked")
                    List<QName> copyMemberTypes = ((List<QName> ) strategy.copy(LocatorUtils.property(locator, "memberTypes", sourceMemberTypes), sourceMemberTypes, ((this.memberTypes!= null)&&(!this.memberTypes.isEmpty()))));
                    copy.memberTypes = null;
                    if (copyMemberTypes!= null) {
                        List<QName> uniqueMemberTypesl = copy.getMemberTypes();
                        uniqueMemberTypesl.addAll(copyMemberTypes);
                    }
                } else {
                    if (memberTypesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.memberTypes = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Union();
    }

}

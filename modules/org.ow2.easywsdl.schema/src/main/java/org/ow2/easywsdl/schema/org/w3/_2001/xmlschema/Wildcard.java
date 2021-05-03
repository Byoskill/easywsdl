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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Classe Java pour wildcard complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="wildcard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.w3.org/2001/XMLSchema}annotated"&gt;
 *       &lt;attribute name="namespace" type="{http://www.w3.org/2001/XMLSchema}namespaceList" default="##any" /&gt;
 *       &lt;attribute name="processContents" default="strict"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="skip"/&gt;
 *             &lt;enumeration value="lax"/&gt;
 *             &lt;enumeration value="strict"/&gt;
 *           &lt;/restriction&gt;
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
@XmlType(name = "wildcard")
@XmlSeeAlso({
    Any.class
})
public class Wildcard
    extends Annotated
    implements Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    @XmlAttribute(name = "namespace")
    @XmlSchemaType(name = "namespaceList")
    protected List<String> namespace;
    @XmlAttribute(name = "processContents")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String processContents;

    /**
     * Gets the value of the namespace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namespace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamespace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNamespace() {
        if (namespace == null) {
            namespace = new ArrayList<String>();
        }
        return this.namespace;
    }

    /**
     * Obtient la valeur de la propriété processContents.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessContents() {
        if (processContents == null) {
            return "strict";
        } else {
            return processContents;
        }
    }

    /**
     * Définit la valeur de la propriété processContents.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessContents(String value) {
        this.processContents = value;
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
            List<String> theNamespace;
            theNamespace = (((this.namespace!= null)&&(!this.namespace.isEmpty()))?this.getNamespace():null);
            strategy.appendField(locator, this, "namespace", buffer, theNamespace, ((this.namespace!= null)&&(!this.namespace.isEmpty())));
        }
        {
            String theProcessContents;
            theProcessContents = this.getProcessContents();
            strategy.appendField(locator, this, "processContents", buffer, theProcessContents, (this.processContents!= null));
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
        final Wildcard that = ((Wildcard) object);
        {
            List<String> lhsNamespace;
            lhsNamespace = (((this.namespace!= null)&&(!this.namespace.isEmpty()))?this.getNamespace():null);
            List<String> rhsNamespace;
            rhsNamespace = (((that.namespace!= null)&&(!that.namespace.isEmpty()))?that.getNamespace():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "namespace", lhsNamespace), LocatorUtils.property(thatLocator, "namespace", rhsNamespace), lhsNamespace, rhsNamespace, ((this.namespace!= null)&&(!this.namespace.isEmpty())), ((that.namespace!= null)&&(!that.namespace.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsProcessContents;
            lhsProcessContents = this.getProcessContents();
            String rhsProcessContents;
            rhsProcessContents = that.getProcessContents();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processContents", lhsProcessContents), LocatorUtils.property(thatLocator, "processContents", rhsProcessContents), lhsProcessContents, rhsProcessContents, (this.processContents!= null), (that.processContents!= null))) {
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
            List<String> theNamespace;
            theNamespace = (((this.namespace!= null)&&(!this.namespace.isEmpty()))?this.getNamespace():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "namespace", theNamespace), currentHashCode, theNamespace, ((this.namespace!= null)&&(!this.namespace.isEmpty())));
        }
        {
            String theProcessContents;
            theProcessContents = this.getProcessContents();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processContents", theProcessContents), currentHashCode, theProcessContents, (this.processContents!= null));
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
        if (draftCopy instanceof Wildcard) {
            final Wildcard copy = ((Wildcard) draftCopy);
            {
                Boolean namespaceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.namespace!= null)&&(!this.namespace.isEmpty())));
                if (namespaceShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<String> sourceNamespace;
                    sourceNamespace = (((this.namespace!= null)&&(!this.namespace.isEmpty()))?this.getNamespace():null);
                    @SuppressWarnings("unchecked")
                    List<String> copyNamespace = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "namespace", sourceNamespace), sourceNamespace, ((this.namespace!= null)&&(!this.namespace.isEmpty()))));
                    copy.namespace = null;
                    if (copyNamespace!= null) {
                        List<String> uniqueNamespacel = copy.getNamespace();
                        uniqueNamespacel.addAll(copyNamespace);
                    }
                } else {
                    if (namespaceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.namespace = null;
                    }
                }
            }
            {
                Boolean processContentsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.processContents!= null));
                if (processContentsShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceProcessContents;
                    sourceProcessContents = this.getProcessContents();
                    String copyProcessContents = ((String) strategy.copy(LocatorUtils.property(locator, "processContents", sourceProcessContents), sourceProcessContents, (this.processContents!= null)));
                    copy.setProcessContents(copyProcessContents);
                } else {
                    if (processContentsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.processContents = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Wildcard();
    }

}

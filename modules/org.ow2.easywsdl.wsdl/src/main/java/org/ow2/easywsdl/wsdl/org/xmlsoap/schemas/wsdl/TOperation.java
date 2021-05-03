//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.03 à 03:26:13 PM CEST 
//


package org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
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
 * <p>Classe Java pour tOperation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="tOperation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.xmlsoap.org/wsdl/}tExtensibleDocumented"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;group ref="{http://schemas.xmlsoap.org/wsdl/}request-response-or-one-way-operation"/&gt;
 *           &lt;group ref="{http://schemas.xmlsoap.org/wsdl/}solicit-response-or-notification-operation"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *       &lt;attribute name="parameterOrder" type="{http://www.w3.org/2001/XMLSchema}NMTOKENS" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tOperation", propOrder = {
    "rest"
})
public class TOperation
    extends TExtensibleDocumented
    implements Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    @XmlElementRefs({
        @XmlElementRef(name = "input", namespace = "http://schemas.xmlsoap.org/wsdl/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "output", namespace = "http://schemas.xmlsoap.org/wsdl/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fault", namespace = "http://schemas.xmlsoap.org/wsdl/", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends TExtensibleAttributesDocumented>> rest;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(name = "parameterOrder")
    @XmlSchemaType(name = "NMTOKENS")
    protected List<String> parameterOrder;

    /**
     * Obtient le reste du modèle de contenu. 
     * 
     * <p>
     * Vous obtenez la propriété "catch-all" pour la raison suivante : 
     * Le nom de champ "Output" est utilisé par deux parties différentes d'un schéma. Reportez-vous à : 
     * ligne 202 sur file:/home/sleroy/git/easywsdl/modules/org.ow2.easywsdl.wsdl/src/main/resources/schema/wsdl/wsdl11/wsdl11.xsd
     * ligne 194 sur file:/home/sleroy/git/easywsdl/modules/org.ow2.easywsdl.wsdl/src/main/resources/schema/wsdl/wsdl11/wsdl11.xsd
     * <p>
     * Pour vous débarrasser de cette propriété, appliquez une personnalisation de propriété à l'une 
     * des deux déclarations suivantes afin de modifier leurs noms : 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TParam }{@code >}
     * {@link JAXBElement }{@code <}{@link TParam }{@code >}
     * {@link JAXBElement }{@code <}{@link TFault }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends TExtensibleAttributesDocumented>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<? extends TExtensibleAttributesDocumented>>();
        }
        return this.rest;
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
     * Gets the value of the parameterOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameterOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameterOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getParameterOrder() {
        if (parameterOrder == null) {
            parameterOrder = new ArrayList<String>();
        }
        return this.parameterOrder;
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
            List<JAXBElement<? extends TExtensibleAttributesDocumented>> theRest;
            theRest = (((this.rest!= null)&&(!this.rest.isEmpty()))?this.getRest():null);
            strategy.appendField(locator, this, "rest", buffer, theRest, ((this.rest!= null)&&(!this.rest.isEmpty())));
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            List<String> theParameterOrder;
            theParameterOrder = (((this.parameterOrder!= null)&&(!this.parameterOrder.isEmpty()))?this.getParameterOrder():null);
            strategy.appendField(locator, this, "parameterOrder", buffer, theParameterOrder, ((this.parameterOrder!= null)&&(!this.parameterOrder.isEmpty())));
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
        final TOperation that = ((TOperation) object);
        {
            List<JAXBElement<? extends TExtensibleAttributesDocumented>> lhsRest;
            lhsRest = (((this.rest!= null)&&(!this.rest.isEmpty()))?this.getRest():null);
            List<JAXBElement<? extends TExtensibleAttributesDocumented>> rhsRest;
            rhsRest = (((that.rest!= null)&&(!that.rest.isEmpty()))?that.getRest():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rest", lhsRest), LocatorUtils.property(thatLocator, "rest", rhsRest), lhsRest, rhsRest, ((this.rest!= null)&&(!this.rest.isEmpty())), ((that.rest!= null)&&(!that.rest.isEmpty())))) {
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
            List<String> lhsParameterOrder;
            lhsParameterOrder = (((this.parameterOrder!= null)&&(!this.parameterOrder.isEmpty()))?this.getParameterOrder():null);
            List<String> rhsParameterOrder;
            rhsParameterOrder = (((that.parameterOrder!= null)&&(!that.parameterOrder.isEmpty()))?that.getParameterOrder():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parameterOrder", lhsParameterOrder), LocatorUtils.property(thatLocator, "parameterOrder", rhsParameterOrder), lhsParameterOrder, rhsParameterOrder, ((this.parameterOrder!= null)&&(!this.parameterOrder.isEmpty())), ((that.parameterOrder!= null)&&(!that.parameterOrder.isEmpty())))) {
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
            List<JAXBElement<? extends TExtensibleAttributesDocumented>> theRest;
            theRest = (((this.rest!= null)&&(!this.rest.isEmpty()))?this.getRest():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rest", theRest), currentHashCode, theRest, ((this.rest!= null)&&(!this.rest.isEmpty())));
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            List<String> theParameterOrder;
            theParameterOrder = (((this.parameterOrder!= null)&&(!this.parameterOrder.isEmpty()))?this.getParameterOrder():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parameterOrder", theParameterOrder), currentHashCode, theParameterOrder, ((this.parameterOrder!= null)&&(!this.parameterOrder.isEmpty())));
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
        if (draftCopy instanceof TOperation) {
            final TOperation copy = ((TOperation) draftCopy);
            {
                Boolean restShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.rest!= null)&&(!this.rest.isEmpty())));
                if (restShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<JAXBElement<? extends TExtensibleAttributesDocumented>> sourceRest;
                    sourceRest = (((this.rest!= null)&&(!this.rest.isEmpty()))?this.getRest():null);
                    @SuppressWarnings("unchecked")
                    List<JAXBElement<? extends TExtensibleAttributesDocumented>> copyRest = ((List<JAXBElement<? extends TExtensibleAttributesDocumented>> ) strategy.copy(LocatorUtils.property(locator, "rest", sourceRest), sourceRest, ((this.rest!= null)&&(!this.rest.isEmpty()))));
                    copy.rest = null;
                    if (copyRest!= null) {
                        List<JAXBElement<? extends TExtensibleAttributesDocumented>> uniqueRestl = copy.getRest();
                        uniqueRestl.addAll(copyRest);
                    }
                } else {
                    if (restShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.rest = null;
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
                Boolean parameterOrderShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.parameterOrder!= null)&&(!this.parameterOrder.isEmpty())));
                if (parameterOrderShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<String> sourceParameterOrder;
                    sourceParameterOrder = (((this.parameterOrder!= null)&&(!this.parameterOrder.isEmpty()))?this.getParameterOrder():null);
                    @SuppressWarnings("unchecked")
                    List<String> copyParameterOrder = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "parameterOrder", sourceParameterOrder), sourceParameterOrder, ((this.parameterOrder!= null)&&(!this.parameterOrder.isEmpty()))));
                    copy.parameterOrder = null;
                    if (copyParameterOrder!= null) {
                        List<String> uniqueParameterOrderl = copy.getParameterOrder();
                        uniqueParameterOrderl.addAll(copyParameterOrder);
                    }
                } else {
                    if (parameterOrderShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.parameterOrder = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TOperation();
    }

}

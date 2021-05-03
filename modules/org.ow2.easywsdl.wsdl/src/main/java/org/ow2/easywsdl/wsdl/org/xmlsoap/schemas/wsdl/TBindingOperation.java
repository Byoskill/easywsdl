//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.03 à 03:26:13 PM CEST 
//


package org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 * <p>Classe Java pour tBindingOperation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="tBindingOperation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.xmlsoap.org/wsdl/}tExtensibleDocumented"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="input" type="{http://schemas.xmlsoap.org/wsdl/}tBindingOperationMessage" minOccurs="0"/&gt;
 *         &lt;element name="output" type="{http://schemas.xmlsoap.org/wsdl/}tBindingOperationMessage" minOccurs="0"/&gt;
 *         &lt;element name="fault" type="{http://schemas.xmlsoap.org/wsdl/}tBindingOperationFault" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tBindingOperation", propOrder = {
    "input",
    "output",
    "fault"
})
public class TBindingOperation
    extends TExtensibleDocumented
    implements Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    protected TBindingOperationMessage input;
    protected TBindingOperationMessage output;
    protected List<TBindingOperationFault> fault;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;

    /**
     * Obtient la valeur de la propriété input.
     * 
     * @return
     *     possible object is
     *     {@link TBindingOperationMessage }
     *     
     */
    public TBindingOperationMessage getInput() {
        return input;
    }

    /**
     * Définit la valeur de la propriété input.
     * 
     * @param value
     *     allowed object is
     *     {@link TBindingOperationMessage }
     *     
     */
    public void setInput(TBindingOperationMessage value) {
        this.input = value;
    }

    /**
     * Obtient la valeur de la propriété output.
     * 
     * @return
     *     possible object is
     *     {@link TBindingOperationMessage }
     *     
     */
    public TBindingOperationMessage getOutput() {
        return output;
    }

    /**
     * Définit la valeur de la propriété output.
     * 
     * @param value
     *     allowed object is
     *     {@link TBindingOperationMessage }
     *     
     */
    public void setOutput(TBindingOperationMessage value) {
        this.output = value;
    }

    /**
     * Gets the value of the fault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TBindingOperationFault }
     * 
     * 
     */
    public List<TBindingOperationFault> getFault() {
        if (fault == null) {
            fault = new ArrayList<TBindingOperationFault>();
        }
        return this.fault;
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
            TBindingOperationMessage theInput;
            theInput = this.getInput();
            strategy.appendField(locator, this, "input", buffer, theInput, (this.input!= null));
        }
        {
            TBindingOperationMessage theOutput;
            theOutput = this.getOutput();
            strategy.appendField(locator, this, "output", buffer, theOutput, (this.output!= null));
        }
        {
            List<TBindingOperationFault> theFault;
            theFault = (((this.fault!= null)&&(!this.fault.isEmpty()))?this.getFault():null);
            strategy.appendField(locator, this, "fault", buffer, theFault, ((this.fault!= null)&&(!this.fault.isEmpty())));
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
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
        final TBindingOperation that = ((TBindingOperation) object);
        {
            TBindingOperationMessage lhsInput;
            lhsInput = this.getInput();
            TBindingOperationMessage rhsInput;
            rhsInput = that.getInput();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "input", lhsInput), LocatorUtils.property(thatLocator, "input", rhsInput), lhsInput, rhsInput, (this.input!= null), (that.input!= null))) {
                return false;
            }
        }
        {
            TBindingOperationMessage lhsOutput;
            lhsOutput = this.getOutput();
            TBindingOperationMessage rhsOutput;
            rhsOutput = that.getOutput();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "output", lhsOutput), LocatorUtils.property(thatLocator, "output", rhsOutput), lhsOutput, rhsOutput, (this.output!= null), (that.output!= null))) {
                return false;
            }
        }
        {
            List<TBindingOperationFault> lhsFault;
            lhsFault = (((this.fault!= null)&&(!this.fault.isEmpty()))?this.getFault():null);
            List<TBindingOperationFault> rhsFault;
            rhsFault = (((that.fault!= null)&&(!that.fault.isEmpty()))?that.getFault():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fault", lhsFault), LocatorUtils.property(thatLocator, "fault", rhsFault), lhsFault, rhsFault, ((this.fault!= null)&&(!this.fault.isEmpty())), ((that.fault!= null)&&(!that.fault.isEmpty())))) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            TBindingOperationMessage theInput;
            theInput = this.getInput();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "input", theInput), currentHashCode, theInput, (this.input!= null));
        }
        {
            TBindingOperationMessage theOutput;
            theOutput = this.getOutput();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "output", theOutput), currentHashCode, theOutput, (this.output!= null));
        }
        {
            List<TBindingOperationFault> theFault;
            theFault = (((this.fault!= null)&&(!this.fault.isEmpty()))?this.getFault():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fault", theFault), currentHashCode, theFault, ((this.fault!= null)&&(!this.fault.isEmpty())));
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
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
        if (draftCopy instanceof TBindingOperation) {
            final TBindingOperation copy = ((TBindingOperation) draftCopy);
            {
                Boolean inputShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.input!= null));
                if (inputShouldBeCopiedAndSet == Boolean.TRUE) {
                    TBindingOperationMessage sourceInput;
                    sourceInput = this.getInput();
                    TBindingOperationMessage copyInput = ((TBindingOperationMessage) strategy.copy(LocatorUtils.property(locator, "input", sourceInput), sourceInput, (this.input!= null)));
                    copy.setInput(copyInput);
                } else {
                    if (inputShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.input = null;
                    }
                }
            }
            {
                Boolean outputShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.output!= null));
                if (outputShouldBeCopiedAndSet == Boolean.TRUE) {
                    TBindingOperationMessage sourceOutput;
                    sourceOutput = this.getOutput();
                    TBindingOperationMessage copyOutput = ((TBindingOperationMessage) strategy.copy(LocatorUtils.property(locator, "output", sourceOutput), sourceOutput, (this.output!= null)));
                    copy.setOutput(copyOutput);
                } else {
                    if (outputShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.output = null;
                    }
                }
            }
            {
                Boolean faultShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.fault!= null)&&(!this.fault.isEmpty())));
                if (faultShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<TBindingOperationFault> sourceFault;
                    sourceFault = (((this.fault!= null)&&(!this.fault.isEmpty()))?this.getFault():null);
                    @SuppressWarnings("unchecked")
                    List<TBindingOperationFault> copyFault = ((List<TBindingOperationFault> ) strategy.copy(LocatorUtils.property(locator, "fault", sourceFault), sourceFault, ((this.fault!= null)&&(!this.fault.isEmpty()))));
                    copy.fault = null;
                    if (copyFault!= null) {
                        List<TBindingOperationFault> uniqueFaultl = copy.getFault();
                        uniqueFaultl.addAll(copyFault);
                    }
                } else {
                    if (faultShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fault = null;
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
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TBindingOperation();
    }

}

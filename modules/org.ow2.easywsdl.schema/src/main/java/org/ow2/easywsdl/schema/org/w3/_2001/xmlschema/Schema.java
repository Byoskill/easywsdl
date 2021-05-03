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
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{http://www.w3.org/2001/XMLSchema}include"/&gt;
 *           &lt;element ref="{http://www.w3.org/2001/XMLSchema}import"/&gt;
 *           &lt;element ref="{http://www.w3.org/2001/XMLSchema}redefine"/&gt;
 *           &lt;element ref="{http://www.w3.org/2001/XMLSchema}annotation"/&gt;
 *         &lt;/choice&gt;
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;group ref="{http://www.w3.org/2001/XMLSchema}schemaTop"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="targetNamespace" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *       &lt;attribute name="finalDefault" type="{http://www.w3.org/2001/XMLSchema}fullDerivationSet" default="" /&gt;
 *       &lt;attribute name="blockDefault" type="{http://www.w3.org/2001/XMLSchema}blockSet" default="" /&gt;
 *       &lt;attribute name="attributeFormDefault" type="{http://www.w3.org/2001/XMLSchema}formChoice" default="unqualified" /&gt;
 *       &lt;attribute name="elementFormDefault" type="{http://www.w3.org/2001/XMLSchema}formChoice" default="unqualified" /&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/&gt;
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
    "includeOrImportOrRedefine",
    "simpleTypeOrComplexTypeOrGroup"
})
@XmlRootElement(name = "schema")
public class Schema
    extends OpenAttrs
    implements Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    @XmlElements({
        @XmlElement(name = "include", type = Include.class),
        @XmlElement(name = "import", type = Import.class),
        @XmlElement(name = "redefine", type = Redefine.class),
        @XmlElement(name = "annotation", type = Annotation.class)
    })
    protected List<OpenAttrs> includeOrImportOrRedefine;
    @XmlElements({
        @XmlElement(name = "simpleType", type = TopLevelSimpleType.class),
        @XmlElement(name = "complexType", type = TopLevelComplexType.class),
        @XmlElement(name = "group", type = NamedGroup.class),
        @XmlElement(name = "attributeGroup", type = NamedAttributeGroup.class),
        @XmlElement(name = "element", type = TopLevelElement.class),
        @XmlElement(name = "attribute", type = TopLevelAttribute.class),
        @XmlElement(name = "notation", type = Notation.class)
    })
    protected List<Annotated> simpleTypeOrComplexTypeOrGroup;
    @XmlAttribute(name = "targetNamespace")
    @XmlSchemaType(name = "anyURI")
    protected String targetNamespace;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String version;
    @XmlAttribute(name = "finalDefault")
    @XmlSchemaType(name = "fullDerivationSet")
    protected List<String> finalDefault;
    @XmlAttribute(name = "blockDefault")
    @XmlSchemaType(name = "blockSet")
    protected List<String> blockDefault;
    @XmlAttribute(name = "attributeFormDefault")
    protected FormChoice attributeFormDefault;
    @XmlAttribute(name = "elementFormDefault")
    protected FormChoice elementFormDefault;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;

    /**
     * Gets the value of the includeOrImportOrRedefine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includeOrImportOrRedefine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludeOrImportOrRedefine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Include }
     * {@link Import }
     * {@link Redefine }
     * {@link Annotation }
     * 
     * 
     */
    public List<OpenAttrs> getIncludeOrImportOrRedefine() {
        if (includeOrImportOrRedefine == null) {
            includeOrImportOrRedefine = new ArrayList<OpenAttrs>();
        }
        return this.includeOrImportOrRedefine;
    }

    /**
     * Gets the value of the simpleTypeOrComplexTypeOrGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simpleTypeOrComplexTypeOrGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimpleTypeOrComplexTypeOrGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopLevelSimpleType }
     * {@link TopLevelComplexType }
     * {@link NamedGroup }
     * {@link NamedAttributeGroup }
     * {@link TopLevelElement }
     * {@link TopLevelAttribute }
     * {@link Notation }
     * 
     * 
     */
    public List<Annotated> getSimpleTypeOrComplexTypeOrGroup() {
        if (simpleTypeOrComplexTypeOrGroup == null) {
            simpleTypeOrComplexTypeOrGroup = new ArrayList<Annotated>();
        }
        return this.simpleTypeOrComplexTypeOrGroup;
    }

    /**
     * Obtient la valeur de la propriété targetNamespace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetNamespace() {
        return targetNamespace;
    }

    /**
     * Définit la valeur de la propriété targetNamespace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetNamespace(String value) {
        this.targetNamespace = value;
    }

    /**
     * Obtient la valeur de la propriété version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Définit la valeur de la propriété version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the finalDefault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finalDefault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinalDefault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFinalDefault() {
        if (finalDefault == null) {
            finalDefault = new ArrayList<String>();
        }
        return this.finalDefault;
    }

    /**
     * Gets the value of the blockDefault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blockDefault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlockDefault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBlockDefault() {
        if (blockDefault == null) {
            blockDefault = new ArrayList<String>();
        }
        return this.blockDefault;
    }

    /**
     * Obtient la valeur de la propriété attributeFormDefault.
     * 
     * @return
     *     possible object is
     *     {@link FormChoice }
     *     
     */
    public FormChoice getAttributeFormDefault() {
        if (attributeFormDefault == null) {
            return FormChoice.UNQUALIFIED;
        } else {
            return attributeFormDefault;
        }
    }

    /**
     * Définit la valeur de la propriété attributeFormDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link FormChoice }
     *     
     */
    public void setAttributeFormDefault(FormChoice value) {
        this.attributeFormDefault = value;
    }

    /**
     * Obtient la valeur de la propriété elementFormDefault.
     * 
     * @return
     *     possible object is
     *     {@link FormChoice }
     *     
     */
    public FormChoice getElementFormDefault() {
        if (elementFormDefault == null) {
            return FormChoice.UNQUALIFIED;
        } else {
            return elementFormDefault;
        }
    }

    /**
     * Définit la valeur de la propriété elementFormDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link FormChoice }
     *     
     */
    public void setElementFormDefault(FormChoice value) {
        this.elementFormDefault = value;
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

    /**
     * Obtient la valeur de la propriété lang.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Définit la valeur de la propriété lang.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
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
            List<OpenAttrs> theIncludeOrImportOrRedefine;
            theIncludeOrImportOrRedefine = (((this.includeOrImportOrRedefine!= null)&&(!this.includeOrImportOrRedefine.isEmpty()))?this.getIncludeOrImportOrRedefine():null);
            strategy.appendField(locator, this, "includeOrImportOrRedefine", buffer, theIncludeOrImportOrRedefine, ((this.includeOrImportOrRedefine!= null)&&(!this.includeOrImportOrRedefine.isEmpty())));
        }
        {
            List<Annotated> theSimpleTypeOrComplexTypeOrGroup;
            theSimpleTypeOrComplexTypeOrGroup = (((this.simpleTypeOrComplexTypeOrGroup!= null)&&(!this.simpleTypeOrComplexTypeOrGroup.isEmpty()))?this.getSimpleTypeOrComplexTypeOrGroup():null);
            strategy.appendField(locator, this, "simpleTypeOrComplexTypeOrGroup", buffer, theSimpleTypeOrComplexTypeOrGroup, ((this.simpleTypeOrComplexTypeOrGroup!= null)&&(!this.simpleTypeOrComplexTypeOrGroup.isEmpty())));
        }
        {
            String theTargetNamespace;
            theTargetNamespace = this.getTargetNamespace();
            strategy.appendField(locator, this, "targetNamespace", buffer, theTargetNamespace, (this.targetNamespace!= null));
        }
        {
            String theVersion;
            theVersion = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theVersion, (this.version!= null));
        }
        {
            List<String> theFinalDefault;
            theFinalDefault = (((this.finalDefault!= null)&&(!this.finalDefault.isEmpty()))?this.getFinalDefault():null);
            strategy.appendField(locator, this, "finalDefault", buffer, theFinalDefault, ((this.finalDefault!= null)&&(!this.finalDefault.isEmpty())));
        }
        {
            List<String> theBlockDefault;
            theBlockDefault = (((this.blockDefault!= null)&&(!this.blockDefault.isEmpty()))?this.getBlockDefault():null);
            strategy.appendField(locator, this, "blockDefault", buffer, theBlockDefault, ((this.blockDefault!= null)&&(!this.blockDefault.isEmpty())));
        }
        {
            FormChoice theAttributeFormDefault;
            theAttributeFormDefault = this.getAttributeFormDefault();
            strategy.appendField(locator, this, "attributeFormDefault", buffer, theAttributeFormDefault, (this.attributeFormDefault!= null));
        }
        {
            FormChoice theElementFormDefault;
            theElementFormDefault = this.getElementFormDefault();
            strategy.appendField(locator, this, "elementFormDefault", buffer, theElementFormDefault, (this.elementFormDefault!= null));
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
        }
        {
            String theLang;
            theLang = this.getLang();
            strategy.appendField(locator, this, "lang", buffer, theLang, (this.lang!= null));
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
        final Schema that = ((Schema) object);
        {
            List<OpenAttrs> lhsIncludeOrImportOrRedefine;
            lhsIncludeOrImportOrRedefine = (((this.includeOrImportOrRedefine!= null)&&(!this.includeOrImportOrRedefine.isEmpty()))?this.getIncludeOrImportOrRedefine():null);
            List<OpenAttrs> rhsIncludeOrImportOrRedefine;
            rhsIncludeOrImportOrRedefine = (((that.includeOrImportOrRedefine!= null)&&(!that.includeOrImportOrRedefine.isEmpty()))?that.getIncludeOrImportOrRedefine():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "includeOrImportOrRedefine", lhsIncludeOrImportOrRedefine), LocatorUtils.property(thatLocator, "includeOrImportOrRedefine", rhsIncludeOrImportOrRedefine), lhsIncludeOrImportOrRedefine, rhsIncludeOrImportOrRedefine, ((this.includeOrImportOrRedefine!= null)&&(!this.includeOrImportOrRedefine.isEmpty())), ((that.includeOrImportOrRedefine!= null)&&(!that.includeOrImportOrRedefine.isEmpty())))) {
                return false;
            }
        }
        {
            List<Annotated> lhsSimpleTypeOrComplexTypeOrGroup;
            lhsSimpleTypeOrComplexTypeOrGroup = (((this.simpleTypeOrComplexTypeOrGroup!= null)&&(!this.simpleTypeOrComplexTypeOrGroup.isEmpty()))?this.getSimpleTypeOrComplexTypeOrGroup():null);
            List<Annotated> rhsSimpleTypeOrComplexTypeOrGroup;
            rhsSimpleTypeOrComplexTypeOrGroup = (((that.simpleTypeOrComplexTypeOrGroup!= null)&&(!that.simpleTypeOrComplexTypeOrGroup.isEmpty()))?that.getSimpleTypeOrComplexTypeOrGroup():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "simpleTypeOrComplexTypeOrGroup", lhsSimpleTypeOrComplexTypeOrGroup), LocatorUtils.property(thatLocator, "simpleTypeOrComplexTypeOrGroup", rhsSimpleTypeOrComplexTypeOrGroup), lhsSimpleTypeOrComplexTypeOrGroup, rhsSimpleTypeOrComplexTypeOrGroup, ((this.simpleTypeOrComplexTypeOrGroup!= null)&&(!this.simpleTypeOrComplexTypeOrGroup.isEmpty())), ((that.simpleTypeOrComplexTypeOrGroup!= null)&&(!that.simpleTypeOrComplexTypeOrGroup.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsTargetNamespace;
            lhsTargetNamespace = this.getTargetNamespace();
            String rhsTargetNamespace;
            rhsTargetNamespace = that.getTargetNamespace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "targetNamespace", lhsTargetNamespace), LocatorUtils.property(thatLocator, "targetNamespace", rhsTargetNamespace), lhsTargetNamespace, rhsTargetNamespace, (this.targetNamespace!= null), (that.targetNamespace!= null))) {
                return false;
            }
        }
        {
            String lhsVersion;
            lhsVersion = this.getVersion();
            String rhsVersion;
            rhsVersion = that.getVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVersion), LocatorUtils.property(thatLocator, "version", rhsVersion), lhsVersion, rhsVersion, (this.version!= null), (that.version!= null))) {
                return false;
            }
        }
        {
            List<String> lhsFinalDefault;
            lhsFinalDefault = (((this.finalDefault!= null)&&(!this.finalDefault.isEmpty()))?this.getFinalDefault():null);
            List<String> rhsFinalDefault;
            rhsFinalDefault = (((that.finalDefault!= null)&&(!that.finalDefault.isEmpty()))?that.getFinalDefault():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "finalDefault", lhsFinalDefault), LocatorUtils.property(thatLocator, "finalDefault", rhsFinalDefault), lhsFinalDefault, rhsFinalDefault, ((this.finalDefault!= null)&&(!this.finalDefault.isEmpty())), ((that.finalDefault!= null)&&(!that.finalDefault.isEmpty())))) {
                return false;
            }
        }
        {
            List<String> lhsBlockDefault;
            lhsBlockDefault = (((this.blockDefault!= null)&&(!this.blockDefault.isEmpty()))?this.getBlockDefault():null);
            List<String> rhsBlockDefault;
            rhsBlockDefault = (((that.blockDefault!= null)&&(!that.blockDefault.isEmpty()))?that.getBlockDefault():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "blockDefault", lhsBlockDefault), LocatorUtils.property(thatLocator, "blockDefault", rhsBlockDefault), lhsBlockDefault, rhsBlockDefault, ((this.blockDefault!= null)&&(!this.blockDefault.isEmpty())), ((that.blockDefault!= null)&&(!that.blockDefault.isEmpty())))) {
                return false;
            }
        }
        {
            FormChoice lhsAttributeFormDefault;
            lhsAttributeFormDefault = this.getAttributeFormDefault();
            FormChoice rhsAttributeFormDefault;
            rhsAttributeFormDefault = that.getAttributeFormDefault();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attributeFormDefault", lhsAttributeFormDefault), LocatorUtils.property(thatLocator, "attributeFormDefault", rhsAttributeFormDefault), lhsAttributeFormDefault, rhsAttributeFormDefault, (this.attributeFormDefault!= null), (that.attributeFormDefault!= null))) {
                return false;
            }
        }
        {
            FormChoice lhsElementFormDefault;
            lhsElementFormDefault = this.getElementFormDefault();
            FormChoice rhsElementFormDefault;
            rhsElementFormDefault = that.getElementFormDefault();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "elementFormDefault", lhsElementFormDefault), LocatorUtils.property(thatLocator, "elementFormDefault", rhsElementFormDefault), lhsElementFormDefault, rhsElementFormDefault, (this.elementFormDefault!= null), (that.elementFormDefault!= null))) {
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
        {
            String lhsLang;
            lhsLang = this.getLang();
            String rhsLang;
            rhsLang = that.getLang();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lang", lhsLang), LocatorUtils.property(thatLocator, "lang", rhsLang), lhsLang, rhsLang, (this.lang!= null), (that.lang!= null))) {
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
            List<OpenAttrs> theIncludeOrImportOrRedefine;
            theIncludeOrImportOrRedefine = (((this.includeOrImportOrRedefine!= null)&&(!this.includeOrImportOrRedefine.isEmpty()))?this.getIncludeOrImportOrRedefine():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "includeOrImportOrRedefine", theIncludeOrImportOrRedefine), currentHashCode, theIncludeOrImportOrRedefine, ((this.includeOrImportOrRedefine!= null)&&(!this.includeOrImportOrRedefine.isEmpty())));
        }
        {
            List<Annotated> theSimpleTypeOrComplexTypeOrGroup;
            theSimpleTypeOrComplexTypeOrGroup = (((this.simpleTypeOrComplexTypeOrGroup!= null)&&(!this.simpleTypeOrComplexTypeOrGroup.isEmpty()))?this.getSimpleTypeOrComplexTypeOrGroup():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "simpleTypeOrComplexTypeOrGroup", theSimpleTypeOrComplexTypeOrGroup), currentHashCode, theSimpleTypeOrComplexTypeOrGroup, ((this.simpleTypeOrComplexTypeOrGroup!= null)&&(!this.simpleTypeOrComplexTypeOrGroup.isEmpty())));
        }
        {
            String theTargetNamespace;
            theTargetNamespace = this.getTargetNamespace();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "targetNamespace", theTargetNamespace), currentHashCode, theTargetNamespace, (this.targetNamespace!= null));
        }
        {
            String theVersion;
            theVersion = this.getVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "version", theVersion), currentHashCode, theVersion, (this.version!= null));
        }
        {
            List<String> theFinalDefault;
            theFinalDefault = (((this.finalDefault!= null)&&(!this.finalDefault.isEmpty()))?this.getFinalDefault():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "finalDefault", theFinalDefault), currentHashCode, theFinalDefault, ((this.finalDefault!= null)&&(!this.finalDefault.isEmpty())));
        }
        {
            List<String> theBlockDefault;
            theBlockDefault = (((this.blockDefault!= null)&&(!this.blockDefault.isEmpty()))?this.getBlockDefault():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "blockDefault", theBlockDefault), currentHashCode, theBlockDefault, ((this.blockDefault!= null)&&(!this.blockDefault.isEmpty())));
        }
        {
            FormChoice theAttributeFormDefault;
            theAttributeFormDefault = this.getAttributeFormDefault();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attributeFormDefault", theAttributeFormDefault), currentHashCode, theAttributeFormDefault, (this.attributeFormDefault!= null));
        }
        {
            FormChoice theElementFormDefault;
            theElementFormDefault = this.getElementFormDefault();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "elementFormDefault", theElementFormDefault), currentHashCode, theElementFormDefault, (this.elementFormDefault!= null));
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId, (this.id!= null));
        }
        {
            String theLang;
            theLang = this.getLang();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lang", theLang), currentHashCode, theLang, (this.lang!= null));
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
        if (draftCopy instanceof Schema) {
            final Schema copy = ((Schema) draftCopy);
            {
                Boolean includeOrImportOrRedefineShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.includeOrImportOrRedefine!= null)&&(!this.includeOrImportOrRedefine.isEmpty())));
                if (includeOrImportOrRedefineShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<OpenAttrs> sourceIncludeOrImportOrRedefine;
                    sourceIncludeOrImportOrRedefine = (((this.includeOrImportOrRedefine!= null)&&(!this.includeOrImportOrRedefine.isEmpty()))?this.getIncludeOrImportOrRedefine():null);
                    @SuppressWarnings("unchecked")
                    List<OpenAttrs> copyIncludeOrImportOrRedefine = ((List<OpenAttrs> ) strategy.copy(LocatorUtils.property(locator, "includeOrImportOrRedefine", sourceIncludeOrImportOrRedefine), sourceIncludeOrImportOrRedefine, ((this.includeOrImportOrRedefine!= null)&&(!this.includeOrImportOrRedefine.isEmpty()))));
                    copy.includeOrImportOrRedefine = null;
                    if (copyIncludeOrImportOrRedefine!= null) {
                        List<OpenAttrs> uniqueIncludeOrImportOrRedefinel = copy.getIncludeOrImportOrRedefine();
                        uniqueIncludeOrImportOrRedefinel.addAll(copyIncludeOrImportOrRedefine);
                    }
                } else {
                    if (includeOrImportOrRedefineShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.includeOrImportOrRedefine = null;
                    }
                }
            }
            {
                Boolean simpleTypeOrComplexTypeOrGroupShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.simpleTypeOrComplexTypeOrGroup!= null)&&(!this.simpleTypeOrComplexTypeOrGroup.isEmpty())));
                if (simpleTypeOrComplexTypeOrGroupShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Annotated> sourceSimpleTypeOrComplexTypeOrGroup;
                    sourceSimpleTypeOrComplexTypeOrGroup = (((this.simpleTypeOrComplexTypeOrGroup!= null)&&(!this.simpleTypeOrComplexTypeOrGroup.isEmpty()))?this.getSimpleTypeOrComplexTypeOrGroup():null);
                    @SuppressWarnings("unchecked")
                    List<Annotated> copySimpleTypeOrComplexTypeOrGroup = ((List<Annotated> ) strategy.copy(LocatorUtils.property(locator, "simpleTypeOrComplexTypeOrGroup", sourceSimpleTypeOrComplexTypeOrGroup), sourceSimpleTypeOrComplexTypeOrGroup, ((this.simpleTypeOrComplexTypeOrGroup!= null)&&(!this.simpleTypeOrComplexTypeOrGroup.isEmpty()))));
                    copy.simpleTypeOrComplexTypeOrGroup = null;
                    if (copySimpleTypeOrComplexTypeOrGroup!= null) {
                        List<Annotated> uniqueSimpleTypeOrComplexTypeOrGroupl = copy.getSimpleTypeOrComplexTypeOrGroup();
                        uniqueSimpleTypeOrComplexTypeOrGroupl.addAll(copySimpleTypeOrComplexTypeOrGroup);
                    }
                } else {
                    if (simpleTypeOrComplexTypeOrGroupShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.simpleTypeOrComplexTypeOrGroup = null;
                    }
                }
            }
            {
                Boolean targetNamespaceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.targetNamespace!= null));
                if (targetNamespaceShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTargetNamespace;
                    sourceTargetNamespace = this.getTargetNamespace();
                    String copyTargetNamespace = ((String) strategy.copy(LocatorUtils.property(locator, "targetNamespace", sourceTargetNamespace), sourceTargetNamespace, (this.targetNamespace!= null)));
                    copy.setTargetNamespace(copyTargetNamespace);
                } else {
                    if (targetNamespaceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.targetNamespace = null;
                    }
                }
            }
            {
                Boolean versionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.version!= null));
                if (versionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVersion;
                    sourceVersion = this.getVersion();
                    String copyVersion = ((String) strategy.copy(LocatorUtils.property(locator, "version", sourceVersion), sourceVersion, (this.version!= null)));
                    copy.setVersion(copyVersion);
                } else {
                    if (versionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.version = null;
                    }
                }
            }
            {
                Boolean finalDefaultShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.finalDefault!= null)&&(!this.finalDefault.isEmpty())));
                if (finalDefaultShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<String> sourceFinalDefault;
                    sourceFinalDefault = (((this.finalDefault!= null)&&(!this.finalDefault.isEmpty()))?this.getFinalDefault():null);
                    @SuppressWarnings("unchecked")
                    List<String> copyFinalDefault = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "finalDefault", sourceFinalDefault), sourceFinalDefault, ((this.finalDefault!= null)&&(!this.finalDefault.isEmpty()))));
                    copy.finalDefault = null;
                    if (copyFinalDefault!= null) {
                        List<String> uniqueFinalDefaultl = copy.getFinalDefault();
                        uniqueFinalDefaultl.addAll(copyFinalDefault);
                    }
                } else {
                    if (finalDefaultShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.finalDefault = null;
                    }
                }
            }
            {
                Boolean blockDefaultShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.blockDefault!= null)&&(!this.blockDefault.isEmpty())));
                if (blockDefaultShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<String> sourceBlockDefault;
                    sourceBlockDefault = (((this.blockDefault!= null)&&(!this.blockDefault.isEmpty()))?this.getBlockDefault():null);
                    @SuppressWarnings("unchecked")
                    List<String> copyBlockDefault = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "blockDefault", sourceBlockDefault), sourceBlockDefault, ((this.blockDefault!= null)&&(!this.blockDefault.isEmpty()))));
                    copy.blockDefault = null;
                    if (copyBlockDefault!= null) {
                        List<String> uniqueBlockDefaultl = copy.getBlockDefault();
                        uniqueBlockDefaultl.addAll(copyBlockDefault);
                    }
                } else {
                    if (blockDefaultShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.blockDefault = null;
                    }
                }
            }
            {
                Boolean attributeFormDefaultShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.attributeFormDefault!= null));
                if (attributeFormDefaultShouldBeCopiedAndSet == Boolean.TRUE) {
                    FormChoice sourceAttributeFormDefault;
                    sourceAttributeFormDefault = this.getAttributeFormDefault();
                    FormChoice copyAttributeFormDefault = ((FormChoice) strategy.copy(LocatorUtils.property(locator, "attributeFormDefault", sourceAttributeFormDefault), sourceAttributeFormDefault, (this.attributeFormDefault!= null)));
                    copy.setAttributeFormDefault(copyAttributeFormDefault);
                } else {
                    if (attributeFormDefaultShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.attributeFormDefault = null;
                    }
                }
            }
            {
                Boolean elementFormDefaultShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.elementFormDefault!= null));
                if (elementFormDefaultShouldBeCopiedAndSet == Boolean.TRUE) {
                    FormChoice sourceElementFormDefault;
                    sourceElementFormDefault = this.getElementFormDefault();
                    FormChoice copyElementFormDefault = ((FormChoice) strategy.copy(LocatorUtils.property(locator, "elementFormDefault", sourceElementFormDefault), sourceElementFormDefault, (this.elementFormDefault!= null)));
                    copy.setElementFormDefault(copyElementFormDefault);
                } else {
                    if (elementFormDefaultShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.elementFormDefault = null;
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
            {
                Boolean langShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lang!= null));
                if (langShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLang;
                    sourceLang = this.getLang();
                    String copyLang = ((String) strategy.copy(LocatorUtils.property(locator, "lang", sourceLang), sourceLang, (this.lang!= null)));
                    copy.setLang(copyLang);
                } else {
                    if (langShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lang = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Schema();
    }

}

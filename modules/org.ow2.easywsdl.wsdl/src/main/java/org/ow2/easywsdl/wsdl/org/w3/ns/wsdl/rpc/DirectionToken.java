//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.03 à 03:26:13 PM CEST 
//


package org.ow2.easywsdl.wsdl.org.w3.ns.wsdl.rpc;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour directionToken.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="directionToken"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="#in"/&gt;
 *     &lt;enumeration value="#out"/&gt;
 *     &lt;enumeration value="#inout"/&gt;
 *     &lt;enumeration value="#return"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "directionToken", namespace = "http://www.w3.org/ns/wsdl/rpc")
@XmlEnum
public enum DirectionToken {

    @XmlEnumValue("#in")
    IN("#in"),
    @XmlEnumValue("#out")
    OUT("#out"),
    @XmlEnumValue("#inout")
    INOUT("#inout"),
    @XmlEnumValue("#return")
    RETURN("#return");
    private final String value;

    DirectionToken(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DirectionToken fromValue(String v) {
        for (DirectionToken c: DirectionToken.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

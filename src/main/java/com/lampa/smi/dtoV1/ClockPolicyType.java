
package com.lampa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clock_policyType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="clock_policyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auto_boost" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="auto_boost_default" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clock_policyType", propOrder = {
        "autoBoost",
        "autoBoostDefault"
})
public class ClockPolicyType {

    @XmlElement(name = "auto_boost", required = true)
    protected String autoBoost;
    @XmlElement(name = "auto_boost_default", required = true)
    protected String autoBoostDefault;

    /**
     * Gets the value of the autoBoost property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAutoBoost() {
        return autoBoost;
    }

    /**
     * Sets the value of the autoBoost property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAutoBoost(String value) {
        this.autoBoost = value;
    }

    /**
     * Gets the value of the autoBoostDefault property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAutoBoostDefault() {
        return autoBoostDefault;
    }

    /**
     * Sets the value of the autoBoostDefault property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAutoBoostDefault(String value) {
        this.autoBoostDefault = value;
    }

}

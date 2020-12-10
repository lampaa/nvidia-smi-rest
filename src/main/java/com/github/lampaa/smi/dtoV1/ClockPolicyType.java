
package com.github.lampaa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 *
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

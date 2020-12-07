
package com.lampa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for power_readingsType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="power_readingsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="power_state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="power_management" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="power_draw" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="power_limit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="default_power_limit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enforced_power_limit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="min_power_limit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="max_power_limit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "power_readingsType", propOrder = {
        "powerState",
        "powerManagement",
        "powerDraw",
        "powerLimit",
        "defaultPowerLimit",
        "enforcedPowerLimit",
        "minPowerLimit",
        "maxPowerLimit"
})
public class PowerReadingsType {

    @XmlElement(name = "power_state", required = true)
    protected String powerState;
    @XmlElement(name = "power_management", required = true)
    protected String powerManagement;
    @XmlElement(name = "power_draw", required = true)
    protected String powerDraw;
    @XmlElement(name = "power_limit", required = true)
    protected String powerLimit;
    @XmlElement(name = "default_power_limit", required = true)
    protected String defaultPowerLimit;
    @XmlElement(name = "enforced_power_limit", required = true)
    protected String enforcedPowerLimit;
    @XmlElement(name = "min_power_limit", required = true)
    protected String minPowerLimit;
    @XmlElement(name = "max_power_limit", required = true)
    protected String maxPowerLimit;

    /**
     * Gets the value of the powerState property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPowerState() {
        return powerState;
    }

    /**
     * Sets the value of the powerState property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPowerState(String value) {
        this.powerState = value;
    }

    /**
     * Gets the value of the powerManagement property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPowerManagement() {
        return powerManagement;
    }

    /**
     * Sets the value of the powerManagement property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPowerManagement(String value) {
        this.powerManagement = value;
    }

    /**
     * Gets the value of the powerDraw property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPowerDraw() {
        return powerDraw;
    }

    /**
     * Sets the value of the powerDraw property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPowerDraw(String value) {
        this.powerDraw = value;
    }

    /**
     * Gets the value of the powerLimit property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPowerLimit() {
        return powerLimit;
    }

    /**
     * Sets the value of the powerLimit property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPowerLimit(String value) {
        this.powerLimit = value;
    }

    /**
     * Gets the value of the defaultPowerLimit property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDefaultPowerLimit() {
        return defaultPowerLimit;
    }

    /**
     * Sets the value of the defaultPowerLimit property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDefaultPowerLimit(String value) {
        this.defaultPowerLimit = value;
    }

    /**
     * Gets the value of the enforcedPowerLimit property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEnforcedPowerLimit() {
        return enforcedPowerLimit;
    }

    /**
     * Sets the value of the enforcedPowerLimit property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEnforcedPowerLimit(String value) {
        this.enforcedPowerLimit = value;
    }

    /**
     * Gets the value of the minPowerLimit property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMinPowerLimit() {
        return minPowerLimit;
    }

    /**
     * Sets the value of the minPowerLimit property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMinPowerLimit(String value) {
        this.minPowerLimit = value;
    }

    /**
     * Gets the value of the maxPowerLimit property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMaxPowerLimit() {
        return maxPowerLimit;
    }

    /**
     * Sets the value of the maxPowerLimit property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMaxPowerLimit(String value) {
        this.maxPowerLimit = value;
    }

}

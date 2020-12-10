
package com.github.lampaa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clocks_throttle_reasonsType", propOrder = {
        "clocksThrottleReasonGpuIdle",
        "clocksThrottleReasonApplicationsClocksSetting",
        "clocksThrottleReasonSwPowerCap",
        "clocksThrottleReasonHwSlowdown",
        "clocksThrottleReasonHwThermalSlowdown",
        "clocksThrottleReasonHwPowerBrakeSlowdown",
        "clocksThrottleReasonSyncBoost",
        "clocksThrottleReasonSwThermalSlowdown",
        "clocksThrottleReasonDisplayClocksSetting"
})
public class ClocksThrottleReasonsType {

    @XmlElement(name = "clocks_throttle_reason_gpu_idle", required = true)
    protected String clocksThrottleReasonGpuIdle;
    @XmlElement(name = "clocks_throttle_reason_applications_clocks_setting", required = true)
    protected String clocksThrottleReasonApplicationsClocksSetting;
    @XmlElement(name = "clocks_throttle_reason_sw_power_cap", required = true)
    protected String clocksThrottleReasonSwPowerCap;
    @XmlElement(name = "clocks_throttle_reason_hw_slowdown", required = true)
    protected String clocksThrottleReasonHwSlowdown;
    @XmlElement(name = "clocks_throttle_reason_hw_thermal_slowdown", required = true)
    protected String clocksThrottleReasonHwThermalSlowdown;
    @XmlElement(name = "clocks_throttle_reason_hw_power_brake_slowdown", required = true)
    protected String clocksThrottleReasonHwPowerBrakeSlowdown;
    @XmlElement(name = "clocks_throttle_reason_sync_boost", required = true)
    protected String clocksThrottleReasonSyncBoost;
    @XmlElement(name = "clocks_throttle_reason_sw_thermal_slowdown", required = true)
    protected String clocksThrottleReasonSwThermalSlowdown;
    @XmlElement(name = "clocks_throttle_reason_display_clocks_setting", required = true)
    protected String clocksThrottleReasonDisplayClocksSetting;

    /**
     * Gets the value of the clocksThrottleReasonGpuIdle property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClocksThrottleReasonGpuIdle() {
        return clocksThrottleReasonGpuIdle;
    }

    /**
     * Sets the value of the clocksThrottleReasonGpuIdle property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClocksThrottleReasonGpuIdle(String value) {
        this.clocksThrottleReasonGpuIdle = value;
    }

    /**
     * Gets the value of the clocksThrottleReasonApplicationsClocksSetting property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClocksThrottleReasonApplicationsClocksSetting() {
        return clocksThrottleReasonApplicationsClocksSetting;
    }

    /**
     * Sets the value of the clocksThrottleReasonApplicationsClocksSetting property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClocksThrottleReasonApplicationsClocksSetting(String value) {
        this.clocksThrottleReasonApplicationsClocksSetting = value;
    }

    /**
     * Gets the value of the clocksThrottleReasonSwPowerCap property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClocksThrottleReasonSwPowerCap() {
        return clocksThrottleReasonSwPowerCap;
    }

    /**
     * Sets the value of the clocksThrottleReasonSwPowerCap property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClocksThrottleReasonSwPowerCap(String value) {
        this.clocksThrottleReasonSwPowerCap = value;
    }

    /**
     * Gets the value of the clocksThrottleReasonHwSlowdown property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClocksThrottleReasonHwSlowdown() {
        return clocksThrottleReasonHwSlowdown;
    }

    /**
     * Sets the value of the clocksThrottleReasonHwSlowdown property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClocksThrottleReasonHwSlowdown(String value) {
        this.clocksThrottleReasonHwSlowdown = value;
    }

    /**
     * Gets the value of the clocksThrottleReasonHwThermalSlowdown property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClocksThrottleReasonHwThermalSlowdown() {
        return clocksThrottleReasonHwThermalSlowdown;
    }

    /**
     * Sets the value of the clocksThrottleReasonHwThermalSlowdown property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClocksThrottleReasonHwThermalSlowdown(String value) {
        this.clocksThrottleReasonHwThermalSlowdown = value;
    }

    /**
     * Gets the value of the clocksThrottleReasonHwPowerBrakeSlowdown property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClocksThrottleReasonHwPowerBrakeSlowdown() {
        return clocksThrottleReasonHwPowerBrakeSlowdown;
    }

    /**
     * Sets the value of the clocksThrottleReasonHwPowerBrakeSlowdown property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClocksThrottleReasonHwPowerBrakeSlowdown(String value) {
        this.clocksThrottleReasonHwPowerBrakeSlowdown = value;
    }

    /**
     * Gets the value of the clocksThrottleReasonSyncBoost property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClocksThrottleReasonSyncBoost() {
        return clocksThrottleReasonSyncBoost;
    }

    /**
     * Sets the value of the clocksThrottleReasonSyncBoost property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClocksThrottleReasonSyncBoost(String value) {
        this.clocksThrottleReasonSyncBoost = value;
    }

    /**
     * Gets the value of the clocksThrottleReasonSwThermalSlowdown property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClocksThrottleReasonSwThermalSlowdown() {
        return clocksThrottleReasonSwThermalSlowdown;
    }

    /**
     * Sets the value of the clocksThrottleReasonSwThermalSlowdown property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClocksThrottleReasonSwThermalSlowdown(String value) {
        this.clocksThrottleReasonSwThermalSlowdown = value;
    }

    /**
     * Gets the value of the clocksThrottleReasonDisplayClocksSetting property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClocksThrottleReasonDisplayClocksSetting() {
        return clocksThrottleReasonDisplayClocksSetting;
    }

    /**
     * Sets the value of the clocksThrottleReasonDisplayClocksSetting property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClocksThrottleReasonDisplayClocksSetting(String value) {
        this.clocksThrottleReasonDisplayClocksSetting = value;
    }

}

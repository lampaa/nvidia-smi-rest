
package com.github.lampaa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "default_applications_clocksType", propOrder = {
        "graphicsClock",
        "memClock"
})
public class DefaultApplicationsClocksType {

    @XmlElement(name = "graphics_clock", required = true)
    protected String graphicsClock;
    @XmlElement(name = "mem_clock", required = true)
    protected String memClock;

    /**
     * Gets the value of the graphicsClock property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGraphicsClock() {
        return graphicsClock;
    }

    /**
     * Sets the value of the graphicsClock property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGraphicsClock(String value) {
        this.graphicsClock = value;
    }

    /**
     * Gets the value of the memClock property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMemClock() {
        return memClock;
    }

    /**
     * Sets the value of the memClock property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMemClock(String value) {
        this.memClock = value;
    }

}

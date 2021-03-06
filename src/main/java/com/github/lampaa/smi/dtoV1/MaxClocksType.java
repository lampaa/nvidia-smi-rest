
package com.github.lampaa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "max_clocksType", propOrder = {
        "graphicsClock",
        "smClock",
        "memClock",
        "videoClock"
})
public class MaxClocksType {

    @XmlElement(name = "graphics_clock", required = true)
    protected String graphicsClock;
    @XmlElement(name = "sm_clock", required = true)
    protected String smClock;
    @XmlElement(name = "mem_clock", required = true)
    protected String memClock;
    @XmlElement(name = "video_clock", required = true)
    protected String videoClock;

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
     * Gets the value of the smClock property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSmClock() {
        return smClock;
    }

    /**
     * Sets the value of the smClock property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSmClock(String value) {
        this.smClock = value;
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

    /**
     * Gets the value of the videoClock property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getVideoClock() {
        return videoClock;
    }

    /**
     * Sets the value of the videoClock property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVideoClock(String value) {
        this.videoClock = value;
    }

}

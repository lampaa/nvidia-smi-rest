
package com.github.lampaa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clocksType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="clocksType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="graphics_clock" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sm_clock" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mem_clock" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="video_clock" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clocksType", propOrder = {
        "graphicsClock",
        "smClock",
        "memClock",
        "videoClock"
})
public class ClocksType {

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
    public Integer getGraphicsClock() {
        try {
            return Integer.valueOf(this.graphicsClock.replace(" MHz", ""));
        } catch (NumberFormatException ex) {
            return null;
        }
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
    public Integer getSmClock() {
        try {
            return Integer.valueOf(smClock.replace(" MHz", ""));
        } catch (NumberFormatException ex) {
            return null;
        }
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
    public Integer getMemClock() {
        try {
            return Integer.valueOf(memClock.replace(" MHz", ""));
        } catch (NumberFormatException ex) {
            return null;
        }
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
    public Integer getVideoClock() {
        try {
            return Integer.valueOf(videoClock.replace(" MHz", ""));
        } catch (NumberFormatException ex) {
            return null;
        }
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

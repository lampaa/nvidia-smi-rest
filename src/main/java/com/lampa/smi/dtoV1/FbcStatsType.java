
package com.lampa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fbc_statsType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="fbc_statsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="session_count" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="average_fps" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="average_latency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fbc_statsType", propOrder = {
        "sessionCount",
        "averageFps",
        "averageLatency"
})
public class FbcStatsType {

    @XmlElement(name = "session_count", required = true)
    protected String sessionCount;
    @XmlElement(name = "average_fps", required = true)
    protected String averageFps;
    @XmlElement(name = "average_latency", required = true)
    protected String averageLatency;

    /**
     * Gets the value of the sessionCount property.
     *
     * @return possible object is
     * {@link String }
     */
    public Integer getSessionCount() {
        try {
            return Integer.valueOf(sessionCount);
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    /**
     * Sets the value of the sessionCount property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSessionCount(String value) {
        this.sessionCount = value;
    }

    /**
     * Gets the value of the averageFps property.
     *
     * @return possible object is
     * {@link String }
     */
    public Integer getAverageFps() {
        try {
            return Integer.valueOf(averageFps);
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    /**
     * Sets the value of the averageFps property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAverageFps(String value) {
        this.averageFps = value;
    }

    /**
     * Gets the value of the averageLatency property.
     *
     * @return possible object is
     * {@link String }
     */
    public Integer getAverageLatency() {
        try {
            return Integer.valueOf(averageLatency);
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    /**
     * Sets the value of the averageLatency property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAverageLatency(String value) {
        this.averageLatency = value;
    }

}

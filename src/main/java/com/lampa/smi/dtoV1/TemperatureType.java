
package com.lampa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for temperatureType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="temperatureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gpu_temp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gpu_temp_max_threshold" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gpu_temp_slow_threshold" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gpu_temp_max_gpu_threshold" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="memory_temp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gpu_temp_max_mem_threshold" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "temperatureType", propOrder = {
        "gpuTemp",
        "gpuTempMaxThreshold",
        "gpuTempSlowThreshold",
        "gpuTempMaxGpuThreshold",
        "memoryTemp",
        "gpuTempMaxMemThreshold"
})
public class TemperatureType {

    @XmlElement(name = "gpu_temp", required = true)
    protected String gpuTemp;
    @XmlElement(name = "gpu_temp_max_threshold", required = true)
    protected String gpuTempMaxThreshold;
    @XmlElement(name = "gpu_temp_slow_threshold", required = true)
    protected String gpuTempSlowThreshold;
    @XmlElement(name = "gpu_temp_max_gpu_threshold", required = true)
    protected String gpuTempMaxGpuThreshold;
    @XmlElement(name = "memory_temp", required = true)
    protected String memoryTemp;
    @XmlElement(name = "gpu_temp_max_mem_threshold", required = true)
    protected String gpuTempMaxMemThreshold;

    /**
     * Gets the value of the gpuTemp property.
     *
     * @return possible object is
     * {@link String }
     */
    public Integer getGpuTemp() {
        try {
            return Integer.valueOf(gpuTemp.replace(" C", ""));
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    /**
     * Sets the value of the gpuTemp property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGpuTemp(String value) {
        this.gpuTemp = value;
    }

    /**
     * Gets the value of the gpuTempMaxThreshold property.
     *
     * @return possible object is
     * {@link String }
     */
    public Integer getGpuTempMaxThreshold() {
        try {
            return Integer.valueOf(gpuTempMaxThreshold.replace(" C", ""));
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    /**
     * Sets the value of the gpuTempMaxThreshold property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGpuTempMaxThreshold(String value) {
        this.gpuTempMaxThreshold = value;
    }

    /**
     * Gets the value of the gpuTempSlowThreshold property.
     *
     * @return possible object is
     * {@link String }
     */
    public Integer getGpuTempSlowThreshold() {
        try {
            return Integer.valueOf(gpuTempSlowThreshold.replace(" C", ""));
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    /**
     * Sets the value of the gpuTempSlowThreshold property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGpuTempSlowThreshold(String value) {
        this.gpuTempSlowThreshold = value;
    }

    /**
     * Gets the value of the gpuTempMaxGpuThreshold property.
     *
     * @return possible object is
     * {@link String }
     */
    public Integer getGpuTempMaxGpuThreshold() {
        try {
            return Integer.valueOf(gpuTempMaxGpuThreshold.replace(" C", ""));
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    /**
     * Sets the value of the gpuTempMaxGpuThreshold property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGpuTempMaxGpuThreshold(String value) {
        this.gpuTempMaxGpuThreshold = value;
    }

    /**
     * Gets the value of the memoryTemp property.
     *
     * @return possible object is
     * {@link String }
     */
    public Integer getMemoryTemp() {
        try {
            return Integer.valueOf(memoryTemp.replace(" C", ""));
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    /**
     * Sets the value of the memoryTemp property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMemoryTemp(String value) {
        this.memoryTemp = value;
    }

    /**
     * Gets the value of the gpuTempMaxMemThreshold property.
     *
     * @return possible object is
     * {@link String }
     */
    public Integer getGpuTempMaxMemThreshold() {
        try {
            return Integer.valueOf(gpuTempMaxMemThreshold.replace(" C", ""));
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    /**
     * Sets the value of the gpuTempMaxMemThreshold property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGpuTempMaxMemThreshold(String value) {
        this.gpuTempMaxMemThreshold = value;
    }
}

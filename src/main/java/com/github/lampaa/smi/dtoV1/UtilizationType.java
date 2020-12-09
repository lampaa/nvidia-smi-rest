
package com.github.lampaa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for utilizationType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="utilizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gpu_util" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="memory_util" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="encoder_util" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="decoder_util" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "utilizationType", propOrder = {
        "gpuUtil",
        "memoryUtil",
        "encoderUtil",
        "decoderUtil"
})
public class UtilizationType {

    @XmlElement(name = "gpu_util", required = true)
    protected String gpuUtil;
    @XmlElement(name = "memory_util", required = true)
    protected String memoryUtil;
    @XmlElement(name = "encoder_util", required = true)
    protected String encoderUtil;
    @XmlElement(name = "decoder_util", required = true)
    protected String decoderUtil;

    /**
     * Gets the value of the gpuUtil property.
     *
     * @return possible object is
     * {@link String }
     */
    public Integer getGpuUtil() {
        try {
            return Integer.valueOf(gpuUtil.replace(" %", ""));
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    /**
     * Sets the value of the gpuUtil property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGpuUtil(String value) {
        this.gpuUtil = value;//Integer.parseInt(value.replace("%", ""));
    }

    /**
     * Gets the value of the memoryUtil property.
     *
     * @return possible object is
     * {@link String }
     */
    public Integer getMemoryUtil() {
        try {
            return Integer.valueOf(memoryUtil.replace(" %", ""));
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    /**
     * Sets the value of the memoryUtil property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMemoryUtil(String value) {
        this.memoryUtil = value;// Integer.parseInt(value.replace("%", ""));
    }

    /**
     * Gets the value of the encoderUtil property.
     *
     * @return possible object is
     * {@link String }
     */
    public Integer getEncoderUtil() {
        try {
            return Integer.valueOf(encoderUtil.replace(" %", ""));
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    /**
     * Sets the value of the encoderUtil property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEncoderUtil(String value) {
        this.encoderUtil = value;//Integer.parseInt(value.replace("%", ""));
    }

    /**
     * Gets the value of the decoderUtil property.
     *
     * @return possible object is
     * {@link String }
     */
    public Integer getDecoderUtil() {
        try {
            return Integer.valueOf(decoderUtil.replace(" %", ""));
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    /**
     * Sets the value of the decoderUtil property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDecoderUtil(String value) {
        this.decoderUtil = value;//.parseInt(value.replace("%", ""));
    }

}

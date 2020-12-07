
package com.lampa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gpu_virtualization_modeType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="gpu_virtualization_modeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="virtualization_mode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gpu_virtualization_modeType", propOrder = {
        "virtualizationMode"
})
public class GpuVirtualizationModeType {

    @XmlElement(name = "virtualization_mode", required = true)
    protected String virtualizationMode;

    /**
     * Gets the value of the virtualizationMode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getVirtualizationMode() {
        return virtualizationMode;
    }

    /**
     * Sets the value of the virtualizationMode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVirtualizationMode(String value) {
        this.virtualizationMode = value;
    }

}

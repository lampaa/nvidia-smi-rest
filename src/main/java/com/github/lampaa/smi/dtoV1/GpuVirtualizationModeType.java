
package com.github.lampaa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 *
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

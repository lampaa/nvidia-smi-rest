
package com.github.lampaa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gpu_operation_modeType", propOrder = {
        "currentGom",
        "pendingGom"
})
public class GpuOperationModeType {

    @XmlElement(name = "current_gom", required = true)
    protected String currentGom;
    @XmlElement(name = "pending_gom", required = true)
    protected String pendingGom;

    /**
     * Gets the value of the currentGom property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCurrentGom() {
        return currentGom;
    }

    /**
     * Sets the value of the currentGom property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCurrentGom(String value) {
        this.currentGom = value;
    }

    /**
     * Gets the value of the pendingGom property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPendingGom() {
        return pendingGom;
    }

    /**
     * Sets the value of the pendingGom property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPendingGom(String value) {
        this.pendingGom = value;
    }

}

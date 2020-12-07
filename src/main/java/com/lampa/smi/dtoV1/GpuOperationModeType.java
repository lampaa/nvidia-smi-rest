
package com.lampa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gpu_operation_modeType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="gpu_operation_modeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="current_gom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pending_gom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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

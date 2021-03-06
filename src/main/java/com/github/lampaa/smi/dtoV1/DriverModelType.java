
package com.github.lampaa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "driver_modelType", propOrder = {
        "currentDm",
        "pendingDm"
})
public class DriverModelType {

    @XmlElement(name = "current_dm", required = true)
    protected String currentDm;
    @XmlElement(name = "pending_dm", required = true)
    protected String pendingDm;

    /**
     * Gets the value of the currentDm property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCurrentDm() {
        return currentDm;
    }

    /**
     * Sets the value of the currentDm property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCurrentDm(String value) {
        this.currentDm = value;
    }

    /**
     * Gets the value of the pendingDm property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPendingDm() {
        return pendingDm;
    }

    /**
     * Sets the value of the pendingDm property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPendingDm(String value) {
        this.pendingDm = value;
    }

}

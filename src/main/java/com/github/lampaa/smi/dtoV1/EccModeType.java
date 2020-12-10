
package com.github.lampaa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ecc_modeType", propOrder = {
        "currentEcc",
        "pendingEcc"
})
public class EccModeType {

    @XmlElement(name = "current_ecc", required = true)
    protected String currentEcc;
    @XmlElement(name = "pending_ecc", required = true)
    protected String pendingEcc;

    /**
     * Gets the value of the currentEcc property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCurrentEcc() {
        return currentEcc;
    }

    /**
     * Sets the value of the currentEcc property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCurrentEcc(String value) {
        this.currentEcc = value;
    }

    /**
     * Gets the value of the pendingEcc property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPendingEcc() {
        return pendingEcc;
    }

    /**
     * Sets the value of the pendingEcc property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPendingEcc(String value) {
        this.pendingEcc = value;
    }

}

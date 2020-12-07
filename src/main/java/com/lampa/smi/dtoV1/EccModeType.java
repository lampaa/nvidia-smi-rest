
package com.lampa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ecc_modeType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ecc_modeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="current_ecc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pending_ecc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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

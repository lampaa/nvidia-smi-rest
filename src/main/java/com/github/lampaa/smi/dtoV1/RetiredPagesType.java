
package com.github.lampaa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retired_pagesType", propOrder = {
        "multipleSingleBitRetirement",
        "doubleBitRetirement",
        "pendingBlacklist"
})
public class RetiredPagesType {

    @XmlElement(name = "multiple_single_bit_retirement", required = true)
    protected MultipleSingleBitRetirementType multipleSingleBitRetirement;
    @XmlElement(name = "double_bit_retirement", required = true)
    protected DoubleBitRetirementType doubleBitRetirement;
    @XmlElement(name = "pending_blacklist", required = true)
    protected String pendingBlacklist;

    /**
     * Gets the value of the multipleSingleBitRetirement property.
     *
     * @return possible object is
     * {@link MultipleSingleBitRetirementType }
     */
    public MultipleSingleBitRetirementType getMultipleSingleBitRetirement() {
        return multipleSingleBitRetirement;
    }

    /**
     * Sets the value of the multipleSingleBitRetirement property.
     *
     * @param value allowed object is
     *              {@link MultipleSingleBitRetirementType }
     */
    public void setMultipleSingleBitRetirement(MultipleSingleBitRetirementType value) {
        this.multipleSingleBitRetirement = value;
    }

    /**
     * Gets the value of the doubleBitRetirement property.
     *
     * @return possible object is
     * {@link DoubleBitRetirementType }
     */
    public DoubleBitRetirementType getDoubleBitRetirement() {
        return doubleBitRetirement;
    }

    /**
     * Sets the value of the doubleBitRetirement property.
     *
     * @param value allowed object is
     *              {@link DoubleBitRetirementType }
     */
    public void setDoubleBitRetirement(DoubleBitRetirementType value) {
        this.doubleBitRetirement = value;
    }

    /**
     * Gets the value of the pendingBlacklist property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPendingBlacklist() {
        return pendingBlacklist;
    }

    /**
     * Sets the value of the pendingBlacklist property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPendingBlacklist(String value) {
        this.pendingBlacklist = value;
    }

}

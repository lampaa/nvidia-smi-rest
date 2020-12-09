
package com.github.lampaa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retired_pagesType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="retired_pagesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="multiple_single_bit_retirement" type="{}multiple_single_bit_retirementType"/>
 *         &lt;element name="double_bit_retirement" type="{}double_bit_retirementType"/>
 *         &lt;element name="pending_blacklist" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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

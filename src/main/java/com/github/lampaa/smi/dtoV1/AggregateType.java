
package com.github.lampaa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for aggregateType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="aggregateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="single_bit" type="{}single_bitType"/>
 *         &lt;element name="double_bit" type="{}double_bitType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aggregateType", propOrder = {
        "singleBit",
        "doubleBit"
})
public class AggregateType {

    @XmlElement(name = "single_bit", required = true)
    protected SingleBitType singleBit;
    @XmlElement(name = "double_bit", required = true)
    protected DoubleBitType doubleBit;

    /**
     * Gets the value of the singleBit property.
     *
     * @return possible object is
     * {@link SingleBitType }
     */
    public SingleBitType getSingleBit() {
        return singleBit;
    }

    /**
     * Sets the value of the singleBit property.
     *
     * @param value allowed object is
     *              {@link SingleBitType }
     */
    public void setSingleBit(SingleBitType value) {
        this.singleBit = value;
    }

    /**
     * Gets the value of the doubleBit property.
     *
     * @return possible object is
     * {@link DoubleBitType }
     */
    public DoubleBitType getDoubleBit() {
        return doubleBit;
    }

    /**
     * Sets the value of the doubleBit property.
     *
     * @param value allowed object is
     *              {@link DoubleBitType }
     */
    public void setDoubleBit(DoubleBitType value) {
        this.doubleBit = value;
    }

}

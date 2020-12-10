
package com.github.lampaa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 *
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

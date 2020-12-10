
package com.github.lampaa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multiple_single_bit_retirementType", propOrder = {
        "retiredCount",
        "retiredPagelist"
})
public class MultipleSingleBitRetirementType {

    @XmlElement(name = "retired_count", required = true)
    protected String retiredCount;
    @XmlElement(name = "retired_pagelist", required = true)
    protected String retiredPagelist;

    /**
     * Gets the value of the retiredCount property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRetiredCount() {
        return retiredCount;
    }

    /**
     * Sets the value of the retiredCount property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRetiredCount(String value) {
        this.retiredCount = value;
    }

    /**
     * Gets the value of the retiredPagelist property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRetiredPagelist() {
        return retiredPagelist;
    }

    /**
     * Sets the value of the retiredPagelist property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRetiredPagelist(String value) {
        this.retiredPagelist = value;
    }

}

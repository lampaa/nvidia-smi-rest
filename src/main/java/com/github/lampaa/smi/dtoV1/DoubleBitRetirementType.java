
package com.github.lampaa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for double_bit_retirementType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="double_bit_retirementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="retired_count" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="retired_pagelist" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "double_bit_retirementType", propOrder = {
        "retiredCount",
        "retiredPagelist"
})
public class DoubleBitRetirementType {

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

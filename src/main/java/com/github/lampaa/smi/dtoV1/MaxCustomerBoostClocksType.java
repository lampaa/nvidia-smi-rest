
package com.github.lampaa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "max_customer_boost_clocksType", propOrder = {
        "graphicsClock"
})
public class MaxCustomerBoostClocksType {

    @XmlElement(name = "graphics_clock", required = true)
    protected String graphicsClock;

    /**
     * Gets the value of the graphicsClock property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGraphicsClock() {
        return graphicsClock;
    }

    /**
     * Sets the value of the graphicsClock property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGraphicsClock(String value) {
        this.graphicsClock = value;
    }

}

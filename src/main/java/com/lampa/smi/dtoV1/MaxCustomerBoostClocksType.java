
package com.lampa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for max_customer_boost_clocksType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="max_customer_boost_clocksType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="graphics_clock" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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

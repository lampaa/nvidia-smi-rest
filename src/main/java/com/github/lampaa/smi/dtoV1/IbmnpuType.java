
package com.github.lampaa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ibmnpuType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ibmnpuType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="relaxed_ordering_mode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ibmnpuType", propOrder = {
        "relaxedOrderingMode"
})
public class IbmnpuType {

    @XmlElement(name = "relaxed_ordering_mode", required = true)
    protected String relaxedOrderingMode;

    /**
     * Gets the value of the relaxedOrderingMode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRelaxedOrderingMode() {
        return relaxedOrderingMode;
    }

    /**
     * Sets the value of the relaxedOrderingMode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRelaxedOrderingMode(String value) {
        this.relaxedOrderingMode = value;
    }

}

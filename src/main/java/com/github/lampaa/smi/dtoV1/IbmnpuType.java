
package com.github.lampaa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 *
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

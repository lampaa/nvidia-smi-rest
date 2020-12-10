
package com.github.lampaa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bar1_memory_usageType", propOrder = {
        "total",
        "used",
        "free"
})
public class Bar1MemoryUsageType {

    @XmlElement(required = true)
    protected String total;
    @XmlElement(required = true)
    protected String used;
    @XmlElement(required = true)
    protected String free;

    /**
     * Gets the value of the total property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTotal(String value) {
        this.total = value;
    }

    /**
     * Gets the value of the used property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUsed() {
        return used;
    }

    /**
     * Sets the value of the used property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUsed(String value) {
        this.used = value;
    }

    /**
     * Gets the value of the free property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFree() {
        return free;
    }

    /**
     * Sets the value of the free property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFree(String value) {
        this.free = value;
    }

}

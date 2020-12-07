
package com.lampa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fb_memory_usageType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="fb_memory_usageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="used" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="free" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fb_memory_usageType", propOrder = {
        "total",
        "used",
        "free"
})
public class FbMemoryUsageType {

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
    public Integer getTotal() {
        try {
            return Integer.valueOf(total.replace(" MiB", ""));
        } catch (NumberFormatException ex) {
            return null;
        }
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
    public Integer getUsed() {
        try {
            return Integer.valueOf(used.replace(" MiB", ""));
        } catch (NumberFormatException ex) {
            return null;
        }
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
    public Integer getFree() {
        try {
            return Integer.valueOf(free.replace(" MiB", ""));
        } catch (NumberFormatException ex) {
            return null;
        }
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

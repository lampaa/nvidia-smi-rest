
package com.github.lampaa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for double_bitType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="double_bitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="device_memory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="register_file" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="l1_cache" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="l2_cache" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="texture_memory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="texture_shm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cbu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "double_bitType", propOrder = {
        "deviceMemory",
        "registerFile",
        "l1Cache",
        "l2Cache",
        "textureMemory",
        "textureShm",
        "cbu",
        "total"
})
public class DoubleBitType {

    @XmlElement(name = "device_memory", required = true)
    protected String deviceMemory;
    @XmlElement(name = "register_file", required = true)
    protected String registerFile;
    @XmlElement(name = "l1_cache", required = true)
    protected String l1Cache;
    @XmlElement(name = "l2_cache", required = true)
    protected String l2Cache;
    @XmlElement(name = "texture_memory", required = true)
    protected String textureMemory;
    @XmlElement(name = "texture_shm", required = true)
    protected String textureShm;
    @XmlElement(required = true)
    protected String cbu;
    @XmlElement(required = true)
    protected String total;

    /**
     * Gets the value of the deviceMemory property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDeviceMemory() {
        return deviceMemory;
    }

    /**
     * Sets the value of the deviceMemory property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDeviceMemory(String value) {
        this.deviceMemory = value;
    }

    /**
     * Gets the value of the registerFile property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRegisterFile() {
        return registerFile;
    }

    /**
     * Sets the value of the registerFile property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRegisterFile(String value) {
        this.registerFile = value;
    }

    /**
     * Gets the value of the l1Cache property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getL1Cache() {
        return l1Cache;
    }

    /**
     * Sets the value of the l1Cache property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setL1Cache(String value) {
        this.l1Cache = value;
    }

    /**
     * Gets the value of the l2Cache property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getL2Cache() {
        return l2Cache;
    }

    /**
     * Sets the value of the l2Cache property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setL2Cache(String value) {
        this.l2Cache = value;
    }

    /**
     * Gets the value of the textureMemory property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTextureMemory() {
        return textureMemory;
    }

    /**
     * Sets the value of the textureMemory property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTextureMemory(String value) {
        this.textureMemory = value;
    }

    /**
     * Gets the value of the textureShm property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTextureShm() {
        return textureShm;
    }

    /**
     * Sets the value of the textureShm property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTextureShm(String value) {
        this.textureShm = value;
    }

    /**
     * Gets the value of the cbu property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCbu() {
        return cbu;
    }

    /**
     * Sets the value of the cbu property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCbu(String value) {
        this.cbu = value;
    }

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

}

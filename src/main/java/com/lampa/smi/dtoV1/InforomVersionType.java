
package com.lampa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inforom_versionType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="inforom_versionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="img_version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="oem_object" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ecc_object" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pwr_object" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inforom_versionType", propOrder = {
        "imgVersion",
        "oemObject",
        "eccObject",
        "pwrObject"
})
public class InforomVersionType {

    @XmlElement(name = "img_version", required = true)
    protected String imgVersion;
    @XmlElement(name = "oem_object", required = true)
    protected String oemObject;
    @XmlElement(name = "ecc_object", required = true)
    protected String eccObject;
    @XmlElement(name = "pwr_object", required = true)
    protected String pwrObject;

    /**
     * Gets the value of the imgVersion property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getImgVersion() {
        return imgVersion;
    }

    /**
     * Sets the value of the imgVersion property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setImgVersion(String value) {
        this.imgVersion = value;
    }

    /**
     * Gets the value of the oemObject property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOemObject() {
        return oemObject;
    }

    /**
     * Sets the value of the oemObject property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOemObject(String value) {
        this.oemObject = value;
    }

    /**
     * Gets the value of the eccObject property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEccObject() {
        return eccObject;
    }

    /**
     * Sets the value of the eccObject property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEccObject(String value) {
        this.eccObject = value;
    }

    /**
     * Gets the value of the pwrObject property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPwrObject() {
        return pwrObject;
    }

    /**
     * Sets the value of the pwrObject property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPwrObject(String value) {
        this.pwrObject = value;
    }

}

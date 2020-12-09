
package com.github.lampaa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for link_widthsType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="link_widthsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="max_link_width" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="current_link_width" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "link_widthsType", propOrder = {
        "maxLinkWidth",
        "currentLinkWidth"
})
public class LinkWidthsType {

    @XmlElement(name = "max_link_width", required = true)
    protected String maxLinkWidth;
    @XmlElement(name = "current_link_width", required = true)
    protected String currentLinkWidth;

    /**
     * Gets the value of the maxLinkWidth property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMaxLinkWidth() {
        return maxLinkWidth;
    }

    /**
     * Sets the value of the maxLinkWidth property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMaxLinkWidth(String value) {
        this.maxLinkWidth = value;
    }

    /**
     * Gets the value of the currentLinkWidth property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCurrentLinkWidth() {
        return currentLinkWidth;
    }

    /**
     * Sets the value of the currentLinkWidth property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCurrentLinkWidth(String value) {
        this.currentLinkWidth = value;
    }

}

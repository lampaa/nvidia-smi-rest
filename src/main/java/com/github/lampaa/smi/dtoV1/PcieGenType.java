
package com.github.lampaa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pcie_genType", propOrder = {
        "maxLinkGen",
        "currentLinkGen"
})
public class PcieGenType {

    @XmlElement(name = "max_link_gen", required = true)
    protected String maxLinkGen;
    @XmlElement(name = "current_link_gen", required = true)
    protected String currentLinkGen;

    /**
     * Gets the value of the maxLinkGen property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMaxLinkGen() {
        return maxLinkGen;
    }

    /**
     * Sets the value of the maxLinkGen property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMaxLinkGen(String value) {
        this.maxLinkGen = value;
    }

    /**
     * Gets the value of the currentLinkGen property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCurrentLinkGen() {
        return currentLinkGen;
    }

    /**
     * Sets the value of the currentLinkGen property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCurrentLinkGen(String value) {
        this.currentLinkGen = value;
    }

}

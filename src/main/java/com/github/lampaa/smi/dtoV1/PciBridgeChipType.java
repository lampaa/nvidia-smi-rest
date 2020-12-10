
package com.github.lampaa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pci_bridge_chipType", propOrder = {
        "bridgeChipType",
        "bridgeChipFw"
})
public class PciBridgeChipType {

    @XmlElement(name = "bridge_chip_type", required = true)
    protected String bridgeChipType;
    @XmlElement(name = "bridge_chip_fw", required = true)
    protected String bridgeChipFw;

    /**
     * Gets the value of the bridgeChipType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBridgeChipType() {
        return bridgeChipType;
    }

    /**
     * Sets the value of the bridgeChipType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBridgeChipType(String value) {
        this.bridgeChipType = value;
    }

    /**
     * Gets the value of the bridgeChipFw property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBridgeChipFw() {
        return bridgeChipFw;
    }

    /**
     * Sets the value of the bridgeChipFw property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBridgeChipFw(String value) {
        this.bridgeChipFw = value;
    }

}

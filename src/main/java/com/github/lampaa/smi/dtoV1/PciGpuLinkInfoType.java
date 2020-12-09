
package com.github.lampaa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pci_gpu_link_infoType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="pci_gpu_link_infoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pcie_gen" type="{}pcie_genType"/>
 *         &lt;element name="link_widths" type="{}link_widthsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pci_gpu_link_infoType", propOrder = {
        "pcieGen",
        "linkWidths"
})
public class PciGpuLinkInfoType {

    @XmlElement(name = "pcie_gen", required = true)
    protected PcieGenType pcieGen;
    @XmlElement(name = "link_widths", required = true)
    protected LinkWidthsType linkWidths;

    /**
     * Gets the value of the pcieGen property.
     *
     * @return possible object is
     * {@link PcieGenType }
     */
    public PcieGenType getPcieGen() {
        return pcieGen;
    }

    /**
     * Sets the value of the pcieGen property.
     *
     * @param value allowed object is
     *              {@link PcieGenType }
     */
    public void setPcieGen(PcieGenType value) {
        this.pcieGen = value;
    }

    /**
     * Gets the value of the linkWidths property.
     *
     * @return possible object is
     * {@link LinkWidthsType }
     */
    public LinkWidthsType getLinkWidths() {
        return linkWidths;
    }

    /**
     * Sets the value of the linkWidths property.
     *
     * @param value allowed object is
     *              {@link LinkWidthsType }
     */
    public void setLinkWidths(LinkWidthsType value) {
        this.linkWidths = value;
    }

}

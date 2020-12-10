
package com.github.lampaa.smi.dtoV1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pciType", propOrder = {
        "pciBus",
        "pciDevice",
        "pciDomain",
        "pciDeviceId",
        "pciBusId",
        "pciSubSystemId",
        "pciGpuLinkInfo",
        "pciBridgeChip",
        "replayCounter",
        "replayRolloverCounter",
        "txUtil",
        "rxUtil"
})
public class PciType {

    @XmlElement(name = "pci_bus", required = true)
    protected String pciBus;
    @XmlElement(name = "pci_device", required = true)
    protected String pciDevice;
    @XmlElement(name = "pci_domain", required = true)
    protected String pciDomain;
    @XmlElement(name = "pci_device_id", required = true)
    protected String pciDeviceId;
    @XmlElement(name = "pci_bus_id", required = true)
    protected String pciBusId;
    @XmlElement(name = "pci_sub_system_id", required = true)
    protected String pciSubSystemId;
    @XmlElement(name = "pci_gpu_link_info", required = true)
    protected PciGpuLinkInfoType pciGpuLinkInfo;
    @XmlElement(name = "pci_bridge_chip", required = true)
    protected PciBridgeChipType pciBridgeChip;
    @XmlElement(name = "replay_counter", required = true)
    protected String replayCounter;
    @XmlElement(name = "replay_rollover_counter", required = true)
    protected String replayRolloverCounter;
    @XmlElement(name = "tx_util", required = true)
    protected String txUtil;
    @XmlElement(name = "rx_util", required = true)
    protected String rxUtil;

    /**
     * Gets the value of the pciBus property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPciBus() {
        return pciBus;
    }

    /**
     * Sets the value of the pciBus property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPciBus(String value) {
        this.pciBus = value;
    }

    /**
     * Gets the value of the pciDevice property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPciDevice() {
        return pciDevice;
    }

    /**
     * Sets the value of the pciDevice property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPciDevice(String value) {
        this.pciDevice = value;
    }

    /**
     * Gets the value of the pciDomain property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPciDomain() {
        return pciDomain;
    }

    /**
     * Sets the value of the pciDomain property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPciDomain(String value) {
        this.pciDomain = value;
    }

    /**
     * Gets the value of the pciDeviceId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPciDeviceId() {
        return pciDeviceId;
    }

    /**
     * Sets the value of the pciDeviceId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPciDeviceId(String value) {
        this.pciDeviceId = value;
    }

    /**
     * Gets the value of the pciBusId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPciBusId() {
        return pciBusId;
    }

    /**
     * Sets the value of the pciBusId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPciBusId(String value) {
        this.pciBusId = value;
    }

    /**
     * Gets the value of the pciSubSystemId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPciSubSystemId() {
        return pciSubSystemId;
    }

    /**
     * Sets the value of the pciSubSystemId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPciSubSystemId(String value) {
        this.pciSubSystemId = value;
    }

    /**
     * Gets the value of the pciGpuLinkInfo property.
     *
     * @return possible object is
     * {@link PciGpuLinkInfoType }
     */
    public PciGpuLinkInfoType getPciGpuLinkInfo() {
        return pciGpuLinkInfo;
    }

    /**
     * Sets the value of the pciGpuLinkInfo property.
     *
     * @param value allowed object is
     *              {@link PciGpuLinkInfoType }
     */
    public void setPciGpuLinkInfo(PciGpuLinkInfoType value) {
        this.pciGpuLinkInfo = value;
    }

    /**
     * Gets the value of the pciBridgeChip property.
     *
     * @return possible object is
     * {@link PciBridgeChipType }
     */
    public PciBridgeChipType getPciBridgeChip() {
        return pciBridgeChip;
    }

    /**
     * Sets the value of the pciBridgeChip property.
     *
     * @param value allowed object is
     *              {@link PciBridgeChipType }
     */
    public void setPciBridgeChip(PciBridgeChipType value) {
        this.pciBridgeChip = value;
    }

    /**
     * Gets the value of the replayCounter property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getReplayCounter() {
        return replayCounter;
    }

    /**
     * Sets the value of the replayCounter property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setReplayCounter(String value) {
        this.replayCounter = value;
    }

    /**
     * Gets the value of the replayRolloverCounter property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getReplayRolloverCounter() {
        return replayRolloverCounter;
    }

    /**
     * Sets the value of the replayRolloverCounter property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setReplayRolloverCounter(String value) {
        this.replayRolloverCounter = value;
    }

    /**
     * Gets the value of the txUtil property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTxUtil() {
        return txUtil;
    }

    /**
     * Sets the value of the txUtil property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTxUtil(String value) {
        this.txUtil = value;
    }

    /**
     * Gets the value of the rxUtil property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRxUtil() {
        return rxUtil;
    }

    /**
     * Sets the value of the rxUtil property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRxUtil(String value) {
        this.rxUtil = value;
    }

}

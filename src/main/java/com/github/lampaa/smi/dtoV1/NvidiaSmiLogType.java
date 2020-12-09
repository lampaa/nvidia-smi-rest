
package com.github.lampaa.smi.dtoV1;

import jakarta.xml.bind.annotation.*;

import java.util.List;


/**
 * <p>Java class for nvidia_smi_logType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="nvidia_smi_logType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="driver_version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cuda_version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attached_gpus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gpu" type="{}gpuType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement(name = "nvidia_smi_log")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nvidia_smi_logType", propOrder = {
        "timestamp",
        "driverVersion",
        "cudaVersion",
        "attachedGpus",
        "gpu"
})
public class NvidiaSmiLogType {

    @XmlElement(required = true)
    protected String timestamp;
    @XmlElement(name = "driver_version", required = true)
    protected String driverVersion;
    @XmlElement(name = "cuda_version", required = true)
    protected String cudaVersion;
    @XmlElement(name = "attached_gpus", required = true)
    protected String attachedGpus;
    @XmlElement(required = true)
    protected List<GpuType> gpu;

    /**
     * Gets the value of the timestamp property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the driverVersion property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDriverVersion() {
        return driverVersion;
    }

    /**
     * Sets the value of the driverVersion property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDriverVersion(String value) {
        this.driverVersion = value;
    }

    /**
     * Gets the value of the cudaVersion property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCudaVersion() {
        return cudaVersion;
    }

    /**
     * Sets the value of the cudaVersion property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCudaVersion(String value) {
        this.cudaVersion = value;
    }

    /**
     * Gets the value of the attachedGpus property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAttachedGpus() {
        return attachedGpus;
    }

    /**
     * Sets the value of the attachedGpus property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAttachedGpus(String value) {
        this.attachedGpus = value;
    }

    /**
     * Gets the value of the gpu property.
     *
     * @return possible object is
     * {@link GpuType }
     */
    public List<GpuType> getGpu() {
        return gpu;
    }

    /**
     * Sets the value of the gpu property.
     *
     * @param value allowed object is
     *              {@link GpuType }
     */
    public void setGpu(List<GpuType> value) {
        this.gpu = value;
    }

}

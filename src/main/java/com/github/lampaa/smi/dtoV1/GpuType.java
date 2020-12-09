
package com.github.lampaa.smi.dtoV1;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for gpuType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="gpuType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="product_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="product_brand" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="display_mode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="display_active" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="persistence_mode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accounting_mode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accounting_mode_buffer_size" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="driver_model" type="{}driver_modelType"/>
 *         &lt;element name="serial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="minor_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vbios_version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="multigpu_board" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="board_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gpu_part_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inforom_version" type="{}inforom_versionType"/>
 *         &lt;element name="gpu_operation_mode" type="{}gpu_operation_modeType"/>
 *         &lt;element name="gpu_virtualization_mode" type="{}gpu_virtualization_modeType"/>
 *         &lt;element name="ibmnpu" type="{}ibmnpuType"/>
 *         &lt;element name="pci" type="{}pciType"/>
 *         &lt;element name="fan_speed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="performance_state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clocks_throttle_reasons" type="{}clocks_throttle_reasonsType"/>
 *         &lt;element name="fb_memory_usage" type="{}fb_memory_usageType"/>
 *         &lt;element name="bar1_memory_usage" type="{}bar1_memory_usageType"/>
 *         &lt;element name="compute_mode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="utilization" type="{}utilizationType"/>
 *         &lt;element name="encoder_stats" type="{}encoder_statsType"/>
 *         &lt;element name="fbc_stats" type="{}fbc_statsType"/>
 *         &lt;element name="ecc_mode" type="{}ecc_modeType"/>
 *         &lt;element name="ecc_errors" type="{}ecc_errorsType"/>
 *         &lt;element name="retired_pages" type="{}retired_pagesType"/>
 *         &lt;element name="temperature" type="{}temperatureType"/>
 *         &lt;element name="power_readings" type="{}power_readingsType"/>
 *         &lt;element name="clocks" type="{}clocksType"/>
 *         &lt;element name="applications_clocks" type="{}applications_clocksType"/>
 *         &lt;element name="default_applications_clocks" type="{}default_applications_clocksType"/>
 *         &lt;element name="max_clocks" type="{}max_clocksType"/>
 *         &lt;element name="max_customer_boost_clocks" type="{}max_customer_boost_clocksType"/>
 *         &lt;element name="clock_policy" type="{}clock_policyType"/>
 *         &lt;element name="supported_clocks" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="processes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accounted_processes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gpuType", propOrder = {
        "productName",
        "productBrand",
        "displayMode",
        "displayActive",
        "persistenceMode",
        "accountingMode",
        "accountingModeBufferSize",
        "driverModel",
        "serial",
        "uuid",
        "minorNumber",
        "vbiosVersion",
        "multigpuBoard",
        "boardId",
        "gpuPartNumber",
        "inforomVersion",
        "gpuOperationMode",
        "gpuVirtualizationMode",
        "ibmnpu",
        "pci",
        "fanSpeed",
        "performanceState",
        "clocksThrottleReasons",
        "fbMemoryUsage",
        "bar1MemoryUsage",
        "computeMode",
        "utilization",
        "encoderStats",
        "fbcStats",
        "eccMode",
        "eccErrors",
        "retiredPages",
        "temperature",
        "powerReadings",
        "clocks",
        "applicationsClocks",
        "defaultApplicationsClocks",
        "maxClocks",
        "maxCustomerBoostClocks",
        "clockPolicy",
        "supportedClocks",
        "processes",
        "accountedProcesses"
})
public class GpuType {

    @XmlElement(name = "product_name", required = true)
    protected String productName;
    @XmlElement(name = "product_brand", required = true)
    protected String productBrand;
    @XmlElement(name = "display_mode", required = true)
    protected String displayMode;
    @XmlElement(name = "display_active", required = true)
    protected String displayActive;
    @XmlElement(name = "persistence_mode", required = true)
    protected String persistenceMode;
    @XmlElement(name = "accounting_mode", required = true)
    protected String accountingMode;
    @XmlElement(name = "accounting_mode_buffer_size", required = true)
    protected String accountingModeBufferSize;
    @XmlElement(name = "driver_model", required = true)
    protected DriverModelType driverModel;
    @XmlElement(required = true)
    protected String serial;
    @XmlElement(required = true)
    protected String uuid;
    @XmlElement(name = "minor_number", required = true)
    protected String minorNumber;
    @XmlElement(name = "vbios_version", required = true)
    protected String vbiosVersion;
    @XmlElement(name = "multigpu_board", required = true)
    protected String multigpuBoard;
    @XmlElement(name = "board_id", required = true)
    protected String boardId;
    @XmlElement(name = "gpu_part_number", required = true)
    protected String gpuPartNumber;
    @XmlElement(name = "inforom_version", required = true)
    protected InforomVersionType inforomVersion;
    @XmlElement(name = "gpu_operation_mode", required = true)
    protected GpuOperationModeType gpuOperationMode;
    @XmlElement(name = "gpu_virtualization_mode", required = true)
    protected GpuVirtualizationModeType gpuVirtualizationMode;
    @XmlElement(required = true)
    protected IbmnpuType ibmnpu;
    @XmlElement(required = true)
    protected PciType pci;
    @XmlElement(name = "fan_speed", required = true)
    protected String fanSpeed;
    @XmlElement(name = "performance_state", required = true)
    protected String performanceState;
    @XmlElement(name = "clocks_throttle_reasons", required = true)
    protected ClocksThrottleReasonsType clocksThrottleReasons;
    @XmlElement(name = "fb_memory_usage", required = true)
    protected FbMemoryUsageType fbMemoryUsage;
    @XmlElement(name = "bar1_memory_usage", required = true)
    protected Bar1MemoryUsageType bar1MemoryUsage;
    @XmlElement(name = "compute_mode", required = true)
    protected String computeMode;
    @XmlElement(required = true)
    protected UtilizationType utilization;
    @XmlElement(name = "encoder_stats", required = true)
    protected EncoderStatsType encoderStats;
    @XmlElement(name = "fbc_stats", required = true)
    protected FbcStatsType fbcStats;
    @XmlElement(name = "ecc_mode", required = true)
    protected EccModeType eccMode;
    @XmlElement(name = "ecc_errors", required = true)
    protected EccErrorsType eccErrors;
    @XmlElement(name = "retired_pages", required = true)
    protected RetiredPagesType retiredPages;
    @XmlElement(required = true)
    protected TemperatureType temperature;
    @XmlElement(name = "power_readings", required = true)
    protected PowerReadingsType powerReadings;
    @XmlElement(required = true)
    protected ClocksType clocks;
    @XmlElement(name = "applications_clocks", required = true)
    protected ApplicationsClocksType applicationsClocks;
    @XmlElement(name = "default_applications_clocks", required = true)
    protected DefaultApplicationsClocksType defaultApplicationsClocks;
    @XmlElement(name = "max_clocks", required = true)
    protected MaxClocksType maxClocks;
    @XmlElement(name = "max_customer_boost_clocks", required = true)
    protected MaxCustomerBoostClocksType maxCustomerBoostClocks;
    @XmlElement(name = "clock_policy", required = true)
    protected ClockPolicyType clockPolicy;
    @XmlElement(name = "supported_clocks", required = true)
    protected String supportedClocks;
    @XmlElement(required = true)
    protected String processes;
    @XmlElement(name = "accounted_processes", required = true)
    protected String accountedProcesses;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the productName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the productBrand property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getProductBrand() {
        return productBrand;
    }

    /**
     * Sets the value of the productBrand property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProductBrand(String value) {
        this.productBrand = value;
    }

    /**
     * Gets the value of the displayMode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDisplayMode() {
        return displayMode;
    }

    /**
     * Sets the value of the displayMode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDisplayMode(String value) {
        this.displayMode = value;
    }

    /**
     * Gets the value of the displayActive property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDisplayActive() {
        return displayActive;
    }

    /**
     * Sets the value of the displayActive property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDisplayActive(String value) {
        this.displayActive = value;
    }

    /**
     * Gets the value of the persistenceMode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPersistenceMode() {
        return persistenceMode;
    }

    /**
     * Sets the value of the persistenceMode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPersistenceMode(String value) {
        this.persistenceMode = value;
    }

    /**
     * Gets the value of the accountingMode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAccountingMode() {
        return accountingMode;
    }

    /**
     * Sets the value of the accountingMode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAccountingMode(String value) {
        this.accountingMode = value;
    }

    /**
     * Gets the value of the accountingModeBufferSize property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAccountingModeBufferSize() {
        return accountingModeBufferSize;
    }

    /**
     * Sets the value of the accountingModeBufferSize property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAccountingModeBufferSize(String value) {
        this.accountingModeBufferSize = value;
    }

    /**
     * Gets the value of the driverModel property.
     *
     * @return possible object is
     * {@link DriverModelType }
     */
    public DriverModelType getDriverModel() {
        return driverModel;
    }

    /**
     * Sets the value of the driverModel property.
     *
     * @param value allowed object is
     *              {@link DriverModelType }
     */
    public void setDriverModel(DriverModelType value) {
        this.driverModel = value;
    }

    /**
     * Gets the value of the serial property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSerial() {
        return serial;
    }

    /**
     * Sets the value of the serial property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSerial(String value) {
        this.serial = value;
    }

    /**
     * Gets the value of the uuid property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the minorNumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMinorNumber() {
        return minorNumber;
    }

    /**
     * Sets the value of the minorNumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMinorNumber(String value) {
        this.minorNumber = value;
    }

    /**
     * Gets the value of the vbiosVersion property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getVbiosVersion() {
        return vbiosVersion;
    }

    /**
     * Sets the value of the vbiosVersion property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVbiosVersion(String value) {
        this.vbiosVersion = value;
    }

    /**
     * Gets the value of the multigpuBoard property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMultigpuBoard() {
        return multigpuBoard;
    }

    /**
     * Sets the value of the multigpuBoard property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMultigpuBoard(String value) {
        this.multigpuBoard = value;
    }

    /**
     * Gets the value of the boardId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBoardId() {
        return boardId;
    }

    /**
     * Sets the value of the boardId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBoardId(String value) {
        this.boardId = value;
    }

    /**
     * Gets the value of the gpuPartNumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGpuPartNumber() {
        return gpuPartNumber;
    }

    /**
     * Sets the value of the gpuPartNumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGpuPartNumber(String value) {
        this.gpuPartNumber = value;
    }

    /**
     * Gets the value of the inforomVersion property.
     *
     * @return possible object is
     * {@link InforomVersionType }
     */
    public InforomVersionType getInforomVersion() {
        return inforomVersion;
    }

    /**
     * Sets the value of the inforomVersion property.
     *
     * @param value allowed object is
     *              {@link InforomVersionType }
     */
    public void setInforomVersion(InforomVersionType value) {
        this.inforomVersion = value;
    }

    /**
     * Gets the value of the gpuOperationMode property.
     *
     * @return possible object is
     * {@link GpuOperationModeType }
     */
    public GpuOperationModeType getGpuOperationMode() {
        return gpuOperationMode;
    }

    /**
     * Sets the value of the gpuOperationMode property.
     *
     * @param value allowed object is
     *              {@link GpuOperationModeType }
     */
    public void setGpuOperationMode(GpuOperationModeType value) {
        this.gpuOperationMode = value;
    }

    /**
     * Gets the value of the gpuVirtualizationMode property.
     *
     * @return possible object is
     * {@link GpuVirtualizationModeType }
     */
    public GpuVirtualizationModeType getGpuVirtualizationMode() {
        return gpuVirtualizationMode;
    }

    /**
     * Sets the value of the gpuVirtualizationMode property.
     *
     * @param value allowed object is
     *              {@link GpuVirtualizationModeType }
     */
    public void setGpuVirtualizationMode(GpuVirtualizationModeType value) {
        this.gpuVirtualizationMode = value;
    }

    /**
     * Gets the value of the ibmnpu property.
     *
     * @return possible object is
     * {@link IbmnpuType }
     */
    public IbmnpuType getIbmnpu() {
        return ibmnpu;
    }

    /**
     * Sets the value of the ibmnpu property.
     *
     * @param value allowed object is
     *              {@link IbmnpuType }
     */
    public void setIbmnpu(IbmnpuType value) {
        this.ibmnpu = value;
    }

    /**
     * Gets the value of the pci property.
     *
     * @return possible object is
     * {@link PciType }
     */
    public PciType getPci() {
        return pci;
    }

    /**
     * Sets the value of the pci property.
     *
     * @param value allowed object is
     *              {@link PciType }
     */
    public void setPci(PciType value) {
        this.pci = value;
    }

    /**
     * Gets the value of the fanSpeed property.
     *
     * @return possible object is
     * {@link String }
     */
    public Integer getFanSpeed() {
        try {
            return Integer.valueOf(fanSpeed.replace(" %", ""));
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    /**
     * Sets the value of the fanSpeed property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFanSpeed(String value) {
        this.fanSpeed = value;
    }

    /**
     * Gets the value of the performanceState property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPerformanceState() {
        return performanceState;
    }

    /**
     * Sets the value of the performanceState property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPerformanceState(String value) {
        this.performanceState = value;
    }

    /**
     * Gets the value of the clocksThrottleReasons property.
     *
     * @return possible object is
     * {@link ClocksThrottleReasonsType }
     */
    public ClocksThrottleReasonsType getClocksThrottleReasons() {
        return clocksThrottleReasons;
    }

    /**
     * Sets the value of the clocksThrottleReasons property.
     *
     * @param value allowed object is
     *              {@link ClocksThrottleReasonsType }
     */
    public void setClocksThrottleReasons(ClocksThrottleReasonsType value) {
        this.clocksThrottleReasons = value;
    }

    /**
     * Gets the value of the fbMemoryUsage property.
     *
     * @return possible object is
     * {@link FbMemoryUsageType }
     */
    public FbMemoryUsageType getFbMemoryUsage() {
        return fbMemoryUsage;
    }

    /**
     * Sets the value of the fbMemoryUsage property.
     *
     * @param value allowed object is
     *              {@link FbMemoryUsageType }
     */
    public void setFbMemoryUsage(FbMemoryUsageType value) {
        this.fbMemoryUsage = value;
    }

    /**
     * Gets the value of the bar1MemoryUsage property.
     *
     * @return possible object is
     * {@link Bar1MemoryUsageType }
     */
    public Bar1MemoryUsageType getBar1MemoryUsage() {
        return bar1MemoryUsage;
    }

    /**
     * Sets the value of the bar1MemoryUsage property.
     *
     * @param value allowed object is
     *              {@link Bar1MemoryUsageType }
     */
    public void setBar1MemoryUsage(Bar1MemoryUsageType value) {
        this.bar1MemoryUsage = value;
    }

    /**
     * Gets the value of the computeMode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getComputeMode() {
        return computeMode;
    }

    /**
     * Sets the value of the computeMode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setComputeMode(String value) {
        this.computeMode = value;
    }

    /**
     * Gets the value of the utilization property.
     *
     * @return possible object is
     * {@link UtilizationType }
     */
    public UtilizationType getUtilization() {
        return utilization;
    }

    /**
     * Sets the value of the utilization property.
     *
     * @param value allowed object is
     *              {@link UtilizationType }
     */
    public void setUtilization(UtilizationType value) {
        this.utilization = value;
    }

    /**
     * Gets the value of the encoderStats property.
     *
     * @return possible object is
     * {@link EncoderStatsType }
     */
    public EncoderStatsType getEncoderStats() {
        return encoderStats;
    }

    /**
     * Sets the value of the encoderStats property.
     *
     * @param value allowed object is
     *              {@link EncoderStatsType }
     */
    public void setEncoderStats(EncoderStatsType value) {
        this.encoderStats = value;
    }

    /**
     * Gets the value of the fbcStats property.
     *
     * @return possible object is
     * {@link FbcStatsType }
     */
    public FbcStatsType getFbcStats() {
        return fbcStats;
    }

    /**
     * Sets the value of the fbcStats property.
     *
     * @param value allowed object is
     *              {@link FbcStatsType }
     */
    public void setFbcStats(FbcStatsType value) {
        this.fbcStats = value;
    }

    /**
     * Gets the value of the eccMode property.
     *
     * @return possible object is
     * {@link EccModeType }
     */
    public EccModeType getEccMode() {
        return eccMode;
    }

    /**
     * Sets the value of the eccMode property.
     *
     * @param value allowed object is
     *              {@link EccModeType }
     */
    public void setEccMode(EccModeType value) {
        this.eccMode = value;
    }

    /**
     * Gets the value of the eccErrors property.
     *
     * @return possible object is
     * {@link EccErrorsType }
     */
    public EccErrorsType getEccErrors() {
        return eccErrors;
    }

    /**
     * Sets the value of the eccErrors property.
     *
     * @param value allowed object is
     *              {@link EccErrorsType }
     */
    public void setEccErrors(EccErrorsType value) {
        this.eccErrors = value;
    }

    /**
     * Gets the value of the retiredPages property.
     *
     * @return possible object is
     * {@link RetiredPagesType }
     */
    public RetiredPagesType getRetiredPages() {
        return retiredPages;
    }

    /**
     * Sets the value of the retiredPages property.
     *
     * @param value allowed object is
     *              {@link RetiredPagesType }
     */
    public void setRetiredPages(RetiredPagesType value) {
        this.retiredPages = value;
    }

    /**
     * Gets the value of the temperature property.
     *
     * @return possible object is
     * {@link TemperatureType }
     */
    public TemperatureType getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     *
     * @param value allowed object is
     *              {@link TemperatureType }
     */
    public void setTemperature(TemperatureType value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the powerReadings property.
     *
     * @return possible object is
     * {@link PowerReadingsType }
     */
    public PowerReadingsType getPowerReadings() {
        return powerReadings;
    }

    /**
     * Sets the value of the powerReadings property.
     *
     * @param value allowed object is
     *              {@link PowerReadingsType }
     */
    public void setPowerReadings(PowerReadingsType value) {
        this.powerReadings = value;
    }

    /**
     * Gets the value of the clocks property.
     *
     * @return possible object is
     * {@link ClocksType }
     */
    public ClocksType getClocks() {
        return clocks;
    }

    /**
     * Sets the value of the clocks property.
     *
     * @param value allowed object is
     *              {@link ClocksType }
     */
    public void setClocks(ClocksType value) {
        this.clocks = value;
    }

    /**
     * Gets the value of the applicationsClocks property.
     *
     * @return possible object is
     * {@link ApplicationsClocksType }
     */
    public ApplicationsClocksType getApplicationsClocks() {
        return applicationsClocks;
    }

    /**
     * Sets the value of the applicationsClocks property.
     *
     * @param value allowed object is
     *              {@link ApplicationsClocksType }
     */
    public void setApplicationsClocks(ApplicationsClocksType value) {
        this.applicationsClocks = value;
    }

    /**
     * Gets the value of the defaultApplicationsClocks property.
     *
     * @return possible object is
     * {@link DefaultApplicationsClocksType }
     */
    public DefaultApplicationsClocksType getDefaultApplicationsClocks() {
        return defaultApplicationsClocks;
    }

    /**
     * Sets the value of the defaultApplicationsClocks property.
     *
     * @param value allowed object is
     *              {@link DefaultApplicationsClocksType }
     */
    public void setDefaultApplicationsClocks(DefaultApplicationsClocksType value) {
        this.defaultApplicationsClocks = value;
    }

    /**
     * Gets the value of the maxClocks property.
     *
     * @return possible object is
     * {@link MaxClocksType }
     */
    public MaxClocksType getMaxClocks() {
        return maxClocks;
    }

    /**
     * Sets the value of the maxClocks property.
     *
     * @param value allowed object is
     *              {@link MaxClocksType }
     */
    public void setMaxClocks(MaxClocksType value) {
        this.maxClocks = value;
    }

    /**
     * Gets the value of the maxCustomerBoostClocks property.
     *
     * @return possible object is
     * {@link MaxCustomerBoostClocksType }
     */
    public MaxCustomerBoostClocksType getMaxCustomerBoostClocks() {
        return maxCustomerBoostClocks;
    }

    /**
     * Sets the value of the maxCustomerBoostClocks property.
     *
     * @param value allowed object is
     *              {@link MaxCustomerBoostClocksType }
     */
    public void setMaxCustomerBoostClocks(MaxCustomerBoostClocksType value) {
        this.maxCustomerBoostClocks = value;
    }

    /**
     * Gets the value of the clockPolicy property.
     *
     * @return possible object is
     * {@link ClockPolicyType }
     */
    public ClockPolicyType getClockPolicy() {
        return clockPolicy;
    }

    /**
     * Sets the value of the clockPolicy property.
     *
     * @param value allowed object is
     *              {@link ClockPolicyType }
     */
    public void setClockPolicy(ClockPolicyType value) {
        this.clockPolicy = value;
    }

    /**
     * Gets the value of the supportedClocks property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSupportedClocks() {
        return supportedClocks;
    }

    /**
     * Sets the value of the supportedClocks property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSupportedClocks(String value) {
        this.supportedClocks = value;
    }

    /**
     * Gets the value of the processes property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getProcesses() {
        return processes;
    }

    /**
     * Sets the value of the processes property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProcesses(String value) {
        this.processes = value;
    }

    /**
     * Gets the value of the accountedProcesses property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAccountedProcesses() {
        return accountedProcesses;
    }

    /**
     * Sets the value of the accountedProcesses property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAccountedProcesses(String value) {
        this.accountedProcesses = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

}

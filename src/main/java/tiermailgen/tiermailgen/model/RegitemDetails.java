package tiermailgen.tiermailgen.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * RegitemDetails generated by hbm2java
 */
@Entity
@Table(name = "regitem_details")
public class RegitemDetails implements java.io.Serializable {

	private Integer regItemDetUid;
	private RegistrationItems registrationItems;
	private Integer addEquipInforTypeUid;
	private BigDecimal adjustedPmFactor;
	private String apceExecOrderNo;
	private Integer apcefilterTypeUid;
	private Character auxEngineFlag;
	private Integer brakeHprangesUid;
	private Integer brakeHprangesUnitsUid;
	private Integer brakeHpvalue;
	private BigDecimal carbCertPmFactorOverride;
	private Short cctsOnHighway;
	private BigDecimal co;
	private String coOtherUnits;
	private Integer coUnitsUid;
	private String companyUnitId;
	private Character crusherEquipedFlag;
	private Integer currentTierUid;
	private String description;
	private Integer electrificationPercent;
	private String emissionPoints;
	private String engineFamily;
	private String enginePowersOther;
	private Integer enginePowersTypeUid;
	private Integer engineTypeLookupUid;
	private Integer engineUseTypeUid;
	private String equipmentId;
	private String flowrate;
	private Integer flowRateUnitsUid;
	private String fuelAddExecOrderNo;
	private Integer fuelAdditiveUid;
	private BigDecimal fuelConsumptionRate;
	private Integer fuelConsumptionUnitsUid;
	private Integer fuelTypeUsedUid;
	private String listDescription;
	private Integer manufacturerUid;
	private String manufacturerOther;
	private String model;
	private Integer modelYearsUid;
	private String monitoringOther;
	private Integer monitoringMethodsUid;
	private String nameOtherEmisData;
	private String nameSrcTestEmisData;
	private BigDecimal nox;
	private String noxOtherUnits;
	private Integer noxUnitsUid;
	private String nozzleDiameter;
	private Integer nozzleDiameterUnitsUid;
	private String nozzlePressure;
	private Integer nosslePressureUnitsUid;
	private Short numberOfUnits;
	private Integer pmControlEfficiency;
	private BigDecimal pm10;
	private String pm10OtherUnits;
	private Integer pm10UnitsUid;
	private Integer powerUoMUid;
	private BigDecimal powerRating;
	private Character pressureGaugeFlag;
	private String primaryComponentIndicator;
	private Integer regItemCompTypeUid;
	private String regItemCompTypeOther;
	private String resident;
	private String resident1995;
	private Character selfPropelledFlag;
	private String serialNo;
	private String series;
	private Integer siloCrusherCount;
	private String siloCrushers;
	private String sourceEmissionsData;
	private BigDecimal sox;
	private String soxOtherUnits;
	private Integer soxUnitsUid;
	private Integer stwtypesUid;
	private String throughputRating;
	private Integer tierUid;
	private String transferPoints;
	private Integer throughputRatingUnitsUid;
	private Character truckCentralMixFlag;
	private BigDecimal voc;
	private String vocOtherUnits;
	private Integer vocUnitsUid;
	private Integer wetBlastingPercentage;
	private Date woodProcAckDate;
	private Character woodProcAckFlag;
	private String woodProcAckUser;
	private char activeFlag;
	private String createModifiedBy;
	private Date createModifiedDate;
	private String legacyAbrasiveFlowRate;
	private String legacyNozzleDiameter;
	private String legacyNozzlePressure;
	private String legacyAbrasiveTypes;
	private String legacySandType;
	private String legacyOtherBlasting;
	private String legacyEmissionControls;
	private Integer legacyPmControlEfficency;
	private String legacyThroughPutRating;
	private String legacyMaterialsProcessed;
	private String legacyEmissionPoints;
	private String legacyTransferPoints;
	private String legacySilosCrushers;
	private Double legacyFuelConsumptionRate;
	private String legacyFuelConsumptionUnits;
	private String legacyResident;
	private String legacyResident1995;
	private String legacyMonitoringMethods;
	private String legacyEngineFamily;
	private Character administrativeBypassFlag;
	private String administrativeBypassReason;

	public RegitemDetails() {
	}

	public RegitemDetails(RegistrationItems registrationItems, String primaryComponentIndicator, char activeFlag,
			String createModifiedBy, Date createModifiedDate) {
		this.registrationItems = registrationItems;
		this.primaryComponentIndicator = primaryComponentIndicator;
		this.activeFlag = activeFlag;
		this.createModifiedBy = createModifiedBy;
		this.createModifiedDate = createModifiedDate;
	}

	public RegitemDetails(RegistrationItems registrationItems, Integer addEquipInforTypeUid,
			BigDecimal adjustedPmFactor, String apceExecOrderNo, Integer apcefilterTypeUid, Character auxEngineFlag,
			Integer brakeHprangesUid, Integer brakeHprangesUnitsUid, Integer brakeHpvalue,
			BigDecimal carbCertPmFactorOverride, Short cctsOnHighway, BigDecimal co, String coOtherUnits,
			Integer coUnitsUid, String companyUnitId, Character crusherEquipedFlag, Integer currentTierUid,
			String description, Integer electrificationPercent, String emissionPoints, String engineFamily,
			String enginePowersOther, Integer enginePowersTypeUid, Integer engineTypeLookupUid,
			Integer engineUseTypeUid, String equipmentId, String flowrate, Integer flowRateUnitsUid,
			String fuelAddExecOrderNo, Integer fuelAdditiveUid, BigDecimal fuelConsumptionRate,
			Integer fuelConsumptionUnitsUid, Integer fuelTypeUsedUid, String listDescription, Integer manufacturerUid,
			String manufacturerOther, String model, Integer modelYearsUid, String monitoringOther,
			Integer monitoringMethodsUid, String nameOtherEmisData, String nameSrcTestEmisData, BigDecimal nox,
			String noxOtherUnits, Integer noxUnitsUid, String nozzleDiameter, Integer nozzleDiameterUnitsUid,
			String nozzlePressure, Integer nosslePressureUnitsUid, Short numberOfUnits, Integer pmControlEfficiency,
			BigDecimal pm10, String pm10OtherUnits, Integer pm10UnitsUid, Integer powerUoMUid, BigDecimal powerRating,
			Character pressureGaugeFlag, String primaryComponentIndicator, Integer regItemCompTypeUid,
			String regItemCompTypeOther, String resident, String resident1995, Character selfPropelledFlag,
			String serialNo, String series, Integer siloCrusherCount, String siloCrushers, String sourceEmissionsData,
			BigDecimal sox, String soxOtherUnits, Integer soxUnitsUid, Integer stwtypesUid, String throughputRating,
			Integer tierUid, String transferPoints, Integer throughputRatingUnitsUid, Character truckCentralMixFlag,
			BigDecimal voc, String vocOtherUnits, Integer vocUnitsUid, Integer wetBlastingPercentage,
			Date woodProcAckDate, Character woodProcAckFlag, String woodProcAckUser, char activeFlag,
			String createModifiedBy, Date createModifiedDate, String legacyAbrasiveFlowRate,
			String legacyNozzleDiameter, String legacyNozzlePressure, String legacyAbrasiveTypes, String legacySandType,
			String legacyOtherBlasting, String legacyEmissionControls, Integer legacyPmControlEfficency,
			String legacyThroughPutRating, String legacyMaterialsProcessed, String legacyEmissionPoints,
			String legacyTransferPoints, String legacySilosCrushers, Double legacyFuelConsumptionRate,
			String legacyFuelConsumptionUnits, String legacyResident, String legacyResident1995,
			String legacyMonitoringMethods, String legacyEngineFamily, Character administrativeBypassFlag,
			String administrativeBypassReason) {
		this.registrationItems = registrationItems;
		this.addEquipInforTypeUid = addEquipInforTypeUid;
		this.adjustedPmFactor = adjustedPmFactor;
		this.apceExecOrderNo = apceExecOrderNo;
		this.apcefilterTypeUid = apcefilterTypeUid;
		this.auxEngineFlag = auxEngineFlag;
		this.brakeHprangesUid = brakeHprangesUid;
		this.brakeHprangesUnitsUid = brakeHprangesUnitsUid;
		this.brakeHpvalue = brakeHpvalue;
		this.carbCertPmFactorOverride = carbCertPmFactorOverride;
		this.cctsOnHighway = cctsOnHighway;
		this.co = co;
		this.coOtherUnits = coOtherUnits;
		this.coUnitsUid = coUnitsUid;
		this.companyUnitId = companyUnitId;
		this.crusherEquipedFlag = crusherEquipedFlag;
		this.currentTierUid = currentTierUid;
		this.description = description;
		this.electrificationPercent = electrificationPercent;
		this.emissionPoints = emissionPoints;
		this.engineFamily = engineFamily;
		this.enginePowersOther = enginePowersOther;
		this.enginePowersTypeUid = enginePowersTypeUid;
		this.engineTypeLookupUid = engineTypeLookupUid;
		this.engineUseTypeUid = engineUseTypeUid;
		this.equipmentId = equipmentId;
		this.flowrate = flowrate;
		this.flowRateUnitsUid = flowRateUnitsUid;
		this.fuelAddExecOrderNo = fuelAddExecOrderNo;
		this.fuelAdditiveUid = fuelAdditiveUid;
		this.fuelConsumptionRate = fuelConsumptionRate;
		this.fuelConsumptionUnitsUid = fuelConsumptionUnitsUid;
		this.fuelTypeUsedUid = fuelTypeUsedUid;
		this.listDescription = listDescription;
		this.manufacturerUid = manufacturerUid;
		this.manufacturerOther = manufacturerOther;
		this.model = model;
		this.modelYearsUid = modelYearsUid;
		this.monitoringOther = monitoringOther;
		this.monitoringMethodsUid = monitoringMethodsUid;
		this.nameOtherEmisData = nameOtherEmisData;
		this.nameSrcTestEmisData = nameSrcTestEmisData;
		this.nox = nox;
		this.noxOtherUnits = noxOtherUnits;
		this.noxUnitsUid = noxUnitsUid;
		this.nozzleDiameter = nozzleDiameter;
		this.nozzleDiameterUnitsUid = nozzleDiameterUnitsUid;
		this.nozzlePressure = nozzlePressure;
		this.nosslePressureUnitsUid = nosslePressureUnitsUid;
		this.numberOfUnits = numberOfUnits;
		this.pmControlEfficiency = pmControlEfficiency;
		this.pm10 = pm10;
		this.pm10OtherUnits = pm10OtherUnits;
		this.pm10UnitsUid = pm10UnitsUid;
		this.powerUoMUid = powerUoMUid;
		this.powerRating = powerRating;
		this.pressureGaugeFlag = pressureGaugeFlag;
		this.primaryComponentIndicator = primaryComponentIndicator;
		this.regItemCompTypeUid = regItemCompTypeUid;
		this.regItemCompTypeOther = regItemCompTypeOther;
		this.resident = resident;
		this.resident1995 = resident1995;
		this.selfPropelledFlag = selfPropelledFlag;
		this.serialNo = serialNo;
		this.series = series;
		this.siloCrusherCount = siloCrusherCount;
		this.siloCrushers = siloCrushers;
		this.sourceEmissionsData = sourceEmissionsData;
		this.sox = sox;
		this.soxOtherUnits = soxOtherUnits;
		this.soxUnitsUid = soxUnitsUid;
		this.stwtypesUid = stwtypesUid;
		this.throughputRating = throughputRating;
		this.tierUid = tierUid;
		this.transferPoints = transferPoints;
		this.throughputRatingUnitsUid = throughputRatingUnitsUid;
		this.truckCentralMixFlag = truckCentralMixFlag;
		this.voc = voc;
		this.vocOtherUnits = vocOtherUnits;
		this.vocUnitsUid = vocUnitsUid;
		this.wetBlastingPercentage = wetBlastingPercentage;
		this.woodProcAckDate = woodProcAckDate;
		this.woodProcAckFlag = woodProcAckFlag;
		this.woodProcAckUser = woodProcAckUser;
		this.activeFlag = activeFlag;
		this.createModifiedBy = createModifiedBy;
		this.createModifiedDate = createModifiedDate;
		this.legacyAbrasiveFlowRate = legacyAbrasiveFlowRate;
		this.legacyNozzleDiameter = legacyNozzleDiameter;
		this.legacyNozzlePressure = legacyNozzlePressure;
		this.legacyAbrasiveTypes = legacyAbrasiveTypes;
		this.legacySandType = legacySandType;
		this.legacyOtherBlasting = legacyOtherBlasting;
		this.legacyEmissionControls = legacyEmissionControls;
		this.legacyPmControlEfficency = legacyPmControlEfficency;
		this.legacyThroughPutRating = legacyThroughPutRating;
		this.legacyMaterialsProcessed = legacyMaterialsProcessed;
		this.legacyEmissionPoints = legacyEmissionPoints;
		this.legacyTransferPoints = legacyTransferPoints;
		this.legacySilosCrushers = legacySilosCrushers;
		this.legacyFuelConsumptionRate = legacyFuelConsumptionRate;
		this.legacyFuelConsumptionUnits = legacyFuelConsumptionUnits;
		this.legacyResident = legacyResident;
		this.legacyResident1995 = legacyResident1995;
		this.legacyMonitoringMethods = legacyMonitoringMethods;
		this.legacyEngineFamily = legacyEngineFamily;
		this.administrativeBypassFlag = administrativeBypassFlag;
		this.administrativeBypassReason = administrativeBypassReason;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "RegItemDet_UID", unique = true, nullable = false)
	public Integer getRegItemDetUid() {
		return this.regItemDetUid;
	}

	public void setRegItemDetUid(Integer regItemDetUid) {
		this.regItemDetUid = regItemDetUid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RegItem_UID", nullable = false)
	public RegistrationItems getRegistrationItems() {
		return this.registrationItems;
	}

	public void setRegistrationItems(RegistrationItems registrationItems) {
		this.registrationItems = registrationItems;
	}

	@Column(name = "AddEquipInforType_UID")
	public Integer getAddEquipInforTypeUid() {
		return this.addEquipInforTypeUid;
	}

	public void setAddEquipInforTypeUid(Integer addEquipInforTypeUid) {
		this.addEquipInforTypeUid = addEquipInforTypeUid;
	}

	@Column(name = "Adjusted_PM_Factor", precision = 10)
	public BigDecimal getAdjustedPmFactor() {
		return this.adjustedPmFactor;
	}

	public void setAdjustedPmFactor(BigDecimal adjustedPmFactor) {
		this.adjustedPmFactor = adjustedPmFactor;
	}

	@Column(name = "APCE_ExecOrderNo", length = 20)
	public String getApceExecOrderNo() {
		return this.apceExecOrderNo;
	}

	public void setApceExecOrderNo(String apceExecOrderNo) {
		this.apceExecOrderNo = apceExecOrderNo;
	}

	@Column(name = "APCEFilterType_UID")
	public Integer getApcefilterTypeUid() {
		return this.apcefilterTypeUid;
	}

	public void setApcefilterTypeUid(Integer apcefilterTypeUid) {
		this.apcefilterTypeUid = apcefilterTypeUid;
	}

	@Column(name = "Aux_Engine_Flag", length = 1)
	public Character getAuxEngineFlag() {
		return this.auxEngineFlag;
	}

	public void setAuxEngineFlag(Character auxEngineFlag) {
		this.auxEngineFlag = auxEngineFlag;
	}

	@Column(name = "BrakeHPRanges_UID")
	public Integer getBrakeHprangesUid() {
		return this.brakeHprangesUid;
	}

	public void setBrakeHprangesUid(Integer brakeHprangesUid) {
		this.brakeHprangesUid = brakeHprangesUid;
	}

	@Column(name = "BrakeHPRanges_Units_UID")
	public Integer getBrakeHprangesUnitsUid() {
		return this.brakeHprangesUnitsUid;
	}

	public void setBrakeHprangesUnitsUid(Integer brakeHprangesUnitsUid) {
		this.brakeHprangesUnitsUid = brakeHprangesUnitsUid;
	}

	@Column(name = "BrakeHPValue")
	public Integer getBrakeHpvalue() {
		return this.brakeHpvalue;
	}

	public void setBrakeHpvalue(Integer brakeHpvalue) {
		this.brakeHpvalue = brakeHpvalue;
	}

	@Column(name = "CARB_Cert_PM_Factor_Override", precision = 10)
	public BigDecimal getCarbCertPmFactorOverride() {
		return this.carbCertPmFactorOverride;
	}

	public void setCarbCertPmFactorOverride(BigDecimal carbCertPmFactorOverride) {
		this.carbCertPmFactorOverride = carbCertPmFactorOverride;
	}

	@Column(name = "CCTS_OnHighway")
	public Short getCctsOnHighway() {
		return this.cctsOnHighway;
	}

	public void setCctsOnHighway(Short cctsOnHighway) {
		this.cctsOnHighway = cctsOnHighway;
	}

	@Column(name = "CO", precision = 10, scale = 4)
	public BigDecimal getCo() {
		return this.co;
	}

	public void setCo(BigDecimal co) {
		this.co = co;
	}

	@Column(name = "CO_Other_Units", length = 12)
	public String getCoOtherUnits() {
		return this.coOtherUnits;
	}

	public void setCoOtherUnits(String coOtherUnits) {
		this.coOtherUnits = coOtherUnits;
	}

	@Column(name = "CO_Units_UID")
	public Integer getCoUnitsUid() {
		return this.coUnitsUid;
	}

	public void setCoUnitsUid(Integer coUnitsUid) {
		this.coUnitsUid = coUnitsUid;
	}

	@Column(name = "Company_Unit_ID", length = 60)
	public String getCompanyUnitId() {
		return this.companyUnitId;
	}

	public void setCompanyUnitId(String companyUnitId) {
		this.companyUnitId = companyUnitId;
	}

	@Column(name = "Crusher_Equiped_Flag", length = 1)
	public Character getCrusherEquipedFlag() {
		return this.crusherEquipedFlag;
	}

	public void setCrusherEquipedFlag(Character crusherEquipedFlag) {
		this.crusherEquipedFlag = crusherEquipedFlag;
	}

	@Column(name = "CurrentTier_UID")
	public Integer getCurrentTierUid() {
		return this.currentTierUid;
	}

	public void setCurrentTierUid(Integer currentTierUid) {
		this.currentTierUid = currentTierUid;
	}

	@Column(name = "Description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "Electrification_Percent")
	public Integer getElectrificationPercent() {
		return this.electrificationPercent;
	}

	public void setElectrificationPercent(Integer electrificationPercent) {
		this.electrificationPercent = electrificationPercent;
	}

	@Column(name = "Emission_Points")
	public String getEmissionPoints() {
		return this.emissionPoints;
	}

	public void setEmissionPoints(String emissionPoints) {
		this.emissionPoints = emissionPoints;
	}

	@Column(name = "Engine_Family", length = 12)
	public String getEngineFamily() {
		return this.engineFamily;
	}

	public void setEngineFamily(String engineFamily) {
		this.engineFamily = engineFamily;
	}

	@Column(name = "EnginePowersOther")
	public String getEnginePowersOther() {
		return this.enginePowersOther;
	}

	public void setEnginePowersOther(String enginePowersOther) {
		this.enginePowersOther = enginePowersOther;
	}

	@Column(name = "EnginePowersType_UID")
	public Integer getEnginePowersTypeUid() {
		return this.enginePowersTypeUid;
	}

	public void setEnginePowersTypeUid(Integer enginePowersTypeUid) {
		this.enginePowersTypeUid = enginePowersTypeUid;
	}

	@Column(name = "EngineTypeLookup_UID")
	public Integer getEngineTypeLookupUid() {
		return this.engineTypeLookupUid;
	}

	public void setEngineTypeLookupUid(Integer engineTypeLookupUid) {
		this.engineTypeLookupUid = engineTypeLookupUid;
	}

	@Column(name = "EngineUseType_UID")
	public Integer getEngineUseTypeUid() {
		return this.engineUseTypeUid;
	}

	public void setEngineUseTypeUid(Integer engineUseTypeUid) {
		this.engineUseTypeUid = engineUseTypeUid;
	}

	@Column(name = "Equipment_ID", length = 70)
	public String getEquipmentId() {
		return this.equipmentId;
	}

	public void setEquipmentId(String equipmentId) {
		this.equipmentId = equipmentId;
	}

	@Column(name = "Flowrate", length = 20)
	public String getFlowrate() {
		return this.flowrate;
	}

	public void setFlowrate(String flowrate) {
		this.flowrate = flowrate;
	}

	@Column(name = "FlowRate_Units_UID")
	public Integer getFlowRateUnitsUid() {
		return this.flowRateUnitsUid;
	}

	public void setFlowRateUnitsUid(Integer flowRateUnitsUid) {
		this.flowRateUnitsUid = flowRateUnitsUid;
	}

	@Column(name = "FuelAdd_ExecOrderNo", length = 20)
	public String getFuelAddExecOrderNo() {
		return this.fuelAddExecOrderNo;
	}

	public void setFuelAddExecOrderNo(String fuelAddExecOrderNo) {
		this.fuelAddExecOrderNo = fuelAddExecOrderNo;
	}

	@Column(name = "FuelAdditive_UID")
	public Integer getFuelAdditiveUid() {
		return this.fuelAdditiveUid;
	}

	public void setFuelAdditiveUid(Integer fuelAdditiveUid) {
		this.fuelAdditiveUid = fuelAdditiveUid;
	}

	@Column(name = "Fuel_Consumption_Rate", precision = 15, scale = 5)
	public BigDecimal getFuelConsumptionRate() {
		return this.fuelConsumptionRate;
	}

	public void setFuelConsumptionRate(BigDecimal fuelConsumptionRate) {
		this.fuelConsumptionRate = fuelConsumptionRate;
	}

	@Column(name = "FuelConsumption_Units_UID")
	public Integer getFuelConsumptionUnitsUid() {
		return this.fuelConsumptionUnitsUid;
	}

	public void setFuelConsumptionUnitsUid(Integer fuelConsumptionUnitsUid) {
		this.fuelConsumptionUnitsUid = fuelConsumptionUnitsUid;
	}

	@Column(name = "FuelTypeUsed_UID")
	public Integer getFuelTypeUsedUid() {
		return this.fuelTypeUsedUid;
	}

	public void setFuelTypeUsedUid(Integer fuelTypeUsedUid) {
		this.fuelTypeUsedUid = fuelTypeUsedUid;
	}

	@Column(name = "List_Description")
	public String getListDescription() {
		return this.listDescription;
	}

	public void setListDescription(String listDescription) {
		this.listDescription = listDescription;
	}

	@Column(name = "Manufacturer_UID")
	public Integer getManufacturerUid() {
		return this.manufacturerUid;
	}

	public void setManufacturerUid(Integer manufacturerUid) {
		this.manufacturerUid = manufacturerUid;
	}

	@Column(name = "Manufacturer_Other", length = 60)
	public String getManufacturerOther() {
		return this.manufacturerOther;
	}

	public void setManufacturerOther(String manufacturerOther) {
		this.manufacturerOther = manufacturerOther;
	}

	@Column(name = "Model", length = 45)
	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Column(name = "ModelYears_UID")
	public Integer getModelYearsUid() {
		return this.modelYearsUid;
	}

	public void setModelYearsUid(Integer modelYearsUid) {
		this.modelYearsUid = modelYearsUid;
	}

	@Column(name = "Monitoring_Other", length = 50)
	public String getMonitoringOther() {
		return this.monitoringOther;
	}

	public void setMonitoringOther(String monitoringOther) {
		this.monitoringOther = monitoringOther;
	}

	@Column(name = "MonitoringMethods_UID")
	public Integer getMonitoringMethodsUid() {
		return this.monitoringMethodsUid;
	}

	public void setMonitoringMethodsUid(Integer monitoringMethodsUid) {
		this.monitoringMethodsUid = monitoringMethodsUid;
	}

	@Column(name = "Name_Other_Emis_Data", length = 40)
	public String getNameOtherEmisData() {
		return this.nameOtherEmisData;
	}

	public void setNameOtherEmisData(String nameOtherEmisData) {
		this.nameOtherEmisData = nameOtherEmisData;
	}

	@Column(name = "Name_Src_Test_Emis_Data", length = 40)
	public String getNameSrcTestEmisData() {
		return this.nameSrcTestEmisData;
	}

	public void setNameSrcTestEmisData(String nameSrcTestEmisData) {
		this.nameSrcTestEmisData = nameSrcTestEmisData;
	}

	@Column(name = "NOx", precision = 10, scale = 4)
	public BigDecimal getNox() {
		return this.nox;
	}

	public void setNox(BigDecimal nox) {
		this.nox = nox;
	}

	@Column(name = "NOx_Other_Units", length = 12)
	public String getNoxOtherUnits() {
		return this.noxOtherUnits;
	}

	public void setNoxOtherUnits(String noxOtherUnits) {
		this.noxOtherUnits = noxOtherUnits;
	}

	@Column(name = "NOx_Units_UID")
	public Integer getNoxUnitsUid() {
		return this.noxUnitsUid;
	}

	public void setNoxUnitsUid(Integer noxUnitsUid) {
		this.noxUnitsUid = noxUnitsUid;
	}

	@Column(name = "Nozzle_Diameter", length = 15)
	public String getNozzleDiameter() {
		return this.nozzleDiameter;
	}

	public void setNozzleDiameter(String nozzleDiameter) {
		this.nozzleDiameter = nozzleDiameter;
	}

	@Column(name = "NozzleDiameter_Units_UID")
	public Integer getNozzleDiameterUnitsUid() {
		return this.nozzleDiameterUnitsUid;
	}

	public void setNozzleDiameterUnitsUid(Integer nozzleDiameterUnitsUid) {
		this.nozzleDiameterUnitsUid = nozzleDiameterUnitsUid;
	}

	@Column(name = "Nozzle_Pressure", length = 15)
	public String getNozzlePressure() {
		return this.nozzlePressure;
	}

	public void setNozzlePressure(String nozzlePressure) {
		this.nozzlePressure = nozzlePressure;
	}

	@Column(name = "NosslePressure_Units_UID")
	public Integer getNosslePressureUnitsUid() {
		return this.nosslePressureUnitsUid;
	}

	public void setNosslePressureUnitsUid(Integer nosslePressureUnitsUid) {
		this.nosslePressureUnitsUid = nosslePressureUnitsUid;
	}

	@Column(name = "Number_Of_Units")
	public Short getNumberOfUnits() {
		return this.numberOfUnits;
	}

	public void setNumberOfUnits(Short numberOfUnits) {
		this.numberOfUnits = numberOfUnits;
	}

	@Column(name = "PM_Control_Efficiency")
	public Integer getPmControlEfficiency() {
		return this.pmControlEfficiency;
	}

	public void setPmControlEfficiency(Integer pmControlEfficiency) {
		this.pmControlEfficiency = pmControlEfficiency;
	}

	@Column(name = "PM10", precision = 10, scale = 4)
	public BigDecimal getPm10() {
		return this.pm10;
	}

	public void setPm10(BigDecimal pm10) {
		this.pm10 = pm10;
	}

	@Column(name = "PM10_Other_Units", length = 12)
	public String getPm10OtherUnits() {
		return this.pm10OtherUnits;
	}

	public void setPm10OtherUnits(String pm10OtherUnits) {
		this.pm10OtherUnits = pm10OtherUnits;
	}

	@Column(name = "PM10_Units_UID")
	public Integer getPm10UnitsUid() {
		return this.pm10UnitsUid;
	}

	public void setPm10UnitsUid(Integer pm10UnitsUid) {
		this.pm10UnitsUid = pm10UnitsUid;
	}

	@Column(name = "PowerUoM_UID")
	public Integer getPowerUoMUid() {
		return this.powerUoMUid;
	}

	public void setPowerUoMUid(Integer powerUoMUid) {
		this.powerUoMUid = powerUoMUid;
	}

	@Column(name = "Power_Rating", precision = 15, scale = 5)
	public BigDecimal getPowerRating() {
		return this.powerRating;
	}

	public void setPowerRating(BigDecimal powerRating) {
		this.powerRating = powerRating;
	}

	@Column(name = "Pressure_Gauge_Flag", length = 1)
	public Character getPressureGaugeFlag() {
		return this.pressureGaugeFlag;
	}

	public void setPressureGaugeFlag(Character pressureGaugeFlag) {
		this.pressureGaugeFlag = pressureGaugeFlag;
	}

	@Column(name = "Primary_Component_Indicator", nullable = false, length = 10)
	public String getPrimaryComponentIndicator() {
		return this.primaryComponentIndicator;
	}

	public void setPrimaryComponentIndicator(String primaryComponentIndicator) {
		this.primaryComponentIndicator = primaryComponentIndicator;
	}

	@Column(name = "RegItemCompType_UID")
	public Integer getRegItemCompTypeUid() {
		return this.regItemCompTypeUid;
	}

	public void setRegItemCompTypeUid(Integer regItemCompTypeUid) {
		this.regItemCompTypeUid = regItemCompTypeUid;
	}

	@Column(name = "RegItemCompType_Other", length = 60)
	public String getRegItemCompTypeOther() {
		return this.regItemCompTypeOther;
	}

	public void setRegItemCompTypeOther(String regItemCompTypeOther) {
		this.regItemCompTypeOther = regItemCompTypeOther;
	}

	@Column(name = "Resident", length = 2)
	public String getResident() {
		return this.resident;
	}

	public void setResident(String resident) {
		this.resident = resident;
	}

	@Column(name = "Resident_1995", length = 2)
	public String getResident1995() {
		return this.resident1995;
	}

	public void setResident1995(String resident1995) {
		this.resident1995 = resident1995;
	}

	@Column(name = "Self_Propelled_Flag", length = 1)
	public Character getSelfPropelledFlag() {
		return this.selfPropelledFlag;
	}

	public void setSelfPropelledFlag(Character selfPropelledFlag) {
		this.selfPropelledFlag = selfPropelledFlag;
	}

	@Column(name = "Serial_No", length = 30)
	public String getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	@Column(name = "Series", length = 20)
	public String getSeries() {
		return this.series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	@Column(name = "Silo_Crusher_Count")
	public Integer getSiloCrusherCount() {
		return this.siloCrusherCount;
	}

	public void setSiloCrusherCount(Integer siloCrusherCount) {
		this.siloCrusherCount = siloCrusherCount;
	}

	@Column(name = "Silo_Crushers")
	public String getSiloCrushers() {
		return this.siloCrushers;
	}

	public void setSiloCrushers(String siloCrushers) {
		this.siloCrushers = siloCrushers;
	}

	@Column(name = "Source_Emissions_Data", length = 10)
	public String getSourceEmissionsData() {
		return this.sourceEmissionsData;
	}

	public void setSourceEmissionsData(String sourceEmissionsData) {
		this.sourceEmissionsData = sourceEmissionsData;
	}

	@Column(name = "SOx", precision = 10, scale = 4)
	public BigDecimal getSox() {
		return this.sox;
	}

	public void setSox(BigDecimal sox) {
		this.sox = sox;
	}

	@Column(name = "SOx_Other_Units", length = 12)
	public String getSoxOtherUnits() {
		return this.soxOtherUnits;
	}

	public void setSoxOtherUnits(String soxOtherUnits) {
		this.soxOtherUnits = soxOtherUnits;
	}

	@Column(name = "SOx_Units_UID")
	public Integer getSoxUnitsUid() {
		return this.soxUnitsUid;
	}

	public void setSoxUnitsUid(Integer soxUnitsUid) {
		this.soxUnitsUid = soxUnitsUid;
	}

	@Column(name = "STWTypes_UID")
	public Integer getStwtypesUid() {
		return this.stwtypesUid;
	}

	public void setStwtypesUid(Integer stwtypesUid) {
		this.stwtypesUid = stwtypesUid;
	}

	@Column(name = "Throughput_Rating", length = 40)
	public String getThroughputRating() {
		return this.throughputRating;
	}

	public void setThroughputRating(String throughputRating) {
		this.throughputRating = throughputRating;
	}

	@Column(name = "Tier_UID")
	public Integer getTierUid() {
		return this.tierUid;
	}

	public void setTierUid(Integer tierUid) {
		this.tierUid = tierUid;
	}

	@Column(name = "Transfer_Points")
	public String getTransferPoints() {
		return this.transferPoints;
	}

	public void setTransferPoints(String transferPoints) {
		this.transferPoints = transferPoints;
	}

	@Column(name = "ThroughputRating_Units_UID")
	public Integer getThroughputRatingUnitsUid() {
		return this.throughputRatingUnitsUid;
	}

	public void setThroughputRatingUnitsUid(Integer throughputRatingUnitsUid) {
		this.throughputRatingUnitsUid = throughputRatingUnitsUid;
	}

	@Column(name = "Truck_CentralMix_Flag", length = 1)
	public Character getTruckCentralMixFlag() {
		return this.truckCentralMixFlag;
	}

	public void setTruckCentralMixFlag(Character truckCentralMixFlag) {
		this.truckCentralMixFlag = truckCentralMixFlag;
	}

	@Column(name = "VOC", precision = 10, scale = 4)
	public BigDecimal getVoc() {
		return this.voc;
	}

	public void setVoc(BigDecimal voc) {
		this.voc = voc;
	}

	@Column(name = "VOC_Other_Units", length = 12)
	public String getVocOtherUnits() {
		return this.vocOtherUnits;
	}

	public void setVocOtherUnits(String vocOtherUnits) {
		this.vocOtherUnits = vocOtherUnits;
	}

	@Column(name = "VOC_Units_UID")
	public Integer getVocUnitsUid() {
		return this.vocUnitsUid;
	}

	public void setVocUnitsUid(Integer vocUnitsUid) {
		this.vocUnitsUid = vocUnitsUid;
	}

	@Column(name = "Wet_Blasting_Percentage")
	public Integer getWetBlastingPercentage() {
		return this.wetBlastingPercentage;
	}

	public void setWetBlastingPercentage(Integer wetBlastingPercentage) {
		this.wetBlastingPercentage = wetBlastingPercentage;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "WoodProcAck_Date", length = 10)
	public Date getWoodProcAckDate() {
		return this.woodProcAckDate;
	}

	public void setWoodProcAckDate(Date woodProcAckDate) {
		this.woodProcAckDate = woodProcAckDate;
	}

	@Column(name = "WoodProcAck_Flag", length = 1)
	public Character getWoodProcAckFlag() {
		return this.woodProcAckFlag;
	}

	public void setWoodProcAckFlag(Character woodProcAckFlag) {
		this.woodProcAckFlag = woodProcAckFlag;
	}

	@Column(name = "WoodProcAck_User", length = 45)
	public String getWoodProcAckUser() {
		return this.woodProcAckUser;
	}

	public void setWoodProcAckUser(String woodProcAckUser) {
		this.woodProcAckUser = woodProcAckUser;
	}

	@Column(name = "Active_Flag", nullable = false, length = 1)
	public char getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(char activeFlag) {
		this.activeFlag = activeFlag;
	}

	@Column(name = "Create_Modified_By", nullable = false, length = 45)
	public String getCreateModifiedBy() {
		return this.createModifiedBy;
	}

	public void setCreateModifiedBy(String createModifiedBy) {
		this.createModifiedBy = createModifiedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Create_Modified_Date", nullable = false, length = 19)
	public Date getCreateModifiedDate() {
		return this.createModifiedDate;
	}

	public void setCreateModifiedDate(Date createModifiedDate) {
		this.createModifiedDate = createModifiedDate;
	}

	@Column(name = "Legacy_AbrasiveFlowRate", length = 20)
	public String getLegacyAbrasiveFlowRate() {
		return this.legacyAbrasiveFlowRate;
	}

	public void setLegacyAbrasiveFlowRate(String legacyAbrasiveFlowRate) {
		this.legacyAbrasiveFlowRate = legacyAbrasiveFlowRate;
	}

	@Column(name = "Legacy_NozzleDiameter", length = 15)
	public String getLegacyNozzleDiameter() {
		return this.legacyNozzleDiameter;
	}

	public void setLegacyNozzleDiameter(String legacyNozzleDiameter) {
		this.legacyNozzleDiameter = legacyNozzleDiameter;
	}

	@Column(name = "Legacy_NozzlePressure", length = 15)
	public String getLegacyNozzlePressure() {
		return this.legacyNozzlePressure;
	}

	public void setLegacyNozzlePressure(String legacyNozzlePressure) {
		this.legacyNozzlePressure = legacyNozzlePressure;
	}

	@Column(name = "Legacy_AbrasiveTypes", length = 60)
	public String getLegacyAbrasiveTypes() {
		return this.legacyAbrasiveTypes;
	}

	public void setLegacyAbrasiveTypes(String legacyAbrasiveTypes) {
		this.legacyAbrasiveTypes = legacyAbrasiveTypes;
	}

	@Column(name = "Legacy_SandType", length = 20)
	public String getLegacySandType() {
		return this.legacySandType;
	}

	public void setLegacySandType(String legacySandType) {
		this.legacySandType = legacySandType;
	}

	@Column(name = "Legacy_OtherBlasting")
	public String getLegacyOtherBlasting() {
		return this.legacyOtherBlasting;
	}

	public void setLegacyOtherBlasting(String legacyOtherBlasting) {
		this.legacyOtherBlasting = legacyOtherBlasting;
	}

	@Column(name = "Legacy_EmissionControls")
	public String getLegacyEmissionControls() {
		return this.legacyEmissionControls;
	}

	public void setLegacyEmissionControls(String legacyEmissionControls) {
		this.legacyEmissionControls = legacyEmissionControls;
	}

	@Column(name = "Legacy_PmControlEfficency")
	public Integer getLegacyPmControlEfficency() {
		return this.legacyPmControlEfficency;
	}

	public void setLegacyPmControlEfficency(Integer legacyPmControlEfficency) {
		this.legacyPmControlEfficency = legacyPmControlEfficency;
	}

	@Column(name = "Legacy_ThroughPutRating", length = 40)
	public String getLegacyThroughPutRating() {
		return this.legacyThroughPutRating;
	}

	public void setLegacyThroughPutRating(String legacyThroughPutRating) {
		this.legacyThroughPutRating = legacyThroughPutRating;
	}

	@Column(name = "Legacy_MaterialsProcessed")
	public String getLegacyMaterialsProcessed() {
		return this.legacyMaterialsProcessed;
	}

	public void setLegacyMaterialsProcessed(String legacyMaterialsProcessed) {
		this.legacyMaterialsProcessed = legacyMaterialsProcessed;
	}

	@Column(name = "Legacy_EmissionPoints")
	public String getLegacyEmissionPoints() {
		return this.legacyEmissionPoints;
	}

	public void setLegacyEmissionPoints(String legacyEmissionPoints) {
		this.legacyEmissionPoints = legacyEmissionPoints;
	}

	@Column(name = "Legacy_TransferPoints")
	public String getLegacyTransferPoints() {
		return this.legacyTransferPoints;
	}

	public void setLegacyTransferPoints(String legacyTransferPoints) {
		this.legacyTransferPoints = legacyTransferPoints;
	}

	@Column(name = "Legacy_SilosCrushers")
	public String getLegacySilosCrushers() {
		return this.legacySilosCrushers;
	}

	public void setLegacySilosCrushers(String legacySilosCrushers) {
		this.legacySilosCrushers = legacySilosCrushers;
	}

	@Column(name = "Legacy_FuelConsumptionRate", precision = 7)
	public Double getLegacyFuelConsumptionRate() {
		return this.legacyFuelConsumptionRate;
	}

	public void setLegacyFuelConsumptionRate(Double legacyFuelConsumptionRate) {
		this.legacyFuelConsumptionRate = legacyFuelConsumptionRate;
	}

	@Column(name = "Legacy_FuelConsumptionUnits", length = 15)
	public String getLegacyFuelConsumptionUnits() {
		return this.legacyFuelConsumptionUnits;
	}

	public void setLegacyFuelConsumptionUnits(String legacyFuelConsumptionUnits) {
		this.legacyFuelConsumptionUnits = legacyFuelConsumptionUnits;
	}

	@Column(name = "Legacy_Resident", length = 60)
	public String getLegacyResident() {
		return this.legacyResident;
	}

	public void setLegacyResident(String legacyResident) {
		this.legacyResident = legacyResident;
	}

	@Column(name = "Legacy_Resident1995")
	public String getLegacyResident1995() {
		return this.legacyResident1995;
	}

	public void setLegacyResident1995(String legacyResident1995) {
		this.legacyResident1995 = legacyResident1995;
	}

	@Column(name = "Legacy_MonitoringMethods", length = 60)
	public String getLegacyMonitoringMethods() {
		return this.legacyMonitoringMethods;
	}

	public void setLegacyMonitoringMethods(String legacyMonitoringMethods) {
		this.legacyMonitoringMethods = legacyMonitoringMethods;
	}

	@Column(name = "Legacy_EngineFamily", length = 20)
	public String getLegacyEngineFamily() {
		return this.legacyEngineFamily;
	}

	public void setLegacyEngineFamily(String legacyEngineFamily) {
		this.legacyEngineFamily = legacyEngineFamily;
	}

	@Column(name = "Administrative_Bypass_Flag", length = 1)
	public Character getAdministrativeBypassFlag() {
		return this.administrativeBypassFlag;
	}

	public void setAdministrativeBypassFlag(Character administrativeBypassFlag) {
		this.administrativeBypassFlag = administrativeBypassFlag;
	}

	@Column(name = "Administrative_Bypass_Reason")
	public String getAdministrativeBypassReason() {
		return this.administrativeBypassReason;
	}

	public void setAdministrativeBypassReason(String administrativeBypassReason) {
		this.administrativeBypassReason = administrativeBypassReason;
	}

}
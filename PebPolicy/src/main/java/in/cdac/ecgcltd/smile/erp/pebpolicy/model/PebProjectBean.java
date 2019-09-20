package in.cdac.ecgcltd.smile.erp.pebpolicy.model;

import java.time.OffsetDateTime;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class PebProjectBean {

	private Long projectId;

	@NotNull
	@Min(value = 10)
	private Double projectValue;

	@NotEmpty
	@Size(min = 2, max = 3)
	private String projectCountry;

	@NotEmpty
	@Size(min = 2, max = 3)
	private String paymentCountry;

	/* @NotNull */
	/*
	 * @Column(name = "project_signing_date", columnDefinition =
	 * "TIMESTAMP WITHOUT TIME ZONE")
	 */
	@NotNull
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date projectSigningDate;

	
	@NotNull 
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date startDate;

	@NotNull 
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date endDate;

	@NotEmpty
	@Size(min = 2, max = 45)
	private String contractNo;

	@NotNull
	@Min(value = 1)
	@Max(value = 5)
	private Integer lobId;

	@Size(min = 2, max = 99)
	private String tags;

	@NotNull
	private Integer buyerId;

	@NotNull
	private Integer exporterId;

	@NotEmpty
	@Size(min = 2, max = 10)
	private String projectStatus;

	@NotEmpty
	@Size(min = 2, max = 45)
	private String fundingArrangement;

	@NotEmpty
	@Size(min = 2, max = 45)
	private String fundingAgencyName;

	@NotEmpty
	@Size(min = 2, max = 2499)
	private String projectDescription;

	@NotNull
	@Min(value = 1)
	@Max(value = 4)
	private Integer sectorProjectType;

	@NotEmpty
	@Size(min = 2, max = 3)
	private String localCurrencyCode;

	@NotEmpty
	@Size(min = 2, max = 3)
	private String foreignCurrencyCode;

	@NotEmpty
	@Size(min = 2, max = 3)
	private String thirdPartyCurrencyCode;

	@NotNull
	@Min(value = 0)
	private Double localExchangeRate;

	@NotNull
	@Min(value = 0)
	private Double foreignExchangeRate;

	@NotNull
	@Min(value = 0)
	private Double thirdPartyExchangeRate;

	private String createdBy;

	private Date createdOn;

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public Double getProjectValue() {
		return projectValue;
	}

	public void setProjectValue(Double projectValue) {
		this.projectValue = projectValue;
	}

	public String getProjectCountry() {
		return projectCountry;
	}

	public void setProjectCountry(String projectCountry) {
		this.projectCountry = projectCountry;
	}

	public String getPaymentCountry() {
		return paymentCountry;
	}

	public void setPaymentCountry(String paymentCountry) {
		this.paymentCountry = paymentCountry;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public Integer getLobId() {
		return lobId;
	}

	public void setLobId(Integer lobId) {
		this.lobId = lobId;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public Integer getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}

	public Integer getExporterId() {
		return exporterId;
	}

	public void setExporterId(Integer exporterId) {
		this.exporterId = exporterId;
	}

	public String getProjectStatus() {
		return projectStatus;
	}

	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}

	public String getFundingArrangement() {
		return fundingArrangement;
	}

	public void setFundingArrangement(String fundingArrangement) {
		this.fundingArrangement = fundingArrangement;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public Integer getSectorProjectType() {
		return sectorProjectType;
	}

	public void setSectorProjectType(Integer sectorProjectType) {
		this.sectorProjectType = sectorProjectType;
	}

	public String getLocalCurrencyCode() {
		return localCurrencyCode;
	}

	public void setLocalCurrencyCode(String localCurrencyCode) {
		this.localCurrencyCode = localCurrencyCode;
	}

	public String getForeignCurrencyCode() {
		return foreignCurrencyCode;
	}

	public void setForeignCurrencyCode(String foreignCurrencyCode) {
		this.foreignCurrencyCode = foreignCurrencyCode;
	}

	public String getThirdPartyCurrencyCode() {
		return thirdPartyCurrencyCode;
	}

	public void setThirdPartyCurrencyCode(String thirdPartyCurrencyCode) {
		this.thirdPartyCurrencyCode = thirdPartyCurrencyCode;
	}

	public Double getLocalExchangeRate() {
		return localExchangeRate;
	}

	public void setLocalExchangeRate(Double localExchangeRate) {
		this.localExchangeRate = localExchangeRate;
	}

	public Double getForeignExchangeRate() {
		return foreignExchangeRate;
	}

	public void setForeignExchangeRate(Double foreignExchangeRate) {
		this.foreignExchangeRate = foreignExchangeRate;
	}

	public Double getThirdPartyExchangeRate() {
		return thirdPartyExchangeRate;
	}

	public void setThirdPartyExchangeRate(Double thirdPartyExchangeRate) {
		this.thirdPartyExchangeRate = thirdPartyExchangeRate;
	}

	public String getFundingAgencyName() {
		return fundingAgencyName;
	}

	public void setFundingAgencyName(String fundingAgencyName) {
		this.fundingAgencyName = fundingAgencyName;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getProjectSigningDate() {
		return projectSigningDate;
	}

	public void setProjectSigningDate(Date projectSigningDate) {
		this.projectSigningDate = projectSigningDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "PebProjectBean [projectId=" + projectId + ", projectValue=" + projectValue + ", projectCountry="
				+ projectCountry + ", paymentCountry=" + paymentCountry + ", projectSigningDate=" + projectSigningDate
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", contractNo=" + contractNo + ", lobId="
				+ lobId + ", tags=" + tags + ", buyerId=" + buyerId + ", exporterId=" + exporterId + ", projectStatus="
				+ projectStatus + ", fundingArrangement=" + fundingArrangement + ", fundingAgencyName="
				+ fundingAgencyName + ", projectDescription=" + projectDescription + ", sectorProjectType="
				+ sectorProjectType + ", localCurrencyCode=" + localCurrencyCode + ", foreignCurrencyCode="
				+ foreignCurrencyCode + ", thirdPartyCurrencyCode=" + thirdPartyCurrencyCode + ", localExchangeRate="
				+ localExchangeRate + ", foreignExchangeRate=" + foreignExchangeRate + ", thirdPartyExchangeRate="
				+ thirdPartyExchangeRate + ", createdBy=" + createdBy + ", createdOn=" + createdOn + "]";
	}

	
}

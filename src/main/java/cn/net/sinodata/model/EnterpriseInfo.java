package cn.net.sinodata.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 企业基本信息数据
 */
public class EnterpriseInfo implements Serializable {
    private static final long serialVersionUID = -5297283684178822710L;

    private String id;
    private String name;
    private String creditCode;
    private Date enterpriseCreateDate;
    private String type;
    private String registeredAddress;
    private String registeredCapital;
    private String registrationAuthority;
    private String location;
    private String identificationSituation;
    private String industryType;
    private String mainProducts;
    private String whetherListed;
    private String listedType;
    private String stockCode;
    private Date listedDate;
    private String legalName;
    private String carType;
    private String carNumber;
    private String legalTelephone;
    private String legalPhone;
    private String legalEmail;
    private String contactName;
    private String contactPhone;
    private String contactEmail;
    private Date createDate;
    private Date updateDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    public Date getEnterpriseCreateDate() {
        return enterpriseCreateDate;
    }

    public void setEnterpriseCreateDate(Date enterpriseCreateDate) {
        this.enterpriseCreateDate = enterpriseCreateDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRegisteredAddress() {
        return registeredAddress;
    }

    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress;
    }

    public String getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public String getRegistrationAuthority() {
        return registrationAuthority;
    }

    public void setRegistrationAuthority(String registrationAuthority) {
        this.registrationAuthority = registrationAuthority;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIdentificationSituation() {
        return identificationSituation;
    }

    public void setIdentificationSituation(String identificationSituation) {
        this.identificationSituation = identificationSituation;
    }

    public String getIndustryType() {
        return industryType;
    }

    public void setIndustryType(String industryType) {
        this.industryType = industryType;
    }

    public String getMainProducts() {
        return mainProducts;
    }

    public void setMainProducts(String mainProducts) {
        this.mainProducts = mainProducts;
    }

    public String getWhetherListed() {
        return whetherListed;
    }

    public void setWhetherListed(String whetherListed) {
        this.whetherListed = whetherListed;
    }

    public String getListedType() {
        return listedType;
    }

    public void setListedType(String listedType) {
        this.listedType = listedType;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public Date getListedDate() {
        return listedDate;
    }

    public void setListedDate(Date listedDate) {
        this.listedDate = listedDate;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getLegalTelephone() {
        return legalTelephone;
    }

    public void setLegalTelephone(String legalTelephone) {
        this.legalTelephone = legalTelephone;
    }

    public String getLegalPhone() {
        return legalPhone;
    }

    public void setLegalPhone(String legalPhone) {
        this.legalPhone = legalPhone;
    }

    public String getLegalEmail() {
        return legalEmail;
    }

    public void setLegalEmail(String legalEmail) {
        this.legalEmail = legalEmail;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}

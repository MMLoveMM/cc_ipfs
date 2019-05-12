package cn.net.sinodata.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 企业基本信息数据
 */
public class EnterpriseInfo implements Serializable {
    private static final long serialVersionUID = -5297283684178822710L;

    private String id;
    private String name;    //企业名称
    private String creditCode;  //统一社会信用代码
    private Date enterpriseCreateDate;  //企业成立日期
    private String type;    //  企业类别(法律责任形式)
    private String registeredAddress;   //注册地址
    private String registeredCapital;   //注册资本(万元)
    private String registrationAuthority;   //登记机关
    private String location;    //企业所在地（吉林省、长春市、朝阳区）
    private String identificationSituation; //认定情况    t_data_dict(situation)
    private String industryType;    //行业类型
    private String mainProducts;    //主要产品
    private String whetherListed;   //是否上市或挂牌
    private String listedType;  //上市类型
    private String stockCode;   //股票代码
    private Date listedDate;    //上市时间
    private String legalName;   //法人姓名
    private String carType; //证件类型
    private String carNumber;   //证件号码
    private String legalTelephone;  //法人固定电话
    private String legalPhone;  //法人手机
    private String legalEmail;  //法人邮箱
    private String contactName; //联系人姓名
    private String contactPhone;    //联系人手机
    private String contactEmail;    //联系人邮箱
    private Date createDate;
    private Date updateDate;
    private String financeId;  //财务状况id
    private String personId;   //人员状况id
    private String propertyId; //近三年知识产权id
    private String pdfId;  //相关附件id


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

    public String getFinanceId() {
        return financeId;
    }

    public void setFinanceId(String financeId) {
        this.financeId = financeId;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getPdfId() {
        return pdfId;
    }

    public void setPdfId(String pdfId) {
        this.pdfId = pdfId;
    }
}

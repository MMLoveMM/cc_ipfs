package cn.net.sinodata.model;

import java.io.Serializable;
import java.util.Date;

public class EnterpriseFilePdf implements Serializable {
    private static final long serialVersionUID = -2719090593239843704L;

    private String id;
    private String enterpriseId;
    private String businessLicenseCopy; //营业执照副本
    private String intellectualProperty;    //知识产权相关证明材料
    private String financialAuditReport;    //经具有资质的中介机构鉴证的企业年度财务审计报告（包括会计报表、会计报表附注和财务情况说明书），或企业所得税年度纳税申报表（包括主表及附表）
    private String instructionManual;   //经具有资质的中介机构鉴证的企业年度研究开发费用专项审计报告并附研究开发活动说明材料，或企业所得税年度纳税申报表中的研发费用加计扣除优惠明细表并附研究开发活动说明材料
    private Date createDate;
    private Date updateDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getBusinessLicenseCopy() {
        return businessLicenseCopy;
    }

    public void setBusinessLicenseCopy(String businessLicenseCopy) {
        this.businessLicenseCopy = businessLicenseCopy;
    }

    public String getIntellectualProperty() {
        return intellectualProperty;
    }

    public void setIntellectualProperty(String intellectualProperty) {
        this.intellectualProperty = intellectualProperty;
    }

    public String getFinancialAuditReport() {
        return financialAuditReport;
    }

    public void setFinancialAuditReport(String financialAuditReport) {
        this.financialAuditReport = financialAuditReport;
    }

    public String getInstructionManual() {
        return instructionManual;
    }

    public void setInstructionManual(String instructionManual) {
        this.instructionManual = instructionManual;
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

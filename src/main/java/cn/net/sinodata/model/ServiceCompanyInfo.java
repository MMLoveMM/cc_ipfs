package cn.net.sinodata.model;

import java.util.Date;

public class ServiceCompanyInfo {
    /**
     * ID
     */
    private String id;

    /**
     * 项目id
     */
    private String projectInfoId;

    /**
     * 企业id
     */
    private String companyId;

    /**
     * 属性
     */
    private String type;

    /**
     * 状态  0：待处理，1：处理中，2：已完成 -1取消
     */
    private String status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后修改时间
     */
    private Date modTime;

    /**
     * 取消项目原因
     */
    private String reasonForCancellation;

    /**
     * 项目完成评价
     */
    private String evaluation;

    /**
     * 放款金额
     */
    private String loansMoney;

    /**
     * 持股比例
     */
    private String shareholdingRatio;

    /**
     * 抵押物
     */
    private String pawn;

    /**
     * 评估金额
     */
    private String assessTheAmount;

    /**
     * 完成评价时间
     */
    private Date evaluationTime;

    /**
     * ID
     * @return ID ID
     */
    public String getId() {
        return id;
    }

    /**
     * ID
     * @param id ID
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 项目id
     * @return PROJECT_INFO_ID 项目id
     */
    public String getProjectInfoId() {
        return projectInfoId;
    }

    /**
     * 项目id
     * @param projectInfoId 项目id
     */
    public void setProjectInfoId(String projectInfoId) {
        this.projectInfoId = projectInfoId == null ? null : projectInfoId.trim();
    }

    /**
     * 企业id
     * @return COMPANY_ID 企业id
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * 企业id
     * @param companyId 企业id
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    /**
     * 属性
     * @return TYPE 属性
     */
    public String getType() {
        return type;
    }

    /**
     * 属性
     * @param type 属性
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 状态  0：待处理，1：处理中，2：已完成 -1取消
     * @return STATUS 状态  0：待处理，1：处理中，2：已完成 -1取消
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态  0：待处理，1：处理中，2：已完成 -1取消
     * @param status 状态  0：待处理，1：处理中，2：已完成 -1取消
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 创建时间
     * @return CREATE_TIME 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 最后修改时间
     * @return MOD_TIME 最后修改时间
     */
    public Date getModTime() {
        return modTime;
    }

    /**
     * 最后修改时间
     * @param modTime 最后修改时间
     */
    public void setModTime(Date modTime) {
        this.modTime = modTime;
    }

    /**
     * 取消项目原因
     * @return REASON_FOR_CANCELLATION 取消项目原因
     */
    public String getReasonForCancellation() {
        return reasonForCancellation;
    }

    /**
     * 取消项目原因
     * @param reasonForCancellation 取消项目原因
     */
    public void setReasonForCancellation(String reasonForCancellation) {
        this.reasonForCancellation = reasonForCancellation == null ? null : reasonForCancellation.trim();
    }

    /**
     * 项目完成评价
     * @return EVALUATION 项目完成评价
     */
    public String getEvaluation() {
        return evaluation;
    }

    /**
     * 项目完成评价
     * @param evaluation 项目完成评价
     */
    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation == null ? null : evaluation.trim();
    }

    /**
     * 放款金额
     * @return LOANS_MONEY 放款金额
     */
    public String getLoansMoney() {
        return loansMoney;
    }

    /**
     * 放款金额
     * @param loansMoney 放款金额
     */
    public void setLoansMoney(String loansMoney) {
        this.loansMoney = loansMoney == null ? null : loansMoney.trim();
    }

    /**
     * 持股比例
     * @return SHAREHOLDING_RATIO 持股比例
     */
    public String getShareholdingRatio() {
        return shareholdingRatio;
    }

    /**
     * 持股比例
     * @param shareholdingRatio 持股比例
     */
    public void setShareholdingRatio(String shareholdingRatio) {
        this.shareholdingRatio = shareholdingRatio == null ? null : shareholdingRatio.trim();
    }

    /**
     * 抵押物
     * @return PAWN 抵押物
     */
    public String getPawn() {
        return pawn;
    }

    /**
     * 抵押物
     * @param pawn 抵押物
     */
    public void setPawn(String pawn) {
        this.pawn = pawn == null ? null : pawn.trim();
    }

    /**
     * 评估金额
     * @return ASSESS_THE_AMOUNT 评估金额
     */
    public String getAssessTheAmount() {
        return assessTheAmount;
    }

    /**
     * 评估金额
     * @param assessTheAmount 评估金额
     */
    public void setAssessTheAmount(String assessTheAmount) {
        this.assessTheAmount = assessTheAmount == null ? null : assessTheAmount.trim();
    }

    /**
     * 完成评价时间
     * @return EVALUATION_TIME 完成评价时间
     */
    public Date getEvaluationTime() {
        return evaluationTime;
    }

    /**
     * 完成评价时间
     * @param evaluationTime 完成评价时间
     */
    public void setEvaluationTime(Date evaluationTime) {
        this.evaluationTime = evaluationTime;
    }
}
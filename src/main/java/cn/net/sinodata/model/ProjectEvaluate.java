package cn.net.sinodata.model;

public class ProjectEvaluate {
    /**
     * ID
     */
    private String id;

    /**
     * 项目ID
     */
    private String projectid;

    /**
     * 行业前景评分值
     */
    private String industryfutureval;

    /**
     * 管理团队评分值
     */
    private String managementteamsval;

    /**
     * 技术水平评分值
     */
    private String technologicallevelval;

    /**
     * 运营模式评分值
     */
    private String operationpatternval;

    /**
     * 财务状况评分值
     */
    private String financialpositionval;

    /**
     * 估值评分
     */
    private String appraisementval;

    /**
     * 评价人ID
     */
    private String appraiserid;

    /**
     * 评价平均分
     */
    private String averageval;

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
     * 项目ID
     * @return PROJECTID 项目ID
     */
    public String getProjectid() {
        return projectid;
    }

    /**
     * 项目ID
     * @param projectid 项目ID
     */
    public void setProjectid(String projectid) {
        this.projectid = projectid == null ? null : projectid.trim();
    }

    /**
     * 行业前景评分值
     * @return INDUSTRYFUTUREVAL 行业前景评分值
     */
    public String getIndustryfutureval() {
        return industryfutureval;
    }

    /**
     * 行业前景评分值
     * @param industryfutureval 行业前景评分值
     */
    public void setIndustryfutureval(String industryfutureval) {
        this.industryfutureval = industryfutureval == null ? null : industryfutureval.trim();
    }

    /**
     * 管理团队评分值
     * @return MANAGEMENTTEAMSVAL 管理团队评分值
     */
    public String getManagementteamsval() {
        return managementteamsval;
    }

    /**
     * 管理团队评分值
     * @param managementteamsval 管理团队评分值
     */
    public void setManagementteamsval(String managementteamsval) {
        this.managementteamsval = managementteamsval == null ? null : managementteamsval.trim();
    }

    /**
     * 技术水平评分值
     * @return TECHNOLOGICALLEVELVAL 技术水平评分值
     */
    public String getTechnologicallevelval() {
        return technologicallevelval;
    }

    /**
     * 技术水平评分值
     * @param technologicallevelval 技术水平评分值
     */
    public void setTechnologicallevelval(String technologicallevelval) {
        this.technologicallevelval = technologicallevelval == null ? null : technologicallevelval.trim();
    }

    /**
     * 运营模式评分值
     * @return OPERATIONPATTERNVAL 运营模式评分值
     */
    public String getOperationpatternval() {
        return operationpatternval;
    }

    /**
     * 运营模式评分值
     * @param operationpatternval 运营模式评分值
     */
    public void setOperationpatternval(String operationpatternval) {
        this.operationpatternval = operationpatternval == null ? null : operationpatternval.trim();
    }

    /**
     * 财务状况评分值
     * @return FINANCIALPOSITIONVAL 财务状况评分值
     */
    public String getFinancialpositionval() {
        return financialpositionval;
    }

    /**
     * 财务状况评分值
     * @param financialpositionval 财务状况评分值
     */
    public void setFinancialpositionval(String financialpositionval) {
        this.financialpositionval = financialpositionval == null ? null : financialpositionval.trim();
    }

    /**
     * 估值评分
     * @return APPRAISEMENTVAL 估值评分
     */
    public String getAppraisementval() {
        return appraisementval;
    }

    /**
     * 估值评分
     * @param appraisementval 估值评分
     */
    public void setAppraisementval(String appraisementval) {
        this.appraisementval = appraisementval == null ? null : appraisementval.trim();
    }

    /**
     * 评价人ID
     * @return APPRAISERID 评价人ID
     */
    public String getAppraiserid() {
        return appraiserid;
    }

    /**
     * 评价人ID
     * @param appraiserid 评价人ID
     */
    public void setAppraiserid(String appraiserid) {
        this.appraiserid = appraiserid == null ? null : appraiserid.trim();
    }

    /**
     * 评价平均分
     * @return AVERAGEVAL 评价平均分
     */
    public String getAverageval() {
        return averageval;
    }

    /**
     * 评价平均分
     * @param averageval 评价平均分
     */
    public void setAverageval(String averageval) {
        this.averageval = averageval == null ? null : averageval.trim();
    }
}
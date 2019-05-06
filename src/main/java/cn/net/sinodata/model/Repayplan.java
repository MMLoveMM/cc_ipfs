package cn.net.sinodata.model;

public class Repayplan {
    /**
     * 主键
     */
    private String id;

    /**
     * 贷款金额
     */
    private Double loanamt;

    /**
     * 贷款期限
     */
    private Short loandl;

    /**
     * 是否分期还款
     */
    private String isinstalment;

    /**
     * 分期还款方案
     */
    private String repaymode;

    /**
     * 贷款利率
     */
    private Double loanrate;

    /**
     * 计息方式
     */
    private String interestway;

    /**
     * 还款总期数
     */
    private Short loantimes;

    /**
     * 当前期数
     */
    private Short loanctimes;

    /**
     * 创建日期
     */
    private String plancreatedt;

    /**
     * 累计还款利息总和
     */
    private Double intsum;

    /**
     * 已还金额
     */
    private Double rpyprinint;

    /**
     * 还款状态
     */
    private String status;

    /**
     * 项目ID
     */
    private String projectid;

    /**
     * 还款方式
     */
    private String repayway;

    /**
     * 已还利息
     */
    private Double rpyint;

    /**
     * 主键
     * @return ID 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 贷款金额
     * @return LOANAMT 贷款金额
     */
    public Double getLoanamt() {
        return loanamt;
    }

    /**
     * 贷款金额
     * @param loanamt 贷款金额
     */
    public void setLoanamt(Double loanamt) {
        this.loanamt = loanamt;
    }

    /**
     * 贷款期限
     * @return LOANDL 贷款期限
     */
    public Short getLoandl() {
        return loandl;
    }

    /**
     * 贷款期限
     * @param loandl 贷款期限
     */
    public void setLoandl(Short loandl) {
        this.loandl = loandl;
    }

    /**
     * 是否分期还款
     * @return ISINSTALMENT 是否分期还款
     */
    public String getIsinstalment() {
        return isinstalment;
    }

    /**
     * 是否分期还款
     * @param isinstalment 是否分期还款
     */
    public void setIsinstalment(String isinstalment) {
        this.isinstalment = isinstalment == null ? null : isinstalment.trim();
    }

    /**
     * 分期还款方案
     * @return REPAYMODE 分期还款方案
     */
    public String getRepaymode() {
        return repaymode;
    }

    /**
     * 分期还款方案
     * @param repaymode 分期还款方案
     */
    public void setRepaymode(String repaymode) {
        this.repaymode = repaymode == null ? null : repaymode.trim();
    }

    /**
     * 贷款利率
     * @return LOANRATE 贷款利率
     */
    public Double getLoanrate() {
        return loanrate;
    }

    /**
     * 贷款利率
     * @param loanrate 贷款利率
     */
    public void setLoanrate(Double loanrate) {
        this.loanrate = loanrate;
    }

    /**
     * 计息方式
     * @return INTERESTWAY 计息方式
     */
    public String getInterestway() {
        return interestway;
    }

    /**
     * 计息方式
     * @param interestway 计息方式
     */
    public void setInterestway(String interestway) {
        this.interestway = interestway == null ? null : interestway.trim();
    }

    /**
     * 还款总期数
     * @return LOANTIMES 还款总期数
     */
    public Short getLoantimes() {
        return loantimes;
    }

    /**
     * 还款总期数
     * @param loantimes 还款总期数
     */
    public void setLoantimes(Short loantimes) {
        this.loantimes = loantimes;
    }

    /**
     * 当前期数
     * @return LOANCTIMES 当前期数
     */
    public Short getLoanctimes() {
        return loanctimes;
    }

    /**
     * 当前期数
     * @param loanctimes 当前期数
     */
    public void setLoanctimes(Short loanctimes) {
        this.loanctimes = loanctimes;
    }

    /**
     * 创建日期
     * @return PLANCREATEDT 创建日期
     */
    public String getPlancreatedt() {
        return plancreatedt;
    }

    /**
     * 创建日期
     * @param plancreatedt 创建日期
     */
    public void setPlancreatedt(String plancreatedt) {
        this.plancreatedt = plancreatedt == null ? null : plancreatedt.trim();
    }

    /**
     * 累计还款利息总和
     * @return INTSUM 累计还款利息总和
     */
    public Double getIntsum() {
        return intsum;
    }

    /**
     * 累计还款利息总和
     * @param intsum 累计还款利息总和
     */
    public void setIntsum(Double intsum) {
        this.intsum = intsum;
    }

    /**
     * 已还金额
     * @return RPYPRININT 已还金额
     */
    public Double getRpyprinint() {
        return rpyprinint;
    }

    /**
     * 已还金额
     * @param rpyprinint 已还金额
     */
    public void setRpyprinint(Double rpyprinint) {
        this.rpyprinint = rpyprinint;
    }

    /**
     * 还款状态
     * @return STATUS 还款状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 还款状态
     * @param status 还款状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
     * 还款方式
     * @return REPAYWAY 还款方式
     */
    public String getRepayway() {
        return repayway;
    }

    /**
     * 还款方式
     * @param repayway 还款方式
     */
    public void setRepayway(String repayway) {
        this.repayway = repayway == null ? null : repayway.trim();
    }

    /**
     * 已还利息
     * @return RPYINT 已还利息
     */
    public Double getRpyint() {
        return rpyint;
    }

    /**
     * 已还利息
     * @param rpyint 已还利息
     */
    public void setRpyint(Double rpyint) {
        this.rpyint = rpyint;
    }
}
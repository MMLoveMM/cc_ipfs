package cn.net.sinodata.model;

public class FinacialVal {
    /**
     * 主键ID
     */
    private String id;

    /**
     * 报表条目编号
     */
    private String num;

    /**
     * 数据
     */
    private String val;

    /**
     * 审计时间
     */
    private String auditdt;

    /**
     * 客户编号
     */
    private String customid;

    /**
     * 录入时间
     */
    private String inputdt;

    /**
     * 主键ID
     * @return ID 主键ID
     */
    public String getId() {
        return id;
    }

    /**
     * 主键ID
     * @param id 主键ID
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 报表条目编号
     * @return NUM 报表条目编号
     */
    public String getNum() {
        return num;
    }

    /**
     * 报表条目编号
     * @param num 报表条目编号
     */
    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    /**
     * 数据
     * @return VAL 数据
     */
    public String getVal() {
        return val;
    }

    /**
     * 数据
     * @param val 数据
     */
    public void setVal(String val) {
        this.val = val == null ? null : val.trim();
    }

    /**
     * 审计时间
     * @return AUDITDT 审计时间
     */
    public String getAuditdt() {
        return auditdt;
    }

    /**
     * 审计时间
     * @param auditdt 审计时间
     */
    public void setAuditdt(String auditdt) {
        this.auditdt = auditdt == null ? null : auditdt.trim();
    }

    /**
     * 客户编号
     * @return CUSTOMID 客户编号
     */
    public String getCustomid() {
        return customid;
    }

    /**
     * 客户编号
     * @param customid 客户编号
     */
    public void setCustomid(String customid) {
        this.customid = customid == null ? null : customid.trim();
    }

    /**
     * 录入时间
     * @return INPUTDT 录入时间
     */
    public String getInputdt() {
        return inputdt;
    }

    /**
     * 录入时间
     * @param inputdt 录入时间
     */
    public void setInputdt(String inputdt) {
        this.inputdt = inputdt == null ? null : inputdt.trim();
    }
}
package cn.net.sinodata.model;

public class GuaranteeRepayment {
    /**
     * ID
     */
    private String id;

    /**
     * 项目ID
     */
    private String projectid;

    /**
     * 当前期数
     */
    private String curstage;

    /**
     * 当期还款金额
     */
    private String curamount;

    /**
     * 当期应还日期
     */
    private String curplandt;

    /**
     * 当期还款日期
     */
    private String currepaydt;

    /**
     * 当期还款状态
     */
    private String curstatus;

    /**
     * 担保还款计划表id
     */
    private String grrid;

    /**
     * 剩余本金
     */
    private String remainprincipal;

    /**
     * 还款本金
     */
    private String repayprincipal;

    /**
     * 还款利息
     */
    private String repayinterest;

    /**
     * 实际还款金额
     */
    private String actualamount;

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
     * 当前期数
     * @return CURSTAGE 当前期数
     */
    public String getCurstage() {
        return curstage;
    }

    /**
     * 当前期数
     * @param curstage 当前期数
     */
    public void setCurstage(String curstage) {
        this.curstage = curstage == null ? null : curstage.trim();
    }

    /**
     * 当期还款金额
     * @return CURAMOUNT 当期还款金额
     */
    public String getCuramount() {
        return curamount;
    }

    /**
     * 当期还款金额
     * @param curamount 当期还款金额
     */
    public void setCuramount(String curamount) {
        this.curamount = curamount == null ? null : curamount.trim();
    }

    /**
     * 当期应还日期
     * @return CURPLANDT 当期应还日期
     */
    public String getCurplandt() {
        return curplandt;
    }

    /**
     * 当期应还日期
     * @param curplandt 当期应还日期
     */
    public void setCurplandt(String curplandt) {
        this.curplandt = curplandt == null ? null : curplandt.trim();
    }

    /**
     * 当期还款日期
     * @return CURREPAYDT 当期还款日期
     */
    public String getCurrepaydt() {
        return currepaydt;
    }

    /**
     * 当期还款日期
     * @param currepaydt 当期还款日期
     */
    public void setCurrepaydt(String currepaydt) {
        this.currepaydt = currepaydt == null ? null : currepaydt.trim();
    }

    /**
     * 当期还款状态
     * @return CURSTATUS 当期还款状态
     */
    public String getCurstatus() {
        return curstatus;
    }

    /**
     * 当期还款状态
     * @param curstatus 当期还款状态
     */
    public void setCurstatus(String curstatus) {
        this.curstatus = curstatus == null ? null : curstatus.trim();
    }

    /**
     * 担保还款计划表id
     * @return GRRID 担保还款计划表id
     */
    public String getGrrid() {
        return grrid;
    }

    /**
     * 担保还款计划表id
     * @param grrid 担保还款计划表id
     */
    public void setGrrid(String grrid) {
        this.grrid = grrid == null ? null : grrid.trim();
    }

    /**
     * 剩余本金
     * @return REMAINPRINCIPAL 剩余本金
     */
    public String getRemainprincipal() {
        return remainprincipal;
    }

    /**
     * 剩余本金
     * @param remainprincipal 剩余本金
     */
    public void setRemainprincipal(String remainprincipal) {
        this.remainprincipal = remainprincipal == null ? null : remainprincipal.trim();
    }

    /**
     * 还款本金
     * @return REPAYPRINCIPAL 还款本金
     */
    public String getRepayprincipal() {
        return repayprincipal;
    }

    /**
     * 还款本金
     * @param repayprincipal 还款本金
     */
    public void setRepayprincipal(String repayprincipal) {
        this.repayprincipal = repayprincipal == null ? null : repayprincipal.trim();
    }

    /**
     * 还款利息
     * @return REPAYINTEREST 还款利息
     */
    public String getRepayinterest() {
        return repayinterest;
    }

    /**
     * 还款利息
     * @param repayinterest 还款利息
     */
    public void setRepayinterest(String repayinterest) {
        this.repayinterest = repayinterest == null ? null : repayinterest.trim();
    }

    /**
     * 实际还款金额
     * @return ACTUALAMOUNT 实际还款金额
     */
    public String getActualamount() {
        return actualamount;
    }

    /**
     * 实际还款金额
     * @param actualamount 实际还款金额
     */
    public void setActualamount(String actualamount) {
        this.actualamount = actualamount == null ? null : actualamount.trim();
    }
}
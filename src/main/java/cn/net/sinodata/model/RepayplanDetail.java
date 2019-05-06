package cn.net.sinodata.model;

public class RepayplanDetail {
    /**
     * 主键
     */
    private String id;

    /**
     * 还款计划ID
     */
    private String rpypid;

    /**
     * 当前期数
     */
    private Short curstage;

    /**
     * 当期还款金额
     */
    private Double currpyamt;

    /**
     * 当期还款利息
     */
    private Double currpyint;

    /**
     * 剩余需还本息
     */
    private Double keepprinint;

    /**
     * 当期应还日期
     */
    private String planrpydt;

    /**
     * 当期还款日期
     */
    private String currpydt;

    /**
     * 当期还款状态
     */
    private String currpystate;

    /**
     * 剩余需还利息
     */
    private Double keepint;

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
     * 还款计划ID
     * @return RPYPID 还款计划ID
     */
    public String getRpypid() {
        return rpypid;
    }

    /**
     * 还款计划ID
     * @param rpypid 还款计划ID
     */
    public void setRpypid(String rpypid) {
        this.rpypid = rpypid == null ? null : rpypid.trim();
    }

    /**
     * 当前期数
     * @return CURSTAGE 当前期数
     */
    public Short getCurstage() {
        return curstage;
    }

    /**
     * 当前期数
     * @param curstage 当前期数
     */
    public void setCurstage(Short curstage) {
        this.curstage = curstage;
    }

    /**
     * 当期还款金额
     * @return CURRPYAMT 当期还款金额
     */
    public Double getCurrpyamt() {
        return currpyamt;
    }

    /**
     * 当期还款金额
     * @param currpyamt 当期还款金额
     */
    public void setCurrpyamt(Double currpyamt) {
        this.currpyamt = currpyamt;
    }

    /**
     * 当期还款利息
     * @return CURRPYINT 当期还款利息
     */
    public Double getCurrpyint() {
        return currpyint;
    }

    /**
     * 当期还款利息
     * @param currpyint 当期还款利息
     */
    public void setCurrpyint(Double currpyint) {
        this.currpyint = currpyint;
    }

    /**
     * 剩余需还本息
     * @return KEEPPRININT 剩余需还本息
     */
    public Double getKeepprinint() {
        return keepprinint;
    }

    /**
     * 剩余需还本息
     * @param keepprinint 剩余需还本息
     */
    public void setKeepprinint(Double keepprinint) {
        this.keepprinint = keepprinint;
    }

    /**
     * 当期应还日期
     * @return PLANRPYDT 当期应还日期
     */
    public String getPlanrpydt() {
        return planrpydt;
    }

    /**
     * 当期应还日期
     * @param planrpydt 当期应还日期
     */
    public void setPlanrpydt(String planrpydt) {
        this.planrpydt = planrpydt == null ? null : planrpydt.trim();
    }

    /**
     * 当期还款日期
     * @return CURRPYDT 当期还款日期
     */
    public String getCurrpydt() {
        return currpydt;
    }

    /**
     * 当期还款日期
     * @param currpydt 当期还款日期
     */
    public void setCurrpydt(String currpydt) {
        this.currpydt = currpydt == null ? null : currpydt.trim();
    }

    /**
     * 当期还款状态
     * @return CURRPYSTATE 当期还款状态
     */
    public String getCurrpystate() {
        return currpystate;
    }

    /**
     * 当期还款状态
     * @param currpystate 当期还款状态
     */
    public void setCurrpystate(String currpystate) {
        this.currpystate = currpystate == null ? null : currpystate.trim();
    }

    /**
     * 剩余需还利息
     * @return KEEPINT 剩余需还利息
     */
    public Double getKeepint() {
        return keepint;
    }

    /**
     * 剩余需还利息
     * @param keepint 剩余需还利息
     */
    public void setKeepint(Double keepint) {
        this.keepint = keepint;
    }
}
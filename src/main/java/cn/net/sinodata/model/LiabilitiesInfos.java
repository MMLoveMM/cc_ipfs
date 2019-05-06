package cn.net.sinodata.model;

import java.util.Date;

public class LiabilitiesInfos {
    /**
     * ID
     */
    private String id;

    /**
     * 个人id
     */
    private String perid;

    /**
     * 
     */
    private String liabtype;

    /**
     * 借款金额
     */
    private String credit;

    /**
     * 已经还款
     */
    private String paid;

    /**
     * 未还款
     */
    private String nopay;

    /**
     * 月均还款
     */
    private String averagepay;

    /**
     * 添加时间
     */
    private Date createtime;

    /**
     * 修改时间
     */
    private Date updatetime;

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
     * 个人id
     * @return PERID 个人id
     */
    public String getPerid() {
        return perid;
    }

    /**
     * 个人id
     * @param perid 个人id
     */
    public void setPerid(String perid) {
        this.perid = perid == null ? null : perid.trim();
    }

    /**
     * 
     * @return LIABTYPE 
     */
    public String getLiabtype() {
        return liabtype;
    }

    /**
     * 
     * @param liabtype 
     */
    public void setLiabtype(String liabtype) {
        this.liabtype = liabtype == null ? null : liabtype.trim();
    }

    /**
     * 借款金额
     * @return CREDIT 借款金额
     */
    public String getCredit() {
        return credit;
    }

    /**
     * 借款金额
     * @param credit 借款金额
     */
    public void setCredit(String credit) {
        this.credit = credit == null ? null : credit.trim();
    }

    /**
     * 已经还款
     * @return PAID 已经还款
     */
    public String getPaid() {
        return paid;
    }

    /**
     * 已经还款
     * @param paid 已经还款
     */
    public void setPaid(String paid) {
        this.paid = paid == null ? null : paid.trim();
    }

    /**
     * 未还款
     * @return NOPAY 未还款
     */
    public String getNopay() {
        return nopay;
    }

    /**
     * 未还款
     * @param nopay 未还款
     */
    public void setNopay(String nopay) {
        this.nopay = nopay == null ? null : nopay.trim();
    }

    /**
     * 月均还款
     * @return AVERAGEPAY 月均还款
     */
    public String getAveragepay() {
        return averagepay;
    }

    /**
     * 月均还款
     * @param averagepay 月均还款
     */
    public void setAveragepay(String averagepay) {
        this.averagepay = averagepay == null ? null : averagepay.trim();
    }

    /**
     * 添加时间
     * @return CREATETIME 添加时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 添加时间
     * @param createtime 添加时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 修改时间
     * @return UPDATETIME 修改时间
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 修改时间
     * @param updatetime 修改时间
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}
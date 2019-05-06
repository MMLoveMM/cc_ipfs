package cn.net.sinodata.model;

import java.util.Date;

public class TCustAcct {
    /**
     * 主键
     */
    private String id;

    /**
     * 客户ID
     */
    private String customerid;

    /**
     * 账户毛宁城
     */
    private String acctname;

    /**
     * 银行账号
     */
    private String bankacct;

    /**
     * 开户行
     */
    private String openbank;

    /**
     * 状态
     */
    private String status;

    /**
     * 创建时间
     */
    private Date ctime;

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
     * 客户ID
     * @return CUSTOMERID 客户ID
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * 客户ID
     * @param customerid 客户ID
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    /**
     * 账户毛宁城
     * @return ACCTNAME 账户毛宁城
     */
    public String getAcctname() {
        return acctname;
    }

    /**
     * 账户毛宁城
     * @param acctname 账户毛宁城
     */
    public void setAcctname(String acctname) {
        this.acctname = acctname == null ? null : acctname.trim();
    }

    /**
     * 银行账号
     * @return BANKACCT 银行账号
     */
    public String getBankacct() {
        return bankacct;
    }

    /**
     * 银行账号
     * @param bankacct 银行账号
     */
    public void setBankacct(String bankacct) {
        this.bankacct = bankacct == null ? null : bankacct.trim();
    }

    /**
     * 开户行
     * @return OPENBANK 开户行
     */
    public String getOpenbank() {
        return openbank;
    }

    /**
     * 开户行
     * @param openbank 开户行
     */
    public void setOpenbank(String openbank) {
        this.openbank = openbank == null ? null : openbank.trim();
    }

    /**
     * 状态
     * @return STATUS 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 创建时间
     * @return CTIME 创建时间
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * 创建时间
     * @param ctime 创建时间
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}
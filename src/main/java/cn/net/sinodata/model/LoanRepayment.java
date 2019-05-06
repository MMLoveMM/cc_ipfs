package cn.net.sinodata.model;

public class LoanRepayment {
    /**
     * ID
     */
    private String id;

    /**
     * 项目号
     */
    private String projectid;

    /**
     * 放款合作银行
     */
    private String coopbank;

    /**
     * 放款金额
     */
    private String loanamount;

    /**
     * 放款账户
     */
    private String bankaccount;

    /**
     * 放款账户开户行
     */
    private String bankname;

    /**
     * 期限
     */
    private String loanlimit;

    /**
     * 放款日期
     */
    private String loandate;

    /**
     * 放款费率
     */
    private String loanrate;

    /**
     * 放款条件
     */
    private String loancondition;

    /**
     * 同意放款通知书表id
     */
    private String alnid;

    /**
     * 还款方式
     */
    private String reimway;

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
     * 项目号
     * @return PROJECTID 项目号
     */
    public String getProjectid() {
        return projectid;
    }

    /**
     * 项目号
     * @param projectid 项目号
     */
    public void setProjectid(String projectid) {
        this.projectid = projectid == null ? null : projectid.trim();
    }

    /**
     * 放款合作银行
     * @return COOPBANK 放款合作银行
     */
    public String getCoopbank() {
        return coopbank;
    }

    /**
     * 放款合作银行
     * @param coopbank 放款合作银行
     */
    public void setCoopbank(String coopbank) {
        this.coopbank = coopbank == null ? null : coopbank.trim();
    }

    /**
     * 放款金额
     * @return LOANAMOUNT 放款金额
     */
    public String getLoanamount() {
        return loanamount;
    }

    /**
     * 放款金额
     * @param loanamount 放款金额
     */
    public void setLoanamount(String loanamount) {
        this.loanamount = loanamount == null ? null : loanamount.trim();
    }

    /**
     * 放款账户
     * @return BANKACCOUNT 放款账户
     */
    public String getBankaccount() {
        return bankaccount;
    }

    /**
     * 放款账户
     * @param bankaccount 放款账户
     */
    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount == null ? null : bankaccount.trim();
    }

    /**
     * 放款账户开户行
     * @return BANKNAME 放款账户开户行
     */
    public String getBankname() {
        return bankname;
    }

    /**
     * 放款账户开户行
     * @param bankname 放款账户开户行
     */
    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    /**
     * 期限
     * @return LOANLIMIT 期限
     */
    public String getLoanlimit() {
        return loanlimit;
    }

    /**
     * 期限
     * @param loanlimit 期限
     */
    public void setLoanlimit(String loanlimit) {
        this.loanlimit = loanlimit == null ? null : loanlimit.trim();
    }

    /**
     * 放款日期
     * @return LOANDATE 放款日期
     */
    public String getLoandate() {
        return loandate;
    }

    /**
     * 放款日期
     * @param loandate 放款日期
     */
    public void setLoandate(String loandate) {
        this.loandate = loandate == null ? null : loandate.trim();
    }

    /**
     * 放款费率
     * @return LOANRATE 放款费率
     */
    public String getLoanrate() {
        return loanrate;
    }

    /**
     * 放款费率
     * @param loanrate 放款费率
     */
    public void setLoanrate(String loanrate) {
        this.loanrate = loanrate == null ? null : loanrate.trim();
    }

    /**
     * 放款条件
     * @return LOANCONDITION 放款条件
     */
    public String getLoancondition() {
        return loancondition;
    }

    /**
     * 放款条件
     * @param loancondition 放款条件
     */
    public void setLoancondition(String loancondition) {
        this.loancondition = loancondition == null ? null : loancondition.trim();
    }

    /**
     * 同意放款通知书表id
     * @return ALNID 同意放款通知书表id
     */
    public String getAlnid() {
        return alnid;
    }

    /**
     * 同意放款通知书表id
     * @param alnid 同意放款通知书表id
     */
    public void setAlnid(String alnid) {
        this.alnid = alnid == null ? null : alnid.trim();
    }

    /**
     * 还款方式
     * @return REIMWAY 还款方式
     */
    public String getReimway() {
        return reimway;
    }

    /**
     * 还款方式
     * @param reimway 还款方式
     */
    public void setReimway(String reimway) {
        this.reimway = reimway == null ? null : reimway.trim();
    }
}
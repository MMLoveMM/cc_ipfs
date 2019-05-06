package cn.net.sinodata.model;

import java.util.Date;

public class TUsers {
    /**
     * 
     */
    private String id;

    /**
     * 用户名
     */
    private String userid;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 机构ID
     */
    private String organsid;

    /**
     * 部门名称
     */
    private String deptname;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 电话
     */
    private String telephone;

    /**
     * 传真
     */
    private String fax;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 手机验证码
     */
    private String telver;

    /**
     * 用户类型
     */
    private String usertype;

    /**
     * 用户登录IP
     */
    private String userip;

    /**
     * 一天内连续错误登录次数超过3次，自动锁定用户
     */
    private String errloginnum;

    /**
     * 用户状态 0：启用 1：停用 2：失效
     */
    private String status;

    /**
     * 创建人
     */
    private String cname;

    /**
     * 创建时间
     */
    private Date cdate;

    /**
     * 修改人
     */
    private String uname;

    /**
     * 修改时间
     */
    private Date udate;

    /**
     * 备注
     */
    private String note;

    /**
     * 生效时间
     */
    private Date effectDate;

    /**
     * 是否领导
     */
    private String isleader;

    /**
     * 企业信息表ID
     */
    private String customerInfoId;

    /**
     * 
     * @return ID 
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 用户名
     * @return USERID 用户名
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 用户名
     * @param userid 用户名
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * 用户名称
     * @return NAME 用户名称
     */
    public String getName() {
        return name;
    }

    /**
     * 用户名称
     * @param name 用户名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 密码
     * @return PASSWORD 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 机构ID
     * @return ORGANSID 机构ID
     */
    public String getOrgansid() {
        return organsid;
    }

    /**
     * 机构ID
     * @param organsid 机构ID
     */
    public void setOrgansid(String organsid) {
        this.organsid = organsid == null ? null : organsid.trim();
    }

    /**
     * 部门名称
     * @return DEPTNAME 部门名称
     */
    public String getDeptname() {
        return deptname;
    }

    /**
     * 部门名称
     * @param deptname 部门名称
     */
    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    /**
     * 手机号
     * @return MOBILE 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 手机号
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 电话
     * @return TELEPHONE 电话
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 电话
     * @param telephone 电话
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * 传真
     * @return FAX 传真
     */
    public String getFax() {
        return fax;
    }

    /**
     * 传真
     * @param fax 传真
     */
    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    /**
     * 邮箱
     * @return MAIL 邮箱
     */
    public String getMail() {
        return mail;
    }

    /**
     * 邮箱
     * @param mail 邮箱
     */
    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    /**
     * 手机验证码
     * @return TELVER 手机验证码
     */
    public String getTelver() {
        return telver;
    }

    /**
     * 手机验证码
     * @param telver 手机验证码
     */
    public void setTelver(String telver) {
        this.telver = telver == null ? null : telver.trim();
    }

    /**
     * 用户类型
     * @return USERTYPE 用户类型
     */
    public String getUsertype() {
        return usertype;
    }

    /**
     * 用户类型
     * @param usertype 用户类型
     */
    public void setUsertype(String usertype) {
        this.usertype = usertype == null ? null : usertype.trim();
    }

    /**
     * 用户登录IP
     * @return USERIP 用户登录IP
     */
    public String getUserip() {
        return userip;
    }

    /**
     * 用户登录IP
     * @param userip 用户登录IP
     */
    public void setUserip(String userip) {
        this.userip = userip == null ? null : userip.trim();
    }

    /**
     * 一天内连续错误登录次数超过3次，自动锁定用户
     * @return ERRLOGINNUM 一天内连续错误登录次数超过3次，自动锁定用户
     */
    public String getErrloginnum() {
        return errloginnum;
    }

    /**
     * 一天内连续错误登录次数超过3次，自动锁定用户
     * @param errloginnum 一天内连续错误登录次数超过3次，自动锁定用户
     */
    public void setErrloginnum(String errloginnum) {
        this.errloginnum = errloginnum == null ? null : errloginnum.trim();
    }

    /**
     * 用户状态 0：启用 1：停用 2：失效
     * @return STATUS 用户状态 0：启用 1：停用 2：失效
     */
    public String getStatus() {
        return status;
    }

    /**
     * 用户状态 0：启用 1：停用 2：失效
     * @param status 用户状态 0：启用 1：停用 2：失效
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 创建人
     * @return CNAME 创建人
     */
    public String getCname() {
        return cname;
    }

    /**
     * 创建人
     * @param cname 创建人
     */
    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    /**
     * 创建时间
     * @return CDATE 创建时间
     */
    public Date getCdate() {
        return cdate;
    }

    /**
     * 创建时间
     * @param cdate 创建时间
     */
    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    /**
     * 修改人
     * @return UNAME 修改人
     */
    public String getUname() {
        return uname;
    }

    /**
     * 修改人
     * @param uname 修改人
     */
    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    /**
     * 修改时间
     * @return UDATE 修改时间
     */
    public Date getUdate() {
        return udate;
    }

    /**
     * 修改时间
     * @param udate 修改时间
     */
    public void setUdate(Date udate) {
        this.udate = udate;
    }

    /**
     * 备注
     * @return NOTE 备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 备注
     * @param note 备注
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * 生效时间
     * @return EFFECT_DATE 生效时间
     */
    public Date getEffectDate() {
        return effectDate;
    }

    /**
     * 生效时间
     * @param effectDate 生效时间
     */
    public void setEffectDate(Date effectDate) {
        this.effectDate = effectDate;
    }

    /**
     * 是否领导
     * @return ISLEADER 是否领导
     */
    public String getIsleader() {
        return isleader;
    }

    /**
     * 是否领导
     * @param isleader 是否领导
     */
    public void setIsleader(String isleader) {
        this.isleader = isleader == null ? null : isleader.trim();
    }

    /**
     * 企业信息表ID
     * @return CUSTOMER_INFO_ID 企业信息表ID
     */
    public String getCustomerInfoId() {
        return customerInfoId;
    }

    /**
     * 企业信息表ID
     * @param customerInfoId 企业信息表ID
     */
    public void setCustomerInfoId(String customerInfoId) {
        this.customerInfoId = customerInfoId == null ? null : customerInfoId.trim();
    }
}
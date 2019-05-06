package cn.net.sinodata.model;

import java.util.Date;

public class TOrgans {
    /**
     * 
     */
    private String id;

    /**
     * 机构号
     */
    private String orgcode;

    /**
     * 机构名称
     */
    private String orgname;

    /**
     * 机构联系人姓名
     */
    private String conname;

    /**
     * 机构联系人手机
     */
    private String conmobile;

    /**
     * 机构联系人电话
     */
    private String contel;

    /**
     * 机构联系人传真
     */
    private String confax;

    /**
     * 机构联系人邮箱
     */
    private String conmail;

    /**
     * 机构属性
     */
    private String orgtype;

    /**
     * 父机构号
     */
    private String pid;

    /**
     * 状态
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
     * 机构级别
     */
    private String orgLevel;

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
     * 机构号
     * @return ORGCODE 机构号
     */
    public String getOrgcode() {
        return orgcode;
    }

    /**
     * 机构号
     * @param orgcode 机构号
     */
    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode == null ? null : orgcode.trim();
    }

    /**
     * 机构名称
     * @return ORGNAME 机构名称
     */
    public String getOrgname() {
        return orgname;
    }

    /**
     * 机构名称
     * @param orgname 机构名称
     */
    public void setOrgname(String orgname) {
        this.orgname = orgname == null ? null : orgname.trim();
    }

    /**
     * 机构联系人姓名
     * @return CONNAME 机构联系人姓名
     */
    public String getConname() {
        return conname;
    }

    /**
     * 机构联系人姓名
     * @param conname 机构联系人姓名
     */
    public void setConname(String conname) {
        this.conname = conname == null ? null : conname.trim();
    }

    /**
     * 机构联系人手机
     * @return CONMOBILE 机构联系人手机
     */
    public String getConmobile() {
        return conmobile;
    }

    /**
     * 机构联系人手机
     * @param conmobile 机构联系人手机
     */
    public void setConmobile(String conmobile) {
        this.conmobile = conmobile == null ? null : conmobile.trim();
    }

    /**
     * 机构联系人电话
     * @return CONTEL 机构联系人电话
     */
    public String getContel() {
        return contel;
    }

    /**
     * 机构联系人电话
     * @param contel 机构联系人电话
     */
    public void setContel(String contel) {
        this.contel = contel == null ? null : contel.trim();
    }

    /**
     * 机构联系人传真
     * @return CONFAX 机构联系人传真
     */
    public String getConfax() {
        return confax;
    }

    /**
     * 机构联系人传真
     * @param confax 机构联系人传真
     */
    public void setConfax(String confax) {
        this.confax = confax == null ? null : confax.trim();
    }

    /**
     * 机构联系人邮箱
     * @return CONMAIL 机构联系人邮箱
     */
    public String getConmail() {
        return conmail;
    }

    /**
     * 机构联系人邮箱
     * @param conmail 机构联系人邮箱
     */
    public void setConmail(String conmail) {
        this.conmail = conmail == null ? null : conmail.trim();
    }

    /**
     * 机构属性
     * @return ORGTYPE 机构属性
     */
    public String getOrgtype() {
        return orgtype;
    }

    /**
     * 机构属性
     * @param orgtype 机构属性
     */
    public void setOrgtype(String orgtype) {
        this.orgtype = orgtype == null ? null : orgtype.trim();
    }

    /**
     * 父机构号
     * @return PID 父机构号
     */
    public String getPid() {
        return pid;
    }

    /**
     * 父机构号
     * @param pid 父机构号
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
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
     * 机构级别
     * @return ORG_LEVEL 机构级别
     */
    public String getOrgLevel() {
        return orgLevel;
    }

    /**
     * 机构级别
     * @param orgLevel 机构级别
     */
    public void setOrgLevel(String orgLevel) {
        this.orgLevel = orgLevel == null ? null : orgLevel.trim();
    }
}
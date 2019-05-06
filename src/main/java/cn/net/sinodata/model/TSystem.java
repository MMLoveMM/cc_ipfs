package cn.net.sinodata.model;

import java.util.Date;

public class TSystem {
    /**
     * 
     */
    private String id;

    /**
     * 系统编号
     */
    private String syscode;

    /**
     * 系统名称
     */
    private String sysname;

    /**
     * 系统路径
     */
    private String sysurl;

    /**
     * 系统图标
     */
    private String icon;

    /**
     * 创建人
     */
    private String cname;

    /**
     * 创建日期
     */
    private Date cdate;

    /**
     * 修改人
     */
    private String uname;

    /**
     * 修改日期
     */
    private Date udate;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String note;

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
     * 系统编号
     * @return SYSCODE 系统编号
     */
    public String getSyscode() {
        return syscode;
    }

    /**
     * 系统编号
     * @param syscode 系统编号
     */
    public void setSyscode(String syscode) {
        this.syscode = syscode == null ? null : syscode.trim();
    }

    /**
     * 系统名称
     * @return SYSNAME 系统名称
     */
    public String getSysname() {
        return sysname;
    }

    /**
     * 系统名称
     * @param sysname 系统名称
     */
    public void setSysname(String sysname) {
        this.sysname = sysname == null ? null : sysname.trim();
    }

    /**
     * 系统路径
     * @return SYSURL 系统路径
     */
    public String getSysurl() {
        return sysurl;
    }

    /**
     * 系统路径
     * @param sysurl 系统路径
     */
    public void setSysurl(String sysurl) {
        this.sysurl = sysurl == null ? null : sysurl.trim();
    }

    /**
     * 系统图标
     * @return ICON 系统图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 系统图标
     * @param icon 系统图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
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
     * 创建日期
     * @return CDATE 创建日期
     */
    public Date getCdate() {
        return cdate;
    }

    /**
     * 创建日期
     * @param cdate 创建日期
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
     * 修改日期
     * @return UDATE 修改日期
     */
    public Date getUdate() {
        return udate;
    }

    /**
     * 修改日期
     * @param udate 修改日期
     */
    public void setUdate(Date udate) {
        this.udate = udate;
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
}
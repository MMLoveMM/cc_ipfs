package cn.net.sinodata.model;

import java.util.Date;

public class TApplicationLog {
    /**
     * 主键
     */
    private String id;

    /**
     * 模块
     */
    private String module;

    /**
     * 操作类型
     */
    private String opetype;

    /**
     * 操作内容
     */
    private String opecontent;

    /**
     * 操作人帐号
     */
    private String opeperson;

    /**
     * 操作人名称
     */
    private String opename;

    /**
     * 操作时间
     */
    private Date opedate;

    /**
     * 操作机构
     */
    private String opeorg;

    /**
     * 角色
     */
    private String role;

    /**
     * IP地址
     */
    private String ip;

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
     * 模块
     * @return MODULE 模块
     */
    public String getModule() {
        return module;
    }

    /**
     * 模块
     * @param module 模块
     */
    public void setModule(String module) {
        this.module = module == null ? null : module.trim();
    }

    /**
     * 操作类型
     * @return OPETYPE 操作类型
     */
    public String getOpetype() {
        return opetype;
    }

    /**
     * 操作类型
     * @param opetype 操作类型
     */
    public void setOpetype(String opetype) {
        this.opetype = opetype == null ? null : opetype.trim();
    }

    /**
     * 操作内容
     * @return OPECONTENT 操作内容
     */
    public String getOpecontent() {
        return opecontent;
    }

    /**
     * 操作内容
     * @param opecontent 操作内容
     */
    public void setOpecontent(String opecontent) {
        this.opecontent = opecontent == null ? null : opecontent.trim();
    }

    /**
     * 操作人帐号
     * @return OPEPERSON 操作人帐号
     */
    public String getOpeperson() {
        return opeperson;
    }

    /**
     * 操作人帐号
     * @param opeperson 操作人帐号
     */
    public void setOpeperson(String opeperson) {
        this.opeperson = opeperson == null ? null : opeperson.trim();
    }

    /**
     * 操作人名称
     * @return OPENAME 操作人名称
     */
    public String getOpename() {
        return opename;
    }

    /**
     * 操作人名称
     * @param opename 操作人名称
     */
    public void setOpename(String opename) {
        this.opename = opename == null ? null : opename.trim();
    }

    /**
     * 操作时间
     * @return OPEDATE 操作时间
     */
    public Date getOpedate() {
        return opedate;
    }

    /**
     * 操作时间
     * @param opedate 操作时间
     */
    public void setOpedate(Date opedate) {
        this.opedate = opedate;
    }

    /**
     * 操作机构
     * @return OPEORG 操作机构
     */
    public String getOpeorg() {
        return opeorg;
    }

    /**
     * 操作机构
     * @param opeorg 操作机构
     */
    public void setOpeorg(String opeorg) {
        this.opeorg = opeorg == null ? null : opeorg.trim();
    }

    /**
     * 角色
     * @return ROLE 角色
     */
    public String getRole() {
        return role;
    }

    /**
     * 角色
     * @param role 角色
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    /**
     * IP地址
     * @return IP IP地址
     */
    public String getIp() {
        return ip;
    }

    /**
     * IP地址
     * @param ip IP地址
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }
}
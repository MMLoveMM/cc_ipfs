package cn.net.sinodata.model;

import java.util.Date;

public class TFunc {
    /**
     * 主键
     */
    private String id;

    /**
     * 资源名称
     */
    private String funcName;

    /**
     * 权限字符串
     */
    private String permission;

    /**
     * 资源路径
     */
    private String url;

    /**
     * 资源图标
     */
    private String icon;

    /**
     * 资源类型
     */
    private String ftype;

    /**
     * 资源顺序
     */
    private String findex;

    /**
     * 上级资源ID
     */
    private String funcParentId;

    /**
     * 所属子系统
     */
    private String sysid;

    /**
     * 资源级别
     */
    private String level;

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
    private String resid;

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
     * 资源名称
     * @return FUNC_NAME 资源名称
     */
    public String getFuncName() {
        return funcName;
    }

    /**
     * 资源名称
     * @param funcName 资源名称
     */
    public void setFuncName(String funcName) {
        this.funcName = funcName == null ? null : funcName.trim();
    }

    /**
     * 权限字符串
     * @return PERMISSION 权限字符串
     */
    public String getPermission() {
        return permission;
    }

    /**
     * 权限字符串
     * @param permission 权限字符串
     */
    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    /**
     * 资源路径
     * @return URL 资源路径
     */
    public String getUrl() {
        return url;
    }

    /**
     * 资源路径
     * @param url 资源路径
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 资源图标
     * @return ICON 资源图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 资源图标
     * @param icon 资源图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * 资源类型
     * @return FTYPE 资源类型
     */
    public String getFtype() {
        return ftype;
    }

    /**
     * 资源类型
     * @param ftype 资源类型
     */
    public void setFtype(String ftype) {
        this.ftype = ftype == null ? null : ftype.trim();
    }

    /**
     * 资源顺序
     * @return FINDEX 资源顺序
     */
    public String getFindex() {
        return findex;
    }

    /**
     * 资源顺序
     * @param findex 资源顺序
     */
    public void setFindex(String findex) {
        this.findex = findex == null ? null : findex.trim();
    }

    /**
     * 上级资源ID
     * @return FUNC_PARENT_ID 上级资源ID
     */
    public String getFuncParentId() {
        return funcParentId;
    }

    /**
     * 上级资源ID
     * @param funcParentId 上级资源ID
     */
    public void setFuncParentId(String funcParentId) {
        this.funcParentId = funcParentId == null ? null : funcParentId.trim();
    }

    /**
     * 所属子系统
     * @return SYSID 所属子系统
     */
    public String getSysid() {
        return sysid;
    }

    /**
     * 所属子系统
     * @param sysid 所属子系统
     */
    public void setSysid(String sysid) {
        this.sysid = sysid == null ? null : sysid.trim();
    }

    /**
     * 资源级别
     * @return LEVEL 资源级别
     */
    public String getLevel() {
        return level;
    }

    /**
     * 资源级别
     * @param level 资源级别
     */
    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
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
     * @return RESID 备注
     */
    public String getResid() {
        return resid;
    }

    /**
     * 备注
     * @param resid 备注
     */
    public void setResid(String resid) {
        this.resid = resid == null ? null : resid.trim();
    }
    
    /**
     * 
	 * 资源类型：菜单
	 */
	public static final String RESTYPE_MENU = "MENU";
	
	/**
	 * 资源类型：按钮
	 */
	public static final String RESTYPE_BUTTON = "BUTTON";
}
package cn.net.sinodata.model;

public class AccessoryInfo {
    /**
     * ID
     */
    private Long id;

    /**
     * 项目ID
     */
    private String tableid;

    /**
     * 附件名称
     */
    private String accessoryname;

    /**
     * 附件显示名称
     */
    private String showname;

    /**
     * 附件位置
     */
    private String accessoryadd;

    /**
     * 附件类型
     */
    private Short accessorytype;

    /**
     * 文件类型
     */
    private String filetype;

    /**
     * 上传用户
     */
    private String userid;

    /**
     * 上传时间
     */
    private String uploaddt;

    /**
     * 备注
     */
    private String remark;

    /**
     * 
     */
    private String busitype;

    /**
     * 能否删除
     */
    private String delflag;

    /**
     * ID
     * @return ID ID
     */
    public Long getId() {
        return id;
    }

    /**
     * ID
     * @param id ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 项目ID
     * @return TABLEID 项目ID
     */
    public String getTableid() {
        return tableid;
    }

    /**
     * 项目ID
     * @param tableid 项目ID
     */
    public void setTableid(String tableid) {
        this.tableid = tableid == null ? null : tableid.trim();
    }

    /**
     * 附件名称
     * @return ACCESSORYNAME 附件名称
     */
    public String getAccessoryname() {
        return accessoryname;
    }

    /**
     * 附件名称
     * @param accessoryname 附件名称
     */
    public void setAccessoryname(String accessoryname) {
        this.accessoryname = accessoryname == null ? null : accessoryname.trim();
    }

    /**
     * 附件显示名称
     * @return SHOWNAME 附件显示名称
     */
    public String getShowname() {
        return showname;
    }

    /**
     * 附件显示名称
     * @param showname 附件显示名称
     */
    public void setShowname(String showname) {
        this.showname = showname == null ? null : showname.trim();
    }

    /**
     * 附件位置
     * @return ACCESSORYADD 附件位置
     */
    public String getAccessoryadd() {
        return accessoryadd;
    }

    /**
     * 附件位置
     * @param accessoryadd 附件位置
     */
    public void setAccessoryadd(String accessoryadd) {
        this.accessoryadd = accessoryadd == null ? null : accessoryadd.trim();
    }

    /**
     * 附件类型
     * @return ACCESSORYTYPE 附件类型
     */
    public Short getAccessorytype() {
        return accessorytype;
    }

    /**
     * 附件类型
     * @param accessorytype 附件类型
     */
    public void setAccessorytype(Short accessorytype) {
        this.accessorytype = accessorytype;
    }

    /**
     * 文件类型
     * @return FILETYPE 文件类型
     */
    public String getFiletype() {
        return filetype;
    }

    /**
     * 文件类型
     * @param filetype 文件类型
     */
    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }

    /**
     * 上传用户
     * @return USERID 上传用户
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 上传用户
     * @param userid 上传用户
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * 上传时间
     * @return UPLOADDT 上传时间
     */
    public String getUploaddt() {
        return uploaddt;
    }

    /**
     * 上传时间
     * @param uploaddt 上传时间
     */
    public void setUploaddt(String uploaddt) {
        this.uploaddt = uploaddt == null ? null : uploaddt.trim();
    }

    /**
     * 备注
     * @return REMARK 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 
     * @return BUSITYPE 
     */
    public String getBusitype() {
        return busitype;
    }

    /**
     * 
     * @param busitype 
     */
    public void setBusitype(String busitype) {
        this.busitype = busitype == null ? null : busitype.trim();
    }

    /**
     * 能否删除
     * @return DELFLAG 能否删除
     */
    public String getDelflag() {
        return delflag;
    }

    /**
     * 能否删除
     * @param delflag 能否删除
     */
    public void setDelflag(String delflag) {
        this.delflag = delflag == null ? null : delflag.trim();
    }
}
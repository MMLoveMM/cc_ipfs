package cn.net.sinodata.model;

import java.util.Date;

public class TAnnexTemplet {
    /**
     * 流水
     */
    private String id;

    /**
     * 附件ID
     */
    private String accessoryid;

    /**
     * 附件名称
     */
    private String templetname;

    /**
     * 部门ID
     */
    private String organsid;

    /**
     * 上传人ID
     */
    private String uploader;

    /**
     * 上传时间
     */
    private Date uploadtime;

    /**
     * 模板编号
     */
    private String templetnum;

    /**
     * 流水
     * @return ID 流水
     */
    public String getId() {
        return id;
    }

    /**
     * 流水
     * @param id 流水
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 附件ID
     * @return ACCESSORYID 附件ID
     */
    public String getAccessoryid() {
        return accessoryid;
    }

    /**
     * 附件ID
     * @param accessoryid 附件ID
     */
    public void setAccessoryid(String accessoryid) {
        this.accessoryid = accessoryid == null ? null : accessoryid.trim();
    }

    /**
     * 附件名称
     * @return TEMPLETNAME 附件名称
     */
    public String getTempletname() {
        return templetname;
    }

    /**
     * 附件名称
     * @param templetname 附件名称
     */
    public void setTempletname(String templetname) {
        this.templetname = templetname == null ? null : templetname.trim();
    }

    /**
     * 部门ID
     * @return ORGANSID 部门ID
     */
    public String getOrgansid() {
        return organsid;
    }

    /**
     * 部门ID
     * @param organsid 部门ID
     */
    public void setOrgansid(String organsid) {
        this.organsid = organsid == null ? null : organsid.trim();
    }

    /**
     * 上传人ID
     * @return UPLOADER 上传人ID
     */
    public String getUploader() {
        return uploader;
    }

    /**
     * 上传人ID
     * @param uploader 上传人ID
     */
    public void setUploader(String uploader) {
        this.uploader = uploader == null ? null : uploader.trim();
    }

    /**
     * 上传时间
     * @return UPLOADTIME 上传时间
     */
    public Date getUploadtime() {
        return uploadtime;
    }

    /**
     * 上传时间
     * @param uploadtime 上传时间
     */
    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    /**
     * 模板编号
     * @return TEMPLETNUM 模板编号
     */
    public String getTempletnum() {
        return templetnum;
    }

    /**
     * 模板编号
     * @param templetnum 模板编号
     */
    public void setTempletnum(String templetnum) {
        this.templetnum = templetnum == null ? null : templetnum.trim();
    }
}
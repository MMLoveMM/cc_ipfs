package cn.net.sinodata.model;

public class AnnexDocs {
    /**
     * ID
     */
    private String id;

    /**
     * 个人id
     */
    private String perid;

    /**
     * 上传时间
     */
    private String uploaddt;

    /**
     * 证件号码
     */
    private String num;

    /**
     * 备注
     */
    private String remark;

    /**
     * 证件类型
     */
    private String certtypes;

    /**
     * 对应的附件ID
     */
    private String fileid;

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
     * 证件号码
     * @return NUM 证件号码
     */
    public String getNum() {
        return num;
    }

    /**
     * 证件号码
     * @param num 证件号码
     */
    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
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
     * 证件类型
     * @return CERTTYPES 证件类型
     */
    public String getCerttypes() {
        return certtypes;
    }

    /**
     * 证件类型
     * @param certtypes 证件类型
     */
    public void setCerttypes(String certtypes) {
        this.certtypes = certtypes == null ? null : certtypes.trim();
    }

    /**
     * 对应的附件ID
     * @return FILEID 对应的附件ID
     */
    public String getFileid() {
        return fileid;
    }

    /**
     * 对应的附件ID
     * @param fileid 对应的附件ID
     */
    public void setFileid(String fileid) {
        this.fileid = fileid == null ? null : fileid.trim();
    }
}
package cn.net.sinodata.model;

import java.util.Date;

public class TDataDict {
    /**
     * 主键
     */
    private String id;

    /**
     * 编码
     */
    private String dcode;

    /**
     * 名称
     */
    private String dname;

    /**
     * 类型
     */
    private String dictType;

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
     * 编码
     * @return DCODE 编码
     */
    public String getDcode() {
        return dcode;
    }

    /**
     * 编码
     * @param dcode 编码
     */
    public void setDcode(String dcode) {
        this.dcode = dcode == null ? null : dcode.trim();
    }

    /**
     * 名称
     * @return DNAME 名称
     */
    public String getDname() {
        return dname;
    }

    /**
     * 名称
     * @param dname 名称
     */
    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    /**
     * 类型
     * @return DICT_TYPE 类型
     */
    public String getDictType() {
        return dictType;
    }

    /**
     * 类型
     * @param dictType 类型
     */
    public void setDictType(String dictType) {
        this.dictType = dictType == null ? null : dictType.trim();
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
}
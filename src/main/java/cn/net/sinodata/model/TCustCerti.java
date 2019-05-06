package cn.net.sinodata.model;

import java.util.Date;

public class TCustCerti {
    /**
     * 主键
     */
    private String id;

    /**
     * 客户ID
     */
    private String customerid;

    /**
     * 证件颁发国家/地区
     */
    private String nation;

    /**
     * 证件类型
     */
    private String idtype;

    /**
     * 证件号码
     */
    private String idno;

    /**
     * 证件生效日期
     */
    private Date idtefdate;

    /**
     * 证件失效日期
     */
    private Date idlefdate;

    /**
     * 证件年检日期
     */
    private Date idasdate;

    /**
     * 添加日期
     */
    private Date ctime;

    /**
     * 状态
     */
    private String status;

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
     * 客户ID
     * @return CUSTOMERID 客户ID
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * 客户ID
     * @param customerid 客户ID
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    /**
     * 证件颁发国家/地区
     * @return NATION 证件颁发国家/地区
     */
    public String getNation() {
        return nation;
    }

    /**
     * 证件颁发国家/地区
     * @param nation 证件颁发国家/地区
     */
    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    /**
     * 证件类型
     * @return IDTYPE 证件类型
     */
    public String getIdtype() {
        return idtype;
    }

    /**
     * 证件类型
     * @param idtype 证件类型
     */
    public void setIdtype(String idtype) {
        this.idtype = idtype == null ? null : idtype.trim();
    }

    /**
     * 证件号码
     * @return IDNO 证件号码
     */
    public String getIdno() {
        return idno;
    }

    /**
     * 证件号码
     * @param idno 证件号码
     */
    public void setIdno(String idno) {
        this.idno = idno == null ? null : idno.trim();
    }

    /**
     * 证件生效日期
     * @return IDTEFDATE 证件生效日期
     */
    public Date getIdtefdate() {
        return idtefdate;
    }

    /**
     * 证件生效日期
     * @param idtefdate 证件生效日期
     */
    public void setIdtefdate(Date idtefdate) {
        this.idtefdate = idtefdate;
    }

    /**
     * 证件失效日期
     * @return IDLEFDATE 证件失效日期
     */
    public Date getIdlefdate() {
        return idlefdate;
    }

    /**
     * 证件失效日期
     * @param idlefdate 证件失效日期
     */
    public void setIdlefdate(Date idlefdate) {
        this.idlefdate = idlefdate;
    }

    /**
     * 证件年检日期
     * @return IDASDATE 证件年检日期
     */
    public Date getIdasdate() {
        return idasdate;
    }

    /**
     * 证件年检日期
     * @param idasdate 证件年检日期
     */
    public void setIdasdate(Date idasdate) {
        this.idasdate = idasdate;
    }

    /**
     * 添加日期
     * @return CTIME 添加日期
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * 添加日期
     * @param ctime 添加日期
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
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
}
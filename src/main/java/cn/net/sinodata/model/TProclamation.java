package cn.net.sinodata.model;

import java.util.Date;

public class TProclamation {
    /**
     * 主键
     */
    private String id;

    /**
     * 标题
     */
    private String title;

    /**
     * 公告内容
     */
    private String content;

    /**
     * 作者
     */
    private String author;

    /**
     * 发布日期
     */
    private Date reltime;

    /**
     * 关键字
     */
    private String keyword;

    /**
     * 发送方式
     */
    private String sendtype;

    /**
     * 发送范围
     */
    private String sendscope;

    /**
     * 发状状态
     */
    private String relstatus;

    /**
     * 收件人
     */
    private String addressee;

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
     * 发布人
     */
    private String relname;

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
     * 标题
     * @return TITLE 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 标题
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 公告内容
     * @return CONTENT 公告内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 公告内容
     * @param content 公告内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 作者
     * @return AUTHOR 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 作者
     * @param author 作者
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * 发布日期
     * @return RELTIME 发布日期
     */
    public Date getReltime() {
        return reltime;
    }

    /**
     * 发布日期
     * @param reltime 发布日期
     */
    public void setReltime(Date reltime) {
        this.reltime = reltime;
    }

    /**
     * 关键字
     * @return KEYWORD 关键字
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * 关键字
     * @param keyword 关键字
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    /**
     * 发送方式
     * @return SENDTYPE 发送方式
     */
    public String getSendtype() {
        return sendtype;
    }

    /**
     * 发送方式
     * @param sendtype 发送方式
     */
    public void setSendtype(String sendtype) {
        this.sendtype = sendtype == null ? null : sendtype.trim();
    }

    /**
     * 发送范围
     * @return SENDSCOPE 发送范围
     */
    public String getSendscope() {
        return sendscope;
    }

    /**
     * 发送范围
     * @param sendscope 发送范围
     */
    public void setSendscope(String sendscope) {
        this.sendscope = sendscope == null ? null : sendscope.trim();
    }

    /**
     * 发状状态
     * @return RELSTATUS 发状状态
     */
    public String getRelstatus() {
        return relstatus;
    }

    /**
     * 发状状态
     * @param relstatus 发状状态
     */
    public void setRelstatus(String relstatus) {
        this.relstatus = relstatus == null ? null : relstatus.trim();
    }

    /**
     * 收件人
     * @return ADDRESSEE 收件人
     */
    public String getAddressee() {
        return addressee;
    }

    /**
     * 收件人
     * @param addressee 收件人
     */
    public void setAddressee(String addressee) {
        this.addressee = addressee == null ? null : addressee.trim();
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
     * 发布人
     * @return RELNAME 发布人
     */
    public String getRelname() {
        return relname;
    }

    /**
     * 发布人
     * @param relname 发布人
     */
    public void setRelname(String relname) {
        this.relname = relname == null ? null : relname.trim();
    }
}
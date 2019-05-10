package cn.net.sinodata.model;

import java.io.Serializable;
import java.util.Date;

public class News implements Serializable {
    private static final long serialVersionUID = 879635852889683777L;

    private String id;
    private String title;  //资讯标题
    private String context;    //资讯正文
    private String source; //资讯来源
    private Date createDate; //创建时间
    private Date updateDate; //更新时间

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}

package cn.net.sinodata.model;

import java.util.Date;

public class TUsersRoles {
    /**
     * 流水
     */
    private String id;

    /**
     * 用户id
     */
    private String userid;

    /**
     * 项目ID
     */
    private String projectid;

    /**
     * 处理时间
     */
    private Date addtime;

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
     * 用户id
     * @return USERID 用户id
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 用户id
     * @param userid 用户id
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * 项目ID
     * @return PROJECTID 项目ID
     */
    public String getProjectid() {
        return projectid;
    }

    /**
     * 项目ID
     * @param projectid 项目ID
     */
    public void setProjectid(String projectid) {
        this.projectid = projectid == null ? null : projectid.trim();
    }

    /**
     * 处理时间
     * @return ADDTIME 处理时间
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * 处理时间
     * @param addtime 处理时间
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}
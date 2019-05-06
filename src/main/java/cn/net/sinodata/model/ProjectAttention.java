package cn.net.sinodata.model;

public class ProjectAttention {
    /**
     * ID
     */
    private String id;

    /**
     * 项目ID
     */
    private String projectid;

    /**
     * 关注人ID
     */
    private String attentionid;

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
     * 关注人ID
     * @return ATTENTIONID 关注人ID
     */
    public String getAttentionid() {
        return attentionid;
    }

    /**
     * 关注人ID
     * @param attentionid 关注人ID
     */
    public void setAttentionid(String attentionid) {
        this.attentionid = attentionid == null ? null : attentionid.trim();
    }
}
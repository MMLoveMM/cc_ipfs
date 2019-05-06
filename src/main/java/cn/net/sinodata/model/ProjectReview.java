package cn.net.sinodata.model;

public class ProjectReview {
    /**
     * ID
     */
    private String id;

    /**
     * 项目ID
     */
    private String projectid;

    /**
     * 
     */
    private String projectreview;

    /**
     * 评价人ID
     */
    private String appraiserid;

    /**
     * 评价时间
     */
    private String createtime;

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
     * 
     * @return PROJECTREVIEW 
     */
    public String getProjectreview() {
        return projectreview;
    }

    /**
     * 
     * @param projectreview 
     */
    public void setProjectreview(String projectreview) {
        this.projectreview = projectreview == null ? null : projectreview.trim();
    }

    /**
     * 评价人ID
     * @return APPRAISERID 评价人ID
     */
    public String getAppraiserid() {
        return appraiserid;
    }

    /**
     * 评价人ID
     * @param appraiserid 评价人ID
     */
    public void setAppraiserid(String appraiserid) {
        this.appraiserid = appraiserid == null ? null : appraiserid.trim();
    }

    /**
     * 评价时间
     * @return CREATETIME 评价时间
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * 评价时间
     * @param createtime 评价时间
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }
}
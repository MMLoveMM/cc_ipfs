package cn.net.sinodata.model;

public class AccessoryHistory {
    /**
     * 流水
     */
    private String id;

    /**
     * 附件ID
     */
    private Long accessoryid;

    /**
     * 附件名称
     */
    private String accessoryname;

    /**
     * 所属ID
     */
    private String tableid;

    /**
     * 附件类型
     */
    private Short accessorytype;

    /**
     * 操作类型
     */
    private Short operatetype;

    /**
     * 处理节点
     */
    private String node;

    /**
     * 操作人
     */
    private String userid;

    /**
     * 处理时间
     */
    private String dealdt;

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
    public Long getAccessoryid() {
        return accessoryid;
    }

    /**
     * 附件ID
     * @param accessoryid 附件ID
     */
    public void setAccessoryid(Long accessoryid) {
        this.accessoryid = accessoryid;
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
     * 所属ID
     * @return TABLEID 所属ID
     */
    public String getTableid() {
        return tableid;
    }

    /**
     * 所属ID
     * @param tableid 所属ID
     */
    public void setTableid(String tableid) {
        this.tableid = tableid == null ? null : tableid.trim();
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
     * 操作类型
     * @return OPERATETYPE 操作类型
     */
    public Short getOperatetype() {
        return operatetype;
    }

    /**
     * 操作类型
     * @param operatetype 操作类型
     */
    public void setOperatetype(Short operatetype) {
        this.operatetype = operatetype;
    }

    /**
     * 处理节点
     * @return NODE 处理节点
     */
    public String getNode() {
        return node;
    }

    /**
     * 处理节点
     * @param node 处理节点
     */
    public void setNode(String node) {
        this.node = node == null ? null : node.trim();
    }

    /**
     * 操作人
     * @return USERID 操作人
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 操作人
     * @param userid 操作人
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * 处理时间
     * @return DEALDT 处理时间
     */
    public String getDealdt() {
        return dealdt;
    }

    /**
     * 处理时间
     * @param dealdt 处理时间
     */
    public void setDealdt(String dealdt) {
        this.dealdt = dealdt == null ? null : dealdt.trim();
    }
}
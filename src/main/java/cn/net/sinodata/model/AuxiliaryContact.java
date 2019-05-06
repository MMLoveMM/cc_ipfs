package cn.net.sinodata.model;

public class AuxiliaryContact {
    /**
     * ID
     */
    private String id;

    /**
     * 个人id
     */
    private String perid;

    /**
     * 姓名
     */
    private String name;

    /**
     * 关系
     */
    private String relation;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 添加时间
     */
    private String createtime;

    /**
     * 修改时间
     */
    private String updatetime;

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
     * 姓名
     * @return NAME 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 姓名
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 关系
     * @return RELATION 关系
     */
    public String getRelation() {
        return relation;
    }

    /**
     * 关系
     * @param relation 关系
     */
    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    /**
     * 联系电话
     * @return PHONE 联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 联系电话
     * @param phone 联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 添加时间
     * @return CREATETIME 添加时间
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * 添加时间
     * @param createtime 添加时间
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    /**
     * 修改时间
     * @return UPDATETIME 修改时间
     */
    public String getUpdatetime() {
        return updatetime;
    }

    /**
     * 修改时间
     * @param updatetime 修改时间
     */
    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime == null ? null : updatetime.trim();
    }
}
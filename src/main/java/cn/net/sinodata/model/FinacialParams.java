package cn.net.sinodata.model;

public class FinacialParams {
    /**
     * ID
     */
    private String id;

    /**
     * 顺序号
     */
    private Integer seqnum;

    /**
     * 编号
     */
    private String num;

    /**
     * 条目名称
     */
    private String name;

    /**
     * 报表种类
     */
    private String type;

    /**
     * 备注
     */
    private String remark;

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
     * 顺序号
     * @return SEQNUM 顺序号
     */
    public Integer getSeqnum() {
        return seqnum;
    }

    /**
     * 顺序号
     * @param seqnum 顺序号
     */
    public void setSeqnum(Integer seqnum) {
        this.seqnum = seqnum;
    }

    /**
     * 编号
     * @return NUM 编号
     */
    public String getNum() {
        return num;
    }

    /**
     * 编号
     * @param num 编号
     */
    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    /**
     * 条目名称
     * @return NAME 条目名称
     */
    public String getName() {
        return name;
    }

    /**
     * 条目名称
     * @param name 条目名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 报表种类
     * @return TYPE 报表种类
     */
    public String getType() {
        return type;
    }

    /**
     * 报表种类
     * @param type 报表种类
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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
}
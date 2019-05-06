package cn.net.sinodata.model;

public class AssetInfos {
    /**
     * ID
     */
    private String id;

    /**
     * 个人id
     */
    private String perid;

    /**
     * 
     */
    private String housingtype;

    /**
     * 地址/型号
     */
    private String addornum;

    /**
     * 面积/数量
     */
    private String areaornum;

    /**
     * 购买时间
     */
    private String buytime;

    /**
     * 购买价值
     */
    private String purchasevalue;

    /**
     * 评估价值
     */
    private String valuationvalue;

    /**
     * 权证号
     */
    private String warrantsnum;

    /**
     *  权属及使用状况
     */
    private String ownerandusage;

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
     * 
     * @return HOUSINGTYPE 
     */
    public String getHousingtype() {
        return housingtype;
    }

    /**
     * 
     * @param housingtype 
     */
    public void setHousingtype(String housingtype) {
        this.housingtype = housingtype == null ? null : housingtype.trim();
    }

    /**
     * 地址/型号
     * @return ADDORNUM 地址/型号
     */
    public String getAddornum() {
        return addornum;
    }

    /**
     * 地址/型号
     * @param addornum 地址/型号
     */
    public void setAddornum(String addornum) {
        this.addornum = addornum == null ? null : addornum.trim();
    }

    /**
     * 面积/数量
     * @return AREAORNUM 面积/数量
     */
    public String getAreaornum() {
        return areaornum;
    }

    /**
     * 面积/数量
     * @param areaornum 面积/数量
     */
    public void setAreaornum(String areaornum) {
        this.areaornum = areaornum == null ? null : areaornum.trim();
    }

    /**
     * 购买时间
     * @return BUYTIME 购买时间
     */
    public String getBuytime() {
        return buytime;
    }

    /**
     * 购买时间
     * @param buytime 购买时间
     */
    public void setBuytime(String buytime) {
        this.buytime = buytime == null ? null : buytime.trim();
    }

    /**
     * 购买价值
     * @return PURCHASEVALUE 购买价值
     */
    public String getPurchasevalue() {
        return purchasevalue;
    }

    /**
     * 购买价值
     * @param purchasevalue 购买价值
     */
    public void setPurchasevalue(String purchasevalue) {
        this.purchasevalue = purchasevalue == null ? null : purchasevalue.trim();
    }

    /**
     * 评估价值
     * @return VALUATIONVALUE 评估价值
     */
    public String getValuationvalue() {
        return valuationvalue;
    }

    /**
     * 评估价值
     * @param valuationvalue 评估价值
     */
    public void setValuationvalue(String valuationvalue) {
        this.valuationvalue = valuationvalue == null ? null : valuationvalue.trim();
    }

    /**
     * 权证号
     * @return WARRANTSNUM 权证号
     */
    public String getWarrantsnum() {
        return warrantsnum;
    }

    /**
     * 权证号
     * @param warrantsnum 权证号
     */
    public void setWarrantsnum(String warrantsnum) {
        this.warrantsnum = warrantsnum == null ? null : warrantsnum.trim();
    }

    /**
     *  权属及使用状况
     * @return OWNERANDUSAGE  权属及使用状况
     */
    public String getOwnerandusage() {
        return ownerandusage;
    }

    /**
     *  权属及使用状况
     * @param ownerandusage  权属及使用状况
     */
    public void setOwnerandusage(String ownerandusage) {
        this.ownerandusage = ownerandusage == null ? null : ownerandusage.trim();
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
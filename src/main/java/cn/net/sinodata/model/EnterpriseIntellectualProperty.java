package cn.net.sinodata.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 企业近三年知识产权情况
 */
public class EnterpriseIntellectualProperty implements Serializable {
    private static final long serialVersionUID = 409449173374347318L;

    private String id;
    private String enterpriseId;
    private String patent;  //发明专利
    private String utilityModelPatents; //实用新型专利
    private String designPatent;    //外观设计专利
    private String softwareCopyright;   //软件著作权
    private String nationalNewDrug; //国家新药
    private String medicine;    //国家一级中药保护品种
    private String newPlantVariety; //植物新品种
    private String cropVariety; //国家级农作物品种
    private String integratedCircuit;   //集成电路布图设计专有权
    private Date createDate;
    private Date updateDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getPatent() {
        return patent;
    }

    public void setPatent(String patent) {
        this.patent = patent;
    }

    public String getUtilityModelPatents() {
        return utilityModelPatents;
    }

    public void setUtilityModelPatents(String utilityModelPatents) {
        this.utilityModelPatents = utilityModelPatents;
    }

    public String getDesignPatent() {
        return designPatent;
    }

    public void setDesignPatent(String designPatent) {
        this.designPatent = designPatent;
    }

    public String getSoftwareCopyright() {
        return softwareCopyright;
    }

    public void setSoftwareCopyright(String softwareCopyright) {
        this.softwareCopyright = softwareCopyright;
    }

    public String getNationalNewDrug() {
        return nationalNewDrug;
    }

    public void setNationalNewDrug(String nationalNewDrug) {
        this.nationalNewDrug = nationalNewDrug;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getNewPlantVariety() {
        return newPlantVariety;
    }

    public void setNewPlantVariety(String newPlantVariety) {
        this.newPlantVariety = newPlantVariety;
    }

    public String getCropVariety() {
        return cropVariety;
    }

    public void setCropVariety(String cropVariety) {
        this.cropVariety = cropVariety;
    }

    public String getIntegratedCircuit() {
        return integratedCircuit;
    }

    public void setIntegratedCircuit(String integratedCircuit) {
        this.integratedCircuit = integratedCircuit;
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

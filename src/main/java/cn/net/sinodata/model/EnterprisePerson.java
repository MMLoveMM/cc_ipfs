package cn.net.sinodata.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 企业人员情况
 */
public class EnterprisePerson implements Serializable {
    private static final long serialVersionUID = -4156094469112307540L;

    private String id;
    private String enterpriseId;
    private String totalStaff;  //职工总数(人)
    private String technologyPerson;    //科技人员(人)
    private String proportion;  //科技人员占职工总数比(%)
    private String inService;   //在职人员(人)
    private String partTime;    //兼职人员(人)
    private String temporary;   //临时聘用人员(人)
    private String doctor;  //博士(人)
    private String masterDegree;    //硕士(人)
    private String bachelor;    //本科(人)
    private String collegeAndBelow; //大专及以下学历(人)
    private String seniorTitle; //高级职称(人)
    private String intermediateTitle;   //中级职称(人)
    private String primaryTitle;    //初级职称(人)
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

    public String getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(String totalStaff) {
        this.totalStaff = totalStaff;
    }

    public String getTechnologyPerson() {
        return technologyPerson;
    }

    public void setTechnologyPerson(String technologyPerson) {
        this.technologyPerson = technologyPerson;
    }

    public String getProportion() {
        return proportion;
    }

    public void setProportion(String proportion) {
        this.proportion = proportion;
    }

    public String getInService() {
        return inService;
    }

    public void setInService(String inService) {
        this.inService = inService;
    }

    public String getPartTime() {
        return partTime;
    }

    public void setPartTime(String partTime) {
        this.partTime = partTime;
    }

    public String getTemporary() {
        return temporary;
    }

    public void setTemporary(String temporary) {
        this.temporary = temporary;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getMasterDegree() {
        return masterDegree;
    }

    public void setMasterDegree(String masterDegree) {
        this.masterDegree = masterDegree;
    }

    public String getBachelor() {
        return bachelor;
    }

    public void setBachelor(String bachelor) {
        this.bachelor = bachelor;
    }

    public String getCollegeAndBelow() {
        return collegeAndBelow;
    }

    public void setCollegeAndBelow(String collegeAndBelow) {
        this.collegeAndBelow = collegeAndBelow;
    }

    public String getSeniorTitle() {
        return seniorTitle;
    }

    public void setSeniorTitle(String seniorTitle) {
        this.seniorTitle = seniorTitle;
    }

    public String getIntermediateTitle() {
        return intermediateTitle;
    }

    public void setIntermediateTitle(String intermediateTitle) {
        this.intermediateTitle = intermediateTitle;
    }

    public String getPrimaryTitle() {
        return primaryTitle;
    }

    public void setPrimaryTitle(String primaryTitle) {
        this.primaryTitle = primaryTitle;
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

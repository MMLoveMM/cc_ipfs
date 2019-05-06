package cn.net.sinodata.model;

import java.util.Date;

public class PerCustomerInfo {
    /**
     * 客户id
     */
    private String id;

    /**
     * 用户姓名
     */
    private String username;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private String age;

    /**
     * 民族
     */
    private String people;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 居住地址
     */
    private String address;

    /**
     * 工作单位
     */
    private String workunit;

    /**
     * 家庭背景
     */
    private String familybackground;

    /**
     * 教育背景
     */
    private String education;

    /**
     * 工作背景
     */
    private String work;

    /**
     * 社会背景
     */
    private String socialcontext;

    /**
     * 信用状况
     */
    private String creditstanding;

    /**
     * 其他情况
     */
    private String otherinfos;

    /**
     * 添加时间
     */
    private Date createtime;

    /**
     * 修改时间
     */
    private Date updatetime;

    /**
     * 关联企业id
     */
    private String companyid;

    /**
     * 录入人员id
     */
    private String inputuserid;

    /**
     * 
     */
    private String pernum;

    /**
     * 客户类型1个人客户 0企业客户
     */
    private String custype;

    /**
     * 
     */
    private String isrelcus;

    /**
     * 
     */
    private String referee;

    /**
     * 
     */
    private String refereename;

    /**
     * 客户id
     * @return ID 客户id
     */
    public String getId() {
        return id;
    }

    /**
     * 客户id
     * @param id 客户id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 用户姓名
     * @return USERNAME 用户姓名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 用户姓名
     * @param username 用户姓名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 性别
     * @return SEX 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 性别
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 年龄
     * @return AGE 年龄
     */
    public String getAge() {
        return age;
    }

    /**
     * 年龄
     * @param age 年龄
     */
    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    /**
     * 民族
     * @return PEOPLE 民族
     */
    public String getPeople() {
        return people;
    }

    /**
     * 民族
     * @param people 民族
     */
    public void setPeople(String people) {
        this.people = people == null ? null : people.trim();
    }

    /**
     * 手机号码
     * @return PHONE 手机号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 手机号码
     * @param phone 手机号码
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 电子邮箱
     * @return EMAIL 电子邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 电子邮箱
     * @param email 电子邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 居住地址
     * @return ADDRESS 居住地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 居住地址
     * @param address 居住地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 工作单位
     * @return WORKUNIT 工作单位
     */
    public String getWorkunit() {
        return workunit;
    }

    /**
     * 工作单位
     * @param workunit 工作单位
     */
    public void setWorkunit(String workunit) {
        this.workunit = workunit == null ? null : workunit.trim();
    }

    /**
     * 家庭背景
     * @return FAMILYBACKGROUND 家庭背景
     */
    public String getFamilybackground() {
        return familybackground;
    }

    /**
     * 家庭背景
     * @param familybackground 家庭背景
     */
    public void setFamilybackground(String familybackground) {
        this.familybackground = familybackground == null ? null : familybackground.trim();
    }

    /**
     * 教育背景
     * @return EDUCATION 教育背景
     */
    public String getEducation() {
        return education;
    }

    /**
     * 教育背景
     * @param education 教育背景
     */
    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    /**
     * 工作背景
     * @return WORK 工作背景
     */
    public String getWork() {
        return work;
    }

    /**
     * 工作背景
     * @param work 工作背景
     */
    public void setWork(String work) {
        this.work = work == null ? null : work.trim();
    }

    /**
     * 社会背景
     * @return SOCIALCONTEXT 社会背景
     */
    public String getSocialcontext() {
        return socialcontext;
    }

    /**
     * 社会背景
     * @param socialcontext 社会背景
     */
    public void setSocialcontext(String socialcontext) {
        this.socialcontext = socialcontext == null ? null : socialcontext.trim();
    }

    /**
     * 信用状况
     * @return CREDITSTANDING 信用状况
     */
    public String getCreditstanding() {
        return creditstanding;
    }

    /**
     * 信用状况
     * @param creditstanding 信用状况
     */
    public void setCreditstanding(String creditstanding) {
        this.creditstanding = creditstanding == null ? null : creditstanding.trim();
    }

    /**
     * 其他情况
     * @return OTHERINFOS 其他情况
     */
    public String getOtherinfos() {
        return otherinfos;
    }

    /**
     * 其他情况
     * @param otherinfos 其他情况
     */
    public void setOtherinfos(String otherinfos) {
        this.otherinfos = otherinfos == null ? null : otherinfos.trim();
    }

    /**
     * 添加时间
     * @return CREATETIME 添加时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 添加时间
     * @param createtime 添加时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 修改时间
     * @return UPDATETIME 修改时间
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 修改时间
     * @param updatetime 修改时间
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * 关联企业id
     * @return COMPANYID 关联企业id
     */
    public String getCompanyid() {
        return companyid;
    }

    /**
     * 关联企业id
     * @param companyid 关联企业id
     */
    public void setCompanyid(String companyid) {
        this.companyid = companyid == null ? null : companyid.trim();
    }

    /**
     * 录入人员id
     * @return INPUTUSERID 录入人员id
     */
    public String getInputuserid() {
        return inputuserid;
    }

    /**
     * 录入人员id
     * @param inputuserid 录入人员id
     */
    public void setInputuserid(String inputuserid) {
        this.inputuserid = inputuserid == null ? null : inputuserid.trim();
    }

    /**
     * 
     * @return PERNUM 
     */
    public String getPernum() {
        return pernum;
    }

    /**
     * 
     * @param pernum 
     */
    public void setPernum(String pernum) {
        this.pernum = pernum == null ? null : pernum.trim();
    }

    /**
     * 客户类型1个人客户 0企业客户
     * @return CUSTYPE 客户类型1个人客户 0企业客户
     */
    public String getCustype() {
        return custype;
    }

    /**
     * 客户类型1个人客户 0企业客户
     * @param custype 客户类型1个人客户 0企业客户
     */
    public void setCustype(String custype) {
        this.custype = custype == null ? null : custype.trim();
    }

    /**
     * 
     * @return ISRELCUS 
     */
    public String getIsrelcus() {
        return isrelcus;
    }

    /**
     * 
     * @param isrelcus 
     */
    public void setIsrelcus(String isrelcus) {
        this.isrelcus = isrelcus == null ? null : isrelcus.trim();
    }

    /**
     * 
     * @return REFEREE 
     */
    public String getReferee() {
        return referee;
    }

    /**
     * 
     * @param referee 
     */
    public void setReferee(String referee) {
        this.referee = referee == null ? null : referee.trim();
    }

    /**
     * 
     * @return REFEREENAME 
     */
    public String getRefereename() {
        return refereename;
    }

    /**
     * 
     * @param refereename 
     */
    public void setRefereename(String refereename) {
        this.refereename = refereename == null ? null : refereename.trim();
    }
}
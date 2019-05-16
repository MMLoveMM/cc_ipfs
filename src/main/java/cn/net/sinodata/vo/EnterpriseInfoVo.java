package cn.net.sinodata.vo;

import cn.net.sinodata.model.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 企业基本信息数据
 */
public class EnterpriseInfoVo implements Serializable {
    private static final long serialVersionUID = -5297283684178822710L;

    private EnterpriseInfo enterpriseInfo = new EnterpriseInfo();   //企业基本信息
    private EnterpriseFinance enterpriseFinance = new EnterpriseFinance();    //企业财务情况
    private EnterprisePerson enterprisePerson = new EnterprisePerson();  //企业人员情况
    private EnterpriseIntellectualProperty enterpriseIntellectualProperty = new EnterpriseIntellectualProperty();  //企业近三年知识产权情况
    private EnterpriseFilePdf enterpriseFilePdf = new EnterpriseFilePdf();    //企业相关附件

    public EnterpriseInfo getEnterpriseInfo() {
        return enterpriseInfo;
    }

    public void setEnterpriseInfo(EnterpriseInfo enterpriseInfo) {
        this.enterpriseInfo = enterpriseInfo;
    }

    public EnterpriseFinance getEnterpriseFinance() {
        return enterpriseFinance;
    }

    public void setEnterpriseFinance(EnterpriseFinance enterpriseFinance) {
        this.enterpriseFinance = enterpriseFinance;
    }

    public EnterprisePerson getEnterprisePerson() {
        return enterprisePerson;
    }

    public void setEnterprisePerson(EnterprisePerson enterprisePerson) {
        this.enterprisePerson = enterprisePerson;
    }

    public EnterpriseIntellectualProperty getEnterpriseIntellectualProperty() {
        return enterpriseIntellectualProperty;
    }

    public void setEnterpriseIntellectualProperty(EnterpriseIntellectualProperty enterpriseIntellectualProperty) {
        this.enterpriseIntellectualProperty = enterpriseIntellectualProperty;
    }

    public EnterpriseFilePdf getEnterpriseFilePdf() {
        return enterpriseFilePdf;
    }

    public void setEnterpriseFilePdf(EnterpriseFilePdf enterpriseFilePdf) {
        this.enterpriseFilePdf = enterpriseFilePdf;
    }
}

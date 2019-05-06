package cn.net.sinodata.vo;

import java.io.Serializable;

import cn.net.sinodata.model.PerCustomerInfo;

public class PerCustomerInfoVo extends PerCustomerInfo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String userid;
	private String name;
	private String isIncludeAcc;
	private String housingtype;
	private String addornum;
	private String areaornum;
	private String buytime;
	private String purchasevalue;
	private String valuationvalue;
	private String warrantsnum;
	private String ownerandusage;
	private String liabtype;
	private String credit;
	private String paid;
	private String nopay;
	private String averagepay;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsIncludeAcc() {
		return isIncludeAcc;
	}
	public void setIsIncludeAcc(String isIncludeAcc) {
		this.isIncludeAcc = isIncludeAcc;
	}
	public String getHousingtype() {
		return housingtype;
	}
	public void setHousingtype(String housingtype) {
		this.housingtype = housingtype;
	}
	public String getAddornum() {
		return addornum;
	}
	public void setAddornum(String addornum) {
		this.addornum = addornum;
	}
	public String getAreaornum() {
		return areaornum;
	}
	public void setAreaornum(String areaornum) {
		this.areaornum = areaornum;
	}
	public String getBuytime() {
		return buytime;
	}
	public void setBuytime(String buytime) {
		this.buytime = buytime;
	}
	public String getPurchasevalue() {
		return purchasevalue;
	}
	public void setPurchasevalue(String purchasevalue) {
		this.purchasevalue = purchasevalue;
	}
	public String getValuationvalue() {
		return valuationvalue;
	}
	public void setValuationvalue(String valuationvalue) {
		this.valuationvalue = valuationvalue;
	}
	public String getWarrantsnum() {
		return warrantsnum;
	}
	public void setWarrantsnum(String warrantsnum) {
		this.warrantsnum = warrantsnum;
	}
	public String getOwnerandusage() {
		return ownerandusage;
	}
	public void setOwnerandusage(String ownerandusage) {
		this.ownerandusage = ownerandusage;
	}
	public String getLiabtype() {
		return liabtype;
	}
	public void setLiabtype(String liabtype) {
		this.liabtype = liabtype;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getPaid() {
		return paid;
	}
	public void setPaid(String paid) {
		this.paid = paid;
	}
	public String getNopay() {
		return nopay;
	}
	public void setNopay(String nopay) {
		this.nopay = nopay;
	}
	public String getAveragepay() {
		return averagepay;
	}
	public void setAveragepay(String averagepay) {
		this.averagepay = averagepay;
	}
	
	
}

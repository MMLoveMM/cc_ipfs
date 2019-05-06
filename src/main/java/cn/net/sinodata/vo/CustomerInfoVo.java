package cn.net.sinodata.vo;

import java.io.Serializable;

import cn.net.sinodata.model.CustomerInfo;

public class CustomerInfoVo extends CustomerInfo implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 财务审计数据
     */
    private String dataStr;
	
    /**
     * 账户信息
     */
	private String acctStr;	
	
	/**
	 * 证件信息
	 */
	private String certiStr;
	
	
    public String getDataStr() {
		return dataStr;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setDataStr(String dataStr) {
		this.dataStr = dataStr;
	}

	public String getAcctStr() {
		return acctStr;
	}

	public void setAcctStr(String acctStr) {
		this.acctStr = acctStr;
	}

	public String getCertiStr() {
		return certiStr;
	}

	public void setCertiStr(String certiStr) {
		this.certiStr = certiStr;
	}

}
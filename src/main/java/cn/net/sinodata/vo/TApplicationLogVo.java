package cn.net.sinodata.vo;

import java.io.Serializable;

import cn.net.sinodata.model.TApplicationLog;

public class TApplicationLogVo extends TApplicationLog implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private String orgname;
	private String count;
	
	public String getOrgname() {
		return orgname;
	}
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
}

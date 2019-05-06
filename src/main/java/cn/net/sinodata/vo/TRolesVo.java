package cn.net.sinodata.vo;

import java.io.Serializable;

import cn.net.sinodata.model.TRoles;

public class TRolesVo extends TRoles implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String dname; //名称
	private String dcode; //代码
	private String dictType; //类型
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDcode() {
		return dcode;
	}
	public void setDcode(String dcode) {
		this.dcode = dcode;
	}
	public String getDictType() {
		return dictType;
	}
	public void setDictType(String dictType) {
		this.dictType = dictType;
	}
	
}

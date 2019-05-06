package cn.net.sinodata.vo;


/**
 * 系统缓存类型定义
 * @author Pangpj
 *
 */
public enum CacheType{
	
	DATADIC("datadic", "字典表缓存名称", "通用"),
	MENU("menu", "运营管理系统菜单权限缓存", "运营管理系统"),
	MERS_MENU("mers_menu", "商户系统菜单权限缓存", "商户系统"),
	PWD_FAILED_TIMES("pwd_failed_times", "密码错误次数缓存", "商户系统"),
	RESET_PWD_IDENTIFY_CODE("reset_pwd_identify_code", "重置密码验证码缓存", "商户系统"),
	BUSI_SERVICE("busi_service", "系统征信服务缓存", "API系统"),
	MER_SERVICE("mer_service", "商户征信服务缓存", "API系统"),
	MER_BASIC("mer_basic", "商户基本信息缓存", "API系统"),
	MER_CERT("mer_cert", "商户证书缓存", "API系统"),
	SERVICE_CHANNEL("service_channel", "商户征信服务渠道路由缓存", "API系统"),
	RCS_MENU("rcs_menu", "菜单权限缓存", "风控系统"),
	RCS_CREDIT_COMMON("credit_service_common", "征信服务渠道数据通用缓存", "风控系统"),
	RCS_PWD_FAILED_TIMES("rcs_pwd_failed_times", "密码错误次数缓存", "风控系统"),
	RCS_RESET_PWD_IDENTIFY_CODE("rcs_reset_pwd_identify_code", "重置密码验证码缓存", "风控系统");
	
	private String code;
	
	private String memo;
	
	private String owner;

	private CacheType (String code, String memo, String owner) {
		this.code = code;
		this.memo = memo;
		this.owner = owner;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public static CacheType getCode(String code) {
		for (CacheType c : CacheType.values()) {
			if (c.getCode().equals(code)) {
				return c;
			}
		}
		return null;
	}
}

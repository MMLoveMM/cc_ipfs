package cn.net.sinodata.service;

import cn.net.sinodata.mapper.AccessoryInfoMapper;
import cn.net.sinodata.model.AccessoryInfo;

/**
 * 附件信息表
 * @author Pangpj
 *
 */
public interface AccessoryInfoService extends AccessoryInfoMapper {

		/**
		 * 存入附件信息
		 * @author licc 2017年10月27日15:18:53
		 */
	public int insertAccessoryHisInfo(AccessoryInfo accessoryInfo);
	
	/**
	 * 获取附件信息表最大id值
	 * @author xuj
	 */
	public String getMaxId();
}

package cn.net.sinodata.service;



import java.util.Map;

import com.github.pagehelper.PageInfo;

import cn.net.sinodata.mapper.PerCustomerInfoMapper;
import cn.net.sinodata.model.PerCustomerInfo;
import cn.net.sinodata.model.PerCustomerInfoExample;

/**
 * 个人客户信息
 * 
 * @author Pangpj
 *
 */
public interface PerCustomerInfoService extends PerCustomerInfoMapper {
	/**
	 * 查询个人客户基本信息
	 * @author xuj
	 * 
	 */
	public PageInfo<?> getCustomerInfo(int page, int rows,
			PerCustomerInfoExample example);
	
	/**
	 * 获取个人客户列表数据
	 * @param page
	 * @param rows
	 * @param example
	 * @author xuj
	 * @return
	 */
	public PageInfo<?> getPersonCustomerList(int page, int rows,PerCustomerInfoExample example );
	
	/**
	 * 获取某列最大perNum值
	 * @author xuj
	 * @param col
	 * @return
	 */
	public String getMaxProjectNum();
	
	/**
	 * 删除个人客户信息
	 * @author xuj
	 * @param perCustomerInfo
	 * @return
	 */
	public int deletePersonInfos(String id);

	/**
	 * 添加个人客户信息
	 * @author xuj
	 * @return
	 */
	public int addPersonInfo(PerCustomerInfo percustomerInfo,Map<String, Object> contactsMap);

	/**
	 * 修改个人客户信息
	 * @author xuj
	 * @param person
	 * @param contactsMap
	 * @return
	 */
	public int updatePersonInfo(PerCustomerInfo person ,Map<String, Object> contactsMap);
	
	public PageInfo<?> getAssetMsg(int paramInt1, int paramInt2, PerCustomerInfoExample paramPerCustomerInfoExample);

	public PageInfo<?> getAssetReport(int paramInt1, int paramInt2, PerCustomerInfoExample paramPerCustomerInfoExample);
}

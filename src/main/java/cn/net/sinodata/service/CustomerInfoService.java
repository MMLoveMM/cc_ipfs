package cn.net.sinodata.service;


import java.text.ParseException;

import com.github.pagehelper.PageInfo;

import cn.net.sinodata.mapper.CustomerInfoMapper;
import cn.net.sinodata.model.CustomerInfoExample;
import cn.net.sinodata.vo.CustomerInfoVo;

/**
 * 客户信息
 * @author Pangpj
 *
 */
public interface CustomerInfoService extends CustomerInfoMapper {
	/**
	 * 用户企业用户基本 信息
	 * @author licc 2017年9月13日
	 */
	public PageInfo<?> getCustomerList(int page, int rows, CustomerInfoExample example);
	
	/**
	 * 获取最大列的值
	 */
	public String getMaxCompanyNum();
	
	
	/**
	 * 保存企业信息
	 * @param customer
	 * @author licc 2017年10月11日09:40:28
	 * @throws ParseException 
	 */
	public int insertCustomerInfo(String companyNum,String userId,CustomerInfoVo customerInfoVo,String createtime,String customId) throws ParseException;
		
	
	/**
	 * 修改企业信息
	 * @author licc
	 * @throws ParseException 
	 */
	public int insertModCustomer(CustomerInfoVo customerInfoVo,String createtime,String allid) throws ParseException;
	
	/**
	 * 获取企业客户联系人信息
	 * @author Xuj
	 */
	public PageInfo<?> getCompanyContactList(int page, int rows, CustomerInfoExample example);
}

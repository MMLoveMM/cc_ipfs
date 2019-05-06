package cn.net.sinodata.service;

import com.github.pagehelper.PageInfo;

import cn.net.sinodata.mapper.TUsersMapper;
import cn.net.sinodata.model.TUsers;
import cn.net.sinodata.model.TUsersExample;

/**
 * 用户
 * @author Pangpj
 *
 */
public interface TUsersService extends TUsersMapper {
	
	/**
	 * 分页获取所有用户表数据
	 * @author Pangpj 2017-9-1 10:29:542
	 */
	public PageInfo<?> getAllUsers(int page, int rows, TUsersExample example);
	
	/**
	 * 获取用户信息
	 * @author Pangpj 2017年9月1日15:35:25
	 */
	public TUsers getUserById(String username);
	
	
}

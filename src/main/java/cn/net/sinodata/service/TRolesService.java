package cn.net.sinodata.service;

import java.util.List;

import com.github.pagehelper.PageInfo;

import cn.net.sinodata.mapper.TRolesMapper;
import cn.net.sinodata.model.TRoles;
import cn.net.sinodata.model.TRolesExample;

/**
 * 角色
 * @author Pangpj
 *
 */
public interface TRolesService extends TRolesMapper {
	
	/**
	 * 根据用户id获取用户角色
	 * 
	 * @param userId
	 *            -用户id:String
	 * @return List<SysRole>
	 */
	public List<TRoles> getRolesByUserId(String userId);
	
	
	/**
	 * 查询角色管理信息
	 * @author xuj
	 */
	public PageInfo<?> getRoleList(int page, int rows, TRolesExample example);
	
}

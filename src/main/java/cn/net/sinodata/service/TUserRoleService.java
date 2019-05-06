package cn.net.sinodata.service;

import cn.net.sinodata.mapper.tUserRoleMapper;

/**
 * 用户权限
 * @author Pangpj
 *
 */
public interface TUserRoleService extends tUserRoleMapper {
	/**
	 * 添加角色用户
	 * @author xuj
	 * @param roleId
	 */
	public int addUserRole(String roleId,String userId);
}

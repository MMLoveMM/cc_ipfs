package cn.net.sinodata.service;

import cn.net.sinodata.mapper.TUsersRolesMapper;
import cn.net.sinodata.model.TUsersRoles;

/**
 * 项目权限查看
 * @author Pangpj
 *
 */
public interface TUsersRolesService extends TUsersRolesMapper {
	
	/**
	 * 查看用户权限By项目ID和用户ID
	 * @author xuj
	 * @param proId
	 * @param userId
	 * @return
	 */
	public  TUsersRoles selectByPidAndUid(String userid,String projectid);
}

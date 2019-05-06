package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.net.sinodata.mapper.tUserRoleMapper;
import cn.net.sinodata.model.tUserRoleExample;
import cn.net.sinodata.model.tUserRoleKey;
import cn.net.sinodata.service.TUserRoleService;

@Service
public class TUserRoleServiceImpl implements TUserRoleService {

	@Autowired
	private tUserRoleMapper tUserRoleMapper;
	
	public int countByExample(tUserRoleExample example) {
		
		return tUserRoleMapper.countByExample(example);
	}

	public int deleteByExample(tUserRoleExample example) {
		
		return tUserRoleMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(tUserRoleKey key) {
		
		return tUserRoleMapper.deleteByPrimaryKey(key);
	}

	public int insert(tUserRoleKey record) {
		
		return tUserRoleMapper.insert(record);
	}

	public int insertSelective(tUserRoleKey record) {
		
		return tUserRoleMapper.insertSelective(record);
	}

	public List<tUserRoleKey> selectByExample(tUserRoleExample example) {
		
		return tUserRoleMapper.selectByExample(example);
	}

	public int updateByExampleSelective(tUserRoleKey record, tUserRoleExample example) {
		
		return tUserRoleMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(tUserRoleKey record, tUserRoleExample example) {
		
		return tUserRoleMapper.updateByExample(record, example);
	}

	public int addUserRole(String roleId, String userId) {
		int flag = 0;
		tUserRoleExample example = new tUserRoleExample();
		tUserRoleExample.Criteria criteria = example.createCriteria();
		criteria.andRoleIdEqualTo(roleId);
		List<tUserRoleKey> userRoleList = tUserRoleMapper.selectByExample(example);
		if(!userRoleList.isEmpty()){
			//删除已有角色用户
			criteria.andUserIdNotEqualTo("admin");
			tUserRoleMapper.deleteByExample(example);
		}
		String[] userIds = userId.split(",");
		for (int i = 0; i < userIds.length; i++) {
			// 保存用户ID、角色ID
			tUserRoleKey userRole = new tUserRoleKey();
			userRole.setRoleId(roleId);
			userRole.setUserId(userIds[i]);
			flag = tUserRoleMapper.insertSelective(userRole);
			if(flag < 1){
				return flag;
			}
		}
		return flag;
	}

}

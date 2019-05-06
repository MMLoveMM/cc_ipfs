package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.net.sinodata.mapper.TUsersRolesMapper;
import cn.net.sinodata.model.TUsersRoles;
import cn.net.sinodata.model.TUsersRolesExample;
import cn.net.sinodata.service.TUsersRolesService;

@Service
public class TUsersRolesServiceImpl implements TUsersRolesService {

	@Autowired
	private TUsersRolesMapper tUsersRolesMapper;
	
	public int countByExample(TUsersRolesExample example) {
		
		return tUsersRolesMapper.countByExample(example);
	}

	public int deleteByExample(TUsersRolesExample example) {
		
		return tUsersRolesMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return tUsersRolesMapper.deleteByPrimaryKey(id);
	}

	public int insert(TUsersRoles record) {
		
		return tUsersRolesMapper.insert(record);
	}

	public int insertSelective(TUsersRoles record) {
		
		return tUsersRolesMapper.insertSelective(record);
	}

	public List<TUsersRoles> selectByExample(TUsersRolesExample example) {
		
		return tUsersRolesMapper.selectByExample(example);
	}

	public TUsersRoles selectByPrimaryKey(String id) {
		
		return tUsersRolesMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(TUsersRoles record, TUsersRolesExample example) {
		
		return tUsersRolesMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TUsersRoles record, TUsersRolesExample example) {
		
		return tUsersRolesMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TUsersRoles record) {
		
		return tUsersRolesMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TUsersRoles record) {
		
		return tUsersRolesMapper.updateByPrimaryKey(record);
	}

	public TUsersRoles selectByPidAndUid(String projectid,String userid) {
		return tUsersRolesMapper.selectByPidAndUid(projectid,userid);
	}

}

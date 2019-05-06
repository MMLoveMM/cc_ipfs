package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.net.sinodata.mapper.TRolesMapper;
import cn.net.sinodata.model.TRoles;
import cn.net.sinodata.model.TRolesExample;
import cn.net.sinodata.service.TRolesService;
import cn.net.sinodata.vo.TRolesVo;

@Service
public class TRolesServiceImpl implements TRolesService {

	@Autowired
	private TRolesMapper tRolesMapper;
	
	public int countByExample(TRolesExample example) {
		
		return tRolesMapper.countByExample(example);
	}

	public int deleteByExample(TRolesExample example) {
		
		return tRolesMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return tRolesMapper.deleteByPrimaryKey(id);
	}

	public int insert(TRoles record) {
		
		return tRolesMapper.insert(record);
	}

	public int insertSelective(TRoles record) {
		
		return tRolesMapper.insertSelective(record);
	}

	public List<TRoles> selectByExample(TRolesExample example) {
		
		return tRolesMapper.selectByExample(example);
	}

	public TRoles selectByPrimaryKey(String id) {
		
		return tRolesMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(TRoles record, TRolesExample example) {
		
		return tRolesMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TRoles record, TRolesExample example) {
		
		return tRolesMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TRoles record) {
		
		return tRolesMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TRoles record) {
		
		return tRolesMapper.updateByPrimaryKey(record);
	}

	/**
	 * 根据用户id获取用户角色
	 * 
	 * @param userId
	 *            -用户id:String
	 * @return List<SysRole>
	 */
	public List<TRoles> getRolesByUserId(String userId) {
		
		return tRolesMapper.getRolesByUserId(userId);
	}
	
	/**
	 * 联表查询  troles 和 t_data_dict
	 */
	public List<TRolesVo> selectRolesVoByExample(TRolesExample example) {
		
		return tRolesMapper.selectRolesVoByExample(example);
	}
	
	
	/**
	 * 查询角色管理信息
	 * @author xuj
	 */
	public PageInfo<?> getRoleList(int page, int rows, TRolesExample example) {
		PageHelper.startPage(page, rows);
		
		return new PageInfo<>(tRolesMapper.selectRolesVoByExample(example));
	}


}

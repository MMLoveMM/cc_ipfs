package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.net.sinodata.mapper.TUsersMapper;
import cn.net.sinodata.model.TUsers;
import cn.net.sinodata.model.TUsersExample;
import cn.net.sinodata.service.TUsersService;

@Service
public class TUsersServiceImpl implements TUsersService {

	@Autowired
	private TUsersMapper tUsersMapper;
	
	public int countByExample(TUsersExample example) {
		
		return tUsersMapper.countByExample(example);
	}

	public int deleteByExample(TUsersExample example) {
		
		return tUsersMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String userid) {
		
		return tUsersMapper.deleteByPrimaryKey(userid);
	}

	public int insert(TUsers record) {
		
		return tUsersMapper.insert(record);
	}

	public int insertSelective(TUsers record) {
		
		return tUsersMapper.insertSelective(record);
	}

	public List<TUsers> selectByExample(TUsersExample example) {
		
		return tUsersMapper.selectByExample(example);
	}

	public TUsers selectByPrimaryKey(String userid) {
		
		return tUsersMapper.selectByPrimaryKey(userid);
	}

	public int updateByExampleSelective(TUsers record, TUsersExample example) {
		
		return tUsersMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TUsers record, TUsersExample example) {
		
		return tUsersMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TUsers record) {
		
		return tUsersMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TUsers record) {
		
		return tUsersMapper.updateByPrimaryKey(record);
	}

	/**
	 * 分页获取所有用户表数据
	 * @author Pangpj 2017-9-1 10:29:542
	 */
	public PageInfo<?> getAllUsers(int page, int rows, TUsersExample example){
		//设置分页
		PageHelper.offsetPage(page, rows);
		
		return new PageInfo<>(tUsersMapper.selectByExample(example));
	}

	/**
	 * 获取用户信息
	 * @author Pangpj 2017年9月1日15:35:25
	 */
	public TUsers getUserById(String username) {
		return tUsersMapper.getUserById(username);
	}

	
	
	
}

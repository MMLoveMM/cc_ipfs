package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.net.sinodata.mapper.tRoleFuncMapper;
import cn.net.sinodata.model.tRoleFuncExample;
import cn.net.sinodata.model.tRoleFuncKey;
import cn.net.sinodata.service.TRoleFuncService;

@Service
public class TRoleFuncServiceImpl implements TRoleFuncService{

	@Autowired
	private tRoleFuncMapper tRoleFuncMapper;
	
	public int countByExample(tRoleFuncExample example) {
		
		return tRoleFuncMapper.countByExample(example);
	}

	public int deleteByExample(tRoleFuncExample example) {
		
		return tRoleFuncMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(tRoleFuncKey key) {
		
		return tRoleFuncMapper.deleteByPrimaryKey(key);
	}

	public int insert(tRoleFuncKey record) {
		
		return tRoleFuncMapper.insert(record);
	}

	public int insertSelective(tRoleFuncKey record) {
		
		return tRoleFuncMapper.insertSelective(record);
	}

	public List<tRoleFuncKey> selectByExample(tRoleFuncExample example) {
		
		return tRoleFuncMapper.selectByExample(example);
	}

	public int updateByExampleSelective(tRoleFuncKey record, tRoleFuncExample example) {
		
		return tRoleFuncMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(tRoleFuncKey record, tRoleFuncExample example) {
		
		return tRoleFuncMapper.updateByExample(record, example);
	}

}

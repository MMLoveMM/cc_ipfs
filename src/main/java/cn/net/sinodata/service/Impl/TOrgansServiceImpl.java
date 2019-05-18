package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.net.sinodata.mapper.TOrgansMapper;
import cn.net.sinodata.model.TOrgans;
import cn.net.sinodata.model.TOrgansExample;
import cn.net.sinodata.service.TOrgansService;

@Service
public class TOrgansServiceImpl implements TOrgansService {

	@Autowired
	private TOrgansMapper tOrgansMapper;
	
	public int countByExample(TOrgansExample example) {
		
		return tOrgansMapper.countByExample(example);
	}

	public int deleteByExample(TOrgansExample example) {
		
		return tOrgansMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return tOrgansMapper.deleteByPrimaryKey(id);
	}

	public int insert(TOrgans record) {
		
		return tOrgansMapper.insert(record);
	}

	public int insertSelective(TOrgans record) {
		
		return tOrgansMapper.insertSelective(record);
	}

	public List<TOrgans> selectByExample(TOrgansExample example) {
		
		return tOrgansMapper.selectByExample(example);
	}

	public TOrgans selectByPrimaryKey(String id) {
		
		return tOrgansMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(TOrgans record, TOrgansExample example) {
		
		return tOrgansMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TOrgans record, TOrgansExample example) {
		
		return tOrgansMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TOrgans record) {
		
		return tOrgansMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TOrgans record) {
		
		return tOrgansMapper.updateByPrimaryKey(record);
	}

	@Override
	public String getOrgCount() {
		return tOrgansMapper.getOrgCount();
	}

}

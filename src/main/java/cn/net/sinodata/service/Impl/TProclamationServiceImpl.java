package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.net.sinodata.mapper.TProclamationMapper;
import cn.net.sinodata.model.TProclamation;
import cn.net.sinodata.model.TProclamationExample;
import cn.net.sinodata.service.TProclamationService;

@Service
public class TProclamationServiceImpl implements TProclamationService {

	@Autowired
	private TProclamationMapper tProclamationMapper;
	
	public int countByExample(TProclamationExample example) {
		
		return tProclamationMapper.countByExample(example);
	}

	public int deleteByExample(TProclamationExample example) {
		
		return tProclamationMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return tProclamationMapper.deleteByPrimaryKey(id);
	}

	public int insert(TProclamation record) {
		
		return tProclamationMapper.insert(record);
	}

	public int insertSelective(TProclamation record) {
		
		return tProclamationMapper.insertSelective(record);
	}

	public List<TProclamation> selectByExample(TProclamationExample example) {
		
		return tProclamationMapper.selectByExample(example);
	}

	public TProclamation selectByPrimaryKey(String id) {
		
		return tProclamationMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(TProclamation record, TProclamationExample example) {
		
		return tProclamationMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TProclamation record, TProclamationExample example) {
		
		return tProclamationMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TProclamation record) {
		
		return tProclamationMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TProclamation record) {
		
		return tProclamationMapper.updateByPrimaryKey(record);
	}

	
}

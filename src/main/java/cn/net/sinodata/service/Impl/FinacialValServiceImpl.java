package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.net.sinodata.mapper.FinacialValMapper;
import cn.net.sinodata.model.FinacialVal;
import cn.net.sinodata.model.FinacialValExample;
import cn.net.sinodata.service.FinacialValService;

@Service
public class FinacialValServiceImpl implements FinacialValService {

	@Autowired
	private FinacialValMapper finacialValMapper;
	
	public int countByExample(FinacialValExample example) {
		
		return finacialValMapper.countByExample(example);
	}

	public int deleteByExample(FinacialValExample example) {
		
		return finacialValMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return finacialValMapper.deleteByPrimaryKey(id);
	}

	public int insert(FinacialVal record) {
		
		return finacialValMapper.insert(record);
	}

	public int insertSelective(FinacialVal record) {
		
		return finacialValMapper.insertSelective(record);
	}

	public List<FinacialVal> selectByExample(FinacialValExample example) {
		
		return finacialValMapper.selectByExample(example);
	}

	public FinacialVal selectByPrimaryKey(String id) {
		
		return finacialValMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(FinacialVal record, FinacialValExample example) {
		
		return finacialValMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(FinacialVal record, FinacialValExample example) {
		
		return finacialValMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(FinacialVal record) {
		
		return finacialValMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(FinacialVal record) {
		
		return finacialValMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<FinacialVal> find(String auditDt, String num, String customId) {
		return finacialValMapper.find(auditDt, num, customId);
	}

}

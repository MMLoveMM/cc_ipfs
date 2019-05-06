package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.net.sinodata.mapper.TAnnexTempletMapper;
import cn.net.sinodata.model.TAnnexTemplet;
import cn.net.sinodata.model.TAnnexTempletExample;
import cn.net.sinodata.service.TAnnexTempletService;
@Service
public class TAnnexTempletServiceImpl implements TAnnexTempletService {

	@Autowired
	private TAnnexTempletMapper tAnnexTempletMapper;
	
	public int countByExample(TAnnexTempletExample example) {
		
		return tAnnexTempletMapper.countByExample(example);
	}

	public int deleteByExample(TAnnexTempletExample example) {
		
		return tAnnexTempletMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return tAnnexTempletMapper.deleteByPrimaryKey(id);
	}

	public int insert(TAnnexTemplet record) {
		
		return tAnnexTempletMapper.insert(record);
	}

	public int insertSelective(TAnnexTemplet record) {
		
		return tAnnexTempletMapper.insertSelective(record);
	}

	public List<TAnnexTemplet> selectByExample(TAnnexTempletExample example) {
		
		return tAnnexTempletMapper.selectByExample(example);
	}

	public TAnnexTemplet selectByPrimaryKey(String id) {
		
		return tAnnexTempletMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(TAnnexTemplet record, TAnnexTempletExample example) {
		
		return tAnnexTempletMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TAnnexTemplet record, TAnnexTempletExample example) {
		
		return tAnnexTempletMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TAnnexTemplet record) {
		
		return tAnnexTempletMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TAnnexTemplet record) {
		
		return tAnnexTempletMapper.updateByPrimaryKey(record);
	}

}

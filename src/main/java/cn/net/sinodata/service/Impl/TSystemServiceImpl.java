package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.net.sinodata.mapper.TSystemMapper;
import cn.net.sinodata.model.TSystem;
import cn.net.sinodata.model.TSystemExample;
import cn.net.sinodata.service.TSystemService;

@Service
public class TSystemServiceImpl implements TSystemService {

	@Autowired
	private TSystemMapper tSystemMapper;
	
	public int countByExample(TSystemExample example) {
		
		return tSystemMapper.countByExample(example);
	}

	public int deleteByExample(TSystemExample example) {
		
		return tSystemMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return tSystemMapper.deleteByPrimaryKey(id);
	}

	public int insert(TSystem record) {
		
		return tSystemMapper.insert(record);
	}

	public int insertSelective(TSystem record) {
		
		return tSystemMapper.insertSelective(record);
	}

	public List<TSystem> selectByExample(TSystemExample example) {
		
		return tSystemMapper.selectByExample(example);
	}

	public TSystem selectByPrimaryKey(String id) {
		
		return tSystemMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(TSystem record, TSystemExample example) {
		
		return tSystemMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TSystem record, TSystemExample example) {
		
		return tSystemMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TSystem record) {
		
		return tSystemMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TSystem record) {
		
		return tSystemMapper.updateByPrimaryKey(record);
	}

}

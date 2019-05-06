package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.net.sinodata.mapper.LiabilitiesInfosMapper;
import cn.net.sinodata.model.LiabilitiesInfos;
import cn.net.sinodata.model.LiabilitiesInfosExample;
import cn.net.sinodata.service.LiabilitiesInfosService;

@Service
public class LiabilitiesInfosServiceImpl implements LiabilitiesInfosService {

	@Autowired
	private LiabilitiesInfosMapper liabilitiesInfosMapper;
	
	public int countByExample(LiabilitiesInfosExample example) {
		
		return liabilitiesInfosMapper.countByExample(example);
	}

	public int deleteByExample(LiabilitiesInfosExample example) {
		
		return liabilitiesInfosMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return liabilitiesInfosMapper.deleteByPrimaryKey(id);
	}

	public int insert(LiabilitiesInfos record) {
		
		return liabilitiesInfosMapper.insert(record);
	}

	public int insertSelective(LiabilitiesInfos record) {
		
		return liabilitiesInfosMapper.insertSelective(record);
	}

	public List<LiabilitiesInfos> selectByExample(LiabilitiesInfosExample example) {
		
		return liabilitiesInfosMapper.selectByExample(example);
	}

	public LiabilitiesInfos selectByPrimaryKey(String id) {
		
		return liabilitiesInfosMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(LiabilitiesInfos record, LiabilitiesInfosExample example) {
		
		return liabilitiesInfosMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(LiabilitiesInfos record, LiabilitiesInfosExample example) {
		
		return liabilitiesInfosMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(LiabilitiesInfos record) {
		
		return liabilitiesInfosMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(LiabilitiesInfos record) {
		
		return liabilitiesInfosMapper.updateByPrimaryKey(record);
	}

	public PageInfo<?> loadLiabsInfo(int page, int rows, LiabilitiesInfosExample example) {
		PageHelper.startPage(page, rows);
		return new PageInfo<>(liabilitiesInfosMapper.selectByExample(example));
	}

	

}

package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.net.sinodata.mapper.TDataDictMapper;
import cn.net.sinodata.model.TDataDict;
import cn.net.sinodata.model.TDataDictExample;
import cn.net.sinodata.service.TDataDictService;

@Service
public class TDataDictServiceImpl implements TDataDictService {

	@Autowired
	private TDataDictMapper tDataDictMapper;
	
	public int countByExample(TDataDictExample example) {
		
		return tDataDictMapper.countByExample(example);
	}

	public int deleteByExample(TDataDictExample example) {
		
		return tDataDictMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return tDataDictMapper.deleteByPrimaryKey(id);
	}

	public int insert(TDataDict record) {
		
		return tDataDictMapper.insert(record);
	}

	public int insertSelective(TDataDict record) {
		
		return tDataDictMapper.insertSelective(record);
	}

	public List<TDataDict> selectByExample(TDataDictExample example) {
		
		return tDataDictMapper.selectByExample(example);
	}

	public TDataDict selectByPrimaryKey(String id) {
		
		return tDataDictMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(TDataDict record, TDataDictExample example) {
		
		return tDataDictMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TDataDict record, TDataDictExample example) {
		
		return tDataDictMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TDataDict record) {
		
		return tDataDictMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TDataDict record) {
		
		return tDataDictMapper.updateByPrimaryKey(record);
	}

	/**
	 * 获取数据字典数据列表
	 * @author Pangpj  2017年9月5日11:52:34
	 */
	 
	 
	public PageInfo<?> getDictList(int page, int rows, TDataDictExample example) {
		PageHelper.startPage(page, rows);
		
		return new PageInfo<>(tDataDictMapper.selectByExample(example));
	}

}

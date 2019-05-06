package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.net.sinodata.mapper.TApplicationLogMapper;
import cn.net.sinodata.model.TApplicationLog;
import cn.net.sinodata.model.TApplicationLogExample;
import cn.net.sinodata.service.TApplicationLogService;
import cn.net.sinodata.vo.TApplicationLogVo;

@Service
public class TApplicationLogServiceImpl implements TApplicationLogService {

	@Autowired
	private TApplicationLogMapper tApplicationLogMapper;
	
	public int countByExample(TApplicationLogExample example) {
		
		return tApplicationLogMapper.countByExample(example);
	}

	public int deleteByExample(TApplicationLogExample example) {
		
		return tApplicationLogMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return tApplicationLogMapper.deleteByPrimaryKey(id);
	}

	public int insert(TApplicationLog record) {
		
		return tApplicationLogMapper.insert(record);
	}

	public int insertSelective(TApplicationLog record) {
		
		return tApplicationLogMapper.insertSelective(record);
	}


	public List<TApplicationLog> selectByExample(TApplicationLogExample example) {
		
		return tApplicationLogMapper.selectByExample(example);
	}

	public TApplicationLog selectByPrimaryKey(String id) {
		
		return tApplicationLogMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(TApplicationLog record, TApplicationLogExample example) {
		
		return tApplicationLogMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TApplicationLog record, TApplicationLogExample example) {
		
		return tApplicationLogMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TApplicationLog record) {
		
		return tApplicationLogMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TApplicationLog record) {
		
		return tApplicationLogMapper.updateByPrimaryKey(record);
	}
	
	public List<TApplicationLogVo> selectTApplicationLogVOByExample(TApplicationLogExample example){
		
		return tApplicationLogMapper.selectTApplicationLogVOByExample(example);
	}
	
	public PageInfo<?> getLoginReportList(int page, int rows, TApplicationLogExample example){
		
		PageHelper.startPage(page, rows);
		
		return new PageInfo<>(tApplicationLogMapper.selectTApplicationLogVOByExample(example));
	}

	public PageInfo<?> getLoginReportViewList(int page, int rows, TApplicationLogExample example){
		int startRows = rows < 10 ? 10 : 0;
		
		PageHelper.startPage(page, startRows);
		
		return new PageInfo<>(tApplicationLogMapper.selectByExample(example));
	}
}

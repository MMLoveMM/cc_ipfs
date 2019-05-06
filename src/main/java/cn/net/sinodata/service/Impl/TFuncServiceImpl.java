package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.net.sinodata.mapper.TFuncMapper;
import cn.net.sinodata.model.TFunc;
import cn.net.sinodata.model.TFuncExample;
import cn.net.sinodata.service.CacheService;
import cn.net.sinodata.service.TFuncService;
import cn.net.sinodata.vo.CacheType;

@Service
public class TFuncServiceImpl implements TFuncService {

	@Autowired
	private TFuncMapper tFuncMapper;
	
	@Autowired
	private CacheService cacheService;
	
	public int countByExample(TFuncExample example) {
		
		return tFuncMapper.countByExample(example);
	}

	public int deleteByExample(TFuncExample example) {
		
		return tFuncMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return tFuncMapper.deleteByPrimaryKey(id);
	}

	public int insert(TFunc record) {
		
		return tFuncMapper.insert(record);
	}

	public int insertSelective(TFunc record) {
		
		return tFuncMapper.insertSelective(record);
	}

	public List<TFunc> selectByExample(TFuncExample example) {
		
		return tFuncMapper.selectByExample(example);
	}

	public TFunc selectByPrimaryKey(String id) {
		
		return tFuncMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(TFunc record, TFuncExample example) {
		
		return tFuncMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TFunc record, TFuncExample example) {
		
		return tFuncMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TFunc record) {
		
		return tFuncMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TFunc record) {
		
		return tFuncMapper.updateByPrimaryKey(record);
	}

	/**
	 * 根据用户id查询用户可用资源
	 * @param userId
	 * @return
	 */
	public List<TFunc> getResourcesByUserId(String userId) {
		return tFuncMapper.getResourcesByUserId(userId);
	}
	
	@SuppressWarnings("unchecked")
	public List<TFunc> getCachedResourcesByUserId(String userId) {
		Object cache = cacheService.getCache(CacheType.MENU.getCode(), userId);
		if (cache != null) {
			return (List<TFunc>)cache;
		}
		cache = tFuncMapper.getResourcesByUserId(userId);
		cacheService.addCache(CacheType.MENU.getCode(), userId, cache);
		return (List<TFunc>)cache;
	}
	
	/**
	 * 获取功能菜单列表
	 */
	public PageInfo<?> getFuncList(int page, int rows, TFuncExample example) {
		
		PageHelper.startPage(page,rows);
		
		return  new PageInfo<>(tFuncMapper.selectByExample(example));
	}

}

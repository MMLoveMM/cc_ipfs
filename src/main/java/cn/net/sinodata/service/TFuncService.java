package cn.net.sinodata.service;

import java.util.List;

import com.github.pagehelper.PageInfo;

import cn.net.sinodata.mapper.TFuncMapper;
import cn.net.sinodata.model.TFunc;
import cn.net.sinodata.model.TFuncExample;

/**
 * 功能菜单
 * @author Pangpj
 *
 */
public interface TFuncService extends TFuncMapper{

	/**
	 * 根据用户id查询用户可用资源
	 * @param userId
	 * @return
	 */
	List<TFunc> getResourcesByUserId(String userId);
	
	/**
	 * 获取功能菜单列表
	 * @author xuj
	 * @param page
	 * @param rows
	 * @param tfuncs
	 * @return
	 */
	public PageInfo<?> getFuncList(int page,int rows, TFuncExample example);
}

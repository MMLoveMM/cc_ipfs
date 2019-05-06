package cn.net.sinodata.service;

import com.github.pagehelper.PageInfo;

import cn.net.sinodata.mapper.TApplicationLogMapper;
import cn.net.sinodata.model.TApplicationLogExample;

/**
 * 应用日志
 * @author Pangpj
 *
 */
public interface TApplicationLogService extends TApplicationLogMapper {

	/**
	 * 获取分页登录报表数据
	 * 
	 * @author Pangpj 2017-9-18 10:52:442
	 * @param page
	 * @param rows
	 * @param example
	 * @return
	 */
	public PageInfo<?> getLoginReportList(int page, int rows, TApplicationLogExample example);
	
	/**
	 * 获取分页登录报表详情数据
	 * 
	 * @author Pangpj 2017年9月18日17:41:36
	 * @param page
	 * @param rows
	 * @param example
	 * @return
	 */
	public PageInfo<?> getLoginReportViewList(int page, int rows, TApplicationLogExample example);
}

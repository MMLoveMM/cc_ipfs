package cn.net.sinodata.service;

import com.github.pagehelper.PageInfo;

import cn.net.sinodata.mapper.TDataDictMapper;
import cn.net.sinodata.model.TDataDictExample;

/**
 * 字典
 * @author Pangpj
 *
 */
public interface TDataDictService extends TDataDictMapper {

	/**
	 * 用户获取数据字典数据列表
	 * @author Pangpj  2017年9月5日11:49:21
	 */
	public PageInfo<?> getDictList(int page, int rows, TDataDictExample example);
}

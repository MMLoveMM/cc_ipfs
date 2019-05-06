package cn.net.sinodata.service;

import com.github.pagehelper.PageInfo;

import cn.net.sinodata.mapper.LiabilitiesInfosMapper;
import cn.net.sinodata.model.LiabilitiesInfosExample;

/**
 * 负债信息
 * @author Pangpj
 *
 */
public interface LiabilitiesInfosService extends LiabilitiesInfosMapper {
	/**
	 * 查询个人客户信息-负债信息
	 * @author xuj
	 */
	public PageInfo<?> loadLiabsInfo(int page, int rows, LiabilitiesInfosExample example);
}

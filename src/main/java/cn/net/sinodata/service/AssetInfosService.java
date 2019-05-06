package cn.net.sinodata.service;

import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;

import cn.net.sinodata.mapper.AssetInfosMapper;
import cn.net.sinodata.model.AssetInfosExample;

/**
 * 个人客户资产信息
 * @author Pangpj 2017年8月31日17:24:11
 *
 */
public interface AssetInfosService extends AssetInfosMapper {
	/**
	 * 查询个人客户信息--资产信息
	 * @author xuj
	 * @param rows
	 * @param page
	 * @param assetInfos
	 * @return
	 */
	public PageInfo<?> loadAssetInfo(@RequestParam(value="rows", required=false) int rows, 
			@RequestParam(value = "page", required=false) int page, AssetInfosExample example);
}

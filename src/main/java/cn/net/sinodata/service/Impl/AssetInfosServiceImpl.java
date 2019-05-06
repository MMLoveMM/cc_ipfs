package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.net.sinodata.mapper.AssetInfosMapper;
import cn.net.sinodata.model.AssetInfos;
import cn.net.sinodata.model.AssetInfosExample;
import cn.net.sinodata.service.AssetInfosService;

@Service
public class AssetInfosServiceImpl implements AssetInfosService {
	
	@Autowired
	private AssetInfosMapper assetInfosMapper;

	public int countByExample(AssetInfosExample example) {
		
		return assetInfosMapper.countByExample(example);
	}

	public int deleteByExample(AssetInfosExample example) {
		
		return assetInfosMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return assetInfosMapper.deleteByPrimaryKey(id);
	}

	public int insert(AssetInfos record) {
		
		return assetInfosMapper.insert(record);
	}

	public int insertSelective(AssetInfos record) {
		
		return assetInfosMapper.insertSelective(record);
	}

	public List<AssetInfos> selectByExample(AssetInfosExample example) {
		
		return assetInfosMapper.selectByExample(example);
	}

	public AssetInfos selectByPrimaryKey(String id) {
		
		return assetInfosMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(AssetInfos record, AssetInfosExample example) {
		
		return assetInfosMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(AssetInfos record, AssetInfosExample example) {
		
		return assetInfosMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(AssetInfos record) {
		
		return assetInfosMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(AssetInfos record) {
		
		return assetInfosMapper.updateByPrimaryKey(record);
	}

	public PageInfo<?> loadAssetInfo(int rows, int page, AssetInfosExample example) {
		PageHelper.startPage(page, rows);
		return new PageInfo<>(assetInfosMapper.selectByExample(example));
	}

}

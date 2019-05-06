package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.net.sinodata.mapper.AnnexDocsMapper;
import cn.net.sinodata.model.AnnexDocs;
import cn.net.sinodata.model.AnnexDocsExample;
import cn.net.sinodata.service.AnnexDocsService;

/**
 * 证件信息表Service
 * @author Pangpj
 *
 */
@Service
public class AnnexDocsServiceImpl implements AnnexDocsService{

	@Autowired
	private AnnexDocsMapper annexDocsMapper;
	
	public int countByExample(AnnexDocsExample example) {
		
		return annexDocsMapper.countByExample(example);
	}

	public int deleteByExample(AnnexDocsExample example) {
		
		return annexDocsMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return annexDocsMapper.deleteByPrimaryKey(id);
	}

	public int insert(AnnexDocs record) {
		
		return annexDocsMapper.insert(record);
	}

	public int insertSelective(AnnexDocs record) {
		
		return annexDocsMapper.insertSelective(record);
	}

	public List<AnnexDocs> selectByExample(AnnexDocsExample example) {
		
		return annexDocsMapper.selectByExample(example);
	}

	public AnnexDocs selectByPrimaryKey(String id) {
		
		return annexDocsMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(AnnexDocs record, AnnexDocsExample example) {
		
		return annexDocsMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(AnnexDocs record, AnnexDocsExample example) {
		
		return annexDocsMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(AnnexDocs record) {
		
		return annexDocsMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(AnnexDocs record) {
		
		return annexDocsMapper.updateByPrimaryKey(record);
	}

}

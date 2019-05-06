package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.net.sinodata.mapper.TCustCertiMapper;
import cn.net.sinodata.model.TCustCerti;
import cn.net.sinodata.model.TCustCertiExample;
import cn.net.sinodata.service.TCustCertiService;

@Service
public class TCustCertiServiceImpl implements TCustCertiService {

	@Autowired
	private TCustCertiMapper tCustCertiMapper;
	
	public int countByExample(TCustCertiExample example) {
		
		return tCustCertiMapper.countByExample(example);
	}

	public int deleteByExample(TCustCertiExample example) {
		
		return tCustCertiMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return tCustCertiMapper.deleteByPrimaryKey(id);
	}

	public int insert(TCustCerti record) {
		
		return tCustCertiMapper.insert(record);
	}

	public int insertSelective(TCustCerti record) {
		
		return tCustCertiMapper.insertSelective(record);
	}

	public List<TCustCerti> selectByExample(TCustCertiExample example) {
		
		return tCustCertiMapper.selectByExample(example);
	}

	public TCustCerti selectByPrimaryKey(String id) {
		
		return tCustCertiMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(TCustCerti record, TCustCertiExample example) {
		
		return tCustCertiMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TCustCerti record, TCustCertiExample example) {
		
		return tCustCertiMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TCustCerti record) {
		
		return tCustCertiMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TCustCerti record) {
		
		return tCustCertiMapper.updateByPrimaryKey(record);
	}

}

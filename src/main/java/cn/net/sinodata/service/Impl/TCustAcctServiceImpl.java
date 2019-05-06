package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.net.sinodata.mapper.TCustAcctMapper;
import cn.net.sinodata.model.TCustAcct;
import cn.net.sinodata.model.TCustAcctExample;
import cn.net.sinodata.service.TCustAcctService;

@Service
public class TCustAcctServiceImpl implements TCustAcctService {

	@Autowired
	private TCustAcctMapper tCustAcctMapper;
	
	public int countByExample(TCustAcctExample example) {
		
		return tCustAcctMapper.countByExample(example);
	}

	public int deleteByExample(TCustAcctExample example) {
		
		return tCustAcctMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return tCustAcctMapper.deleteByPrimaryKey(id);
	}

	public int insert(TCustAcct record) {
		
		return tCustAcctMapper.insert(record);
	}

	public int insertSelective(TCustAcct record) {
		
		return tCustAcctMapper.insertSelective(record);
	}

	public List<TCustAcct> selectByExample(TCustAcctExample example) {
		
		return tCustAcctMapper.selectByExample(example);
	}

	public TCustAcct selectByPrimaryKey(String id) {
		
		return tCustAcctMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(TCustAcct record, TCustAcctExample example) {
		
		return tCustAcctMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TCustAcct record, TCustAcctExample example) {
		
		return tCustAcctMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(TCustAcct record) {
		
		return tCustAcctMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TCustAcct record) {
		
		return tCustAcctMapper.updateByPrimaryKey(record);
	}

}

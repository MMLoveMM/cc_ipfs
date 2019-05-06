package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.net.sinodata.mapper.RepayplanMapper;
import cn.net.sinodata.model.Repayplan;
import cn.net.sinodata.model.RepayplanExample;
import cn.net.sinodata.service.RepayplanService;

/**
 * 保理还款计划表Service
 * @author pangpj
 *
 */
@Service
public class RepayplanServiceImpl implements RepayplanService {

	@Autowired
	private RepayplanMapper repayplanMapper;
	
	public int countByExample(RepayplanExample example) {
		
		return repayplanMapper.countByExample(example);
	}

	public int deleteByExample(RepayplanExample example) {
		
		return repayplanMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return repayplanMapper.deleteByPrimaryKey(id);
	}

	public int insert(Repayplan record) {
		
		return repayplanMapper.insert(record);
	}

	public int insertSelective(Repayplan record) {
		
		return repayplanMapper.insertSelective(record);
	}

	public List<Repayplan> selectByExample(RepayplanExample example) {
		
		return repayplanMapper.selectByExample(example);
	}

	public Repayplan selectByPrimaryKey(String id) {
		
		return repayplanMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(Repayplan record, RepayplanExample example) {
		
		return repayplanMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Repayplan record, RepayplanExample example) {
		
		return repayplanMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Repayplan record) {
		
		return repayplanMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Repayplan record) {
		
		return repayplanMapper.updateByPrimaryKey(record);
	}

}

package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.net.sinodata.mapper.LoanRepaymentMapper;
import cn.net.sinodata.model.LoanRepayment;
import cn.net.sinodata.model.LoanRepaymentExample;
import cn.net.sinodata.service.LoanRepaymentService;

/**
 * 担保放款信息表Service
 * @author pangpj
 *
 */
@Service
public class LoanRepaymentServiceImpl implements LoanRepaymentService{

	@Autowired
	private LoanRepaymentMapper loanRepaymentMapper;
	
	public int countByExample(LoanRepaymentExample example) {
		
		return loanRepaymentMapper.countByExample(example);
	}

	public int deleteByExample(LoanRepaymentExample example) {
		
		return loanRepaymentMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return loanRepaymentMapper.deleteByPrimaryKey(id);
	}

	public int insert(LoanRepayment record) {
		
		return loanRepaymentMapper.insert(record);
	}

	public int insertSelective(LoanRepayment record) {
		
		return loanRepaymentMapper.insertSelective(record);
	}

	public List<LoanRepayment> selectByExampleWithBLOBs(LoanRepaymentExample example) {
		
		return loanRepaymentMapper.selectByExampleWithBLOBs(example);
	}

	public List<LoanRepayment> selectByExample(LoanRepaymentExample example) {
		
		return loanRepaymentMapper.selectByExample(example);
	}

	public LoanRepayment selectByPrimaryKey(String id) {
		
		return loanRepaymentMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(LoanRepayment record, LoanRepaymentExample example) {
		
		return loanRepaymentMapper.updateByExampleSelective(record, example);
	}

	public int updateByExampleWithBLOBs(LoanRepayment record, LoanRepaymentExample example) {
		
		return loanRepaymentMapper.updateByExampleWithBLOBs(record, example);
	}

	public int updateByExample(LoanRepayment record, LoanRepaymentExample example) {
		
		return loanRepaymentMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(LoanRepayment record) {
		
		return loanRepaymentMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKeyWithBLOBs(LoanRepayment record) {
		
		return loanRepaymentMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	public int updateByPrimaryKey(LoanRepayment record) {
		
		return loanRepaymentMapper.updateByPrimaryKey(record);
	}

}

package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.net.sinodata.mapper.GuaranteeRepaymentMapper;
import cn.net.sinodata.model.GuaranteeRepayment;
import cn.net.sinodata.model.GuaranteeRepaymentExample;
import cn.net.sinodata.service.GuaranteeRepaymentService;

/**
 * 担保还款计划明细表 Service
 * @author pangpj
 *
 */
@Service
public class GuaranteeRepaymentServiceImpl implements GuaranteeRepaymentService {

	@Autowired
	private GuaranteeRepaymentMapper guaranteeRepaymentMapper;
	
	public int countByExample(GuaranteeRepaymentExample example) {
		
		return guaranteeRepaymentMapper.countByExample(example);
	}

	public int deleteByExample(GuaranteeRepaymentExample example) {
		
		return guaranteeRepaymentMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return guaranteeRepaymentMapper.deleteByPrimaryKey(id);
	}

	public int insert(GuaranteeRepayment record) {
		
		return guaranteeRepaymentMapper.insert(record);
	}

	public int insertSelective(GuaranteeRepayment record) {
		
		return guaranteeRepaymentMapper.insertSelective(record);
	}

	public List<GuaranteeRepayment> selectByExample(GuaranteeRepaymentExample example) {
		
		return guaranteeRepaymentMapper.selectByExample(example);
	}

	public GuaranteeRepayment selectByPrimaryKey(String id) {
		
		return guaranteeRepaymentMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(GuaranteeRepayment record, GuaranteeRepaymentExample example) {
		
		return guaranteeRepaymentMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(GuaranteeRepayment record, GuaranteeRepaymentExample example) {
		
		return guaranteeRepaymentMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(GuaranteeRepayment record) {
		
		return guaranteeRepaymentMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(GuaranteeRepayment record) {
		
		return guaranteeRepaymentMapper.updateByPrimaryKey(record);
	}

}

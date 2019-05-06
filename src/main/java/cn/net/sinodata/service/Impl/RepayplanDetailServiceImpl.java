package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.net.sinodata.mapper.RepayplanDetailMapper;
import cn.net.sinodata.model.RepayplanDetail;
import cn.net.sinodata.model.RepayplanDetailExample;
import cn.net.sinodata.service.RepayplanDetailService;

/**
 * 保理还款计划明细表Service
 * @author pangpj
 *
 */
@Service
public class RepayplanDetailServiceImpl implements RepayplanDetailService{

	@Autowired
	private RepayplanDetailMapper repayplanDetailMapper;
	
	public int countByExample(RepayplanDetailExample example) {
		
		return repayplanDetailMapper.countByExample(example);
	}

	public int deleteByExample(RepayplanDetailExample example) {
		
		return repayplanDetailMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return repayplanDetailMapper.deleteByPrimaryKey(id);
	}

	public int insert(RepayplanDetail record) {
		
		return repayplanDetailMapper.insert(record);
	}

	public int insertSelective(RepayplanDetail record) {
		
		return repayplanDetailMapper.insertSelective(record);
	}

	public List<RepayplanDetail> selectByExample(RepayplanDetailExample example) {
		
		return repayplanDetailMapper.selectByExample(example);
	}

	public RepayplanDetail selectByPrimaryKey(String id) {
		
		return repayplanDetailMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(RepayplanDetail record, RepayplanDetailExample example) {
		
		return repayplanDetailMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(RepayplanDetail record, RepayplanDetailExample example) {
		
		return repayplanDetailMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(RepayplanDetail record) {
		
		return repayplanDetailMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(RepayplanDetail record) {
		
		return repayplanDetailMapper.updateByPrimaryKey(record);
	}

}

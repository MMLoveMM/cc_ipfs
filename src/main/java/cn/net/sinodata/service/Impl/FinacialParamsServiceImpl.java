package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.net.sinodata.mapper.FinacialParamsMapper;
import cn.net.sinodata.model.FinacialParams;
import cn.net.sinodata.model.FinacialParamsExample;
import cn.net.sinodata.service.FinacialParamsService;

/**
 * 报表条目名称表 Service
 * @author Pangpj
 *
 */
@Service
public class FinacialParamsServiceImpl implements FinacialParamsService {
	
	@Autowired
	private FinacialParamsMapper finacialParamsMapper;

	public int countByExample(FinacialParamsExample example) {
		
		return finacialParamsMapper.countByExample(example);
	}

	public int deleteByExample(FinacialParamsExample example) {
		
		return finacialParamsMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return finacialParamsMapper.deleteByPrimaryKey(id);
	}

	public int insert(FinacialParams record) {
		
		return finacialParamsMapper.insert(record);
	}

	public int insertSelective(FinacialParams record) {
		
		return finacialParamsMapper.insertSelective(record);
	}

	public List<FinacialParams> selectByExample(FinacialParamsExample example) {
		
		return finacialParamsMapper.selectByExample(example);
	}

	public FinacialParams selectByPrimaryKey(String id) {
		
		return finacialParamsMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(FinacialParams record, FinacialParamsExample example) {
		
		return finacialParamsMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(FinacialParams record, FinacialParamsExample example) {
		
		return finacialParamsMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(FinacialParams record) {
		
		return finacialParamsMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(FinacialParams record) {
		
		return finacialParamsMapper.updateByPrimaryKey(record);
	}

}

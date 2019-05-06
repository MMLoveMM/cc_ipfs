package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.net.sinodata.mapper.AuxiliaryContactMapper;
import cn.net.sinodata.model.AuxiliaryContact;
import cn.net.sinodata.model.AuxiliaryContactExample;
import cn.net.sinodata.service.AuxiliaryContactService;

/**
 * 辅助联系人表Service
 * @author Pangpj
 *
 */
@Service
public class AuxiliaryContactServiceImpl implements AuxiliaryContactService {
	
	@Autowired
	private AuxiliaryContactMapper auxiliaryContactMapper;

	public int countByExample(AuxiliaryContactExample example) {
		
		return auxiliaryContactMapper.countByExample(example);
	}

	public int deleteByExample(AuxiliaryContactExample example) {
		
		return auxiliaryContactMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return auxiliaryContactMapper.deleteByPrimaryKey(id);
	}

	public int insert(AuxiliaryContact record) {
		
		return auxiliaryContactMapper.insert(record);
	}

	public int insertSelective(AuxiliaryContact record) {
		
		return auxiliaryContactMapper.insertSelective(record);
	}

	public List<AuxiliaryContact> selectByExample(AuxiliaryContactExample example) {
		
		return auxiliaryContactMapper.selectByExample(example);
	}

	public AuxiliaryContact selectByPrimaryKey(String id) {
		
		return auxiliaryContactMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(AuxiliaryContact record, AuxiliaryContactExample example) {
		
		return auxiliaryContactMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(AuxiliaryContact record, AuxiliaryContactExample example) {
		
		return auxiliaryContactMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(AuxiliaryContact record) {
		
		return auxiliaryContactMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(AuxiliaryContact record) {
		
		return auxiliaryContactMapper.updateByPrimaryKey(record);
	}

}

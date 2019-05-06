package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.net.sinodata.mapper.ReminderInfoMapper;
import cn.net.sinodata.model.ReminderInfo;
import cn.net.sinodata.model.ReminderInfoExample;
import cn.net.sinodata.service.ReminderInfoService;

@Service
public class ReminderInfoServiceImpl implements ReminderInfoService {

	@Autowired
	private ReminderInfoMapper reminderInfoMapper;
	
	public int countByExample(ReminderInfoExample example) {
		
		return reminderInfoMapper.countByExample(example);
	}

	public int deleteByExample(ReminderInfoExample example) {
		
		return reminderInfoMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return reminderInfoMapper.deleteByPrimaryKey(id);
	}

	public int insert(ReminderInfo record) {
		
		return reminderInfoMapper.insert(record);
	}

	public int insertSelective(ReminderInfo record) {
		
		return reminderInfoMapper.insertSelective(record);
	}

	public List<ReminderInfo> selectByExample(ReminderInfoExample example) {
		
		return reminderInfoMapper.selectByExample(example);
	}

	public ReminderInfo selectByPrimaryKey(String id) {
		
		return reminderInfoMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(ReminderInfo record, ReminderInfoExample example) {
		
		return reminderInfoMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(ReminderInfo record, ReminderInfoExample example) {
		
		return reminderInfoMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(ReminderInfo record) {
		
		return reminderInfoMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(ReminderInfo record) {
		
		return reminderInfoMapper.updateByPrimaryKey(record);
	}

}

package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.net.sinodata.mapper.AccessoryHistoryMapper;
import cn.net.sinodata.model.AccessoryHistory;
import cn.net.sinodata.model.AccessoryHistoryExample;
import cn.net.sinodata.service.AccessoryHistoryService;

/**
 * 附件历史表		Service
 * @author Pangpj
 *
 */
@Service
public class AccessoryHistoryServiceImpl implements AccessoryHistoryService {

	@Autowired
	private AccessoryHistoryMapper accessoryHistoryMapper;
	
	public int countByExample(AccessoryHistoryExample example) {
		
		return accessoryHistoryMapper.countByExample(example);
	}

	public int deleteByExample(AccessoryHistoryExample example) {
		
		return accessoryHistoryMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return accessoryHistoryMapper.deleteByPrimaryKey(id);
	}

	public int insert(AccessoryHistory record) {
		
		return accessoryHistoryMapper.insert(record);
	}

	public int insertSelective(AccessoryHistory record) {
		
		return accessoryHistoryMapper.insertSelective(record);
	}

	public List<AccessoryHistory> selectByExample(AccessoryHistoryExample example) {
		
		return accessoryHistoryMapper.selectByExample(example);
	}

	public AccessoryHistory selectByPrimaryKey(String id) {
		
		return accessoryHistoryMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(AccessoryHistory record, AccessoryHistoryExample example) {
		
		return accessoryHistoryMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(AccessoryHistory record, AccessoryHistoryExample example) {
		
		return accessoryHistoryMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(AccessoryHistory record) {
		
		return accessoryHistoryMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(AccessoryHistory record) {
		
		return accessoryHistoryMapper.updateByPrimaryKey(record);
	}

}

package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.net.sinodata.mapper.AccessoryInfoMapper;
import cn.net.sinodata.model.AccessoryHistory;
import cn.net.sinodata.model.AccessoryInfo;
import cn.net.sinodata.model.AccessoryInfoExample;
import cn.net.sinodata.service.AccessoryHistoryService;
import cn.net.sinodata.service.AccessoryInfoService;
import cn.net.sinodata.util.StringUtil;
import cn.net.sinodata.util.UuidUtil;

/**
 * 附件信息表 Service
 * @author Pangpj
 *
 */
@Service
public class AccessoryInfoServiceImpl implements AccessoryInfoService {

	@Autowired
	private AccessoryInfoMapper accessoryInfoMapper;
	
	@Autowired
	private AccessoryHistoryService accessoryHistoryService;
	
	public int countByExample(AccessoryInfoExample example) {
		
		return accessoryInfoMapper.countByExample(example);
	}

	public int deleteByExample(AccessoryInfoExample example) {
		
		return accessoryInfoMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Long id) {
		
		return accessoryInfoMapper.deleteByPrimaryKey(id);
	}

	public int insert(AccessoryInfo record) {
		
		return accessoryInfoMapper.insert(record);
	}

	public int insertSelective(AccessoryInfo record) {
		
		return accessoryInfoMapper.insertSelective(record);
	}

	public List<AccessoryInfo> selectByExample(AccessoryInfoExample example) {
		
		return accessoryInfoMapper.selectByExample(example);
	}

	public AccessoryInfo selectByPrimaryKey(Long id) {
		
		return accessoryInfoMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(AccessoryInfo record, AccessoryInfoExample example) {
		
		return accessoryInfoMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(AccessoryInfo record, AccessoryInfoExample example) {
		
		return accessoryInfoMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(AccessoryInfo record) {
		
		return accessoryInfoMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(AccessoryInfo record) {
		
		return accessoryInfoMapper.updateByPrimaryKey(record);
	}

	/**
	 * 存入附件信息
	 * @author licc 2017年10月27日15:23:16
	 */
	public int insertAccessoryHisInfo(AccessoryInfo accessoryInfo) {
		int flag = 1;
		//存入附件信息
		int access = accessoryInfoMapper.insertSelective(accessoryInfo);
		
		if(access < 1){
			flag = 0;
		}
		//存入附件历史
		AccessoryHistory accessoryHistory = new AccessoryHistory();
		accessoryHistory.setId(UuidUtil.getUuid());
		//accessoryHistory.setAccessoryid(accessoryInfo.getId());
		accessoryHistory.setAccessoryname(accessoryInfo.getAccessoryname());
		
		//mod by xj 2017年11月2日15:19:49
		if(StringUtil.isNotEmpty(accessoryInfo.getTableid())){
			accessoryInfo.setTableid(accessoryInfo.getTableid());		
		}
		accessoryHistory.setAccessorytype(accessoryInfo.getAccessorytype());
		accessoryHistory.setUserid(accessoryInfo.getUserid());
		//accessoryHistory.setNode(changeNode(node));
		//accessoryHistory.setDealDt(accessoryInfo.getUploaddt());
		short type = (short)1;
		accessoryHistory.setOperatetype(type);
		
		int accH = accessoryHistoryService.insertSelective(accessoryHistory);
		if(accH < 1){
			flag = 0;
		}
		return flag;
	}
	
	/**
	 * 查询附件信息表最大id值
	 * @author xuj
	 */
	public String getMaxId() {
		return accessoryInfoMapper.getMaxId();
	}

}

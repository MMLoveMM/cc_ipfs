package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.net.sinodata.mapper.ServiceCompanyInfoMapper;
import cn.net.sinodata.model.ServiceCompanyInfo;
import cn.net.sinodata.model.ServiceCompanyInfoExample;
import cn.net.sinodata.service.ServiceCompanyInfoService;

@Service
public class ServiceCompanyInfoServiceImpl implements ServiceCompanyInfoService {

	@Autowired
	private ServiceCompanyInfoMapper serviceCompanyInfoMapper;
	
	public int countByExample(ServiceCompanyInfoExample example) {
		
		return serviceCompanyInfoMapper.countByExample(example);
	}

	public int deleteByExample(ServiceCompanyInfoExample example) {
		
		return serviceCompanyInfoMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return serviceCompanyInfoMapper.deleteByPrimaryKey(id);
	}

	public int insert(ServiceCompanyInfo record) {
		
		return serviceCompanyInfoMapper.insert(record);
	}

	public int insertSelective(ServiceCompanyInfo record) {
		
		return serviceCompanyInfoMapper.insertSelective(record);
	}

	public List<ServiceCompanyInfo> selectByExample(ServiceCompanyInfoExample example) {
		
		return serviceCompanyInfoMapper.selectByExample(example);
	}

	public ServiceCompanyInfo selectByPrimaryKey(String id) {
		
		return serviceCompanyInfoMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(ServiceCompanyInfo record, ServiceCompanyInfoExample example) {
		
		return serviceCompanyInfoMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(ServiceCompanyInfo record, ServiceCompanyInfoExample example) {
		
		return serviceCompanyInfoMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(ServiceCompanyInfo record) {
		
		return serviceCompanyInfoMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(ServiceCompanyInfo record) {
		
		return serviceCompanyInfoMapper.updateByPrimaryKey(record);
	}

}

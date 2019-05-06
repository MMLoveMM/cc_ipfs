package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.net.sinodata.mapper.ProjectEvaluateMapper;
import cn.net.sinodata.model.ProjectEvaluate;
import cn.net.sinodata.model.ProjectEvaluateExample;
import cn.net.sinodata.service.ProjectEvaluateService;

@Service
public class ProjectEvaluateServiceImpl implements ProjectEvaluateService {

	@Autowired
	private ProjectEvaluateMapper projectEvaluateMapper;
	
	public int countByExample(ProjectEvaluateExample example) {
		
		return projectEvaluateMapper.countByExample(example);
	}

	public int deleteByExample(ProjectEvaluateExample example) {
		
		return projectEvaluateMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return projectEvaluateMapper.deleteByPrimaryKey(id);
	}

	public int insert(ProjectEvaluate record) {
		
		return projectEvaluateMapper.insert(record);
	}

	public int insertSelective(ProjectEvaluate record) {
		
		return projectEvaluateMapper.insertSelective(record);
	}

	public List<ProjectEvaluate> selectByExample(ProjectEvaluateExample example) {
		
		return projectEvaluateMapper.selectByExample(example);
	}

	public ProjectEvaluate selectByPrimaryKey(String id) {
		
		return projectEvaluateMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(ProjectEvaluate record, ProjectEvaluateExample example) {
		
		return projectEvaluateMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(ProjectEvaluate record, ProjectEvaluateExample example) {
		
		return projectEvaluateMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(ProjectEvaluate record) {
		
		return projectEvaluateMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(ProjectEvaluate record) {
		
		return projectEvaluateMapper.updateByPrimaryKey(record);
	}

}

package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.net.sinodata.mapper.ProjectAttentionMapper;
import cn.net.sinodata.model.ProjectAttention;
import cn.net.sinodata.model.ProjectAttentionExample;
import cn.net.sinodata.service.ProjectAttentionService;

@Service
public class ProjectAttentionServiceImpl implements ProjectAttentionService {

	@Autowired
	private ProjectAttentionMapper projectAttentionMapper;
	
	public int countByExample(ProjectAttentionExample example) {
		
		return projectAttentionMapper.countByExample(example);
	}

	public int deleteByExample(ProjectAttentionExample example) {
		
		return projectAttentionMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return projectAttentionMapper.deleteByPrimaryKey(id);
	}

	public int insert(ProjectAttention record) {
		
		return projectAttentionMapper.insert(record);
	}

	public int insertSelective(ProjectAttention record) {
		
		return projectAttentionMapper.insertSelective(record);
	}

	public List<ProjectAttention> selectByExample(ProjectAttentionExample example) {
		
		return projectAttentionMapper.selectByExample(example);
	}

	public ProjectAttention selectByPrimaryKey(String id) {
		
		return projectAttentionMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(ProjectAttention record, ProjectAttentionExample example) {
		
		return projectAttentionMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(ProjectAttention record, ProjectAttentionExample example) {
		
		return projectAttentionMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(ProjectAttention record) {
		
		return projectAttentionMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(ProjectAttention record) {
		
		return projectAttentionMapper.updateByPrimaryKey(record);
	}

}

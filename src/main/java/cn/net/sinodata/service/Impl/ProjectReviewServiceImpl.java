package cn.net.sinodata.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.net.sinodata.mapper.ProjectReviewMapper;
import cn.net.sinodata.model.ProjectReview;
import cn.net.sinodata.model.ProjectReviewExample;
import cn.net.sinodata.service.ProjectReviewService;

/**
 * 项目评价表 Service
 * @author pangpj
 *
 */
@Service
public class ProjectReviewServiceImpl implements ProjectReviewService {

	@Autowired
	private ProjectReviewMapper projectReviewMapper;
	
	public int countByExample(ProjectReviewExample example) {
		
		return projectReviewMapper.countByExample(example);
	}

	public int deleteByExample(ProjectReviewExample example) {
		
		return projectReviewMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return projectReviewMapper.deleteByPrimaryKey(id);
	}

	public int insert(ProjectReview record) {
		
		return projectReviewMapper.insert(record);
	}

	public int insertSelective(ProjectReview record) {
		
		return projectReviewMapper.insertSelective(record);
	}

	public List<ProjectReview> selectByExample(ProjectReviewExample example) {
		
		return projectReviewMapper.selectByExample(example);
	}

	public ProjectReview selectByPrimaryKey(String id) {
		
		return projectReviewMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(ProjectReview record, ProjectReviewExample example) {
		
		return projectReviewMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(ProjectReview record, ProjectReviewExample example) {
		
		return projectReviewMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(ProjectReview record) {
		
		return projectReviewMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(ProjectReview record) {
		
		return projectReviewMapper.updateByPrimaryKey(record);
	}

}

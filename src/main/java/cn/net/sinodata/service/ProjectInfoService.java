package cn.net.sinodata.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;

import cn.net.sinodata.mapper.ProjectInfoMapper;
import cn.net.sinodata.model.ProjectInfo;
import cn.net.sinodata.model.ProjectInfoExample;

/**
 * 项目信息
 * @author Pangpj
 *
 */
public interface ProjectInfoService extends ProjectInfoMapper {
	/**
	 * 项目融资信息
	 * @author licc 2017年9月18日15:43:37
	 */
	public PageInfo<ProjectInfo>  getProjectList(int page, int rows, ProjectInfoExample example);
	
	/**
	 * 保存项目信息,无流程
	 * @author xu 2017年9月28日16:13:59
	 * @param projectInfo
	 * @param sCIMap
	 */
	public int saveProjectInfo(ProjectInfo projectInfo,String userid, Map<String, Object> sCIMap);
	
	/**
     * 获取某列最大值
     * @author xuj
     * @return
     */
    public String getMaxProjectNum();

	
	
}

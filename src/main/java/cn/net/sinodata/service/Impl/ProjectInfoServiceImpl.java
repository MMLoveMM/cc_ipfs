package cn.net.sinodata.service.Impl;

import cn.net.sinodata.controller.ProjectController;
import cn.net.sinodata.mapper.ProjectInfoMapper;
import cn.net.sinodata.model.*;
import cn.net.sinodata.service.ProjectInfoService;
import cn.net.sinodata.service.ServiceCompanyInfoService;
import cn.net.sinodata.service.TUsersRolesService;
import cn.net.sinodata.service.TUsersService;
import cn.net.sinodata.util.StringUtil;
import cn.net.sinodata.util.UuidUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ProjectInfoServiceImpl implements ProjectInfoService {
	private static final String STATUS_INPUT = "0"; // 录入
	private static final Logger logger = LoggerFactory.getLogger(ProjectController.class);
	@Autowired
	private ProjectInfoMapper projectInfoMapper;
	
	@Autowired
	private TUsersRolesService tUsersRolesService;
	
	@Autowired
	private TUsersService tUsersService;
	
	@Autowired
	private ServiceCompanyInfoService servicecompanyinfoservice;
	
	@Autowired
	private ProjectInfoService projectInfoService;
	
	public int countByExample(ProjectInfoExample example) {
		
		return projectInfoMapper.countByExample(example);
	}

	public int deleteByExample(ProjectInfoExample example) {
		
		return projectInfoMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return projectInfoMapper.deleteByPrimaryKey(id);
	}

	public int insert(ProjectInfo record) {
		
		return projectInfoMapper.insert(record);
	}

	public int insertSelective(ProjectInfo record) {
		
		return projectInfoMapper.insertSelective(record);
	}

	public List<ProjectInfo> selectByExample(ProjectInfoExample example) {
		
		return projectInfoMapper.selectByExample(example);
	}

	public ProjectInfo selectByPrimaryKey(String id) {
		
		return projectInfoMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(ProjectInfo record, ProjectInfoExample example) {
		
		return projectInfoMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(ProjectInfo record, ProjectInfoExample example) {
		
		return projectInfoMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(ProjectInfo record) {
		
		return projectInfoMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(ProjectInfo record) {
		
		return projectInfoMapper.updateByPrimaryKey(record);
	}

	public PageInfo<ProjectInfo> getProjectList(int page, int rows, ProjectInfoExample example) {
		PageHelper.startPage(page, rows);
		
		return new PageInfo<>(projectInfoMapper.selectByExample(example));
	}

	/**
	 * 保存项目信息，不提交流程
	 * @author xuj  2017年9月28日16:15:14
	 * @param projectInfo
	 * @param sCIMap
	 * 
	 */
	public int saveProjectInfo(ProjectInfo projectInfo, String userid, Map<String, Object> sCIMap) {
		
		int flag = 1;
		
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		//项目编号
		String projectnum = "";
		String projectId = projectInfo.getId();
		String customerId = projectInfo.getCustomerid();
		
		ProjectInfo project =  projectInfoMapper.selectByPrimaryKey(projectId);
		
		if(project != null){
			projectInfo.setProjectnum(project.getProjectnum());
			projectInfo.setCreatetime(project.getCreatetime());
			projectInfo.setComefrom(project.getComefrom());
		}
		
		String projectNum = projectInfoMapper.getMaxProjectNum();
		
		if(StringUtil.isEmpty(projectNum)) {
			projectNum = "000001";
		}else{
			projectNum = Integer.parseInt(projectNum) + 1 + "";
		} 
		
		projectInfo.setProjectnum(projectnum);
		projectInfo.setCreatetime(new Date());
		
		projectInfo.setInputerid(user.getUserid());
		projectInfo.setStatus(STATUS_INPUT);
		projectInfo.setCustomerid(customerId);
		projectInfo.setVisitorvolume("0");
		
		//插入项目信息
		logger.info("用户[{}] - 开始插入项目信息", user.getUserid());
		int projectInfoFlag = projectInfoMapper.insertSelective(projectInfo);
		if(projectInfoFlag < 1) {
			flag = 0;
		}
		
		//插入项目权限信息
		logger.info("用户[{}] - 开始存入项目权限信息", user.getUserid());
		TUsersRoles usersRoles = new TUsersRoles();
		TUsersRoles usersRoless = tUsersRolesService.selectByPidAndUid(projectId,userid);
		
		if(usersRoless == null){
			usersRoles.setId(UuidUtil.getUuid());
			usersRoles.setProjectid(projectId);
			usersRoles.setUserid(userid);
			usersRoles.setAddtime(new Date());
			int tUserRolesFlag = this.tUsersRolesService.insertSelective(usersRoles);
			if(tUserRolesFlag < 1) {
				flag = 0;
			}
		}
		
		//存入企业服务信息
		logger.info("用户[{}] - 开始存入企业服务信息", user.getUserid());
		ServiceCompanyInfo sCI = new ServiceCompanyInfo();
		sCI.setProjectInfoId(projectId);
		sCI.setCreateTime(new Date());
		sCI.setStatus("0");
		
		
		String[] factoringGS = (String[]) sCIMap.get("factoringGS");//保理公司
		String[] fundGS = (String[]) sCIMap.get("fundGS");//基金公司
		String[] type = (String[]) sCIMap.get("type");//评估+担保公司
		
		if(factoringGS != null){
			for(int i=0; i<factoringGS.length; i++){
				sCI.setType("10");
				sCI.setCompanyId(factoringGS[i]);
				sCI.setId(UuidUtil.getUuid());
				this.addUsersRoles(projectId, factoringGS[i]);
				this.servicecompanyinfoservice.insertSelective(sCI);
			}
		}
		if(fundGS != null){
			for(int i=0; i<fundGS.length; i++){
				sCI.setType("12");
				sCI.setCompanyId(fundGS[i]);
				sCI.setId(UuidUtil.getUuid());
				this.addUsersRoles(projectId, fundGS[i]);
				this.servicecompanyinfoservice.insertSelective(sCI);
			}
		}
		if(type != null){
			for(int i=0; i<type.length; i++){
				if("11".equals(type[i])){
					sCI.setType(type[i]);
					sCI.setCompanyId(sCIMap.get("evaluationGs").toString());
					sCI.setId(UuidUtil.getUuid());
					this.addUsersRoles(projectId,sCIMap.get("evaluationGs").toString());
					this.servicecompanyinfoservice.insertSelective(sCI);
				}else{
					sCI.setType(type[i]);
					sCI.setCompanyId(sCIMap.get("guaranteeGs").toString());
					sCI.setId(UuidUtil.getUuid());
					this.addUsersRoles(projectId,sCIMap.get("guaranteeGs").toString());
					this.servicecompanyinfoservice.insertSelective(sCI);
			   }
			}
		}
		
		return flag;
	}
	
	
	/**
	 * 插入项目权限信息
	 * @param projectId
	 * @param organsId
	 * @author xuj 2017年9月28日18:00:21
	 */
	public void addUsersRoles(String projectId, String organsId){
			String userId;
			TUsersExample TusersExample = new TUsersExample();
			TUsersExample.Criteria criteria = TusersExample.createCriteria();
			
			criteria.andOrgansidEqualTo(organsId);
			List<TUsers> users = tUsersService.selectByExample(TusersExample);
			if(users != null && !users.isEmpty() && users.get(0) != null ){
				userId = tUsersService.selectByExample(TusersExample).get(0).getUserid();
			}else{
				userId = "";
			}
			
			TUsersRoles tUsersRoles  =new TUsersRoles();
			TUsersRoles tUsers = tUsersRolesService.selectByPidAndUid(projectId,userId);
			if(tUsers == null){
				tUsersRoles.setId(UuidUtil.getUuid());
				tUsersRoles.setProjectid(projectId);
				tUsersRoles.setUserid(userId);
				tUsersRoles.setAddtime(new Date());
				this.tUsersRolesService.insertSelective(tUsersRoles);
			}
		
	}
	
	/**
	 * 获取某列最大值
	 * @author xuj
	 */
	public String getMaxProjectNum() {
		return projectInfoService.getMaxProjectNum();
	}

	@Override
	public String getAmtCont() {
		return projectInfoMapper.getAmtCont();
	}

	/**
	 * 修改项目信息，不提交流程
	 *
	 * @param projectInfo 修改后的项目信息
	 * @param sCIMap      机构名
	 * @author xuj  2017年9月28日16:15:14
	 */
	public int modProjectInfo(ProjectInfo projectInfo, Map<String, Object> sCIMap) {

		int flag = 1;
		int projectInfoFlag = projectInfoMapper.updateByPrimaryKeySelective(projectInfo);
		if (projectInfoFlag < 1) {
			flag = 0;
		}

		String projectId = projectInfo.getId();

		//清空企业服务信息
		ServiceCompanyInfoExample sCIExample = new ServiceCompanyInfoExample();
		ServiceCompanyInfoExample.Criteria sCICriteria = sCIExample.createCriteria();
		sCICriteria.andProjectInfoIdEqualTo(projectId);
		this.servicecompanyinfoservice.deleteByExample(sCIExample);

		//存入企业服务信息
		ServiceCompanyInfo sCI = new ServiceCompanyInfo();
		sCI.setProjectInfoId(projectId);
		sCI.setCreateTime(new Date());
		sCI.setStatus("0");


		String[] factoringGS = (String[]) sCIMap.get("factoringGS");//保理公司
		String[] fundGS = (String[]) sCIMap.get("fundGS");//基金公司
		String[] type = (String[]) sCIMap.get("type");//评估+担保公司

		if (factoringGS != null) {
			for (int i = 0; i < factoringGS.length; i++) {
				sCI.setType("10");
				sCI.setCompanyId(factoringGS[i]);
				sCI.setId(UuidUtil.getUuid());
				this.addUsersRoles(projectId, factoringGS[i]);
				this.servicecompanyinfoservice.insertSelective(sCI);
			}
		}
		if (fundGS != null) {
			for (int i = 0; i < fundGS.length; i++) {
				sCI.setType("12");
				sCI.setCompanyId(fundGS[i]);
				sCI.setId(UuidUtil.getUuid());
				this.addUsersRoles(projectId, fundGS[i]);
				this.servicecompanyinfoservice.insertSelective(sCI);
			}
		}
		if (type != null) {
			for (int i = 0; i < type.length; i++) {
				if ("11".equals(type[i])) {
					sCI.setType(type[i]);
					sCI.setCompanyId(sCIMap.get("evaluationGs").toString());
					sCI.setId(UuidUtil.getUuid());
					this.addUsersRoles(projectId, sCIMap.get("evaluationGs").toString());
					this.servicecompanyinfoservice.insertSelective(sCI);
				} else {
					sCI.setType(type[i]);
					sCI.setCompanyId(sCIMap.get("guaranteeGs").toString());
					sCI.setId(UuidUtil.getUuid());
					this.addUsersRoles(projectId, sCIMap.get("guaranteeGs").toString());
					this.servicecompanyinfoservice.insertSelective(sCI);
				}
			}
		}

		return flag;
	}
}

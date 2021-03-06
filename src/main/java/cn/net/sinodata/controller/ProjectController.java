package cn.net.sinodata.controller;

import cn.net.sinodata.model.*;
import cn.net.sinodata.service.*;
import cn.net.sinodata.util.DateUtil;
import cn.net.sinodata.util.Result;
import cn.net.sinodata.util.StringUtil;
import cn.net.sinodata.util.UuidUtil;
import com.github.pagehelper.PageInfo;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/project")
public class ProjectController {
	private static final Logger logger = LoggerFactory.getLogger(ProjectController.class);

	private final TDataDictService tDataDictService;

	private final TOrgansService tOrgansService;
	
	private final ProjectInfoService projectInfoService;

	private final EnterpriseInfoService enterpriseInfoService;

	private final ServiceCompanyInfoService serviceCompanyInfoService;

	private final EnterpriseFinanceService enterpriseFinanceService;

	private final EnterprisePersonService enterprisePersonService;

	private final EnterpriseIntellectualPropertyService enterpriseIntellectualPropertyService;

	private final EnterpriseFilePdfService enterpriseFilePdfService;

	public ProjectController(EnterpriseInfoService enterpriseInfoService, ProjectInfoService projectInfoService,
							 TDataDictService tDataDictService, TOrgansService tOrgansService,
							 ServiceCompanyInfoService serviceCompanyInfoService, EnterpriseFinanceService enterpriseFinanceService, EnterprisePersonService enterprisePersonService, EnterpriseIntellectualPropertyService enterpriseIntellectualPropertyService, EnterpriseFilePdfService enterpriseFilePdfService) {
		this.enterpriseInfoService = enterpriseInfoService;
		this.projectInfoService = projectInfoService;
		this.tDataDictService = tDataDictService;
		this.tOrgansService = tOrgansService;
		this.serviceCompanyInfoService = serviceCompanyInfoService;
		this.enterpriseFinanceService = enterpriseFinanceService;
		this.enterprisePersonService = enterprisePersonService;
		this.enterpriseIntellectualPropertyService = enterpriseIntellectualPropertyService;
		this.enterpriseFilePdfService = enterpriseFilePdfService;
	}

	@RequestMapping({"/toAdd"})
	public String toAdd(Model model) { TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
	logger.info("用户[{}] - 进入项目管理页面", user.getUserid());

	TDataDictExample dataExample = new TDataDictExample();
	TOrgansExample organsExample = new TOrgansExample();

	List<TDataDict> tdataDicts = this.tDataDictService.selectByExample(dataExample);
	CustomerInfoExample cusExample = new CustomerInfoExample();
	CustomerInfoExample.Criteria criteria = cusExample.createCriteria();

	criteria.andUseridEqualTo(user.getUserid());
	List<TOrgans> organs = this.tOrgansService.selectByExample(organsExample);
	model.addAttribute("organs", organs);
	model.addAttribute("tdataDicts", tdataDicts);
	if (StringUtil.isNotEmpty(user.getCustomerInfoId())) {
		model.addAttribute("projectName", (this.enterpriseInfoService.selectById(user.getCustomerInfoId()).getName()));
	}
	return "user_jsp/project/project_add";
	}

	@RequestMapping({"/add"})
	@ResponseBody
	public String addProjectInfo(ProjectInfo pInfo, String[] factoringGS, String evaluationGs, String guaranteeGs, String[] fundGS, String[] business) {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始项目信息录入", user.getUserid());

		Map<String, Object> sCIMap = new HashMap<String, Object>();
		sCIMap.put("type", business);
		sCIMap.put("factoringGS", factoringGS);
		sCIMap.put("fundGS", fundGS);

		if (StringUtil.isNotEmpty(evaluationGs)) {
			sCIMap.put("evaluationGs", evaluationGs);
		}

		if (StringUtil.isNotEmpty(guaranteeGs)) {
			sCIMap.put("guaranteeGs", guaranteeGs);
		}

		String userId = user.getUserid();

		CustomerInfoExample cusExample = new CustomerInfoExample();
		CustomerInfoExample.Criteria criteria = cusExample.createCriteria();
		criteria.andUseridEqualTo(userId);

		pInfo.setId(UuidUtil.getUuid());
		if (StringUtil.isNotEmpty(user.getCustomerInfoId())) {
			pInfo.setCustomerid(this.enterpriseInfoService.selectById(user.getCustomerInfoId()).getId());
			pInfo.setProjectname(this.enterpriseInfoService.selectById(user.getCustomerInfoId()).getName());
		}
		int flag = this.projectInfoService.saveProjectInfo(pInfo, userId, sCIMap);
		if (flag != 1) {
			logger.info("保存项目信息失败");
			return "保存项目信息失败";
		}

		logger.info("保存项目信息成功");
		return "0";
	}

	@RequestMapping({"/list"})
	public String toProjectList(String flag)
	{
	TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
	logger.info("用户[{}] - 进入项目列表页面", user.getUserid());

	if (StringUtil.isNotEmpty(flag) && "1".equals(flag)) {
		return "user_jsp/project/project_list";
	} else if (StringUtil.isNotEmpty(flag) && "2".equals(flag)) {
		return "user_jsp/project/project_list_view";
	}

	return "project/project_list";
	}

	@RequestMapping({"/list/get"})
	@ResponseBody
	public PageInfo<?> getDictList(@RequestParam(value="rows", required=false) int rows, @RequestParam(value="page", required=false) int page, TDataDict dict) {
	TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
	logger.info("用户[{}] - 开始获取项目列表数据", user.getUserid());

	ProjectInfoExample projectInfoExample = new ProjectInfoExample();

	projectInfoExample.setOrderByClause("createTime DESC");

	return this.projectInfoService.getProjectList(page, rows, projectInfoExample);
	}

	@RequestMapping(value = "toDetail")
	public String toDetail(String id, Model model) {
		TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
		logger.info("用户 [{}] - 开始进入查看项目详情", user.getUserid());

		ProjectInfo projectInfo = projectInfoService.selectByPrimaryKey(id);


		model.addAttribute("projectInfo", projectInfo);
		model.addAttribute("tUsers", user);
		model.addAttribute("tdata", tDataDictService.selectByExample(new TDataDictExample()));
		ServiceCompanyInfoExample serviceCompanyInfoExample = new ServiceCompanyInfoExample();
		ServiceCompanyInfoExample.Criteria criteria = serviceCompanyInfoExample.createCriteria();
		criteria.andProjectInfoIdEqualTo(id);

		List<ServiceCompanyInfo> serviceCompanyInfoList = serviceCompanyInfoService.selectByExample(serviceCompanyInfoExample);
		List<Map<String, Object>> sCIS = new ArrayList<>();
		for (ServiceCompanyInfo serviceCompanyInfo : serviceCompanyInfoList) {
			Map<String, Object> map = new HashMap<>();
			if (StringUtil.isNotEmpty(serviceCompanyInfo.getCompanyId())) {
				EnterpriseInfo enterpriseInfo = enterpriseInfoService.selectById(serviceCompanyInfo.getCompanyId());
				if (enterpriseInfo != null) {
					map.put("orgname", enterpriseInfo.getName());
				}
			}
			map.put("loansMoney", serviceCompanyInfo.getLoansMoney());
			map.put("shareholdingRatio", serviceCompanyInfo.getShareholdingRatio());
			map.put("pawn", serviceCompanyInfo.getPawn());
			sCIS.add(map);
		}
		model.addAttribute("sCIs", sCIS);

		//下面是机构信息
		EnterpriseInfo enterpriseInfo = enterpriseInfoService.selectById(projectInfo.getCustomerid());
		enterpriseInfo.setEnterpriseCreateDateStr(DateUtil.formatDate(enterpriseInfo.getEnterpriseCreateDate(), "yyyy-MM-dd"));
		enterpriseInfo.setListedDateStr(DateUtil.formatDate(enterpriseInfo.getListedDate(), "yyyy-MM-dd"));

		EnterpriseFinance enterpriseFinance = enterpriseFinanceService.selectByEnterpriseId(enterpriseInfo.getId());

		EnterprisePerson enterprisePerson = enterprisePersonService.selectByEnterpriseId(enterpriseInfo.getId());

		EnterpriseIntellectualProperty enterpriseIntellectualProperty =
				enterpriseIntellectualPropertyService.selectByEnterpriseId(enterpriseInfo.getId());

		EnterpriseFilePdf enterpriseFilePdf = enterpriseFilePdfService.selectByEnterpriseId(enterpriseInfo.getId());

		model.addAttribute("enterpriseInfo", enterpriseInfo);
		model.addAttribute("enterpriseFinance", enterpriseFinance);
		model.addAttribute("enterprisePerson", enterprisePerson);
		model.addAttribute("enterpriseIntellectualProperty", enterpriseIntellectualProperty);
		model.addAttribute("enterpriseFilePdf", enterpriseFilePdf);

		return "project/project_detail";
	}

	/**
	 * 前台获取融资列表
	 *
	 * @author PangPj
	 * @param pageSize 每页的条数
	 * @param page	当前第几页
	 * @return 融资列表数据
	 */
	@RequestMapping({"/list/web/get"})
	@ResponseBody
	public Result<Map<String, Object>> getWebDictList(@RequestParam(value = "pageSize", required = false) int pageSize, @RequestParam(value = "page", required = false) int page) {
		TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始获取项目列表数据", user.getUserid());
		Result<Map<String, Object>> result = new Result<>();

		ProjectInfoExample projectInfoExample = new ProjectInfoExample();
		projectInfoExample.setOrderByClause("createTime DESC");

		ProjectInfoExample.Criteria criteria = projectInfoExample.createCriteria();

		if (!"admin".equals(user.getUserid())) {
			criteria.andInputeridEqualTo(user.getUserid());
		}

		PageInfo<ProjectInfo> projectInfoPage = this.projectInfoService.getProjectList(page, pageSize, projectInfoExample);
		List<ProjectInfo> projectInfoList = projectInfoPage.getList();
		if (projectInfoList == null || projectInfoList.isEmpty()) {
			logger.info("项目列表数据为空");
			return result.error("项目列表数据为空");
		}

		List<Map<String, Object>> rtnList = new ArrayList<>();
		for (ProjectInfo projectInfo : projectInfoList) {
			Map<String, Object> map = new HashMap<>();
			map.put("id", projectInfo.getId());
			map.put("projectName", projectInfo.getProjectname());
			map.put("createTime", DateUtil.formatDate(projectInfo.getCreatetime(), "yyyy-MM-dd"));
			map.put("visitorVolume", projectInfo.getVisitorvolume());
			rtnList.add(map);
		}

		Map<String, Object> rtnMap = new HashMap<>();
		rtnMap.put("total", projectInfoPage.getTotal());
		rtnMap.put("rows", rtnList);

		logger.info("获取项目列表数据成功");
		return result.success(rtnMap);
	}

	@RequestMapping({"/toMod"})
	public String toMod(String id, Model model, String flag) {
		TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 进入修改项目信息页面", user.getUserid());

		TDataDictExample dataExample = new TDataDictExample();
		TOrgansExample organsExample = new TOrgansExample();

		List<TDataDict> tdataDicts = this.tDataDictService.selectByExample(dataExample);
		CustomerInfoExample cusExample = new CustomerInfoExample();
		CustomerInfoExample.Criteria criteria = cusExample.createCriteria();

		criteria.andUseridEqualTo(user.getUserid());
		List<TOrgans> organs = this.tOrgansService.selectByExample(organsExample);
		model.addAttribute("organs", organs);
		model.addAttribute("tdataDicts", tdataDicts);

		ProjectInfo projectInfo = this.projectInfoService.selectByPrimaryKey(id);
		model.addAttribute("project", projectInfo);

		EnterpriseInfo enterpriseInfo = enterpriseInfoService.selectById(projectInfo.getCustomerid());
		if (StringUtil.isNotEmpty(enterpriseInfo.getName())) {
			model.addAttribute("customerName", enterpriseInfo.getName());
		}

		if (StringUtil.isNotEmpty(flag) && "2".equals(flag)) {
			return "user_jsp/project/project_mod";
		}

		return "project/project_mod";
	}

	@RequestMapping({"/mod"})
	@ResponseBody
	public String modProjectInfo(ProjectInfo pInfo, String[] factoringGS, String evaluationGs, String guaranteeGs, String[] fundGS, String[] business) {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始修改项目信息", user.getUserid());

		Map<String, Object> sCIMap = new HashMap<String, Object>();
		sCIMap.put("type", business);
		sCIMap.put("factoringGS", factoringGS);
		sCIMap.put("fundGS", fundGS);

		if (StringUtil.isNotEmpty(evaluationGs)) {
			sCIMap.put("evaluationGs", evaluationGs);
		}

		if (StringUtil.isNotEmpty(guaranteeGs)) {
			sCIMap.put("guaranteeGs", guaranteeGs);
		}

		int flag = this.projectInfoService.modProjectInfo(pInfo, sCIMap);
		if (flag != 1) {
			logger.info("修改项目信息失败");
			return "修改项目信息失败";
		}

		logger.info("修改项目信息成功");
		return "0";
	}
}

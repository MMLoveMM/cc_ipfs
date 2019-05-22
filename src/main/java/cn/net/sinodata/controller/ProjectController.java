package cn.net.sinodata.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;

import cn.net.sinodata.model.CustomerInfoExample;
import cn.net.sinodata.model.ProjectInfo;
import cn.net.sinodata.model.ProjectInfoExample;
import cn.net.sinodata.model.TDataDict;
import cn.net.sinodata.model.TDataDictExample;
import cn.net.sinodata.model.TOrgans;
import cn.net.sinodata.model.TOrgansExample;
import cn.net.sinodata.model.TUsers;
import cn.net.sinodata.service.CustomerInfoService;
import cn.net.sinodata.service.ProjectInfoService;
import cn.net.sinodata.service.TDataDictService;
import cn.net.sinodata.service.TOrgansService;
import cn.net.sinodata.util.StringUtil;
import cn.net.sinodata.util.UuidUtil;

@Controller
@RequestMapping(value = "/project")
public class ProjectController {
	private static final Logger logger = LoggerFactory.getLogger(ProjectController.class);

	@Autowired
	private TDataDictService tDataDictService;

	@Autowired
	private CustomerInfoService customerInfoService;

	@Autowired
	private TOrgansService tOrgansService;
	
	@Autowired
	private ProjectInfoService projectInfoService;

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
	    model.addAttribute("projectName", (this.customerInfoService.selectByExample(cusExample).get(0)).getCompanyname());

	    return "project/project_add";
	  }

	  @RequestMapping({"/add"})
	  @ResponseBody
	  public String addProjectInfo(ProjectInfo pInfo, String[] factoringGS, String evaluationGs, String guaranteeGs, String[] fundGS, String[] business)
	  {
	    TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
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
	    pInfo.setCustomerid((this.customerInfoService.selectByExample(cusExample).get(0)).getId());
	    pInfo.setProjectname((this.customerInfoService.selectByExample(cusExample).get(0)).getCompanyname());

	    int flag = this.projectInfoService.saveProjectInfo(pInfo, userId, sCIMap);
	    if (flag != 1) {
	      logger.info("保存项目信息失败");
	      return "保存项目信息失败";
	    }

	    logger.info("保存项目信息成功");
	    return "0";
	  }

	  @RequestMapping({"/list"})
	  public String toProjectList()
	  {
	    TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
	    logger.info("用户[{}] - 进入项目列表页面", user.getUserid());

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

	  @RequestMapping({"/toMod"})
	  public String toMod(String id, Model model) {
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

	    model.addAttribute("project", this.projectInfoService.selectByPrimaryKey(id));

	    return "project/project_mod";
	  }
}

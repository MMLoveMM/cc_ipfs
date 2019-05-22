package cn.net.sinodata.controller;

import cn.net.sinodata.model.*;
import cn.net.sinodata.service.CustomerInfoService;
import cn.net.sinodata.service.ProjectInfoService;
import cn.net.sinodata.service.ServiceCompanyInfoService;
import cn.net.sinodata.service.TOrgansService;
import cn.net.sinodata.util.DateUtil;
import cn.net.sinodata.util.JsonUtil;
import cn.net.sinodata.util.Result;
import cn.net.sinodata.util.StringUtil;
import com.github.pagehelper.PageInfo;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 融资需求Controller
 *
 * @author PangPj
 */
@Controller
@RequestMapping(value = "public/demand")
public class DemandController {
    private static final Logger logger = LoggerFactory.getLogger(DemandController.class);

    private final ProjectInfoService projectInfoService;

    private final ServiceCompanyInfoService serviceCompanyInfoService;

    private final TOrgansService tOrgansService;

    public DemandController(ProjectInfoService projectInfoService, ServiceCompanyInfoService serviceCompanyInfoService, TOrgansService tOrgansService) {
        this.projectInfoService = projectInfoService;
        this.serviceCompanyInfoService = serviceCompanyInfoService;
        this.tOrgansService = tOrgansService;
    }

    /**
     * 进入融资需求首页
     *
     * @return 融资需求首页地址
     */
    @RequestMapping(value = "index")
    public String toIndex(Model model) {
        logger.info("开始进入融资需求首页");

        logger.info("进入融资需求首页成功");
        return "demand/index";
    }

    /**
     * 获取融资需求列表数据
     *
     * @return 融资需求列表数据
     */
    @RequestMapping(value = "list")
    @ResponseBody
    public Result<Map<String, Object>> getList(int page, int pageSize, String companyName, String type) {
        logger.info("开始获取融资需求列表数据");
        Result<Map<String, Object>> result = new Result<>();

        ProjectInfoExample example = new ProjectInfoExample();
        ProjectInfoExample.Criteria criteria = example.createCriteria();
        if (StringUtil.isNotEmpty(companyName)) {
            criteria.andProjectnameLike("%" + companyName + "%");
        }

        if (StringUtil.isNotEmpty(type)) {
            criteria.andLoantypeEqualTo(type);
        }

        PageInfo<ProjectInfo> infoPage = projectInfoService.getProjectList(page, pageSize, example);

        if (infoPage == null || infoPage.getList() == null || infoPage.getList().isEmpty()) {
            logger.info("融资需求数据为空");
            return result.error("融资需求数据为空");
        }

        List<Map<String, Object>> rtnList = new ArrayList<>();
        List<ProjectInfo> projectInfoList = infoPage.getList();
        for (ProjectInfo projectInfo : projectInfoList) {
            Map<String, Object> map = new HashMap<>();
            map.put("id", projectInfo.getId());
            map.put("projectname", projectInfo.getProjectname());
            map.put("loantype", projectInfo.getLoantype());
            map.put("loanamt", projectInfo.getLoanamt() + " 万元");
            map.put("date", DateUtil.formatDate(projectInfo.getCreatetime(), "yyyy-MM-dd"));
            rtnList.add(map);
        }

        Map<String, Object> rtnMap = new HashMap<>();
        rtnMap.put("total", infoPage.getTotal());
        rtnMap.put("rows", rtnList);

        logger.info("获取融资需求列表数据成功");
        return result.success(rtnMap);
    }



    /**
     * 进入融资需求详情页
     *
     * @param projectId 项目id
     * @return  融资需求详情页地址
     */
    @RequestMapping(value = "/detail")
    public String toDetail(String projectId, Model model) {
        logger.info("参数 [{}] - 开始进入融资需求详情页", projectId);

        ProjectInfo projectInfo = projectInfoService.selectByPrimaryKey(projectId);

        ServiceCompanyInfoExample example = new ServiceCompanyInfoExample();
        ServiceCompanyInfoExample.Criteria criteria = example.createCriteria();
        criteria.andProjectInfoIdEqualTo(projectId);

        List<ServiceCompanyInfo> serviceCompanyInfos = serviceCompanyInfoService.selectByExample(example);

        StringBuilder db = new StringBuilder(), bl = new StringBuilder(), pg = new StringBuilder(), jj = new StringBuilder();

        for (ServiceCompanyInfo info : serviceCompanyInfos) {
            TOrgansExample tOrgansExample = new TOrgansExample();
            TOrgansExample.Criteria tCriteria = tOrgansExample.createCriteria();
            tCriteria.andOrgcodeEqualTo(info.getCompanyId());
            List<TOrgans> organsList = tOrgansService.selectByExample(tOrgansExample);
            TOrgans organs = new TOrgans();
            if (organsList != null && !organsList.isEmpty()) {
                organs = organsList.get(0);
            }
            if ("10".equalsIgnoreCase(info.getType())) {
                bl.append(organs.getOrgname() + "，");
            }else if ("11".equalsIgnoreCase(info.getType())) {
                pg.append(organs.getOrgname() + "，");
            }else if ("12".equalsIgnoreCase(info.getType())) {
                jj.append(organs.getOrgname() + "，");
            }else if ("13".equalsIgnoreCase(info.getType())) {
                db.append(organs.getOrgname() + "，");
            }
        }

        Map<String, String> rzMap = new HashMap<>();
        String dbStr = db.toString(), blStr = bl.toString(), pgStr = pg.toString(), jjStr = jj.toString();
        rzMap.put("db", StringUtil.isEmpty(dbStr) ? dbStr : dbStr.substring(0, dbStr.length() - 1));
        rzMap.put("bl", StringUtil.isEmpty(blStr) ? blStr : blStr.substring(0, blStr.length() - 1));
        rzMap.put("pg", StringUtil.isEmpty(pgStr) ? pgStr : pgStr.substring(0, pgStr.length() - 1));
        rzMap.put("jj", StringUtil.isEmpty(jjStr) ? jjStr : jjStr.substring(0, jjStr.length() - 1));

        model.addAttribute("projectInfo", projectInfo);
        model.addAttribute("rzMap", rzMap);

        logger.info("进入融资需求详情页成功");
        return "demand/detail";
    }
}

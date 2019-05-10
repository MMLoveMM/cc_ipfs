package cn.net.sinodata.controller;

import cn.net.sinodata.model.*;
import cn.net.sinodata.service.ProjectInfoService;
import cn.net.sinodata.service.ServiceCompanyInfoService;
import cn.net.sinodata.service.TOrgansService;
import cn.net.sinodata.util.DateUtil;
import cn.net.sinodata.util.JsonUtil;
import cn.net.sinodata.util.StringUtil;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 成功案例controller
 *
 * @author PangPj
 */
@Controller
@RequestMapping(value = "public/success")
public class SuccessController {
    private static final Logger logger = LoggerFactory.getLogger(SuccessController.class);

    @Autowired
    private ProjectInfoService projectInfoService;

    @Autowired
    private ServiceCompanyInfoService serviceCompanyInfoService;

    @Autowired
    private TOrgansService tOrgansService;

    /**
     * 进入成功案例首页
     *
     * @return 成功案例首页地址
     */
    @RequestMapping(value = "index")
    public String toIndex(Model model) {
        logger.info("开始进入成功案例首页");

        ProjectInfoExample example = new ProjectInfoExample();
        ProjectInfoExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo("2");

        List<ProjectInfo> projectInfoList = projectInfoService.selectByExample(example);

        if (projectInfoList.isEmpty()) {
            logger.info("融资需求数据为空");
            return "success/index";
        }

        List<Map<String, Object>> rtnMap = new ArrayList<>();
        for (ProjectInfo projectInfo : projectInfoList) {
            Map<String, Object> map = new HashMap<>();
            map.put("id", projectInfo.getId());
            map.put("projectName", projectInfo.getProjectname());
            map.put("createTime", DateUtil.formatDate(projectInfo.getCreatetime(), "yyyy-MM-dd"));
            rtnMap.add(map);
        }

        model.addAttribute("successList", JsonUtil.toJson(rtnMap));

        logger.info("进入成功案例首页成功");
        return "success/index";
    }

    /**
     * 进入成功案例详情页
     *
     * @param projectId 项目id
     * @return  成功案例详情页地址
     */
    @RequestMapping(value = "/detail")
    public String toDetail(String projectId, Model model) {
        logger.info("参数 [{}] - 开始进入成功案例详情页", projectId);

        ProjectInfo projectInfo = projectInfoService.selectByPrimaryKey(projectId);

        ServiceCompanyInfoExample example = new ServiceCompanyInfoExample();
        ServiceCompanyInfoExample.Criteria criteria = example.createCriteria();
        criteria.andProjectInfoIdEqualTo(projectId);

        List<ServiceCompanyInfo> serviceCompanyInfos = serviceCompanyInfoService.selectByExample(example);

        StringBuilder db = new StringBuilder(), bl = new StringBuilder(), pg = new StringBuilder(), jj = new StringBuilder();

        for (ServiceCompanyInfo info : serviceCompanyInfos) {
            if ("10".equalsIgnoreCase(info.getType())) {
                bl.append(tOrgansService.selectByPrimaryKey(info.getCompanyId()).getOrgname() + "，");
            }else if ("11".equalsIgnoreCase(info.getType())) {
                pg.append(tOrgansService.selectByPrimaryKey(info.getCompanyId()).getOrgname() + "，");
            }else if ("12".equalsIgnoreCase(info.getType())) {
                jj.append(tOrgansService.selectByPrimaryKey(info.getCompanyId()).getOrgname() + "，");
            }else if ("13".equalsIgnoreCase(info.getType())) {
                db.append(tOrgansService.selectByPrimaryKey(info.getCompanyId()).getOrgname() + "，");
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

        logger.info("进入成功案例详情页成功");
        return "success/detail";
    }
}

package cn.net.sinodata.controller;

import cn.net.sinodata.model.*;
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
 * 成功案例controller
 *
 * @author PangPj
 */
@Controller
@RequestMapping(value = "public/success")
public class SuccessController {
    private static final Logger logger = LoggerFactory.getLogger(SuccessController.class);

    private final ProjectInfoService projectInfoService;

    private final ServiceCompanyInfoService serviceCompanyInfoService;

    private final TOrgansService tOrgansService;

    public SuccessController(ProjectInfoService projectInfoService, ServiceCompanyInfoService serviceCompanyInfoService, TOrgansService tOrgansService) {
        this.projectInfoService = projectInfoService;
        this.serviceCompanyInfoService = serviceCompanyInfoService;
        this.tOrgansService = tOrgansService;
    }

    /**
     * 进入成功案例首页
     *
     * @return 成功案例首页地址
     */
    @RequestMapping(value = "index")
    public String toIndex(Model model) {
        logger.info("开始进入成功案例首页");

        logger.info("进入成功案例首页成功");
        return "success/index";
    }

    /**
     * 获取成功案例列表数据
     *
     * @return 成功案例列表数据
     */
    @RequestMapping(value = "list")
    @ResponseBody
    public Result<Map<String, Object>> getList(int page, int pageSize) {
        logger.info("开始获取成功案例列表数据");
        Result<Map<String, Object>> result = new Result<>();

        ProjectInfoExample example = new ProjectInfoExample();
        ProjectInfoExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo("2");

        PageInfo<ProjectInfo> infoPage = projectInfoService.getProjectList(page, pageSize, example);
        List<ProjectInfo> infoList = projectInfoService.selectByExample(example);
        List<ProjectInfo> initInfoList = new ArrayList<>();
        if (page > 1) {
            page = (page - 1) * pageSize;
        }else {
            page = 0;
        }

        int forFLag = 0;
        if (pageSize >= infoList.size()) {
            forFLag = infoList.size();
        }else if (pageSize <= infoList.size() - pageSize){
            forFLag = pageSize;
        }else {
            forFLag = infoList.size() - pageSize;
        }

        for (int i = 0; i < forFLag; i++) {
            initInfoList.add(infoList.get(page + i));
        }
        infoPage.setList(initInfoList);
        if (infoPage == null || infoPage.getList() == null || infoPage.getList().isEmpty()) {
            logger.info("融资需求数据为空");
            return result.error("融资需求数据为空");
        }

        List<Map<String, Object>> rtnList = new ArrayList<>();
        List<ProjectInfo> projectInfoList = infoPage.getList();
        for (ProjectInfo projectInfo : projectInfoList) {
            Map<String, Object> map = new HashMap<>();
            map.put("id", projectInfo.getId());
            map.put("projectName", projectInfo.getProjectname());
            map.put("createTime", DateUtil.formatDate(projectInfo.getCreatetime(), "yyyy-MM-dd"));
            rtnList.add(map);
        }

        Map<String, Object> rtnMap = new HashMap<>();
        rtnMap.put("total", infoPage.getTotal());
        rtnMap.put("rows", rtnList);

        logger.info("进入成功案例首页成功");
        return result.success(rtnMap);
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

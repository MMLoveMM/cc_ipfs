package cn.net.sinodata.controller;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.net.sinodata.model.TFunc;
import cn.net.sinodata.model.TUsers;
import cn.net.sinodata.service.TFuncService;


@Controller
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	private TFuncService tFuncService;
	
	@RequestMapping(value="/index")
	public String hello() {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 进入首页", user.getUserid());
		
		return "index";
	}
	
	@RequestMapping(value = "/menus", method = RequestMethod.POST)
	@ResponseBody
	public List<Map<String, Object>> getMenus() {
		Subject currentUser = SecurityUtils.getSubject();
		// 加载用户菜单信息
		TUsers user = (TUsers) currentUser.getPrincipal();
		List<TFunc> tFs = tFuncService.getResourcesByUserId(user.getId());
		List<Map<String, Object>> outMenus = new ArrayList<Map<String, Object>>();
		for (TFunc tF : tFs) {
			if (!TFunc.RESTYPE_MENU.equals(tF.getFtype())) {
				continue;
			}
			Map<String, Object> tFMap = new HashMap<String, Object>();
			tFMap.put("resid", tF.getId());
			tFMap.put("resname", tF.getFuncName());
			tFMap.put("restype", tF.getFtype());
			tFMap.put("resindex", tF.getFindex());
			tFMap.put("respid", tF.getFuncParentId());
			tFMap.put("permission", tF.getPermission());
			tFMap.put("url", tF.getUrl());
			tFMap.put("status", tF.getStatus());
			outMenus.add(tFMap);
		}
		return outMenus;
	}

}

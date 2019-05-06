package cn.net.sinodata.controller;

import java.util.ArrayList;
import java.util.Date;
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

import cn.net.sinodata.model.TDataDict;
import cn.net.sinodata.model.TDataDictExample;
import cn.net.sinodata.model.TUsers;
import cn.net.sinodata.service.TDataDictService;
import cn.net.sinodata.util.GlobalConfigVars;
import cn.net.sinodata.util.JsonUtil;
import cn.net.sinodata.util.StringUtil;
import cn.net.sinodata.util.UuidUtil;
import cn.net.sinodata.vo.Constant;

@Controller
@RequestMapping(value="/dict")
public class DictController {
	private static final Logger logger = LoggerFactory.getLogger(DictController.class);
	
	@Autowired
	private TDataDictService tDataDictService;
	
	/**
	 * 进入系统字典数据页面
	 * 
	 * @author Pangpj  2017年9月5日11:49:29
	 * @return
	 */
	@RequestMapping(value="/list")
	public String toDict(Model model) {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 进入系统字典数据页面", user.getUserid());
		
		List<TDataDict> dicts = GlobalConfigVars.dataDictTypeinfo;
		
		List<Map<String, Object>> dictList = new ArrayList<Map<String, Object>>();
		for(TDataDict dict : dicts) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("dcode", dict.getDcode());
			map.put("dname", dict.getDname());
			dictList.add(map);
		}
		
		model.addAttribute("dicts", dictList);
		model.addAttribute("dictList", JsonUtil.toJson(dictList));
		
		return "dict/dict_list";
	}
	
	/**
	 * 获取数据字典数据列表
	 * 
	 * @author Pangpj  2017-9-5 11:49:342
	 * @return
	 */
	@RequestMapping(value="/list/get")
	@ResponseBody
	public PageInfo<?> getDictList(@RequestParam(value="rows", required=false) int rows, 
			@RequestParam(value = "page", required=false) int page, TDataDict dict) {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始获取数据字典数据列表", user.getUserid());
		
		TDataDictExample example = new TDataDictExample();
		TDataDictExample.Criteria criteria = example.createCriteria();
		if(StringUtil.isNotEmpty(dict.getDictType())) {
			criteria.andDictTypeEqualTo(dict.getDictType());
		}
		
		example.setOrderByClause("ID DESC");
		
		PageInfo<?> pageInfo = tDataDictService.getDictList(page, rows, example);
		
		return pageInfo;
	}
	
	/**
	 * 开始添加数据字典
	 * 
	 * @author Pangpj 2017年9月12日10:34:53
	 * @param dict
	 * @return
	 */
	@RequestMapping(value = "/addDict")
	@ResponseBody
	public String addDict(TDataDict dict) {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始添加数据字典", user.getUserid());
		
		TDataDict tDDict = new TDataDict();
		tDDict.setId(UuidUtil.getUuid());
		tDDict.setCname(user.getName());
		tDDict.setCdate(new Date());
		
		if(StringUtil.isNotEmpty(dict.getDcode())) {
			tDDict.setDcode(dict.getDcode());
		}
		
		if(StringUtil.isNotEmpty(dict.getDname())) {
			tDDict.setDname(dict.getDname());
		}
		
		if(StringUtil.isNotEmpty(dict.getDictType())) {
			tDDict.setDictType(dict.getDictType());
		}
		
		if(StringUtil.isNotEmpty(dict.getStatus())) {
			tDDict.setStatus(dict.getStatus());
		}
		
		if(StringUtil.isNotEmpty(dict.getNote())) {
			tDDict.setNote(dict.getNote());
		}
		
		int flag = tDataDictService.insertSelective(tDDict);
		
		if(flag < 1) {
			logger.info("添加数据字典失败");
			return "添加失败";
		}
		
		logger.info("添加数据字典成功");
		return Constant.SUCCESS;
	}
	
	/**
	 * 开始删除数据字典
	 * 
	 * @author Pangpj 2017年9月12日10:35:08
	 * @param dictId
	 * @return
	 */
	@RequestMapping(value = "/delDict")
	@ResponseBody
	public String delDict(String dictId) {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始删除数据字典", user.getUserid());
		
		if(StringUtil.isEmpty(dictId)) {
			logger.info("获取数据字典ID为空");
			return "删除失败";
		}
		
		int flag = tDataDictService.deleteByPrimaryKey(dictId);
		
		if(flag < 1) {
			logger.info("删除数据字典失败");
			return "删除失败";
		}
		
		logger.info("删除数据字典成功");
		return Constant.SUCCESS;
	}
	
	/**
	 * 根据id获取数据字典
	 * 
	 * @author Pangpj 2017年9月12日10:35:13
	 * @param dictId
	 * @return
	 */
	@RequestMapping(value = "/getModDict")
	@ResponseBody
	public TDataDict getModDict (String dictId) {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始根据id获取数据字典", user.getUserid());
		
		TDataDict dict = tDataDictService.selectByPrimaryKey(dictId);
		
		logger.info("根据id获取数据字典完成");
		return dict;
	}
	
	/**
	 * 开始修改数据字典
	 * 
	 * @author Pangpj 2017年9月12日10:35:33
	 * @param dict
	 * @return
	 */
	@RequestMapping(value = "/modDict")
	@ResponseBody
	public String modDict(TDataDict dict) {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始修改数据字典", user.getUserid());
		
		TDataDict tDDict = new TDataDict();
		tDDict.setUdate(new Date());
		tDDict.setUname(user.getName());
		
		if(StringUtil.isNotEmpty(dict.getId())) {
			tDDict.setId(dict.getId());
		}
		
		if(StringUtil.isNotEmpty(dict.getDcode())) {
			tDDict.setDcode(dict.getDcode());
		}
		
		if(StringUtil.isNotEmpty(dict.getDname())) {
			tDDict.setDname(dict.getDname());
		}
		
		if(StringUtil.isNotEmpty(dict.getDictType())) {
			tDDict.setDictType(dict.getDictType());
		}
		
		if(StringUtil.isNotEmpty(dict.getStatus())) {
			tDDict.setStatus(dict.getStatus());
		}
		
		if(StringUtil.isNotEmpty(dict.getNote())) {
			tDDict.setNote(dict.getNote());
		}
		
		int flag = tDataDictService.updateByPrimaryKeySelective(tDDict);
	
		if(flag < 1) {
			logger.info("修改数据字典失败");
			return "修改失败";
		}
		
		logger.info("修改数据字典成功");
		return Constant.SUCCESS;
	}
	
}

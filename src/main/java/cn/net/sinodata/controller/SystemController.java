package cn.net.sinodata.controller;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import cn.net.sinodata.model.*;
import cn.net.sinodata.service.*;
import cn.net.sinodata.util.*;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;

import cn.net.sinodata.vo.Constant;
import cn.net.sinodata.vo.TApplicationLogVo;


@Controller
@RequestMapping(value = "/system")
public class SystemController {
	private static final Logger logger = LoggerFactory
			.getLogger(SystemController.class);

	private TFuncService  tFuncService;
	
	private TApplicationLogService tApplicationLogService;
	
	private TOrgansService tOrgansService;
	
	private TDataDictService tDataDictService;
	
	private TUsersService tUsersService;
	
	private TSystemService tSystemService;
	
	private TUserRoleService tUserRoleService;
	
	private TRoleFuncService tRoleFuncService;
	
	private TRolesService tRolesService;

	private NewsService newsService;

	@Autowired
	public SystemController(TOrgansService tOrgansService, TDataDictService
			tDataDictService, TUsersService tUsersService,
			TSystemService tSystemService, TUserRoleService tUserRoleService,
			TRoleFuncService tRoleFuncService, TRolesService tRolesService,
			TFuncService tFuncService, TApplicationLogService tApplicationLogService,
			NewsService newsService) {
		this.tOrgansService = tOrgansService;
		this.tDataDictService = tDataDictService;
		this.tUsersService = tUsersService;
		this.tSystemService = tSystemService;
		this.tUserRoleService = tUserRoleService;
		this.tRoleFuncService = tRoleFuncService;
		this.tRolesService = tRolesService;
		this.tFuncService = tFuncService;
		this.tApplicationLogService = tApplicationLogService;
		this.newsService = newsService;
	}

	/**
	 * 进入系统管理页面
	 * 
	 * @author xuj 2017年9月12日09:33:39
	 * @return
	 */
	@RequestMapping(value = "/resources/list")
	public String toResources(Model model) {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 进入系统管理页面", user.getUserid());
		
		TFuncExample example = new TFuncExample();
		TFuncExample.Criteria criteria = example.createCriteria();
		
		criteria.andFuncParentIdEqualTo("0");
		
		List<TFunc> tfuncs = tFuncService.selectByExample(example);
		
		model.addAttribute("tfuncs", tfuncs);
		
		model.addAttribute("funcParentName", JsonUtil.toJson(tfuncs));
		
		return "system/system_list";
	}
	
	/**
	 * 获取功能菜单列表
	 * @param rows
	 * @param page
	 * @author xuj
	 * @return
	 */
	@RequestMapping(value ="/resources/list/get" )
	@ResponseBody
	public PageInfo<?> getFuncList(@RequestParam(value="rows", required=false) int rows, 
			@RequestParam(value = "page", required=false) int page){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始获取功能菜单列表", user.getUserid());
		
		return tFuncService.getFuncList(page, rows, new TFuncExample());
	}
	
	/**
	 * 添加功能菜单
	 * @author xuj
	 * @param tfunc
	 * @return
	 */
	@RequestMapping(value="/resources/addFunc")
	@ResponseBody
	public String addFunc(TFunc tfunc ){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始添加功能菜单列表", user.getUserid());
		
		TFunc tfuncc = new TFunc();
		tfuncc.setId(UuidUtil.getUuid());
		tfuncc.setPermission("**"+tfunc.getUrl());
		tfuncc.setStatus("1");
		tfuncc.setCname(user.getName());
		tfuncc.setCdate(new Date());
		
		if(StringUtil.isNotEmpty(tfunc.getFuncName())){
			tfuncc.setFuncName(tfunc.getFuncName());
		}
		
		if(StringUtil.isNotEmpty(tfunc.getUrl())){
			tfuncc.setUrl(tfunc.getUrl());
		}
		
		
		if(StringUtil.isNotEmpty(tfunc.getFindex())){
			tfuncc.setFindex(tfunc.getFindex());
		}
		
		if(StringUtil.isNotEmpty(tfunc.getFuncParentId())){
			tfuncc.setFuncParentId(tfunc.getFuncParentId());
		}
		
		if(StringUtil.isNotEmpty(tfunc.getFtype())){
			tfuncc.setFtype(tfunc.getFtype());
		}
		
		int flag = tFuncService.insertSelective(tfuncc);
		
		if(flag < 1) {
			logger.info("添加功能菜单失败");
			return "添加失败";
		}
		
		logger.info("添加功能菜单成功");
		return Constant.SUCCESS;
		
	}
	/**
	 * 根据id获取功能菜单
	 * @param tfuncId
	 * @return
	 * @author xuj
	 */
	@RequestMapping(value = "/resources/getModFunc")
	@ResponseBody
	public TFunc getModFunc (String tfuncId) {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始根据id获取功能菜单", user.getUserid());
		
		TFunc tfunc = tFuncService.selectByPrimaryKey(tfuncId);
		
		logger.info("根据id获取功能菜单完成");
		return tfunc;
	}
	
	/**
	 * 开始修改功能菜单
	 * @param tfunc
	 * @return
	 * @author xuj
	 */
	@RequestMapping(value = "/resources/modFunc")
	@ResponseBody
	public String ModFunc(TFunc tfunc){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始修改功能菜单", user.getUserid());
		
		tfunc.setUdate(new Date());
		tfunc.setUname(user.getName());
		
		int flag = tFuncService.updateByPrimaryKeySelective(tfunc);
	
		if(flag < 1) {
			logger.info("修改功能菜单失败");
			return "修改失败";
		}
		
		logger.info("修改功能菜单成功");
		return Constant.SUCCESS;
	}
	
	/**
	 * 删除功能菜单
	 * @author xuj
	 * @param tfuncId
	 * @return
	 */
	
	@RequestMapping(value = "/resources/delFunc")
	@ResponseBody
	public String delFunc(String tfuncId){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始删除数据字典", user.getUserid());
		
		if(StringUtil.isEmpty(tfuncId)) {
			logger.info("获取功能菜单ID为空");
			return "删除失败";
		}
		
		int flag = tFuncService.deleteByPrimaryKey(tfuncId);
		
		if(flag < 1) {
			logger.info("删除功能菜单失败");
			return "删除失败";
		}
		
		logger.info("删除功能菜单成功");
		return Constant.SUCCESS;
	}
	
	
	/**
	 * 跳转到登录报表页面
	 * 
	 * @author Pangpj 2017年9月18日09:53:21
	 * @return
	 */
	@RequestMapping(value = "/loginReport/list")
	public String toLoginReport() {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始跳转到登录报表页面", user.getUserid());
		
		return "system/login_report_list";
	}
	
	/**
	 * 获取登录报表列表数据
	 * 
	 * @author Pangpj 2017年9月18日09:53:15
	 * @return
	 */
	@RequestMapping(value = "/loginReport/list/get")
	@ResponseBody
	public PageInfo<?> getLoginReportList(@RequestParam(value="rows", required=false) int rows, 
			@RequestParam(value = "page", required=false) int page, TApplicationLogVo tALVo, 
			String startDate, String endDate) {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始获取登录报表数据", user.getUserid());
		
		TApplicationLogExample example = new TApplicationLogExample();
		TApplicationLogExample.Criteria criteria = example.createCriteria();
		
		if(StringUtil.isNotEmpty(startDate)) {
			criteria.andOpedateGreaterThanOrEqualTo(DateUtil.formatDate(startDate));
		}
		
		if(StringUtil.isNotEmpty(endDate)) {
			criteria.andOpedateLessThanOrEqualTo(DateUtil.formatDate(endDate));
		}
		
		if(StringUtil.isNotEmpty(startDate) && StringUtil.isNotEmpty(endDate)) {
			criteria.andOpedateBetween(DateUtil.formatDate(startDate), DateUtil.formatDate(endDate));
		}
		
		if(StringUtil.isNotEmpty(tALVo.getOpeperson())) {
			criteria.andOpepersonEqualTo(tALVo.getOpeperson());
		}
		
		example.setOrderByClause("OPEDATE DESC");

		return tApplicationLogService.getLoginReportList(page, rows, example);
	}
	
	/**
	 * 将数据存入excel
	 * 
	 * @author Pangpj	2017年9月18日16:54:22
	 * @param request
	 * @param startDate
	 * @param endDate
	 * @param tALVo
	 * @return
	 */
	@RequestMapping(value = "/loginReport/setLogExcel")
	@ResponseBody
	public Map<String, Object> setLogExctl(HttpServletRequest request, String startDate, String endDate,
			TApplicationLogVo tALVo) {
		
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始将数据存入excel", user.getUserid());
		
		//用于存储返回数据
		Map<String, Object> fileData = new HashMap<String, Object>();
		
		//表头
		String[] header = {"登录名", "用户姓名", "公司", "登录次数"};
		
		//用于获取表格相符数据
		String[] keys = {"opeperson", "opename", "orgname", "count"};
		
		//文件名称
		String fileName = UUID.randomUUID().toString().replaceAll("-", "");
		
		//生成文件地址
		String path = request.getSession().getServletContext().getRealPath("/") + "WEB-INF/template/t_application_log";
		
		//标题
		String title = "登录信息";
		
		//二级标题
		String secTitle = user.getId() + " - " + DateUtil.formatDate(new Date(), "yyyy年MM月dd日 HH时mm分ss秒");
		
		
		TApplicationLogExample example = new TApplicationLogExample();
		TApplicationLogExample.Criteria criteria = example.createCriteria();
		
		if(StringUtil.isNotEmpty(startDate)) {
			criteria.andOpedateGreaterThanOrEqualTo(DateUtil.formatDate(startDate));
		}
		
		if(StringUtil.isNotEmpty(endDate)) {
			criteria.andOpedateLessThanOrEqualTo(DateUtil.formatDate(endDate));
		}
		
		if(StringUtil.isNotEmpty(startDate) && StringUtil.isNotEmpty(endDate)) {
			criteria.andOpedateBetween(DateUtil.formatDate(startDate), DateUtil.formatDate(endDate));
		}
		
		if(StringUtil.isNotEmpty(tALVo.getOpeperson())) {
			criteria.andOpepersonEqualTo(tALVo.getOpeperson());
		}
		
		List<TApplicationLogVo> tApplicationLogs = tApplicationLogService.selectTApplicationLogVOByExample(example);
		
		if(tApplicationLogs.isEmpty()) {
			logger.info("存入excel失败");
			fileData.put("msg", "数据为空");
			fileData.put("name", "");
			return fileData;
		}
		
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
		
		for(TApplicationLogVo tL : tApplicationLogs) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put(keys[0], StringUtil.isNotEmpty(tL.getOpeperson()) ? tL.getOpeperson() : "");
			map.put(keys[1], StringUtil.isNotEmpty(tL.getOpename()) ? tL.getOpename() : "");
			map.put(keys[2], StringUtil.isNotEmpty(tL.getOrgname()) ? tL.getOrgname() : "");
			map.put(keys[3], StringUtil.isNotEmpty(tL.getCount()) ? tL.getCount() : "");
			data.add(map);
		}
		
		ExcelUtil.setListMapToExcel(path, fileName, title, secTitle, header, keys, data);

		logger.info("存入excel成功");
		fileData.put("msg", "0");
		fileData.put("name", fileName);
		return fileData;
	}
	
	/**
	 * 导出文件
	 * 
	 * @author Pangpj 2017年9月18日17:04:30
	 * @param name	文件名称
	 * @param reauest
	 * @return
	 */
	@RequestMapping(value="/loginReport/downLogExcel")
	public ResponseEntity<byte[]> downLogFile(HttpServletRequest request, String fileName){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 进入导出文件",user.getUserid());
		logger.info("文件名称 - [{}]",fileName);
		//生成文件地址
		String path = request.getSession().getServletContext().getRealPath("/") + "WEB-INF/template/t_application_log" + File.separator  + fileName + ".xls";
		try{
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);  
	        ByteArrayOutputStream bos = new ByteArrayOutputStream(1000);  
	        byte[] b = new byte[1000];  
	        int n;  
	        while ((n = fis.read(b)) != -1) {  
	            bos.write(b, 0, n);  
	        }  
	        fis.close();  
	        bos.close();
	        byte[] publickey = bos.toByteArray();
			HttpHeaders headers = new HttpHeaders();    
			String outFileName = "登录信息.xls";
			String dfileName = new String(outFileName.getBytes("gb2312"), "iso8859-1");
			headers.setContentDispositionFormData("attachment", dfileName);   
			logger.info("导出成功");
			file.delete();
			return new ResponseEntity<byte[]>(publickey, headers, HttpStatus.OK);
		} catch (FileNotFoundException e) {  
	        e.printStackTrace();  
	    } catch (IOException e) {  
	        e.printStackTrace();  
	    }
		return null;
	}
	
	/**
	 * 进入删除excel文件
	 * 
	 * @author Pangpj 2017年9月18日17:05:23
	 * @param request
	 * @param name
	 * @return
	 */
	@RequestMapping(value = "/loginReport/deleteLogExcel")
	@ResponseBody
	public String deleteLogExcel(HttpServletRequest request, String fileName) {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 进入删除excel文件", user.getUserid());
		logger.info("删除文件名为 - [{}]", fileName);
		
		String path = request.getSession().getServletContext().getRealPath("/") + "WEB-INF/template/t_application_log" + File.separator  + fileName  + ".xls";
		
		File file = new File(path);
		
		file.delete();
		logger.info("删除文件成功");
		return Constant.SUCCESS;
	}
	
	/**
	 * 获取登录报表详情分页数据
	 * @return
	 */
	@RequestMapping(value = "/loginReport/list/getDetails")
	@ResponseBody
	public PageInfo<?> getApplicationLogAllPage(@RequestParam(value="rows", required=false) int rows, 
			@RequestParam(value = "page", required=false) int page, String opeperson) {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始获取登录报表详情分页数据", user.getUserid());
		
		TApplicationLogExample example = new TApplicationLogExample();
		TApplicationLogExample.Criteria criteria = example.createCriteria();
		
		if(StringUtil.isNotEmpty(opeperson)) {
			criteria.andOpepersonEqualTo(opeperson);
		}
		
		example.setOrderByClause("OPEDATE DESC");
		
		List<TApplicationLog> tApplicationLogs = tApplicationLogService.selectByExample(example);
		
		PageInfo<TApplicationLog> pageInfo = new PageInfo<TApplicationLog>();
		pageInfo.setList(tApplicationLogs);
		
		return pageInfo;
	}
	
	/**
	 * 将数据存入excel
	 * 
	 * @author Pangpj	2017年9月18日16:54:22
	 * @param request
	 * @param startDate
	 * @param endDate
	 * @param tALVo
	 * @return
	 */
	@RequestMapping(value = "/loginReport/setLogDetailsExcel")
	@ResponseBody
	public Map<String, Object> setLogDetailsExctl(HttpServletRequest request, String opeperson) {
		
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始将数据存入excel", user.getUserid());
		
		//用于存储返回数据
		Map<String, Object> fileData = new HashMap<String, Object>();
		
		//表头
		String[] header = {"登录名", "用户姓名", "登录时间", "登录IP"};
		
		//用于获取表格相符数据
		String[] keys = {"opeperson", "opename", "opedate", "ip"};
		
		//文件名称
		String fileName = UUID.randomUUID().toString().replaceAll("-", "");
		
		//生成文件地址
		String path = request.getSession().getServletContext().getRealPath("/") + "WEB-INF/template/t_application_log";
		
		//标题
		String title = "登录详情";
		
		//二级标题
		String secTitle = user.getId() + " - " + DateUtil.formatDate(new Date(), "yyyy年MM月dd日 HH时mm分ss秒");
		
		
		TApplicationLogExample example = new TApplicationLogExample();
		TApplicationLogExample.Criteria criteria = example.createCriteria();
		
		if(StringUtil.isNotEmpty(opeperson)) {
			criteria.andOpepersonEqualTo(opeperson);
		}
		
		List<TApplicationLog> tApplicationLogs = tApplicationLogService.selectByExample(example);
		
		if(tApplicationLogs.isEmpty()) {
			logger.info("存入excel失败");
			fileData.put("msg", "数据为空");
			fileData.put("name", "");
			return fileData;
		}
		
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
		
		for(TApplicationLog tL : tApplicationLogs) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put(keys[0], StringUtil.isNotEmpty(tL.getOpeperson()) ? tL.getOpeperson() : "");
			map.put(keys[1], StringUtil.isNotEmpty(tL.getOpename()) ? tL.getOpename() : "");
			map.put(keys[2], DateUtil.formatDate(tL.getOpedate(), "yyyy-MM-dd HH:mm:ss"));
			map.put(keys[3], StringUtil.isNotEmpty(tL.getIp()) ? tL.getIp() : "");
			data.add(map);
		}
		
		ExcelUtil.setListMapToExcel(path, fileName, title, secTitle, header, keys, data);

		logger.info("存入excel成功");
		fileData.put("msg", "0");
		fileData.put("name", fileName);
		return fileData;
	}
	
	/**
	 * 导出文件
	 * 
	 * @author Pangpj 2017年9月18日17:04:30
	 * @param name	文件名称
	 * @param reauest
	 * @return
	 */
	@RequestMapping(value="/loginReport/downLogDetailsExcel")
	public ResponseEntity<byte[]> downLogDetailsFile(HttpServletRequest request, String fileName){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 进入导出文件",user.getUserid());
		logger.info("文件名称 - [{}]",fileName);
		//生成文件地址
		String path = request.getSession().getServletContext().getRealPath("/") + "WEB-INF/template/t_application_log" + File.separator  + fileName + ".xls";
		try{
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);  
	        ByteArrayOutputStream bos = new ByteArrayOutputStream(1000);  
	        byte[] b = new byte[1000];  
	        int n;  
	        while ((n = fis.read(b)) != -1) {  
	            bos.write(b, 0, n);  
	        }  
	        fis.close();  
	        bos.close();
	        byte[] publickey = bos.toByteArray();
			HttpHeaders headers = new HttpHeaders();    
			String outFileName = "登录信息详情.xls";
			String dfileName = new String(outFileName.getBytes("gb2312"), "iso8859-1");
			headers.setContentDispositionFormData("attachment", dfileName);   
			logger.info("导出成功");
			file.delete();
			return new ResponseEntity<byte[]>(publickey, headers, HttpStatus.OK);
		} catch (FileNotFoundException e) {  
	        e.printStackTrace();  
	    } catch (IOException e) {  
	        e.printStackTrace();  
	    }
		return null;
	}
	
	/**
	 * 进入删除excel文件
	 * 
	 * @author Pangpj 2017年9月18日17:05:23
	 * @param request
	 * @param name
	 * @return
	 */
	@RequestMapping(value = "/loginReport/deleteLogDetailsExcel")
	@ResponseBody
	public String deleteLogDetailsExcel(HttpServletRequest request, String fileName) {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 进入删除excel文件", user.getUserid());
		logger.info("删除文件名为 - [{}]", fileName);
		
		String path = request.getSession().getServletContext().getRealPath("/") + "WEB-INF/template/t_application_log" + File.separator  + fileName  + ".xls";
		
		File file = new File(path);
		
		file.delete();
		logger.info("删除文件成功");
		return Constant.SUCCESS;
	}
	
	@RequestMapping({"/user/list"})
	  public String toUserList(Model model)
	  {
	    TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
	    logger.info("用户[{}] - 进入用户信息管理页面", user.getUserid());

	    TOrgansExample example = new TOrgansExample();
	    TOrgansExample.Criteria criteria = example.createCriteria();
	    criteria.andPidNotEqualTo("0");
	    List tOrgans = this.tOrgansService.selectByExample(example);
	    model.addAttribute("tOrgans", tOrgans);

	    return "system/user_list";
	  }

	  @RequestMapping({"/user/list/get"})
	  @ResponseBody
	  public PageInfo<?> getUserList(@RequestParam(value="rows") int rows, @RequestParam(value="page") int page)
	  {
	    TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
	    logger.info("用户[{}] - 进入获取用户信息管理列表数据", user.getUserid());
	    logger.info("请求参数为:rows : [{}], page : [{}]", rows, page);

	    PageInfo pageInfo = this.tUsersService.getAllUsers(page, rows, new TUsersExample());
	    return pageInfo;
	  }

	  @RequestMapping({"/user/addUser"})
	  @ResponseBody
	  public String addUser(TUsers tUsers, String newEffectDate)
	  {
	    TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
	    logger.info("用户[{}] - 进入添加用户", user.getUserid());

	    tUsers.setId(UuidUtil.getUuid());
	    tUsers.setPassword(PwdUtil.getPwd(tUsers.getPassword()));
	    tUsers.setEffectDate(DateUtil.formatDate(newEffectDate));
	    tUsers.setCname(user.getId());
	    tUsers.setCdate(new Date());
	    tUsers.setStatus("0");

	    int flag = this.tUsersService.insertSelective(tUsers);

	    if (flag < 1) {
	      logger.info("添加用户失败");
	      return "添加用户失败";
	    }

	    logger.info("添加用户成功");
	    return "0";
	  }

	  @RequestMapping({"/user/modUser"})
	  @ResponseBody
	  public String modUser(TUsers tUsers, String newEffectDate)
	  {
	    TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
	    logger.info("用户[{}] - 开始修改用户信息", user.getUserid());

	    tUsers.setEffectDate(DateUtil.formatDate(newEffectDate));
	    tUsers.setUname(user.getUserid());
	    tUsers.setUdate(new Date());

	    int flag = this.tUsersService.updateByPrimaryKeySelective(tUsers);

	    if (flag < 1) {
	      logger.info("修改用户信息失败");
	      return "修改用户信息失败";
	    }

	    logger.info("修改用户信息成功");
	    return "0";
	  }

	  @RequestMapping({"/user/delUser"})
	  @ResponseBody
	  public String delUser(String userId)
	  {
	    TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
	    logger.info("用户[{}] - 开始删除用户", user.getUserid());

	    int flag = this.tUsersService.deleteByPrimaryKey(userId);

	    if (flag < 1) {
	      logger.info("删除用户信息失败");
	      return "删除用户信息失败";
	    }

	    logger.info("删除用户信息成功");
	    return "0";
	  }

	  @RequestMapping({"/user/modStatus"})
	  @ResponseBody
	  public String modStatus(String id, String status)
	  {
	    TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
	    logger.info("用户[{}] - 开始修改用户状态", user.getUserid());
	    logger.info("请求参数为 : id : [{}], status : [{}]", id, status);

	    TUsers tUsers = new TUsers();
	    tUsers.setId(id);
	    tUsers.setStatus(status);
	    tUsers.setUdate(new Date());
	    tUsers.setUname(user.getUserid());

	    if (this.tUsersService.updateByPrimaryKeySelective(tUsers) < 1) {
	      logger.info("修改用户状态失败");
	      return "修改用户状态失败";
	    }

	    logger.info("修改用户状态成功");
	    return "0";
	  }

	  @RequestMapping({"/user/resetUserPassword"})
	  @ResponseBody
	  public String resetUserPassword(String id)
	  {
	    TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
	    logger.info("用户[{}] - 开始重置用户密码", user.getUserid());
	    logger.info("请求参数为 : id : [{}]", id);

	    TUsers tUsers = new TUsers();
	    tUsers.setId(id);
	    tUsers.setPassword(PwdUtil.getPwd("123456"));

	    if (this.tUsersService.updateByPrimaryKeySelective(tUsers) < 1) {
	      logger.info("重置用户密码失败");
	      return "重置用户密码失败";
	    }

	    logger.info("重置用户密码成功");
	    return "0";
	  }

	  @RequestMapping({"/user/getRoleCheckbox"})
	  @ResponseBody
	  public List<Map<String, Object>> getRoleCheckbox(String id)
	  {
	    TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
	    logger.info("用户[{}] - 开始获取角色列表", user.getUserid());
	    tUserRoleExample example = new tUserRoleExample();
	    tUserRoleExample.Criteria criteria = example.createCriteria();
	    criteria.andUserIdEqualTo(id);
	    List<tUserRoleKey> tUserRoleList = this.tUserRoleService.selectByExample(example);
	    List<TRoles> tRolesList = this.tRolesService.selectByExample(new TRolesExample());

	    String roleIds = "";
	    tUserRoleKey userRole;
	    for (tUserRoleKey tUserRole :  tUserRoleList) { 
	    	userRole = (tUserRoleKey)tUserRole;
	    	roleIds = roleIds + userRole.getRoleId() + ",";
	    }
	    
	    Object newTRolesList = new ArrayList();

	    for (TRoles role : tRolesList) {
	      Map map = new HashMap();
	      map.put("id", role.getId());
	      map.put("name", role.getName());
	      if (roleIds.contains(role.getId()))
	        map.put("check", Boolean.valueOf(true));
	      else {
	        map.put("check", Boolean.valueOf(false));
	      }
	      ((List)newTRolesList).add(map);
	    }

	    return (List<Map<String, Object>>)newTRolesList;
	  }

	  @RequestMapping({"/user/addUsersRoles"})
	  @ResponseBody
	  public String addUsersRoles(@RequestParam("roleCheck") String[] roleCheck, String addUserId)
	  {
	    TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
	    logger.info("用户[{}] - 开始添加用户角色", user.getId());

	    if (roleCheck == null) {
	      logger.info("请至少选择一个角色");
	      return "请至少选择一个角色";
	    }

	    tUserRoleExample userRoleExample = new tUserRoleExample();
	    tUserRoleExample.Criteria userRoleCriteria = userRoleExample.createCriteria();
	    userRoleCriteria.andUserIdEqualTo(addUserId);
	    this.tUserRoleService.deleteByExample(userRoleExample);

	    for (int i = 0; i < roleCheck.length; i++) {
	      tUserRoleKey key = new tUserRoleKey();
	      key.setUserId(addUserId);
	      key.setRoleId(roleCheck[i]);
	      int flag = this.tUserRoleService.insertSelective(key);
	      if (flag < 1) {
	        logger.info("添加用户角色失败");
	        return "添加用户角色失败";
	      }
	    }

	    logger.info("添加用户角色成功");
	    return "0";
	  }
	
	/**
	 * 进入机构管理页面
	 * @author licc
	 */
	@RequestMapping(value = "/organs/list")
	public String  toOrgansList(Model model){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 进入机构管理页面", user.getUserid());
		
		TOrgansExample example = new TOrgansExample();
		TOrgansExample.Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo("01");
		
		List<TOrgans> tOrgans = tOrgansService.selectByExample(example);
		TDataDictExample tDataDictExample = new TDataDictExample();
		
		List<TDataDict> dicts = tDataDictService.selectByExample(tDataDictExample);
		model.addAttribute("dictList1",JsonUtil.toJson(dicts));
		model.addAttribute("orgmap1", JsonUtil.toJson(tOrgans));
		model.addAttribute("dictList",dicts);
		model.addAttribute("orgmap", tOrgans);
		return "/system/organs_list";
	}
	
	/**
	 * 生成机构信息树
	 * @author licc
	 */
	@RequestMapping(value = "/organs/list/get")
	@ResponseBody
	public String getOrgans(Model model){
		TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 获取机构信息树信息", user.getUserid());
		
		TOrgansExample example = new TOrgansExample();
		TOrgansExample.Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo("01");
		List<TOrgans> tOrgans = tOrgansService.selectByExample(example);
		List<Map<String, Object>> orgmap = new ArrayList<Map<String, Object>>();
		for(TOrgans tOrgans2 : tOrgans){
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("id", tOrgans2.getId());
			map.put("pId", tOrgans2.getPid());
			map.put("name", tOrgans2.getOrgname());
			orgmap.add(map);
		}
		
		return JsonUtil.toJson(orgmap);
	}
	
	/**
	 * 增加机构信息
	 * @author licc
	 */
	@RequestMapping(value = "/organs/add")
	@ResponseBody
	public String addOrgansMess(TOrgans tOrgans){
		TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 增加机构信息", user.getUserid());
		
		tOrgans.setId(UuidUtil.getUuid());
		tOrgans.setCdate(new Date());
		tOrgans.setStatus("01");
		tOrgans.setCname(user.getUserid());
		TOrgansExample example = new TOrgansExample();
		TOrgansExample.Criteria criteria = example.createCriteria();
		criteria.andOrgnameEqualTo(tOrgans.getOrgname());
		if(!tOrgansService.selectByExample(example).isEmpty()){
			logger.info("机构名称已存在");
			return "机构名称已存在";
		}
		TOrgansExample exampleOrgCode = new TOrgansExample();
		TOrgansExample.Criteria criteriaOrgCode = exampleOrgCode.createCriteria();
		criteriaOrgCode.andOrgcodeEqualTo(tOrgans.getOrgcode());
		if(!tOrgansService.selectByExample(exampleOrgCode).isEmpty()){
			logger.info("机构号已存在");
			return "机构号已存在";
		}
		if(tOrgans.getPid().isEmpty()){
			tOrgans.setOrgLevel("1");
		}else{
			TOrgans tOrgans2 = tOrgansService.selectByPrimaryKey(tOrgans.getPid());
			tOrgans.setOrgLevel(String.valueOf(Integer.valueOf(tOrgans2.getOrgLevel())+1));
		}
		int flag = tOrgansService.insertSelective(tOrgans);
		if(flag < 1){
			logger.info("添加机构信息失败");
			return "添加机构信息失败";
		}
		logger.info("添加机构信息成功");
		return Constant.SUCCESS;
	}
	
	/**
	 * 获取机构信息
	 * @author licc
	 */
	@RequestMapping(value = "/organs/list/query")
	@ResponseBody
	public TOrgans getOrgansMess(String orgId){
		TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 根据ID获取机构信息", user.getUserid());
		
		TOrgans tOrgans = tOrgansService.selectByPrimaryKey(orgId);
		return tOrgans;
	}
	
	/**
	 * 修改机构信息
	 * @author licc
	 */
	@RequestMapping(value = "/organs/mod")
	@ResponseBody
	public String mod(TOrgans tOrgans){
		TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 修改机构信息", user.getUserid());
		
		String id = tOrgans.getId();
		tOrgans.setUdate(new Date());
		tOrgans.setUname(user.getUserid());
		TOrgansExample example = new TOrgansExample();
		TOrgansExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		
		TOrgansExample example1 = new TOrgansExample();
		TOrgansExample.Criteria criteria1 = example1.createCriteria();
		criteria1.andIdNotEqualTo(id);
		criteria1.andOrgnameEqualTo(tOrgans.getOrgname());
		if(!tOrgansService.selectByExample(example1).isEmpty()){
			logger.info("机构名称已存在");
			return "机构名称已存在";
		}
		TOrgansExample exampleCode = new TOrgansExample();
		TOrgansExample.Criteria criteriaCode = exampleCode.createCriteria();
		criteriaCode.andIdNotEqualTo(id);
		criteriaCode.andOrgcodeEqualTo(tOrgans.getOrgcode());
		if(!tOrgansService.selectByExample(exampleCode).isEmpty()){
			logger.info("机构号已存在");
			return "机构号已存在";
		}
		int flag = tOrgansService.updateByExampleSelective(tOrgans, example);
		if(flag < 1){
			logger.info("修改机构信息失败");
			return "修改机构信息失败";
		}
		if(("02").equals(tOrgans.getStatus()) || "02" == tOrgans.getStatus()){
			TUsers tUsers = new TUsers();
			tUsers.setStatus("02");
			TUsersExample example2 = new TUsersExample();
			TUsersExample.Criteria criteria2 = example2.createCriteria();
			criteria2.andOrgansidEqualTo(tOrgans.getId());
			if(!tUsersService.selectByExample(example2).isEmpty()){
				tUsersService.updateByExampleSelective(tUsers, example2);
			}
			
			TOrgansExample example3 = new TOrgansExample();
			TOrgansExample.Criteria criteria3 = example3.createCriteria();
			criteria3.andPidEqualTo(tOrgans.getId());
			TOrgans tOrgan = new TOrgans();
			tOrgan.setStatus("02");
			tOrgansService.updateByExampleSelective(tOrgan, example3);
			List<TOrgans> tOrgans2 = tOrgansService.selectByExample(example3);
			TUsersExample exampleT = new TUsersExample();
			TUsersExample.Criteria criteriaT = exampleT.createCriteria();
			if(!tOrgans2.isEmpty()){
				for(TOrgans tOrgans3 : tOrgans2){
					criteriaT.andOrgansidEqualTo(tOrgans3.getId());
					if(!tUsersService.selectByExample(exampleT).isEmpty()){
						tUsersService.updateByExampleSelective(tUsers, exampleT);
					}
				}
			}
		}
		logger.info("修改机构信息成功");
		return Constant.SUCCESS;
	}
	
	/**
	 * 删除机构信息
	 * @author licc
	 */
	@RequestMapping(value = "/organs/del")
	@ResponseBody
	public String del(String id){
		TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 删除机构信息", user.getUserid());
		
		TUsersExample example = new TUsersExample();
		TUsersExample.Criteria criteria = example.createCriteria();
		criteria.andOrgansidEqualTo(id);
		criteria.andUseridNotEqualTo("jinan_admin");
		if(!tUsersService.selectByExample(example).isEmpty()){
			logger.info("该机构下有人员不能删除");
			return "该机构下有人员不能删除";
		}
		int flag = tOrgansService.deleteByPrimaryKey(id);
		if(flag < 1){
			logger.info("删除机构信息失败");
			return "删除机构信息失败";
		}
		logger.info("删除机构信息成功");
		return Constant.SUCCESS;
	}
	
	/**
	 * 跳转至角色管理页面
	 * @author xuj
	 * @return
	 */
	@RequestMapping(value="/roleManagement/list")
	public String toRole(Model model){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 进入角色管理页面", user.getUserid());
		
		//子系统表
		List<TSystem> tsystems = tSystemService.selectByExample(new TSystemExample());
		model.addAttribute("tsystems", tsystems);
		
		//获取数据字典
		TDataDictExample example = new TDataDictExample();
		TDataDictExample.Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo("1");
		criteria.andDcodeNotEqualTo("01");
		List<TDataDict> dataDicts = tDataDictService.selectByExample(example);
		model.addAttribute("dataDicts", dataDicts);
		
		return "system/role_management_list";
	}
	
	/**
	 * 查询角色管理信息
	 * @param rows
	 * @param page
	 * @author xuj
	 * @return
	 */
	@RequestMapping(value ="/roleManagement/list/get" )
	@ResponseBody
	public PageInfo<?> getRoleList(@RequestParam(value="rows", required=false) int rows, 
			@RequestParam(value = "page", required=false) int page,String name ,String sysName){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始查询角色管理列表", user.getUserid());
		
		TRolesExample example = new TRolesExample();
		TRolesExample.Criteria criteria = example.createCriteria();
		if(StringUtil.isNotEmpty(name)){
			criteria.andNameEqualTo(name);
		}
		
		if(StringUtil.isNotEmpty(sysName)){
			criteria.andSysidEqualTo(sysName);
		}
		
		example.setOrderByClause("CDATE DESC");
		return tRolesService.getRoleList(page, rows, example);
	}
	
	/**
	 * 添加角色信息
	 * @author xuj 
	 * @param tRoles
	 * @return
	 */
	@RequestMapping(value ="/roleManagement/addRole" )
	@ResponseBody
	public Map<String, Object> addRole(TRoles tRoles){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始添加角色", user.getUserid());
		
		Map<String, Object> map = new HashMap<>();
		TRolesExample  example  = new TRolesExample();
		List<TRoles> rolesList = tRolesService.selectByExample(example);
		if(!rolesList.isEmpty()){
			for(TRoles role : rolesList){
				if(role.getName().equals(tRoles.getName())){
					logger.info("角色名称已存在!");
					map.put("msg", 1);
					return map;
				}
			}
		}
		tRoles.setCdate(new Date());
		tRoles.setCname(user.getName());
		tRoles.setId(UuidUtil.getUuid());
		tRoles.setStatus("01");//默认状态为01
		tRoles.setSysid("3");
		
		int flag = tRolesService.insertSelective(tRoles);
		if(flag < 1 ){
			logger.info("添加角色信息失败!");
			map.put("res", 1);
			return map;
		}
		map.put("res", Constant.SUCCESS);
		return map;
	}
	
	/**
	 * 根据id获取角色信息
	 * @author xuj 
	 * @param tRoles
	 * @return
	 */
	@RequestMapping(value ="/roleManagement/getModRole" )
	@ResponseBody
	public TRoles getModRoles(String roleId){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 根据id获取角色信息", user.getUserid());
		
		return tRolesService.selectByPrimaryKey(roleId);
	}
	
	/**
	 * 修改角色信息
	 * @author xuj
	 * @param tRoles
	 * @param roleId
	 * @return
	 */
	@RequestMapping(value ="/roleManagement/modRole" )
	@ResponseBody
	public Map<String, Object> modRole(TRoles tRoles){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始修改角色信息", user.getUserid());
		
		Map<String, Object> map = new HashMap<>();
		TRolesExample  example  = new TRolesExample();
		List<TRoles> rolesList = tRolesService.selectByExample(example);
		if(!rolesList.isEmpty()){
			for(TRoles role : rolesList){
				if(role.getName().equals(tRoles.getName()) 
						&& !role.getId() .equals( tRoles.getId())){
					logger.info("角色名称已存在!");
					map.put("msg", 1);
					return map;
				}
			}
		}
		tRoles.setUdate(new Date());
		tRoles.setUname(user.getName());
		int flag = tRolesService.updateByPrimaryKeySelective(tRoles);
		
		if(flag < 1 ){
			logger.info("修改角色信息失败!");
			map.put("res", 1);
			return map;
		}
		map.put("res", Constant.SUCCESS);
		return map;
	}
	
	/**
	 * 删除角色信息
	 * 
	 * @author xuj
	 * @param roleId
	 * @return
	 */
	@RequestMapping(value = "/roleManagement/delRole")
	@ResponseBody
	public Map<String, Object> delDict(String roleId) {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始删除角色信息", user.getUserid());
		Map<String , Object> resMap = new HashMap<>();
		
		if(StringUtil.isEmpty(roleId)) {
			logger.info("获取角色ID为空,删除失败");
			resMap.put("res", 1);
			return resMap;
		}
		tUserRoleExample example = new tUserRoleExample();
		tUserRoleExample.Criteria criteria = example.createCriteria();
		criteria.andRoleIdEqualTo(roleId);
		
		List<tUserRoleKey> userRole =  tUserRoleService.selectByExample(example);
		
		if(!userRole.isEmpty()){
			logger.info("角色信息已被使用,未能删除");
			resMap.put("msg", 1);
			return resMap;
		}else{
			int flag = tRolesService.deleteByPrimaryKey(roleId);
			if(flag < 1) {
				logger.info("删除角色失败");
				resMap.put("res", 1);
				return resMap;
			}
		}
		
		logger.info("删除角色成功");
		resMap.put("res", Constant.SUCCESS);
		return resMap;
	}
	
	/**
	 * 显示分配人员树形图
	 * @author xuj
	 * @return
	 */
	@RequestMapping(value = "/roleManagement/showZtree")
	@ResponseBody
	public String zTreeShow (){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 获取分配人员信息", user.getUserid());
		
		List<Map<String, Object>> zTreeJson = new ArrayList<Map<String, Object>>();
		List<TOrgans>  tOrgansList = tOrgansService.selectByExample(new TOrgansExample());
		if(!tOrgansList.isEmpty()){
			for(TOrgans organ : tOrgansList){
				Map<String, Object> ZTreeNotes = new HashMap<String, Object>();
				ZTreeNotes.put("id", organ.getId());
				ZTreeNotes.put("pId", organ.getPid());
				ZTreeNotes.put("name", organ.getOrgname());
				zTreeJson.add(ZTreeNotes);
			}
		}
		
		return JsonUtil.toJson(zTreeJson);
	}
	
	/**
	 * 根据roleId获取用户信息
	 * @author xuj
	 * @return
	 */
	@RequestMapping(value = "/roleManagement/showUserInfo")
	@ResponseBody
	public String getUserbyRoleId (String roleId){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 根据roleId获取角色下的用户信息", user.getUserid());
		
		tUserRoleExample  example = new tUserRoleExample();
		tUserRoleExample.Criteria criteria = example.createCriteria();
		criteria.andRoleIdEqualTo(roleId);
		List<tUserRoleKey> userRoleList = tUserRoleService.selectByExample(example);
		List<Map<String, Object>>  jsonMap  = new ArrayList<>();
		if(!userRoleList.isEmpty()){
			for(tUserRoleKey userRole : userRoleList ){
				Map<String, Object> map = new HashMap<>();
				map.put("userId", userRole.getUserId());
				jsonMap.add(map);
			}
		}
		return JsonUtil.toJson(jsonMap);
	}
	
	/**
	 * 分配角色
	 * @author xuj
	 * @return
	 */
	@RequestMapping(value = "/roleManagement/assignUser")
	@ResponseBody
	public String assignUser (String roleId,String userId){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始分配角色信息", user.getUserid());
		
		TRoles role = tRolesService.selectByPrimaryKey(roleId);
		if(role != null && StringUtil.isNotEmpty(role.getRtype())){
			if("01".equals(role.getRtype())){
				int tUserRoleFlag = tUserRoleService.addUserRole(roleId, userId);
				if(tUserRoleFlag < 1){
					logger.info("保存用户角色信息失败");
					return "分配角色失败";
				}
				logger.info("分配角色成功");
				return Constant.SUCCESS;
			}
		}
		logger.info("分配角色失败");
		return "分配角色失败";
	}
	
	/**
	 * 显示分配功能树形图
	 * @author xuj
	 * @return
	 */
	@RequestMapping(value = "/roleManagement/showFunZtree")
	@ResponseBody
	public String zTreeFunShow (){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 获取分配功能信息", user.getUserid());
		
		List<Map<String, Object>> zTreeJson = new ArrayList<>();
		List<TFunc> tFuncs = tFuncService.selectByExample(new TFuncExample());
		if(!tFuncs.isEmpty()){
			for(TFunc tFunc : tFuncs){
				Map<String, Object> zTreeNotes = new HashMap<>();
				zTreeNotes.put("id", tFunc.getId());
				zTreeNotes.put("pId", tFunc.getFuncParentId());
				zTreeNotes.put("name", tFunc.getFuncName());
				zTreeJson.add(zTreeNotes);
			}
			
		}
		return JsonUtil.toJson(zTreeJson);
	}
	
	
	/**
	 * 根据roleId获取菜单信息
	 * @author xuj
	 * @return
	 */
	@RequestMapping(value = "/roleManagement/showRoleFunInfo")
	@ResponseBody
	public String getFunbyRoleId (String roleId){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 根据roleId获取角色下的菜单信息", user.getUserid());
		
		tRoleFuncExample example = new tRoleFuncExample();
		tRoleFuncExample.Criteria criteria = example.createCriteria();
		criteria.andRoleidEqualTo(roleId);
		
		List<tRoleFuncKey> roleFuncList = tRoleFuncService.selectByExample(example);
		List<Map<String, Object>>  jsonMap  = new ArrayList<>();
		if(!roleFuncList.isEmpty()){
			for(tRoleFuncKey roleFun : roleFuncList){
				TFunc  tfunc = tFuncService.selectByPrimaryKey(roleFun.getResourcesid());
				Map<String, Object> map = new HashMap<>();
				//不是根目录
				if(!"0".equals(tfunc.getFuncParentId())){
					map.put("funId", roleFun.getResourcesid());
					jsonMap.add(map);
				}
			}
		}
		
		return JsonUtil.toJson(jsonMap);
	}
	

	/**
	 * 分配功能
	 * @author xuj
	 * @return
	 */
	@RequestMapping(value = "/roleManagement/assignFun")
	@ResponseBody
	public String assignFun (String roleId,String funId){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始进入分配功能", user.getUserid());
		
		tRoleFuncExample example = new tRoleFuncExample();
		tRoleFuncExample.Criteria criteria = example.createCriteria();
		criteria.andRoleidEqualTo(roleId);
		
		List<tRoleFuncKey> tRoleFuncList  = tRoleFuncService.selectByExample(example);
		if(!tRoleFuncList.isEmpty() ){
			//删除角色功能关联信息
			tRoleFuncService.deleteByExample(example);
		}
		if(StringUtil.isNotEmpty(funId)){
			String[] funIds = funId.split(",");
			for (int i = 0; i < funIds.length; i++) {
				// 保存菜单ID、角色ID
				tRoleFuncKey roleFunc = new tRoleFuncKey();
				roleFunc.setRoleid(roleId);
				roleFunc.setResourcesid(funIds[i]);
				int flag = tRoleFuncService.insertSelective(roleFunc);
				if(flag < 1){
					logger.info("保存角色菜单失败");
					return "分配功能失败";
				}
			}
		}
		logger.info("分配功能成功");
		return Constant.SUCCESS;
		
	}

	/**
	 * 进入资讯列表页面
	 *
	 * @return 资讯列表页面地址
	 */
	@RequestMapping(value = "news/list")
	public String toList() {
		TUsers tUsers = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户 [{}] - 开始进入资讯列表页面", tUsers.getId());

		logger.info("进入资讯列表页面成功");
		return "news/news_list";
	}

	/**
	 * 获取资讯列表分页数据
	 *
	 * @return  资讯列表分页数据
	 */
	@RequestMapping(value = "news/list/get")
	@ResponseBody
	public PageInfo<?> getListData(@RequestParam int page, @RequestParam int rows, News news) {
		TUsers tUsers = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户 [{}] - 开始获取资讯列表分页数据", tUsers.getId());
		page = PageUtil.getPage(page, rows);

		logger.info("获取资讯列表分页数据成功");
		return newsService.getNewsPage(page, rows, news);
	}

	/**
	 * 新增资讯
	 *
	 * @param news	新增资讯数据
	 * @return	是否新增成功
	 */
	@RequestMapping(value = "news/add")
	@ResponseBody
	public String addNews(News news) {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户 [{}] - 开始添加资讯数据", user.getUserid());

		news.setId(UuidUtil.getUuid());
		news.setCreateDate(new Date());
		news.setUpdateDate(new Date());
		newsService.addNews(news);

		return Constant.SUCCESS;
	}

	/**
	 * 修改资讯
	 *
	 * @param news	需要修改的资讯数据
	 * @return	是否修改成功
	 */
	@RequestMapping(value = "news/mod")
	@ResponseBody
	public String modNews(News news) {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户 [{}] - 开始修改资讯数据", user.getUserid());

		news.setUpdateDate(new Date());
		newsService.modNews(news);

		logger.info("修改资讯数据成功");
		return Constant.SUCCESS;
	}

	/**
	 * 删除资讯
	 * @param id	资讯id
	 * @return	是否删除成功
	 */
	@RequestMapping(value = "news/del")
	@ResponseBody
	public String delNews(@RequestParam String id) {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户 [{}] - 开始删除资讯数据", user.getUserid());

		int delFlag = newsService.delNews(id);

		if (delFlag != 1) {
			logger.info("删除资讯数据失败");
			return "删除资讯数据失败";
		}

		logger.info("删除资讯数据成功");
		return Constant.SUCCESS;
	}
}

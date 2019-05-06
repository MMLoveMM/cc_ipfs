package cn.net.sinodata.controller;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
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

import cn.net.sinodata.model.AnnexDocsExample;
import cn.net.sinodata.model.AssetInfosExample;
import cn.net.sinodata.model.AuxiliaryContactExample;
import cn.net.sinodata.model.CustomerInfo;
import cn.net.sinodata.model.CustomerInfoExample;
import cn.net.sinodata.model.LiabilitiesInfosExample;
import cn.net.sinodata.model.PerCustomerInfo;
import cn.net.sinodata.model.PerCustomerInfoExample;
import cn.net.sinodata.model.ProjectInfo;
import cn.net.sinodata.model.ProjectInfoExample;
import cn.net.sinodata.model.TDataDict;
import cn.net.sinodata.model.TDataDictExample;
import cn.net.sinodata.model.TUsers;
import cn.net.sinodata.service.AnnexDocsService;
import cn.net.sinodata.service.AssetInfosService;
import cn.net.sinodata.service.AuxiliaryContactService;
import cn.net.sinodata.service.CustomerInfoService;
import cn.net.sinodata.service.LiabilitiesInfosService;
import cn.net.sinodata.service.PerCustomerInfoService;
import cn.net.sinodata.service.ProjectInfoService;
import cn.net.sinodata.service.TDataDictService;
import cn.net.sinodata.util.DateUtil;
import cn.net.sinodata.util.ExcelUtil;
import cn.net.sinodata.util.JsonUtil;
import cn.net.sinodata.util.StringUtil;
import cn.net.sinodata.vo.Constant;
import cn.net.sinodata.vo.PerCustomerInfoVo;

/**
 * 统计报表
 * @author Pangpj
 *
 */
@Controller
@RequestMapping(value = "/report")
public class ReportController {

private static final Logger logger = LoggerFactory.getLogger(ReportController.class);
	
	@Autowired
	private CustomerInfoService customerInfoService;
	
	@Autowired
	private PerCustomerInfoService perCustomerInfoService;
	
	@Autowired
	private ProjectInfoService projectInfoService;
	
	@Autowired
	private TDataDictService tDataDictService;
	
	@Autowired
	private AssetInfosService assetInfosService;
	
	@Autowired
	private LiabilitiesInfosService liabilitiesInfosService;
	
	@Autowired
	private AnnexDocsService annexDocsService;
	
	@Autowired
	private AuxiliaryContactService auxiliaryContactService;
	
	
	/**
	 * 企业客户基本信息页面
	 * 
	 * @author licc	2017年9月12日 
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/company/list")
	public String toCompany() {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 进入企业用户基本信息页面", user.getUserid());
		
		return "report/company_list";
	}
	
	/**
	 * 获取企业客户基本信息数据
	 * 
	 * @author licc  2017年9月12日 
	 * @return
	 * @throws ParseException 
	 */
	@RequestMapping(value="/company/list/get")
	@ResponseBody
	public PageInfo<?> getCompanyList(@RequestParam(value="rows", required=false) int rows, 
			@RequestParam(value = "page", required=false) int page ,String startDate,String endDate) throws ParseException {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始获取企业客户基本信息数据", user.getUserid());
		
		CustomerInfoExample example = new CustomerInfoExample();
		CustomerInfoExample.Criteria criteria = example.createCriteria();
		
		if(StringUtils.isNotEmpty(startDate)) {
			criteria.andCreateTimeGreaterThanOrEqualTo(DateUtil.formatDate(startDate));
		}
		
		if(StringUtils.isNotEmpty(endDate)) {
			criteria.andCreateTimeLessThanOrEqualTo(DateUtil.formatDate(endDate));
		}
		
		if(StringUtils.isNotEmpty(startDate) && StringUtils.isNotEmpty(endDate)){
				Date startTime = DateUtil.formatDate(startDate);
				Date endTime = DateUtil.formatDate(endDate);
				criteria.andCreateTimeBetween(startTime, endTime);
		}
		example.setOrderByClause("ID DESC");
		
		PageInfo<?> pageInfo = customerInfoService.getCustomerList(page, rows, example);
		
		return pageInfo;
	}
	
	/**
	 * 将企业客户基本信息数据存入excel
	 * 
	 * @author licc 2017年9月14日11:52:41
	 * @param request
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	@RequestMapping(value = "/company/setExcel")
	@ResponseBody
	public Map<String, Object> setCompanyExctl(HttpServletRequest request, String startDate, String endDate) {
		
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始将企业客户基本信息数据存入excel", user.getUserid());
		
		//用于存储返回数据
		Map<String, Object> fileData = new HashMap<String, Object>();
		
		//表头
		String[] header = {"客户编号", "企业名称", "成立时间", "注册资本", "实到资本", 
				"企业类型", "行业类型", "内外部标识", "类别划分", 
				"是否高新技术企业", "主营业务", "法定代表人", "实际控制人", 
				"联系人姓名", "职务", "联系电话", "手机号码", "传真", "电子邮箱"};
		
		//用于获取表格相符数据
		String[] keys = {"companynum", "companyname", "createtime", "registeredcapital", "practicalcapital", 
				"companytype", "businesstype", "mark", "area", 
				"ishighindustry", "mainbusiness", "comanylegalperson", "buicontrolperson", 
				"refereename", "post", "contactnumber", "phonenumber", "fax", "email"};
		
		//文件名称
		String fileName = UUID.randomUUID().toString().replaceAll("-", "");
		
		//生成文件地址
		String path = request.getSession().getServletContext().getRealPath("/") + "WEB-INF/template/customer_info";
		
		//标题
		String title = "企业客户基本信息";
		
		//二级标题
		String secTitle = user.getId() + " - " + DateUtil.formatDate(new Date(), "yyyy年MM月dd日 HH时mm分ss秒");
		
		CustomerInfoExample example = new CustomerInfoExample();
		CustomerInfoExample.Criteria criteria = example.createCriteria();
		
		if(StringUtils.isNotEmpty(startDate)) {
			criteria.andCreateTimeGreaterThanOrEqualTo(DateUtil.formatDate(startDate));
		}
		
		if(StringUtils.isNotEmpty(endDate)) {
			criteria.andCreateTimeLessThanOrEqualTo(DateUtil.formatDate(endDate));
		}
		
		if(StringUtils.isNotEmpty(startDate) && StringUtils.isNotEmpty(endDate)){
				Date startTime = DateUtil.formatDate(startDate);
				Date endTime = DateUtil.formatDate(endDate);
				criteria.andCreateTimeBetween(startTime, endTime);
		}
		
		List<CustomerInfo> customerInfos = customerInfoService.selectByExample(example);
		
		if(customerInfos.isEmpty()) {
			logger.info("存入excel失败");
			fileData.put("msg", "数据为空");
			fileData.put("name", "");
			return fileData;
		}
		
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
		
		for(CustomerInfo cI : customerInfos) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put(keys[0], StringUtil.isNotEmpty(cI.getCompanynum()) ? cI.getCompanynum() : "");
			map.put(keys[1], StringUtil.isNotEmpty(cI.getCompanyname()) ? cI.getCompanyname() : "");
			map.put(keys[2], DateUtil.formatDate(cI.getCreateTime(), "yyyy-MM-dd HH:mm:ss"));
			map.put(keys[3], StringUtil.isNotEmpty(cI.getRegisteredcapital()) ? cI.getRegisteredcapital() : "");
			map.put(keys[4], StringUtil.isNotEmpty(cI.getPracticalcapital()) ? cI.getPracticalcapital() : "");
			map.put(keys[5], StringUtil.isNotEmpty(cI.getCompanytype()) ? cI.getCompanytype() : "");
			map.put(keys[6], StringUtil.isNotEmpty(cI.getBusinesstype()) ? cI.getBusinesstype() : "");
			map.put(keys[7], StringUtil.isNotEmpty(cI.getMark()) ? cI.getMark() : "");
			map.put(keys[8], StringUtil.isNotEmpty(cI.getArea()) ? cI.getArea() : "");
	        map.put(keys[9], StringUtil.isNotEmpty(cI.getIshighindustry()) ? cI.getIshighindustry() : "");
	        map.put(keys[10], StringUtil.isNotEmpty(cI.getMainbusiness()) ? cI.getMainbusiness() : "");
	        map.put(keys[11], StringUtil.isNotEmpty(cI.getComanylegalperson()) ? cI.getComanylegalperson() : "");
	        map.put(keys[12], StringUtil.isNotEmpty(cI.getBuicontrolperson()) ? cI.getBuicontrolperson() : "");
			map.put(keys[13], StringUtil.isNotEmpty(cI.getRefereename()) ? cI.getRefereename() : "");
			map.put(keys[14], StringUtil.isNotEmpty(cI.getPost()) ? cI.getPost() : "");
			map.put(keys[15], StringUtil.isNotEmpty(cI.getContactnumber()) ? cI.getContactnumber() : "");
			map.put(keys[16], StringUtil.isNotEmpty(cI.getPhonenumber()) ? cI.getPhonenumber() : "");
			map.put(keys[17], StringUtil.isNotEmpty(cI.getFax()) ? cI.getFax() : "");
			map.put(keys[18], StringUtil.isNotEmpty(cI.getEmail()) ? cI.getEmail() : "");
			data.add(map);
		}
		
		ExcelUtil.setListMapToExcel(path, fileName, title, secTitle, header, keys, data);

		logger.info("存入excel成功");
		fileData.put("msg", "0");
		fileData.put("name", fileName);
		return fileData;
	}
	
	/**
	 * 导出企业客户基本信息数据文件
	 * 
	 * @author licc 2017年9月14日10:55:47
	 * @param name	文件名称
	 * @param reauest
	 * @return
	 */
	@RequestMapping(value="/company/downExcel")
	public ResponseEntity<byte[]> downCompanyFile(HttpServletRequest request, String fileName){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 进入导出企业客户基本信息数据文件",user.getUserid());
		logger.info("文件名称 - [{}]",fileName);
		//生成文件地址
		String path = request.getSession().getServletContext().getRealPath("/") + "WEB-INF/template/customer_info" + File.separator  + fileName + ".xls";
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
			String outFileName = "企业客户基本信息.xls";
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
	 * 企业客户基本信息删除excel文件
	 * 
	 * @author licc 2017年9月14日11:01:41
	 * @param request
	 * @param name
	 * @return
	 */
	@RequestMapping(value = "/company/deleteExcel")
	@ResponseBody
	public String deleteCompanyExcel(HttpServletRequest request, String fileName) {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 进入企业客户基本信息删除excel文件", user.getUserid());
		logger.info("删除文件名为 - [{}]", fileName);
		
		String path = request.getSession().getServletContext().getRealPath("/") + "WEB-INF/template/customer_info" + File.separator  + fileName  + ".xls";
		
		File file = new File(path);
		
		file.delete();
		logger.info("删除文件成功");
		return Constant.SUCCESS;
	}
	
	/**
	 * 个人客户基本信息页面
	 * 
	 * @author xujing 2017年9月12日09:33:39
	 * @return
	 */
	@RequestMapping(value = "/customer/list")
	public String toCustomerInfo() {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始进入个人客户基本信息页面", user.getUserid());
		return "report/customer_list";
	}

	/**
	 * 获取个人客户基本信息数据
	 * 
	 * @author xujing 2017年9月12日09:33:39
	 * @return
	 * @throws ParseException 
	 */
	@RequestMapping(value = "/customer/list/get")
	@ResponseBody
	public PageInfo<?> getCustomerInfo(
			@RequestParam(value = "rows", required = false) int rows,
			@RequestParam(value = "page", required = false) int page,
			PerCustomerInfo info, String startDate, String endDate) throws ParseException {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始获取个人客户基本信息数据", user.getUserid());

		PerCustomerInfoExample example = new PerCustomerInfoExample();
		PerCustomerInfoExample.Criteria criteria = example.createCriteria();
		
		if(StringUtils.isNotEmpty(startDate)) {
			criteria.andCreatetimeGreaterThanOrEqualTo(DateUtil.formatDate(startDate));
		}
		
		if(StringUtils.isNotEmpty(endDate)) {
			criteria.andCreatetimeLessThanOrEqualTo(DateUtil.formatDate(endDate));
		}
		
		if(StringUtils.isNotEmpty(startDate) && StringUtils.isNotEmpty(endDate)){
				Date startTime = DateUtil.formatDate(startDate);
				Date endTime = DateUtil.formatDate(endDate);
				criteria.andCreatetimeBetween(startTime, endTime);
		}
		example.setOrderByClause("CREATETIME DESC");
		PageInfo<?> pageInfo = perCustomerInfoService.getCustomerInfo(page,rows,example);
		return pageInfo;
	}
	
	/**
	 * 跳转到项目融资信息页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/project/list")
	public String toProject(Model model) {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 跳转到项目融资信息页面", user.getUserid());
		return "report/project_list";
	}
	/**
	 * 获取项目融资信息列表数据
	 * 
	 * @author licc  2017年9月18日15:10:16
	 * @return
	 * @throws ParseException 
	 */
	
	@RequestMapping(value = "/project/list/get")
	@ResponseBody
	public PageInfo<?> getProjectList(@RequestParam(value="rows", required=false) int rows, 
			@RequestParam(value = "page", required=false) int page ,String startDate,String endDate){
		TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始获取项目融资信息列表数据", user.getUserid());
		
		ProjectInfoExample example = new ProjectInfoExample();
		ProjectInfoExample.Criteria criteria = example.createCriteria();
		
		if(StringUtil.isNotEmpty(startDate)){
			criteria.andCreatetimeGreaterThanOrEqualTo(DateUtil.formatDate(startDate));
		}
		if(StringUtil.isNotEmpty(endDate)){
			criteria.andCreatetimeGreaterThanOrEqualTo(DateUtil.formatDate(endDate));
		}
		
		if(StringUtil.isNotEmpty(startDate) && StringUtil.isNotEmpty(endDate)){
			Date startTime = DateUtil.formatDate(startDate);
			Date endTime = DateUtil.formatDate(endDate);
			criteria.andCreatetimeBetween(startTime, endTime);
		}
		
		example.setOrderByClause("ID DESC");
		
		PageInfo<?> pageInfo = projectInfoService.getProjectList(page, rows, example);
		
		return pageInfo;
	}
	
	/**
	 * 将项目融资信息数据存入excel
	 * 
	 * @author licc 2017年9月18日16:43:45
	 * @param request
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	@RequestMapping(value = "/project/setExcel")
	@ResponseBody
	public Map<String, Object> setProjectExctl(HttpServletRequest request, String startDate, String endDate){
		TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始将项目融资信息数据存入Excel", user.getUserid());
		
		//用于存储返回数据
		Map<String,Object> fileData = new HashMap<String,Object>();
		
		//表头
		String[] header = {"项目编号", "项目名称", "融资金额", "融资期限", "融资类型", "已融额度",
				"费率", "只是产权类型"};
		
		//用于获取表格相符数据
		String[] keys = {
				"projectnum", "projectname", "loanamt", "loandeadline", "loantype", "hasloanamt",
				"rate","inteprotype"};
		
		//文件名称
		String fileName = UUID.randomUUID().toString().replaceAll("-","");
		
		//生成文件地址
		String path = request.getSession().getServletContext().getRealPath("/") + "WEB-INF/template/project_info";
		
		//标题
		String title = "项目融资信息";
		
		//二级标题
		String secTitle = user.getId() + " - " + DateUtil.formatDate(new Date(), "yyyy年MM月dd日 HH时mm分ss秒");
		
		ProjectInfoExample example = new ProjectInfoExample();
		ProjectInfoExample.Criteria criteria = example.createCriteria();
		
		if(StringUtil.isNotEmpty(startDate)){
			criteria.andCreatetimeGreaterThanOrEqualTo(DateUtil.formatDate(startDate));
		}
		
		if(StringUtil.isNotEmpty(endDate)){
			criteria.andCreatetimeGreaterThanOrEqualTo(DateUtil.formatDate(endDate));
		}
		
		if(StringUtil.isNotEmpty(startDate) && StringUtil.isNotEmpty(endDate)){
			Date startTime = DateUtil.formatDate(startDate);
			Date endTime = DateUtil.formatDate(endDate);
			criteria.andCreatetimeBetween(startTime, endTime);
		}
		
		example.setOrderByClause("ID DESC");
		
		List<ProjectInfo> projectInfos = projectInfoService.selectByExample(example);
		if(projectInfos.isEmpty()){
			logger.info("存入excel失败");
			fileData.put("msg", "数据为空");
			fileData.put("name", "");
			return fileData;
		}
		
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
		for(ProjectInfo pI : projectInfos){
			Map<String, Object> map = new HashMap<String, Object>();
			map.put(keys[0], StringUtil.isNotEmpty(pI.getProjectnum()) ? pI.getProjectnum() : "");
			map.put(keys[1], StringUtil.isNotEmpty(pI.getProjectname()) ? pI.getProjectname() : "");
			map.put(keys[2], StringUtil.isNotEmpty(pI.getLoanamt()) ? pI.getLoanamt() : "");
			map.put(keys[3], StringUtil.isNotEmpty(pI.getLoandeadline()) ? pI.getLoandeadline() : "");
			map.put(keys[4], StringUtil.isNotEmpty(pI.getLoantype()) ? pI.getLoantype() : "");
			map.put(keys[5], StringUtil.isNotEmpty(pI.getHasloanamt()) ? pI.getHasloanamt() : "");
			map.put(keys[6], StringUtil.isNotEmpty(pI.getRate()) ? pI.getRate() : "");
			map.put(keys[7], StringUtil.isNotEmpty(pI.getInteprotype()) ? pI.getInteprotype() : "");
			data.add(map);
		}
		
		ExcelUtil.setListMapToExcel(path, fileName, title, secTitle, header, keys, data);
		
		logger.info("存入excel成功");
		fileData.put("msg", "0");
		fileData.put("name", fileName);
		return fileData;
	}
	
	/**
	 * 导出项目融资信息文件
	 * 
	 * @author licc 2017年9月18日17:13:26
	 * @param name	文件名称
	 * @param reauest
	 * @return
	 */
	@RequestMapping(value = "/project/downExcel")
	public ResponseEntity<byte[]> downProjectFile(HttpServletRequest request, String fileName){
		TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 进入导出项目融资信息文件", user.getUserid());
		logger.info("文件名称-[{}]",fileName);
		
		//生成文件地址
		String path = request.getSession().getServletContext().getRealPath("/") + "WEB-INF/template/project_info" + File.separator  + fileName + ".xls";
		try{
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			ByteArrayOutputStream bos = new ByteArrayOutputStream(1000);
			byte[] b = new byte[1000];
			int n;
			while((n = fis.read(b)) != -1){
				bos.write(b, 0, n);
			}
			fis.close();
			bos.close();
			byte[] publickey = bos.toByteArray();
			HttpHeaders headers = new HttpHeaders();
			String outFileName = "项目融资信息.xls";
			String dfileName = new String(outFileName.getBytes("gb2312"), "iso8859-1");
			headers.setContentDispositionFormData("attachment", dfileName);
			logger.info("导出成功");
			file.delete();
			return new ResponseEntity<byte[]>(publickey, headers, HttpStatus.OK);
		}catch (FileNotFoundException e) {
			 e.printStackTrace();  
	    } catch (IOException e) {  
	        e.printStackTrace();  
		}
		return null;
	}
	
	/**
	 * 删除项目融资信息excel文件
	 * 
	 * @author licc 2017年9月18日17:26:40
	 * @param request
	 * @param name
	 * @return
	 */
	@RequestMapping(value = "/project/deleteExcel")
	@ResponseBody
	public String deleteProjectExcel(HttpServletRequest request, String fileName) {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 进入删除项目融资信息excel文件", user.getUserid());
		logger.info("删除文件名为 - [{}]", fileName);
		
		String path = request.getSession().getServletContext().getRealPath("/") + "WEB-INF/template/project_info" + File.separator  + fileName  + ".xls";
		
		File file = new File(path);
		
		file.delete();
		logger.info("删除文件成功");
		return Constant.SUCCESS;
	}
	
	/**
	 * 跳转到企业客户联系人页面
	 * @author xuj
	 * @return
	 */
	@RequestMapping(value="/company/Contact/list")
	public String toCompanyContact(Model model){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始进入企业客户联系人页面", user.getUserid());
		
		List<TDataDict> dataDicts = tDataDictService.selectByExample(new TDataDictExample());
		
		model.addAttribute("dataDicts",JsonUtil.toJson(dataDicts));
		
		return  "report/company_contact_list";
	}
	
	/**
	 * 获取企业客户联系人信息
	 * @param rows
	 * @param page
	 * @param startDate
	 * @return
	 */
	@RequestMapping(value="/company/Contact/list/get")
	@ResponseBody
	public PageInfo<?> getCompanyContactList(@RequestParam(value="rows", required=false) int rows, 
			@RequestParam(value = "page", required=false) int page ,String startDate){
		
		CustomerInfoExample  example = new CustomerInfoExample();
		CustomerInfoExample.Criteria criteria = example.createCriteria();
		
		if(StringUtil.isNotEmpty(startDate)){
			criteria.andAddtimeEqualTo(startDate);
		}
		
		example.setOrderByClause("COMPANYNUM");
		
		return customerInfoService.getCompanyContactList(page, rows, example);
	}
	
	/**
	 * 将企业客户联系人信息存入
	 * @author Xuj
	 * @param request
	 * @param startDate
	 * @return
	 */
	@RequestMapping(value = "/company/contact/setExcel")
	@ResponseBody
	public Map<String, Object> setCompanyContactExcel(HttpServletRequest request, String startDate) {
		
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始将企业客户基本信息数据存入excel", user.getUserid());
		
		//用于存储返回数据
		Map<String, Object> fileData = new HashMap<String, Object>();
		
		//表头
		String[] header = {"客户编号", "企业名称", "成立时间", "注册资本", "实到资本", 
				"企业类型", "行业类型", "内外部标识", "类别划分", 
				"是否高新技术企业", "主营业务", "法定代表人", "实际控制人", 
				"联系人姓名", "职务", "联系电话", "手机号码", "传真", "电子邮箱"};
		
		//用于获取表格相符数据
		String[] keys = {"companynum", "companyname", "createtime", "registeredcapital", "practicalcapital", 
				"companytype", "businesstype", "mark", "area", 
				"ishighindustry", "mainbusiness", "comanylegalperson", "buicontrolperson", 
				"refereename", "post", "contactnumber", "phonenumber", "fax", "email"};
		
		//文件名称
		String fileName = UUID.randomUUID().toString().replaceAll("-", "");
		
		//生成文件地址
		String path = request.getSession().getServletContext().getRealPath("/") + "WEB-INF/template/customer_info";
		
		//标题
		String title = "企业客户信息";
		
		//二级标题
		String secTitle = user.getId() + " - " + DateUtil.formatDate(new Date(), "yyyy年MM月dd日 HH时mm分ss秒");
		
		CustomerInfoExample example = new CustomerInfoExample();
		CustomerInfoExample.Criteria criteria = example.createCriteria();
		
		if(StringUtils.isNotEmpty(startDate)) {
			criteria.andCreateTimeGreaterThanOrEqualTo(DateUtil.formatDate(startDate));
		}
		
		List<CustomerInfo> customerInfos = customerInfoService.selectByExample(example);
		
		if(customerInfos.isEmpty()) {
			logger.info("存入excel失败");
			fileData.put("msg", "数据为空");
			fileData.put("name", "");
			return fileData;
		}
		
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
		
		for(CustomerInfo cI : customerInfos) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put(keys[0], StringUtil.isNotEmpty(cI.getCompanynum()) ? cI.getCompanynum() : "");
			map.put(keys[1], StringUtil.isNotEmpty(cI.getCompanyname()) ? cI.getCompanyname() : "");
			map.put(keys[2], DateUtil.formatDate(cI.getCreateTime(), "yyyy-MM-dd HH:mm:ss"));
			map.put(keys[3], StringUtil.isNotEmpty(cI.getRegisteredcapital()) ? cI.getRegisteredcapital() : "");
			map.put(keys[4], StringUtil.isNotEmpty(cI.getPracticalcapital()) ? cI.getPracticalcapital() : "");
			map.put(keys[5], StringUtil.isNotEmpty(cI.getCompanytype()) ? cI.getCompanytype() : "");
			map.put(keys[6], StringUtil.isNotEmpty(cI.getBusinesstype()) ? cI.getBusinesstype() : "");
			map.put(keys[7], StringUtil.isNotEmpty(cI.getMark()) ? cI.getMark() : "");
			map.put(keys[8], StringUtil.isNotEmpty(cI.getArea()) ? cI.getArea() : "");
	        map.put(keys[9], StringUtil.isNotEmpty(cI.getIshighindustry()) ? cI.getIshighindustry() : "");
	        map.put(keys[10], StringUtil.isNotEmpty(cI.getMainbusiness()) ? cI.getMainbusiness() : "");
	        map.put(keys[11], StringUtil.isNotEmpty(cI.getComanylegalperson()) ? cI.getComanylegalperson() : "");
	        map.put(keys[12], StringUtil.isNotEmpty(cI.getBuicontrolperson()) ? cI.getBuicontrolperson() : "");
			map.put(keys[13], StringUtil.isNotEmpty(cI.getRefereename()) ? cI.getRefereename() : "");
			map.put(keys[14], StringUtil.isNotEmpty(cI.getPost()) ? cI.getPost() : "");
			map.put(keys[15], StringUtil.isNotEmpty(cI.getContactnumber()) ? cI.getContactnumber() : "");
			map.put(keys[16], StringUtil.isNotEmpty(cI.getPhonenumber()) ? cI.getPhonenumber() : "");
			map.put(keys[17], StringUtil.isNotEmpty(cI.getFax()) ? cI.getFax() : "");
			map.put(keys[18], StringUtil.isNotEmpty(cI.getEmail()) ? cI.getEmail() : "");
			data.add(map);
		}
		
		ExcelUtil.setListMapToExcel(path, fileName, title, secTitle, header, keys, data);

		logger.info("存入excel成功");
		fileData.put("msg", "0");
		fileData.put("name", fileName);
		return fileData;
	}
	
	/**
	 * 导出企业客户联系人文件
	 * 
	 * @author Xuj
	 * @param name	文件名称
	 * @param reauest
	 * @return
	 */
	@RequestMapping(value="/company/contact/downExcel")
	public ResponseEntity<byte[]> downCompanyContactFile(HttpServletRequest request, String fileName){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 进入导出企业客户联系人信息数据文件",user.getUserid());
		logger.info("文件名称 - [{}]",fileName);
		//生成文件地址
		String path = request.getSession().getServletContext().getRealPath("/") + "WEB-INF/template/customer_info" + File.separator  + fileName + ".xls";
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
			String outFileName = "企业客户信息.xls";
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
	 * 删除企业客户联系人excel文件
	 * 
	 * @author Xuj 
	 * @param request
	 * @param name
	 * @return
	 */
	@RequestMapping(value = "/company/contact/deleteExcel")
	@ResponseBody
	public String deleteCompanyContactExcel(HttpServletRequest request, String fileName) {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 进入企业客户联系人信息删除excel文件", user.getUserid());
		logger.info("删除文件名为 - [{}]", fileName);
		
		String path = request.getSession().getServletContext().getRealPath("/") + "WEB-INF/template/customer_info" + File.separator  + fileName  + ".xls";
		
		File file = new File(path);
		
		file.delete();
		logger.info("删除文件成功");
		return Constant.SUCCESS;
	}
	
	@RequestMapping({"/person/assetMsg"})
	  public String toAssetMsg(Model model)
	  {
	    TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
	    logger.info("用户[{}] - 跳转到个人客户资产负债信息页面", user.getUserid());

	    TDataDictExample example = new TDataDictExample();
	    TDataDictExample.Criteria criteria = example.createCriteria();
	    criteria.andDictTypeEqualTo("houseType");
	    List<TDataDict> tDataDicts = this.tDataDictService.selectByExample(example);
	    model.addAttribute("tDataDicts", JsonUtil.toJson(tDataDicts));
	    return "report/person_assetMsg";
	  }

	  @RequestMapping({"/person/assetMsg/get"})
	  @ResponseBody
	  public PageInfo<?> getAssetMsg(@RequestParam(value="rows", required=false) int rows, @RequestParam(value="page", required=false) int page, String startDate)
	  {
	    TUsers tUser = (TUsers)SecurityUtils.getSubject().getPrincipal();
	    logger.info("用户[{}] - 进入获取个人客户资产负债信息", tUser.getUserid());

	    PerCustomerInfoExample example = new PerCustomerInfoExample();
	    PerCustomerInfoExample.Criteria criteria = example.createCriteria();
	    if (StringUtil.isNotEmpty(startDate)) {
	      criteria.andCreatetimeEqualTo(DateUtil.formatDate(startDate));
	    }

	    PageInfo<?> pageInfo = this.perCustomerInfoService.getAssetMsg(page, rows, example);
	    return pageInfo;
	  }

	  @RequestMapping({"/person/setExcel"})
	  @ResponseBody
	  public Map<String, Object> setAssetExcel(HttpServletRequest request, String startDate)
	  {
	    TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
	    logger.info("用户[{}] - 开始将个人客户资产负债信息存入excel", user.getUserid());

	    Map fileData = new HashMap();

	    String[] header = { "客户编号", "姓名", "资产类型", "地址/型号", "面积/数量", "购买时间", "购买价值", "评估价值", "权证号", "权属及使用情况" };

	    String[] keys = { "id", "username", "housingtype", "addornum", "areaornum", "buytime", "purchasevalue", "valuationvalue", "warrantsnum", "ownerandusage" };

	    String fileName = UUID.randomUUID().toString().replaceAll("-", "");

	    String path = request.getSession().getServletContext().getRealPath("/") + "WEB-INF/template/report";

	    String title = "个人客户资产负债信息";

	    String secTitle = user.getId() + " - " + DateUtil.formatDate(new Date(), "yyyy年MM月dd日 HH时mm分ss秒");

	    PerCustomerInfoExample example = new PerCustomerInfoExample();
	    PerCustomerInfoExample.Criteria criteria = example.createCriteria();
	    if (StringUtil.isNotEmpty(startDate)) {
	      criteria.andCreatetimeEqualTo(DateUtil.formatDate(startDate));
	    }

	    List<PerCustomerInfoVo> perCustomerInfoVos = this.perCustomerInfoService.selectAssetMsgVoByExample(example);

	    if (perCustomerInfoVos.isEmpty()) {
	      logger.info("存入excel失败");
	      fileData.put("msg", "数据为空");
	      fileData.put("name", "");
	      return fileData;
	    }
	    List data = new ArrayList();
	    for (PerCustomerInfoVo cI : perCustomerInfoVos) {
	      Map map = new HashMap();
	      map.put(keys[0], StringUtil.isNotEmpty(cI.getId()) ? cI.getId() : "");
	      map.put(keys[1], StringUtil.isNotEmpty(cI.getUsername()) ? cI.getUsername() : "");
	      map.put(keys[2], StringUtil.isNotEmpty(cI.getHousingtype()) ? cI.getHousingtype() : "");
	      map.put(keys[3], StringUtil.isNotEmpty(cI.getAddornum()) ? cI.getAddornum() : "");
	      map.put(keys[4], StringUtil.isNotEmpty(cI.getAreaornum()) ? cI.getAreaornum() : "");
	      map.put(keys[5], DateUtil.formatDate(cI.getBuytime(), "yyyy-MM-dd HH:mm:ss"));
	      map.put(keys[6], StringUtil.isNotEmpty(cI.getPurchasevalue()) ? cI.getPurchasevalue() : "");
	      map.put(keys[7], StringUtil.isNotEmpty(cI.getValuationvalue()) ? cI.getValuationvalue() : "");
	      map.put(keys[8], StringUtil.isNotEmpty(cI.getWarrantsnum()) ? cI.getWarrantsnum() : "");
	      map.put(keys[9], StringUtil.isNotEmpty(cI.getOwnerandusage()) ? cI.getOwnerandusage() : "");
	      data.add(map);
	    }

	    ExcelUtil.setListMapToExcel(path, fileName, title, secTitle, header, keys, data);

	    logger.info("存入excel成功");
	    fileData.put("msg", "0");
	    fileData.put("name", fileName);
	    return fileData;
	  }

	  @RequestMapping({"/person/downExcel"})
	  public ResponseEntity<byte[]> downPersonAssetFile(HttpServletRequest request, String fileName)
	  {
	    TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
	    logger.info("用户[{}] - 进入导出企业客户列表数据文件", user.getUserid());
	    logger.info("文件名称 - [{}]", fileName);

	    String path = request.getSession().getServletContext().getRealPath("/") + "WEB-INF/template/report" + File.separator + fileName + ".xls";
	    try {
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
	      String outFileName = "个人客户资产负债信息.xls";
	      String dfileName = new String(outFileName.getBytes("gb2312"), "iso8859-1");
	      headers.setContentDispositionFormData("attachment", dfileName);
	      logger.info("导出成功");
	      file.delete();
	      return new ResponseEntity(publickey, headers, HttpStatus.OK);
	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	    return null;
	  }

	  @RequestMapping({"/person/deleteExcel"})
	  @ResponseBody
	  public String deletePersonAssetExcel(HttpServletRequest request, String fileName)
	  {
	    TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
	    logger.info("用户[{}] - 进入个人客户资产负债信息删除excel文件", user.getUserid());
	    logger.info("删除文件名为 - [{}]", fileName);

	    String path = request.getSession().getServletContext().getRealPath("/") + "WEB-INF/template/report" + File.separator + fileName + ".xls";

	    File file = new File(path);

	    file.delete();
	    logger.info("删除文件成功");
	    return "0";
	  }

	  @RequestMapping({"/person/assetReport"})
	  public String toAssetReport(Model model)
	  {
	    TUsers tUsers = (TUsers)SecurityUtils.getSubject().getPrincipal();
	    logger.info("用户[{}] - 进入个人客户负债信息报表", tUsers.getUserid());

	    TDataDictExample example = new TDataDictExample();
	    TDataDictExample.Criteria criteria = example.createCriteria();
	    criteria.andDictTypeEqualTo("liabType");
	    List tDataDicts = this.tDataDictService.selectByExample(example);
	    model.addAttribute("tDataDict", JsonUtil.toJson(tDataDicts));
	    return "report/person_assetReport";
	  }

	  @RequestMapping({"/person/assetReport/get"})
	  @ResponseBody
	  public PageInfo<?> getAssetReport(@RequestParam(value="rows", required=false) int rows, @RequestParam(value="page", required=false) int page, String startDate)
	  {
	    TUsers tUsers = (TUsers)SecurityUtils.getSubject().getPrincipal();
	    logger.info("用户[{}] - 进入获取个人客户负债信息报表", tUsers.getUserid());

	    PerCustomerInfoExample example = new PerCustomerInfoExample();
	    PerCustomerInfoExample.Criteria criteria = example.createCriteria();
	    if (StringUtil.isNotEmpty(startDate)) {
	      criteria.andCreatetimeEqualTo(DateUtil.formatDate(startDate));
	    }
	    PageInfo pageInfo = this.perCustomerInfoService.getAssetReport(page, rows, example);
	    return pageInfo;
	  }

	  @RequestMapping({"/personReport/setExcel"})
	  @ResponseBody
	  public Map<String, Object> setReportExcel(HttpServletRequest request, String startDate)
	  {
	    TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
	    logger.info("用户[{}] - 开始将个人客户负债信息报表存入excel", user.getUserid());

	    Map fileData = new HashMap();

	    String[] header = { "客户编号", "姓名", "负债类型", "借款金额", "已还金额", "未还金额", "月均需还款" };

	    String[] keys = { "id", "username", "liabtype", "credit", "paid", "nopay", "averagepay" };

	    String fileName = UUID.randomUUID().toString().replaceAll("-", "");

	    String path = request.getSession().getServletContext().getRealPath("/") + "WEB-INF/template/report";

	    String title = "个人客户负债信息报表";

	    String secTitle = user.getId() + " - " + DateUtil.formatDate(new Date(), "yyyy年MM月dd日 HH时mm分ss秒");

	    PerCustomerInfoExample example = new PerCustomerInfoExample();
	    PerCustomerInfoExample.Criteria criteria = example.createCriteria();
	    if (StringUtil.isNotEmpty(startDate)) {
	      criteria.andCreatetimeEqualTo(DateUtil.formatDate(startDate));
	    }
	    List<PerCustomerInfoVo> perCustomerInfoVos = this.perCustomerInfoService.selectAssetReportVoByExample(example);

	    if (perCustomerInfoVos.isEmpty()) {
	      logger.info("存入excel失败");
	      fileData.put("msg", "数据为空");
	      fileData.put("name", "");
	      return fileData;
	    }
	    List data = new ArrayList();
	    for (PerCustomerInfoVo cI : perCustomerInfoVos) {
	      Map map = new HashMap();
	      map.put(keys[0], StringUtil.isNotEmpty(cI.getId()) ? cI.getId() : "");
	      map.put(keys[1], StringUtil.isNotEmpty(cI.getUsername()) ? cI.getUsername() : "");
	      map.put(keys[2], StringUtil.isNotEmpty(cI.getLiabtype()) ? cI.getLiabtype() : "");
	      map.put(keys[3], StringUtil.isNotEmpty(cI.getCredit()) ? cI.getCredit() : "");
	      map.put(keys[4], StringUtil.isNotEmpty(cI.getPaid()) ? cI.getPaid() : "");
	      map.put(keys[5], StringUtil.isNotEmpty(cI.getNopay()) ? cI.getNopay() : "");
	      map.put(keys[6], StringUtil.isNotEmpty(cI.getAveragepay()) ? cI.getAveragepay() : "");
	      data.add(map);
	    }

	    ExcelUtil.setListMapToExcel(path, fileName, title, secTitle, header, keys, data);

	    logger.info("存入excel成功");
	    fileData.put("msg", "0");
	    fileData.put("name", fileName);
	    return fileData;
	  }

	  @RequestMapping({"/personReport/downExcel"})
	  public ResponseEntity<byte[]> downPersonReportFile(HttpServletRequest request, String fileName)
	  {
	    TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
	    logger.info("用户[{}] - 进入导出个人客户负债信息报销数据文件", user.getUserid());
	    logger.info("文件名称 - [{}]", fileName);

	    String path = request.getSession().getServletContext().getRealPath("/") + "WEB-INF/template/report" + File.separator + fileName + ".xls";
	    try {
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
	      String outFileName = "个人客户负债信息报表.xls";
	      String dfileName = new String(outFileName.getBytes("gb2312"), "iso8859-1");
	      headers.setContentDispositionFormData("attachment", dfileName);
	      logger.info("导出成功");
	      file.delete();
	      return new ResponseEntity(publickey, headers, HttpStatus.OK);
	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	    return null;
	  }

	  @RequestMapping({"/personReport/deleteExcel"})
	  @ResponseBody
	  public String deletePersonReportExcel(HttpServletRequest request, String fileName)
	  {
	    TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
	    logger.info("用户[{}] - 进入个人客户负债信息报表删除excel文件", user.getUserid());
	    logger.info("删除文件名为 - [{}]", fileName);

	    String path = request.getSession().getServletContext().getRealPath("/") + "WEB-INF/template/report" + File.separator + fileName + ".xls";

	    File file = new File(path);

	    file.delete();
	    logger.info("删除文件成功");
	    return "0";
	  }

	  @RequestMapping({"/person/list/view"})
	  public String viewPersonInfo(String id, Model model)
	  {
	    TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
	    logger.info("用户[{}] - 进入个人客户信息详情页面", user.getUserid());

	    PerCustomerInfo personInfos = this.perCustomerInfoService.selectByPrimaryKey(id);
	    model.addAttribute("personInfos", personInfos);

	    LiabilitiesInfosExample example = new LiabilitiesInfosExample();
	    LiabilitiesInfosExample.Criteria criteria = example.createCriteria();
	    criteria.andPeridEqualTo(id);
	    List liabilitiesInfos = this.liabilitiesInfosService.selectByExample(example);
	    if (!liabilitiesInfos.isEmpty()) {
	      model.addAttribute("liabilitiesInfos", liabilitiesInfos);
	    }

	    AssetInfosExample example2 = new AssetInfosExample();
	    AssetInfosExample.Criteria criteria2 = example2.createCriteria();
	    criteria2.andPeridEqualTo(id);
	    List assetInfos = this.assetInfosService.selectByExample(example2);
	    if (!assetInfos.isEmpty()) {
	      model.addAttribute("assetInfos", assetInfos);
	    }

	    AuxiliaryContactExample example3 = new AuxiliaryContactExample();
	    AuxiliaryContactExample.Criteria criteria3 = example3.createCriteria();
	    criteria3.andPeridEqualTo(id);
	    List auxiliaryContacts = this.auxiliaryContactService.selectByExample(example3);
	    if (!auxiliaryContacts.isEmpty()) {
	      model.addAttribute("auxiliaryContacts", auxiliaryContacts);
	    }

	    AnnexDocsExample example4 = new AnnexDocsExample();
	    AnnexDocsExample.Criteria criteria4 = example4.createCriteria();
	    criteria4.andPeridEqualTo(id);
	    List annexDocs = this.annexDocsService.selectByExample(example4);
	    if (!annexDocs.isEmpty()) {
	      model.addAttribute("annexDocs", annexDocs);
	    }
	    return "report/asset_View";
	  }
}

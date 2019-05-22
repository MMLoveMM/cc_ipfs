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

import javax.servlet.ServletException;

import cn.net.sinodata.model.*;
import cn.net.sinodata.service.*;
import cn.net.sinodata.util.*;
import cn.net.sinodata.vo.*;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;

import cn.net.sinodata.model.FinacialValExample.Criteria;


@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	private final TDataDictService tdatadictService;
	
	private final CustomerInfoService customerInfoService;
	
	private final AssetInfosService assetInfosService;
	
	private final FinacialParamsService finacialParamsService;
	
	private final FinacialValService finacialValService;
	
	private final LiabilitiesInfosService liabilitiesInfosService;
	
	private final ProjectInfoService projectInfoService;
	
	private final AccessoryInfoService accessoryInfoService;
	
	private final PerCustomerInfoService perCustomerInfoService;
	
	private final AnnexDocsService annexDocsService;
	
	private final AuxiliaryContactService auxiliaryContactService;
	
	private final TCustAcctService tCustAcctService;
	
	private final TCustCertiService tCustCertiService;

	private final EnterpriseInfoService enterpriseInfoService;

	private final EnterpriseFinanceService enterpriseFinanceService;

	private final EnterprisePersonService enterprisePersonService;

	private final EnterpriseIntellectualPropertyService enterpriseIntellectualPropertyService;

	private final EnterpriseFilePdfService enterpriseFilePdfService;



	public CustomerController(FinacialParamsService finacialParamsService, TDataDictService tdatadictService,
							  CustomerInfoService customerInfoService, AssetInfosService assetInfosService,
							  FinacialValService finacialValService, LiabilitiesInfosService liabilitiesInfosService,
							  ProjectInfoService projectInfoService, AccessoryInfoService accessoryInfoService,
							  PerCustomerInfoService perCustomerInfoService, AnnexDocsService annexDocsService,
							  TCustCertiService tCustCertiService, EnterpriseInfoService enterpriseInfoService,
							  AuxiliaryContactService auxiliaryContactService, TCustAcctService tCustAcctService,
							  EnterpriseFinanceService enterpriseFinanceService,
							  EnterprisePersonService enterprisePersonService,
							  EnterpriseIntellectualPropertyService enterpriseIntellectualPropertyService,
							  EnterpriseFilePdfService enterpriseFilePdfService) {
		this.finacialParamsService = finacialParamsService;
		this.tdatadictService = tdatadictService;
		this.customerInfoService = customerInfoService;
		this.assetInfosService = assetInfosService;
		this.finacialValService = finacialValService;
		this.liabilitiesInfosService = liabilitiesInfosService;
		this.projectInfoService = projectInfoService;
		this.accessoryInfoService = accessoryInfoService;
		this.perCustomerInfoService = perCustomerInfoService;
		this.annexDocsService = annexDocsService;
		this.tCustCertiService = tCustCertiService;
		this.enterpriseInfoService = enterpriseInfoService;
		this.auxiliaryContactService = auxiliaryContactService;
		this.tCustAcctService = tCustAcctService;
		this.enterpriseFinanceService = enterpriseFinanceService;
		this.enterprisePersonService = enterprisePersonService;
		this.enterpriseIntellectualPropertyService = enterpriseIntellectualPropertyService;
		this.enterpriseFilePdfService = enterpriseFilePdfService;
	}

	@RequestMapping(value="/company/toAdd")
	public String toCustomer(Model model){
		TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 进入录入企业信息信息", user.getUserid());
		String customid = UuidUtil.getUuid();
		model.addAttribute("id", customid);
		model.addAttribute("tDatas", tdatadictService.selectByExample(new TDataDictExample()));
		return "customer/customer_add";
	}
	
	@RequestMapping(value="/company/add")
	@ResponseBody
	public String addCompany(CustomerInfoVo customerInfoVo, String createtime) throws ParseException{
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		String userId = user.getUserid();
		logger.info("用户[{}] - 开始添加企业用户信息", user.getUserid());
		String companyName = customerInfoVo.getCompanyname();
		logger.info("acctInfo:",customerInfoVo.getAcctStr());
		if (StringUtils.isNotEmpty(companyName)) {
			CustomerInfoExample example = new CustomerInfoExample();
			CustomerInfoExample.Criteria criteria = example.createCriteria();
			criteria.andCompanynameEqualTo(companyName);
			if(!customerInfoService.selectByExample(example).isEmpty()) {
				logger.info("企业用户信息已存在,请查看企业用户列表");
				return "企业用户信息已存在,请查看企业用户列表";
			}
		}
		
		String companyNum = customerInfoService.getMaxCompanyNum();
		if(StringUtil.isEmpty(companyNum)) {
			companyNum = "000001";
		}else{
			companyNum = Integer.parseInt(companyNum) + 1 + "";
		} 
		String customId = customerInfoVo.getId();
		
		logger.info("公司序列[{}], 用户id[{}], 数据[{}], 时间:[{}]", companyNum, userId, customerInfoVo, createtime);
		int flag = customerInfoService.insertCustomerInfo(companyNum, userId, customerInfoVo, createtime,customId);
		if(flag < 1){
			logger.info("添加企业用户信息失败");
			return "添加企业用户信息失败";
		}
		
		logger.info("添加企业用户信息成功");
		return Constant.SUCCESS;
	}
	
	/**
	 * 读取附件信息
	 * 
	 * @author licc 2017年10月23日16:59:45
	 * @throws ServletException 
	 * customerId --  mod by xj 2017年11月2日15:18:46
	 * @throws IOException 
	 */
	@RequestMapping(value="/company/upload")
	@ResponseBody
	public String accesoryUpload(MultipartFile myfile, HttpServletRequest request, String customerId) throws IOException, ServletException{
		logger.info("开始读取附件信息..");
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		
		Map<String, Object> map = UploadFileUtil.uploadFile(myfile, request);
		
		if (!map.isEmpty()) {
			AccessoryInfo accessoryInfo = new AccessoryInfo();
			accessoryInfo.setUserid(user.getUserid());
			accessoryInfo.setAccessoryname(map.get("accName").toString());
			accessoryInfo.setShowname(map.get("fileName").toString());
			accessoryInfo.setFiletype(map.get("fileType").toString());
			accessoryInfo.setAccessorytype((short)1);
			accessoryInfo.setAccessoryadd(map.get("accessoryAdd").toString());
			accessoryInfo.setUploaddt(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
			
			//mod by xj 2017年11月2日15:19:49
			if(StringUtil.isNotEmpty(customerId)){
				accessoryInfo.setTableid(customerId);		
			}
			int flag = accessoryInfoService.insertAccessoryHisInfo(accessoryInfo);
			if(flag<1) {
				logger.info("文件上传失败");
				return "文件上传失败";
			}
		}else{
			logger.info("未获取到文件");
			return "未获取到文件";
		} 
		logger.info("文件上传成功");
		return Constant.SUCCESS;
	}
	

	/**
	 * 查询审计财务数据
	 * @author licc 2017年10月23日17:34:27
	 */
	
	@RequestMapping(value="/company/query")
	@ResponseBody
	public List<FinacialParams> ViewAudit(FinacialVal finacialVal, Model model){
		logger.info("查询审计财务数据  ........");
		String num = finacialVal.getNum();
		FinacialParamsExample example = new FinacialParamsExample();
		FinacialParamsExample.Criteria criteria = example.createCriteria();
		if(StringUtil.isNotEmpty(num)){
			criteria.andNumLike(num);
		}
		
		return finacialParamsService.selectByExample(example);
	}
	
	/**
	 * 删除审计数据
	 */
	@RequestMapping(value="/company/delDate")
	@ResponseBody
	public String delSjDate(String sjdate){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始删除审计数据", user.getUserid());
		if(StringUtil.isEmpty(sjdate)) {
			logger.info("获取审计日期为空");
			return "请填写审计日期";
		}
		FinacialValExample example = new FinacialValExample();
		FinacialValExample.Criteria criteria = example.createCriteria();
		Criteria criteria2 = criteria.andAuditdtEqualTo(sjdate);
		if(criteria2 != null) {
			int flag = finacialValService.deleteByExample(example);
			if(flag<1){
				logger.info("删除审计数据失败");
				return "删除审计数据失败";
			}
		}else{
			logger.info("没有此日期的数据");
			return "没有此日期的数据";
		}
		logger.info("删除审计数据成功");
		return Constant.SUCCESS;
	}
//	/**
//	 * 企业客户列表
//	 * @author licc 2017年11月1日10:11:19
//	 */
//	@RequestMapping(value="/companys/list")
//	public String toCompany(Model model){
//		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
//		logger.info("用户[{}] - 进入企业客户列表页面" , user.getUserid());
//
//		TDataDictExample example = new TDataDictExample();
//		List<TDataDict> tdataDict = tdatadictService.selectByExample(example);
//
//		model.addAttribute("countyList", JsonUtil.toJson(tdataDict));
//		return "customer/customer_list";
//	}

	/**
	 * 企业客户列表
	 *
	 * @author pangpj
	 */
	@RequestMapping(value="/companys/list")
	public String toCompany(Model model){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 进入企业客户列表页面" , user.getUserid());

		return "customer/enterprise_list";
	}
	
//	/**
//	 * 获取企业客户信息
//	 * @author licc
//	 */
//	@RequestMapping(value="/companys/list/get")
//	@ResponseBody
//	public PageInfo<?> getCompanysList(@RequestParam(value="rows", required=false) int rows,
//			@RequestParam(value = "page", required=false) int page, String companyname, String contacts, String userid) throws ParseException {
//		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
//		logger.info("用户[{}] - 开始获取企业客户数据", user.getUserid());
//		CustomerInfoExample example = new CustomerInfoExample();
//		if(StringUtil.isNotEmpty(companyname) && StringUtil.isNotEmpty(contacts) && StringUtil.isNotEmpty(userid)){
//			CustomerInfoExample.Criteria criteria = example.createCriteria();
//			criteria.andCompanynameEqualTo(companyname);
//			criteria.andContactsEqualTo(contacts);
//			criteria.andUseridEqualTo(userid);
//		}
//		PageInfo<?> pageInfo = customerInfoService.getCustomerList(page, rows, example);
//
//		return pageInfo;
//	}

	/**
	 * 获取企业客户信息
	 * @author licc
	 */
	@RequestMapping(value="/companys/list/get")
	@ResponseBody
	public PageInfo<?> getCompanysList(@RequestParam(value="rows", required=false) int rows,
									   @RequestParam(value = "page", required=false) int page, String companyname, String contacts, String userid) throws ParseException {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始获取企业客户数据", user.getUserid());

		PageInfo<?> pageInfo = enterpriseInfoService.getPageEnterprise(page, rows);

		return pageInfo;
	}

	/**
	 * 更改推荐状态
	 * @author licc
	 */
	@RequestMapping(value="/companys/changeRecommendStatus")
	@ResponseBody
	public String changeReStatus(String id,String recommendStatus){
		String status ;
		if(StringUtil.isEmpty(id)){
			logger.info("获取id为空");
			return "获取id为空，更改失败";
		}
		if(StringUtil.isEmpty(recommendStatus)){
			logger.info("获取当前状态为空");
			return "获取当前状态为空，更改失败";
		}
		if(StringUtil.isNotEmpty(id) && StringUtil.isNotEmpty(recommendStatus)){
			if("1".equals(recommendStatus)){
				status = "0";
			} else {
				status = "1";
			}
			CustomerInfo customerInfo = new CustomerInfo();
			customerInfo.setRecommendStatus(status);
			CustomerInfoExample example = new CustomerInfoExample();
			CustomerInfoExample.Criteria criteria = example.createCriteria();
			criteria.andIdEqualTo(id);
			int flag = customerInfoService.updateByExampleSelective(customerInfo, example);
			if(flag < 1){
				logger.info("更改推荐状态失败");
				return "更改推荐状态失败";
			}
		}
		logger.info("更改推荐状态成功");
		return Constant.SUCCESS;
	}
	
//	/**
//	 * 删除客户信息
//	 * @author licc
//	 */
//	@RequestMapping(value = "/companys/delCustomer")
//	@ResponseBody
//	public String delCustomer(String id){
//		int flag = 1 ;
//		@SuppressWarnings("unused")
//		String name ;
//		if(StringUtil.isEmpty(id)){
//			logger.info("获取删除客户id为空");
//			return "获取删除id为空，删除失败";
//		}
//		if(projectInfoService.selectByPrimaryKey(id) == null){
//			if(perCustomerInfoService.selectByPrimaryKey(id) == null){
//				flag = customerInfoService.deleteByPrimaryKey(id);
//				TCustAcctExample example = new TCustAcctExample();
//				TCustAcctExample.Criteria criteria = example.createCriteria();
//				criteria.andCustomeridEqualTo(id);
//				if(!tCustAcctService.selectByExample(example).isEmpty()){
//					flag = tCustAcctService.deleteByExample(example);
//				}
//				TCustCertiExample example2 = new TCustCertiExample();
//				TCustCertiExample.Criteria criteria2 = example2.createCriteria();
//				criteria2.andCustomeridEqualTo(id);
//				if(!tCustCertiService.selectByExample(example2).isEmpty()){
//					flag = tCustCertiService.deleteByExample(example2);
//				}
//				AccessoryInfoExample example3 = new AccessoryInfoExample();
//				AccessoryInfoExample.Criteria criteria3 = example3.createCriteria();
//				criteria3.andTableidEqualTo(id);
//				if(!accessoryInfoService.selectByExample(example3).isEmpty()){
//					flag = accessoryInfoService.deleteByExample(example3);
//				}
//				FinacialValExample example4 = new FinacialValExample();
//				FinacialValExample.Criteria criteria4 = example4.createCriteria();
//				criteria4.andCustomidEqualTo(id);
//				if(!finacialValService.selectByExample(example4).isEmpty()){
//					flag = finacialValService.deleteByExample(example4);
//				}
//			}else{
//				flag = 0;
//				CustomerInfo customerInfo = customerInfoService.selectByPrimaryKey(id);
//				name = customerInfo.getCompanyname();
//			}
//		}else{
//			flag = 0;
//			CustomerInfo customerInfo = customerInfoService.selectByPrimaryKey(id);
//			name = customerInfo.getCompanyname();
//		}
//		if(flag < 1){
//			logger.info("删除客户信息失败");
//			return "删除客户信息失败";
//		}
//		logger.info("删除客户信息成功");
//		return Constant.SUCCESS;
//	}
	
//	/**
//	 * 查看详情
//	 * @author licc
//	 */
//	@RequestMapping(value = "/companys/viewCustomer")
//	public String ViewCustomer(String id,Model model){
//		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
//		logger.info("用户[{}] - 进入企业客户信息详情页面" , user.getUserid());
//		CustomerInfo customerInfo = customerInfoService.selectByPrimaryKey(id);
//		model.addAttribute("customerInfo", customerInfo);
//		TCustAcctExample example = new TCustAcctExample();
//		TCustAcctExample.Criteria criteria = example.createCriteria();
//		criteria.andCustomeridEqualTo(id);
//		List<TCustAcct> tCustAcct = tCustAcctService.selectByExample(example);
//		if(!tCustAcct.isEmpty()){
//			model.addAttribute("tCustAcct", tCustAcct);
//		}
//		TCustCertiExample example2 = new TCustCertiExample();
//		TCustCertiExample.Criteria criteria2 = example2.createCriteria();
//		criteria2.andCustomeridEqualTo(id);
//		List<TCustCerti> tCustCerti = tCustCertiService.selectByExample(example2);
//		if(!tCustCerti.isEmpty()){
//			model.addAttribute("tCustCerti", tCustCerti);
//		}
//		AccessoryInfoExample example3 = new AccessoryInfoExample();
//		AccessoryInfoExample.Criteria criteria3 = example3.createCriteria();
//		criteria3.andTableidEqualTo(id);
//		List<AccessoryInfo> accessoryInfos = accessoryInfoService.selectByExample(example3);
//		if(!accessoryInfos.isEmpty()){
//			model.addAttribute("accessoryInfos", accessoryInfos);
//		}
//		FinacialValExample example4 = new FinacialValExample();
//		FinacialValExample.Criteria criteria4 = example4.createCriteria();
//		criteria4.andCustomidEqualTo(id);
//		if(!finacialValService.selectByExample(example4).isEmpty()){
//			model.addAttribute("finacialVals", finacialValService.selectByExample(example4));
//		}
//
//		TDataDictExample example5 = new TDataDictExample();
//		List<TDataDict> tdataDict = tdatadictService.selectByExample(example5);
//
//		model.addAttribute("tdata", JsonUtil.toJson(tdataDict));
//		return "customer/customer_viewss";
//	}

	/**
	 * 删除客户信息
	 * @author pangpj
	 */
	@RequestMapping(value = "/companys/delCustomer")
	@ResponseBody
	public String delCustomer(String id){
		TUsers users = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户 {} - 开始删除客户信息", users.getId());

		enterpriseInfoService.delete(id);

		enterpriseFinanceService.deleteByEnterpriseId(id);

		enterprisePersonService.deleteByEnterpriseId(id);

		enterpriseIntellectualPropertyService.deleteByEnterpriseId(id);

		enterpriseFilePdfService.deleteByEnterpriseId(id);

		logger.info("删除客户信息成功");
		return Constant.SUCCESS;
	}

	/**
	 * 查看详情
	 * @author pangpj
	 */
	@RequestMapping(value = "/companys/viewCustomer")
	public String ViewCustomer(String id,Model model){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 进入企业客户信息详情页面" , user.getUserid());

		EnterpriseInfo enterpriseInfo = enterpriseInfoService.selectById(id);
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

		return "customer/enterprise_viewss";
	}

//	/**
//	 * 获取企业用户数据,返回更新页面
//	 * @author licc
//	 */
//	@RequestMapping(value = "/companys/customerUpdate")
//	public String getcustomerInfo(String id , Model model){
//		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
//		logger.info("用户[{}] - 进入企业客户信息修改页面" , user.getUserid());
//
//		model.addAttribute("tDatas", tdatadictService.selectByExample(new TDataDictExample()));
//
//		CustomerInfo customerInfo = customerInfoService.selectByPrimaryKey(id);
//		model.addAttribute("customerInfo", customerInfo);
//		TCustAcctExample example = new TCustAcctExample();
//		TCustAcctExample.Criteria criteria = example.createCriteria();
//		criteria.andCustomeridEqualTo(id);
//		List<TCustAcct> tCustAcct = tCustAcctService.selectByExample(example);
//		if(!tCustAcct.isEmpty()){
//			model.addAttribute("tCustAcct", tCustAcct);
//		}
//		TCustCertiExample example2 = new TCustCertiExample();
//		TCustCertiExample.Criteria criteria2 = example2.createCriteria();
//		criteria2.andCustomeridEqualTo(id);
//		List<TCustCerti> tCustCerti = tCustCertiService.selectByExample(example2);
//		if(!tCustCerti.isEmpty()){
//			model.addAttribute("tCustCerti", tCustCerti);
//		}
//		AccessoryInfoExample example3 = new AccessoryInfoExample();
//		AccessoryInfoExample.Criteria criteria3 = example3.createCriteria();
//		criteria3.andTableidEqualTo(id);
//		List<AccessoryInfo> accessoryInfos = accessoryInfoService.selectByExample(example3);
//		if(!accessoryInfos.isEmpty()){
//			model.addAttribute("accessoryInfos", accessoryInfos);
//		}
//		FinacialValExample example4 = new FinacialValExample();
//		FinacialValExample.Criteria criteria4 = example4.createCriteria();
//		criteria4.andCustomidEqualTo(id);
//		if(!finacialValService.selectByExample(example4).isEmpty()){
//			model.addAttribute("finacialVals", finacialValService.selectByExample(example4));
//		}
//		return "customer/customer_update";
//	}

	/**
	 * 获取企业用户数据,返回更新页面
	 * @author licc
	 */
	@RequestMapping(value = "/companys/customerUpdate")
	public String getcustomerInfo(String id , Model model){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 进入企业客户信息修改页面" , user.getUserid());

		EnterpriseInfo enterpriseInfo = enterpriseInfoService.selectById(id);
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

		return "user_jsp/enter/enterprise_update";
	}

	/**
	 * 读取附件信息
	 * 
	 * @author licc 2017年10月23日16:59:45
	 * @throws ServletException 
	 * @throws IOException 
	 */
	@RequestMapping(value="/companys/updateAccess")
	@ResponseBody
	public String updateAccesoryUpload(MultipartFile myfile,HttpServletRequest request,String customerId) throws IOException, ServletException{
		logger.info("开始读取附件信息..");
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		
		Map<String, Object> map = UploadFileUtil.uploadFile(myfile, request);
		
		if (!map.isEmpty()) {
			AccessoryInfo accessoryInfo = new AccessoryInfo();
			accessoryInfo.setUserid(user.getUserid());
			accessoryInfo.setAccessoryname(map.get("accName").toString());
			accessoryInfo.setShowname(map.get("fileName").toString());
			accessoryInfo.setFiletype(map.get("fileType").toString());
			accessoryInfo.setAccessorytype((short)1);
			accessoryInfo.setAccessoryadd(map.get("accessoryAdd").toString());
			accessoryInfo.setUploaddt(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
			if(StringUtil.isNotEmpty(customerId)){
				accessoryInfo.setTableid(customerId);		
			}
			 int flag = accessoryInfoService.insertAccessoryHisInfo(accessoryInfo);
			
			 if(flag<1) {
				 logger.info("文件上传失败");
				 return "文件上传失败";
			 }
		}else{
			logger.info("未获取到文件");
			return "未获取到文件";
		} 
		 logger.info("文件上传成功");
		return Constant.SUCCESS;
	}
	
	/**
	 * 修改企业信息
	 * @author licc
	 * @throws ParseException 
	 */
	@RequestMapping(value = "/companys/modCustomer")
	@ResponseBody
	public String updateCustomerInfo(CustomerInfoVo customerInfoVo,String createtime,String allid) throws ParseException{
		
		int flag = customerInfoService.insertModCustomer(customerInfoVo,createtime,allid);
		if(flag < 1){
			logger.info("修改企业信息失败");
			return "修改企业信息失败";
		}
		logger.info("修改企业信息成功");
		return Constant.SUCCESS;
	}
	
	/**
	 * 修改账户信息
	 * @author licc
	 */
	@RequestMapping(value = "/companys/modTCustAcct")
	@ResponseBody
	public String modTCustAcct(String zhId, String zhName , String yhNum , String yh){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始修改账户信息" , user.getUserid());
		
		TCustAcctExample e = new TCustAcctExample();
		TCustAcctExample.Criteria criteria = e.createCriteria();
		criteria.andIdEqualTo(zhId);
		TCustAcct tCustAcct = new TCustAcct();
		tCustAcct.setAcctname(zhName);
		tCustAcct.setBankacct(yhNum);
		tCustAcct.setOpenbank(yh);
		tCustAcct.setCtime(new Date());
		int flag = tCustAcctService.updateByExample(tCustAcct, e);
		if(flag < 1){
			logger.info("修改账户信息失败");
			return "修改账户信息失败";
		}
		logger.info("修改账户信息成功");
		return Constant.SUCCESS;
	}
	
	/**
	 * 删除账户信息
	 * @author licc
	 */
	@RequestMapping(value = "/companys/delTCustAcct")
	@ResponseBody
	public String delTCustAcct(String id){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始删除账户信息" , user.getUserid());
		
		int flag = tCustAcctService.deleteByPrimaryKey(id);
		if(flag < 1){
			logger.info("删除账户信息失败");
			return "删除账户信息失败";
		}
		logger.info("删除账户信息成功");
		return Constant.SUCCESS;
	}
	
	/**
	 * 开始修改证件信息
	 * @author licc
	 */
	@RequestMapping(value = "/companys/modTCustCerti")
	@ResponseBody
	public String modTCustCerti(String zjId , String zjnation , String zjtype , String zjno , String  zjtefdate,String zjlefdate ,String zjasdate){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始修改证件信息" , user.getUserid());
		
		TCustCertiExample example2 = new TCustCertiExample();
		TCustCertiExample.Criteria criteria2 = example2.createCriteria();
		criteria2.andIdEqualTo(zjId);
		TCustCerti tCustCerti = new TCustCerti();
		tCustCerti.setCtime(new Date());
		tCustCerti.setNation(zjnation);
		tCustCerti.setIdno(zjno);
		tCustCerti.setIdtype(zjtype);
		Date Idtefdate ;
		if(!zjtefdate.isEmpty()){
			 Idtefdate = DateUtil.tranObj2Date(zjtefdate, "yyyy-MM-dd");
		}else{
			Idtefdate = null;
		}
		tCustCerti.setIdtefdate(Idtefdate);
		Date Idlefdate ;
		if(!zjlefdate.isEmpty()){
			Idlefdate = DateUtil.tranObj2Date(zjlefdate, "yyyy-MM-dd");
		}else{
			Idlefdate = null;
		}
		tCustCerti.setIdlefdate(Idlefdate);
		Date Idasdate ;
		if(!zjasdate.isEmpty()){
			Idasdate = DateUtil.tranObj2Date(zjasdate, "yyyy-MM-dd");
		}else{
			Idasdate = null;
		}
		tCustCerti.setIdasdate(Idasdate);
		int flag = tCustCertiService.updateByExampleSelective(tCustCerti, example2);
		if(flag < 1){
			logger.info("修改证件信息失败");
			return "修改证件信息失败";
		}
		logger.info("修改证件信息成功");
		return Constant.SUCCESS;
	}
	
	/**
	 * 删除证件信息
	 * @author licc
	 */
	@RequestMapping(value = "/companys/delTCustCerti")
	@ResponseBody
	public String delTCustCerti(String id){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始删除证件信息" , user.getUserid());
		
		int flag = tCustCertiService.deleteByPrimaryKey(id);
		if(flag < 1){
			logger.info("删除证件信息失败");
			return "删除证件信息失败";
		}
		logger.info("删除证件信息成功");
		return Constant.SUCCESS;
	}
	
	/**
	 * 删除附件信息
	 * @author licc
	 */
	@RequestMapping(value="/companys/delAccess")
	@ResponseBody
	public String delAccess(String id){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始删除附件信息" , user.getUserid());
		
		Long accId = Long.valueOf(id); 
		int flag = accessoryInfoService.deleteByPrimaryKey(accId);
		if(flag < 1){
			logger.info("删除附件信息失败");
			return "删除附件信息失败";
		}
		logger.info("删除附件信息成功");
		return Constant.SUCCESS;
	}
	
	/**
	 * 修改审计数据
	 * @author licc
	 */
	@RequestMapping(value = "/companys/modFinal")
	@ResponseBody
	public String modFinal(String sjId, String num , String val){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始修改审计信息" , user.getUserid());
		
		FinacialValExample example4 = new FinacialValExample();
		FinacialValExample.Criteria criteria4 = example4.createCriteria();
		criteria4.andIdEqualTo(sjId);
		FinacialVal finacialVal = new FinacialVal();
		finacialVal.setNum(num);
		finacialVal.setVal(val);
		finacialVal.setInputdt(DateUtil.getDate("yyyy-MM"));
		int flag = finacialValService.updateByExampleSelective(finacialVal, example4);
		if(flag < 1){
			logger.info("修改审计数据失败");
			return "修改审计数据失败";
		}
		logger.info("修改审计数据成功");
		return Constant.SUCCESS;
	}
	
	
	/**
	 * 删除审计数据
	 * @author licc
	 */
	@RequestMapping(value = "/companys/delFinal")
	@ResponseBody
	public String delFinal(String id){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始删除审计信息" , user.getUserid());
		
		int flag = finacialValService.deleteByPrimaryKey(id);
		if(flag < 1){
			logger.info("删除审计数据失败");
			return "删除审计数据失败";
		}
		logger.info("删除审计数据成功");
		return Constant.SUCCESS;
	}
	
	/**
	 * 批量导出Excel
	 * @author licc
	 */
	@RequestMapping(value = "/companys/exportExcel")
	@ResponseBody
	public Map<String, Object> setCustomerExcel(HttpServletRequest request , String companyname, String contacts, String userid){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始将企业客户列表数据存入excel", user.getUserid());
		//用于存储返回数据
		Map<String,Object> fileData = new HashMap<String,Object>();
		//表头
				String[] header = {"客户编号", "企业名称", "成立时间", "联系人",
						"企业类型", "联系人电话", "录入人", "录入时间", "区县"};	
		//用于获取表格相符数据
		String[] keys = {"companynum", "companyname", "createtime", "contacts",
				"companytype", "contactnumber", "userid", "addtime", "county"};
		//文件名称
		String fileName = UUID.randomUUID().toString().replaceAll("-", "");
		
		//生成文件地址
		String path = request.getSession().getServletContext().getRealPath("/") + "WEB-INF/template/customer_info";
		
		//标题
		String title = "企业客户信息列表";
		
		//二级标题
		String secTitle = user.getId() + " - " + DateUtil.formatDate(new Date(), "yyyy年MM月dd日 HH时mm分ss秒");
		
		CustomerInfoExample example = new CustomerInfoExample();
		if(StringUtil.isNotEmpty(companyname) && StringUtil.isNotEmpty(contacts) && StringUtil.isNotEmpty(userid)){
			CustomerInfoExample.Criteria criteria = example.createCriteria();
			criteria.andCompanynameEqualTo(companyname);
			criteria.andContactsEqualTo(contacts);
			criteria.andUseridEqualTo(userid);
		}
		List<CustomerInfo>  customerInfos = customerInfoService.selectByExample(example);
		
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
			map.put(keys[3], StringUtil.isNotEmpty(cI.getContacts()) ? cI.getContacts() : "");
			map.put(keys[4], StringUtil.isNotEmpty(cI.getCompanytype()) ? cI.getCompanytype() : "");
			map.put(keys[5], StringUtil.isNotEmpty(cI.getContactnumber()) ? cI.getContactnumber() : "");
			map.put(keys[6], StringUtil.isNotEmpty(cI.getUserid()) ? cI.getUserid() : "");
			map.put(keys[7], DateUtil.formatDate(cI.getAddtime(),"yyyy-MM-dd HH:mm:ss"));
			map.put(keys[8], StringUtil.isNotEmpty(cI.getCounty()) ? cI.getCounty() : "");
			data.add(map);
		}
		
		ExcelUtil.setListMapToExcel(path, fileName, title, secTitle, header, keys, data);

		logger.info("存入excel成功");
		fileData.put("msg", "0");
		fileData.put("name", fileName);
		return fileData;
	}
	/**
	 * 导出企业客户列表数据文件
	 * @author licc 
	 * @param name	文件名称
	 * @param reauest
	 * @return
	 */
	@RequestMapping(value="/companys/downExcel")
	public ResponseEntity<byte[]> downCompanyFile(HttpServletRequest request, String fileName){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 进入导出企业客户列表数据文件",user.getUserid());
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
			String outFileName = "企业客户信息列表.xls";
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
	 * @author licc 
	 * @param request
	 * @param name
	 * @return
	 */
	@RequestMapping(value = "/companys/deleteExcel")
	@ResponseBody
	public String deleteCompanyExcel(HttpServletRequest request, String fileName) {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 进入企业客户信息列表删除excel文件", user.getUserid());
		logger.info("删除文件名为 - [{}]", fileName);
		
		String path = request.getSession().getServletContext().getRealPath("/") + "WEB-INF/template/customer_info" + File.separator  + fileName  + ".xls";
		
		File file = new File(path);
		
		file.delete();
		logger.info("删除文件成功");
		return Constant.SUCCESS;
	}
	
	
	/**
	 * 跳转到个人客户列表页面
	 * 
	 * @author xuj 
	 * @return
	 */
	@RequestMapping(value = "/person/list")
	public String toPersonList() {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始跳转到个人客户列表页面", user.getUserid());
		return "customer/per_customer_list";
	}
	
	
	
	
	/**
	 * 获取个人客户列表数据
	 * @author xuj
	 * @param rows
	 * @param page
	 * @param perCusVo
	 * @return
	 */
	
	@RequestMapping(value="/person/list/get")
	@ResponseBody
	public PageInfo<?> getPersonCustomerList(@RequestParam(value="rows", required=false) int rows, 
			@RequestParam(value = "page", required=false) int page, PerCustomerInfoVo perCusVo,Model model ) {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始获取个人客户列表信息", user.getUserid());
		
		PerCustomerInfoExample example = new PerCustomerInfoExample();
		PerCustomerInfoExample.Criteria criteria = example.createCriteria();
		//客户名称
		if(StringUtil.isNotEmpty(perCusVo.getUsername())){
			criteria.andUsernameEqualTo(perCusVo.getUsername());
		}
		
		//客户编号
		if(StringUtil.isNotEmpty(perCusVo.getPernum())){
			criteria.andPernumEqualTo(perCusVo.getPernum());
		}
		example.setOrderByClause("CREATETIME DESC" );
		return perCustomerInfoService.getPersonCustomerList(page, rows, example);
	}
	
	/**
	 * 删除个人客户信息
	 * @param id
	 * @author xuj
	 * @return
	 */
	@RequestMapping(value= "/person/del")
	@ResponseBody
	public String  delPersonInfo(String id){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始删除个人客户信息", user.getUserid());
		
		if(StringUtil.isEmpty(id)) {
			logger.info("获取个人客户信息ID为空");
			return "删除失败";
		}
		int flag;
		ProjectInfoExample pInfoExample = new ProjectInfoExample();
		ProjectInfoExample.Criteria criteria = pInfoExample.createCriteria();
		criteria.andCustomeridEqualTo(id);
		criteria.andStatusNotEqualTo("4");
		
		List<ProjectInfo> pInfoList =   projectInfoService.selectByExample(pInfoExample);
		
		if(pInfoList == null || pInfoList.size() == 0){
			 flag = perCustomerInfoService.deletePersonInfos(id);
		}else{
			flag = 0;
			PerCustomerInfo per = perCustomerInfoService.selectByPrimaryKey(id);
			logger.info("删除客户信息失败!" + per.getUsername() + "有关联项目不允许删除");
		}
		
		if(flag < 1) {
			logger.info("删除个人客户信息失败");
			return "删除失败";
		}
		
		logger.info("删除个人客户信息成功");
		return Constant.SUCCESS;
	}
	
	/**
	 * 跳转到添加个人客户列表页面
	 * 
	 * @author xuj 
	 * @return
	 */
	@RequestMapping(value = "/person/list/add")
	public String toPersonListAdd(Model model) {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始跳转到个人客户列表添加页面", user.getUserid());
		
		TDataDictExample example = new TDataDictExample();
		TDataDictExample.Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo("1");
		List<TDataDict> tdataDicts = tdatadictService.selectByExample(example); //数据字典
			
		model.addAttribute("tdataDicts",tdataDicts);
		
		model.addAttribute("percustomerId",UuidUtil.getUuid());	//个人基本信息id
		model.addAttribute("assetInfosId",UuidUtil.getUuid());//资产信息id
		model.addAttribute("liabId",UuidUtil.getUuid());//负债信息id
		
		return "customer/per_customer_add";
	}
	
	/**
	 * 添加个人客户基本信息
	 * @author xj
	 * @param perCustomerInfo
	 * @param contactsName 联系人名字
	 * @param relation 关系
	 * @param contactsPhone 联系人电话
	 * @param percustomerId
	 * @return
	 */
	@RequestMapping(value="/person/add")
	@ResponseBody
	public String addPersonInfo(PerCustomerInfo perCustomerInfo,String[]contactsName, 
			String[]relation, String[]contactsPhone,String percustomerId){
		
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("添加个人客户基本信息---addPersonInfo");
		String projectNum = perCustomerInfoService.getMaxProjectNum();
		
		Map<String, Object> contactsMap = new HashMap<String, Object>();
		contactsMap.put("contactsName", contactsName);
		contactsMap.put("contactsPhone", contactsPhone);
		contactsMap.put("relation", relation);
		
		if(StringUtil.isEmpty(projectNum)) {
			projectNum = "000001";
		}else{
			projectNum = Integer.parseInt(projectNum) + 1 + "";
		} 
		
		perCustomerInfo.setId(percustomerId);
		perCustomerInfo.setPernum(projectNum);
		perCustomerInfo.setInputuserid(user.getUserid());
		perCustomerInfo.setCustype("1");
		
		if(StringUtil.isNotEmpty(perCustomerInfo.getCompanyid())){
			perCustomerInfo.setCompanyid(perCustomerInfo.getCompanyid());
		}
		
		int flag = perCustomerInfoService.addPersonInfo(perCustomerInfo,contactsMap);
		if(flag < 1){
			logger.info("添加个人客户信息失败");
			return "添加个人客户信息失败"; 
		}
		
		logger.info("添加个人客户信息成功");
		return  Constant.SUCCESS;
	}
	
	/**
	 * 添加个人客户信息--证件信息
	 * @author xuj
	 * @return
	 */
	@RequestMapping(value="/person/addAnnexdocs")
	@ResponseBody
	public String addAnnexDocs(AnnexDocs annexdocs ,AccessoryInfo accessoryInfo){
		annexdocs.setUploaddt(DateUtil.formatDate(new Date(),"yyyy-MM-dd HH:mm:ss"));
		annexdocs.setId(UuidUtil.getUuid());
		//查询附件信息表最大id值
		String fileId = accessoryInfoService.getMaxId();
		annexdocs.setFileid(fileId);
		int flag = annexDocsService.insertSelective(annexdocs);
		
		if(flag < 1){
			logger.info("添加个人客户证件信息失败");
			return "添加个人客户证件信息失败"; 
		}
		
		logger.info("添加个人客户证件信息成功");
		return Constant.SUCCESS;
	}
	
	
	
	/**
	 * 个人客户信息--查询负债信息
	 * @author xuj
	 * @param rows
	 * @param page
	 * @param liabs
	 * @return
	 */
	@RequestMapping(value="/person/list/getLoadLiabs")
	@ResponseBody
	public PageInfo<?> loadLiabsInfo(@RequestParam(value="rows", required=false) int rows, 
			@RequestParam(value = "page", required=false) int page, String perid){
		logger.info("开始查询负债信息");
		
		LiabilitiesInfosExample example = new LiabilitiesInfosExample();
		LiabilitiesInfosExample.Criteria criteria = example.createCriteria();
		
		criteria.andPeridEqualTo(perid);
		example.setOrderByClause("CREATETIME DESC" );
		
		return  liabilitiesInfosService.loadLiabsInfo(page, rows, example);
	}
	/**
	 * 个人客户列表--删除负债信息
	 * @author xuj
	 * @param id
	 * @return
	 */
	@RequestMapping(value="person/list/delLoadLiabs")
	@ResponseBody
	public String delLiab(String id){
		logger.info("开始删除负债信息");
		int flag = liabilitiesInfosService.deleteByPrimaryKey(id);
		if(flag < 1){
			logger.info("删除负债信息失败");
			return "删除负债信息失败";
		}
		logger.info("删除负债信息成功");
		return Constant.SUCCESS;
	}
	
	/**
	 * 个人客户列表----添加负债信息
	 * @author xuj
	 * @param liabilitiesInfos
	 * @return
	 */
	@RequestMapping(value="/person/list/addLoadLiabs")
	@ResponseBody
	public String addLiab(LiabilitiesInfos liabilitiesInfos){
		logger.info("开始添加负债信息");
		liabilitiesInfos.setCreatetime(new Date());
		liabilitiesInfos.setId(UuidUtil.getUuid());
		int flag = liabilitiesInfosService.insertSelective(liabilitiesInfos);
		if(flag < 1){
			logger.info("添加负债信息失败");
			return "添加负债信息失败";
		}
		logger.info("添加负债信息成功");
		return Constant.SUCCESS;
	}
	
	/**
	 * 个人客户信息--查询资产信息
	 * @author xuj
	 * @param rows
	 * @param page
	 * @return
	 */
	@RequestMapping(value="/person/list/getLoadAssetInfo")
	@ResponseBody
	public PageInfo<?> loadAssetInfo(@RequestParam(value="rows", required=false) int rows, 
			@RequestParam(value = "page", required=false) int page, String perid){
		logger.info("开始查询资产信息");
		
		AssetInfosExample example = new AssetInfosExample();
		AssetInfosExample.Criteria criteria = example.createCriteria();
		
		
		criteria.andPeridEqualTo(perid);
		example.setOrderByClause("CREATETIME DESC");
		
		return assetInfosService.loadAssetInfo(rows, page, example);
	}
	
	/**
	 * 个人客户列表----添加资产信息
	 * @author xuj
	 * @param assetInfos
	 * @return
	 */
	@RequestMapping(value="/person/list/addAssetInfo")
	@ResponseBody
	public String addAccetInfo(AssetInfos assetInfos){
		logger.info("开始添加资产信息");
		assetInfos.setCreatetime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
		assetInfos.setId(UuidUtil.getUuid());
		int flag = assetInfosService.insertSelective(assetInfos);
		if(flag < 1){
			logger.info("添加资产信息失败");
			return "添加资产信息失败";
		}
		logger.info("添加资产信息成功");
		return Constant.SUCCESS;
	}
	
	/**
	 * 个人客户列表--删除资产信息
	 * @author xuj
	 * @param id
	 * @return
	 */
	@RequestMapping(value="person/list/delLoadAssInfo")
	@ResponseBody
	public String delAssInfo(String id){
		logger.info("开始删除资产信息");
		int flag = assetInfosService.deleteByPrimaryKey(id);
		if(flag < 1){
			logger.info("删除资产信息失败");
			return "删除资产信息失败";
		}
		logger.info("删除资产信息成功");
		return Constant.SUCCESS;
	}
	
	/**
	 * 个人客户列表--查询企业信息
	 * @author xuj
	 * @param rows
	 * @param page
	 * @param customerInfo
	 * @return
	 */
	@RequestMapping(value="/person/company/list")
	@ResponseBody
	public PageInfo<?> getCompanyList(CustomerInfo customerInfo){
		logger.info("开始查询企业信息");
		CustomerInfoExample  example = new CustomerInfoExample();
		CustomerInfoExample.Criteria criteria = example.createCriteria();
		
		if(StringUtil.isNotEmpty(customerInfo.getCompanyname())){
			criteria.andCompanynameEqualTo(customerInfo.getCompanyname());
		}
		if(StringUtil.isNotEmpty(customerInfo.getCompanynum())){
			criteria.andCompanynumEqualTo(customerInfo.getCompanynum());
		}
		
		List<CustomerInfo> customers = customerInfoService.selectByExample(example);
		PageInfo<CustomerInfo> pageInfo = new PageInfo<>();
		pageInfo.setList(customers);
		
		return pageInfo;
	}
	
	

	/**
	 * 跳转到修改个人客户列表页面
	 * 
	 * @author xuj 
	 * @return
	 */
	@RequestMapping(value = "/person/list/mod")
	public String toPersonListMod(Model model,String id) {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 进入个人客户列表修改页面", user.getUserid());
		
		TDataDictExample example = new TDataDictExample();
		TDataDictExample.Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo("1");
		List<TDataDict> tdataDicts = tdatadictService.selectByExample(example); //数据字典
			
		model.addAttribute("tdataDicts",tdataDicts);
		
		PerCustomerInfo perCustomerInfo =  perCustomerInfoService.selectByPrimaryKey(id);
		if(perCustomerInfo != null){
			model.addAttribute("perCustomerInfo", perCustomerInfo);
		}
		
		//根据perid查询辅助联系人
		AuxiliaryContactExample auxiaryExample = new AuxiliaryContactExample();
		AuxiliaryContactExample.Criteria auxiaryCriteria = auxiaryExample.createCriteria();
		auxiaryCriteria.andPeridEqualTo(id);
		List<AuxiliaryContact>  auxiliarys = auxiliaryContactService.selectByExample(auxiaryExample);
		if(!auxiliarys.isEmpty()){
			model.addAttribute("auxiliarys", auxiliarys);
		}
		
		//查询关联企业名称
		CustomerInfo customersInfos = customerInfoService.selectByPrimaryKey(perCustomerInfo.getCompanyid());
		if(customersInfos !=null){
			model.addAttribute("customerName", customersInfos.getCompanyname());
		}
		
		return "customer/per_customer_update";
	}
	
	
	/**
	 * 开始修改个人客户信息
	 * @author xuj 
	 * @return
	 */
	@RequestMapping(value = "/person/modPersonInfo")
	@ResponseBody
	public String modPersonInfo(PerCustomerInfo percustomer,String[]contactsName,String[]relation, String[]contactsPhone) {
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 开始修改个人客户信息", user.getUserid());
		
		Map<String, Object> contactsMap = new HashMap<String, Object>();
		contactsMap.put("contactsName", contactsName);
		contactsMap.put("contactsPhone", contactsPhone);
		contactsMap.put("relation", relation);
		int flag = perCustomerInfoService.updatePersonInfo(percustomer,contactsMap);
		
		if(flag < 1) {
			logger.info("修改个人客户信息失败");
			return "修改个人客户信息失败";
		}
		
		logger.info("修改个人客户信息成功");
		return Constant.SUCCESS;
	}
	
	/**
	 * 个人客户信息详情
	 * @author xj
	 */
	@RequestMapping(value = "/person/list/view")
	public String viewPersonInfo(String id , Model model){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 进入个人客户信息详情页面", user.getUserid());
		
		List<TDataDict> dataDicts = tdatadictService.selectByExample(new TDataDictExample());
		model.addAttribute("dataDicts",JsonUtil.toJson(dataDicts));
		
		PerCustomerInfo personInfos = perCustomerInfoService.selectByPrimaryKey(id);
		model.addAttribute("personInfos", personInfos);
		
		LiabilitiesInfosExample example = new LiabilitiesInfosExample();
		LiabilitiesInfosExample.Criteria criteria = example.createCriteria();
		criteria.andPeridEqualTo(id);
		List<LiabilitiesInfos> liabilitiesInfos = liabilitiesInfosService.selectByExample(example);
		if(!liabilitiesInfos.isEmpty()){
			model.addAttribute("liabilitiesInfos", liabilitiesInfos);
		}
		
		AssetInfosExample example2 = new AssetInfosExample();
		AssetInfosExample.Criteria criteria2 = example2.createCriteria();
		criteria2.andPeridEqualTo(id);
		 List<AssetInfos> assetInfos = assetInfosService.selectByExample(example2);
		 if(!assetInfos.isEmpty()){
			 model.addAttribute("assetInfos", assetInfos);
		 }
		 
		 AuxiliaryContactExample example3 = new AuxiliaryContactExample();
		 AuxiliaryContactExample.Criteria criteria3 = example3.createCriteria();
		 criteria3.andPeridEqualTo(id);
		 List<AuxiliaryContact> auxiliaryContacts = auxiliaryContactService.selectByExample(example3);
		 if(!auxiliaryContacts.isEmpty()){
			 model.addAttribute("auxiliaryContacts", auxiliaryContacts);
		 }
		 
		 AnnexDocsExample example4 = new AnnexDocsExample();
		 AnnexDocsExample.Criteria criteria4 = example4.createCriteria();
		 criteria4.andPeridEqualTo(id);
		 List<AnnexDocs> annexDocs = annexDocsService.selectByExample(example4);
		 if(!annexDocs.isEmpty()){
			 model.addAttribute("annexDocs", annexDocs);
		 }
		return "customer/per_customer_view";
	}
	
	/**
	 * 查询客户关联企业
	 * @author xuj
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/person/companysview")
	@ResponseBody
	public Map<String, Object> viewCompanyInfos(String id,Model model){
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户[{}] - 查询客户关联企业" , user.getUserid());
		CustomerInfo customerInfo = customerInfoService.selectByPrimaryKey(id);
		
		Map<String, Object> map = new HashMap<>();
		map.put("customerInfo", customerInfo);
		
		TCustAcctExample example = new TCustAcctExample();
		TCustAcctExample.Criteria criteria = example.createCriteria();
		criteria.andCustomeridEqualTo(id);
		List<TCustAcct> tCustAcct = tCustAcctService.selectByExample(example);
		map.put("tCustAcct", tCustAcct);
		
		TCustCertiExample example2 = new TCustCertiExample();
		TCustCertiExample.Criteria criteria2 = example2.createCriteria();
		criteria2.andCustomeridEqualTo(id);
		List<TCustCerti> tCustCerti = tCustCertiService.selectByExample(example2);
		map.put("tCustCerti", tCustCerti);
		
		AccessoryInfoExample example3 = new AccessoryInfoExample();
		AccessoryInfoExample.Criteria criteria3 = example3.createCriteria();
		criteria3.andTableidEqualTo(id);
		List<AccessoryInfo> accessoryInfos = accessoryInfoService.selectByExample(example3);
		map.put("accessoryInfos", accessoryInfos);
		
		FinacialValExample example4 = new FinacialValExample();
		FinacialValExample.Criteria criteria4 = example4.createCriteria();
		criteria4.andCustomidEqualTo(id);
		map.put("finacialVals", finacialValService.selectByExample(example4));
		
		map.put("res", Constant.SUCCESS);
		return map;
	}

	/**
	 * 前往添加企业信息页面
	 *
	 * @return 添加企业信息页面地址
	 */
	@RequestMapping(value = "enterprise/toAdd")
	public String toAddEnterprise() {
		TUsers users = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户 [{}] - 开始前往添加企业信息页面", users.getId());

		return "user_jsp/enter/enterprise_add";
	}


	/**
	 * 开始添加企业信息
	 *
	 * @return 是否添加成功
	 */
	@RequestMapping(value = "enterprise/add", method = RequestMethod.POST)
	@ResponseBody
	public String addEnterprise(EnterpriseInfoVo enterpriseInfoVo) {
		TUsers users = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户 [{}] - 开始添加企业信息", users.getId());

		enterpriseInfoService.saveEnterprise(enterpriseInfoVo);

		logger.info("添加企业信息成功");
		return Constant.SUCCESS;
	}

	/**
	 * 保存附件
	 *
	 * @author pangpengj
	 */
	@RequestMapping(value="/enterprise/uploadFile")
	@ResponseBody
	public Result<String> uploadFile(MultipartFile myfile, HttpServletRequest request, String customerId) throws IOException, ServletException{
		TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户 {} - 开始保存附件", user.getId());
		Result<String> result = new Result<>();

		UploadFileVo uploadFileVo = UploadFileUtil.newUploadFile(myfile, request);

		if (uploadFileVo == null) {
			logger.info("保存附件失败");
			return result.error("保存附件失败");
		}

		logger.info("保存附件成功");
		return result.success(uploadFileVo.getFilePath());
	}

	/**
	 * 开始更新企业信息
	 *
	 * @return 是否更新成功
	 */
	@RequestMapping(value = "enterprise/update", method = RequestMethod.POST)
	@ResponseBody
	public String updateEnterprise(EnterpriseInfoVo enterpriseInfoVo) {
		TUsers users = (TUsers) SecurityUtils.getSubject().getPrincipal();
		logger.info("用户 [{}] - 开始更新企业信息", users.getId());

		enterpriseInfoService.updateEnterprise(enterpriseInfoVo);

		logger.info("更新企业信息成功");
		return Constant.SUCCESS;
	}
}

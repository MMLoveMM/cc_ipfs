package cn.net.sinodata.service.Impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.net.sinodata.controller.CustomerController;
import cn.net.sinodata.mapper.CustomerInfoMapper;
import cn.net.sinodata.model.CustomerInfo;
import cn.net.sinodata.model.CustomerInfoExample;
import cn.net.sinodata.model.CustomerInfoWithBLOBs;
import cn.net.sinodata.model.FinacialVal;
import cn.net.sinodata.model.TCustAcct;
import cn.net.sinodata.model.TCustCerti;
import cn.net.sinodata.service.CustomerInfoService;
import cn.net.sinodata.service.FinacialValService;
import cn.net.sinodata.service.TCustAcctService;
import cn.net.sinodata.service.TCustCertiService;
import cn.net.sinodata.util.DateUtil;
import cn.net.sinodata.util.StringUtil;
import cn.net.sinodata.util.UuidUtil;
import cn.net.sinodata.vo.CustomerInfoVo;
import net.sf.json.JSONArray;

@Service
public class CustomerInfoServiceImpl implements CustomerInfoService {

	private Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	private CustomerInfoMapper customerInfoMapper;
	
	@Autowired
	private TCustAcctService tCustAcctService;
	
	@Autowired
	private TCustCertiService tCustCertiService;
	
	@Autowired
	private  FinacialValService finacialValService;
	
	public int countByExample(CustomerInfoExample example) {
		
		return customerInfoMapper.countByExample(example);
	}

	public int deleteByExample(CustomerInfoExample example) {
		
		return customerInfoMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return customerInfoMapper.deleteByPrimaryKey(id);
	}

	public int insert(CustomerInfoWithBLOBs record) {
		
		return customerInfoMapper.insert(record);
	}

	public int insertSelective(CustomerInfoWithBLOBs record) {
		
		return customerInfoMapper.insertSelective(record);
	}

	public List<CustomerInfo> selectByExample(CustomerInfoExample example) {
		
		return customerInfoMapper.selectByExample(example);
	}

	public int updateByExampleSelective(CustomerInfoWithBLOBs record, CustomerInfoExample example) {
		
		return customerInfoMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(CustomerInfo record, CustomerInfoExample example) {
		
		return customerInfoMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(CustomerInfoWithBLOBs record) {
		
		return customerInfoMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(CustomerInfo record) {
		
		return customerInfoMapper.updateByPrimaryKey(record);
	}

	public int insert(CustomerInfo record) {
		
		return customerInfoMapper.insert(record);
	}

	public int insertSelective(CustomerInfo record) {
		
		return customerInfoMapper.insertSelective(record);
	}

	public CustomerInfo selectByPrimaryKey(String id) {
		
		return customerInfoMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(CustomerInfo record, CustomerInfoExample example) {
		
		return customerInfoMapper.updateByExampleSelective(record, example);
	}

	public int updateByPrimaryKeySelective(CustomerInfo record) {
		
		return customerInfoMapper.updateByPrimaryKeySelective(record);
	}
	
	public PageInfo<?> getCustomerList(int page, int rows, CustomerInfoExample example) {
		PageHelper.startPage(page, rows);
		
		return new PageInfo<>(customerInfoMapper.selectByExample(example));
	}


	public int insertCustomerInfo(String companyNum,String userId,CustomerInfoVo customerInfoVo,String createtime,String customId) throws ParseException {
		//FinacialVal finacialVal2 = new FinacialVal();
		int flag = 1;
		
		//保存企业信息
		customerInfoVo.setId(customId);
		customerInfoVo.setCompanynum(companyNum);
		customerInfoVo.setUserid(userId);
		if(StringUtil.isNotEmpty(createtime)) {
			customerInfoVo.setCreateTime(DateUtil.formatDate(createtime));
		}
		
		logger.info("customerInfo2 : ", customerInfoVo);
		int CustomerInfoFlag = customerInfoMapper.insertSelective(customerInfoVo);
		if(CustomerInfoFlag < 1){
			flag = 0;
		}
		//保存账户信息
		logger.info("保存账户信息");
		String acctInfo = customerInfoVo.getAcctStr();
		
		List<TCustAcct> list = getAcctInfoList(acctInfo,customId);
		for(TCustAcct tCustAcct : list){
			int tCustAcctFlag = tCustAcctService.insertSelective(tCustAcct);
			if(tCustAcctFlag<1){
				flag = 0;
			}
		}
		
		
		//保存证件信息
		logger.info("保存证件信息");
		String certiInfo = customerInfoVo.getCertiStr();
		logger.info("certiInfo:",certiInfo);
		List<TCustCerti> list2 = getCertiInfoList(certiInfo,customId);
		for(TCustCerti tCustCerti : list2){
			int tCustCertiFlag = tCustCertiService.insertSelective(tCustCerti);
			if(tCustCertiFlag < 1){
				flag = 0;
			}
		}
		
		//保存审计信息
		logger.info("保存审计信息");
		String dataInfo = customerInfoVo.getDataStr();
		logger.info(dataInfo);
		List<FinacialVal> list3 = getDataInfoList(dataInfo,customId);
		for(FinacialVal finacialVal : list3){
			int finaflag = finacialValService.insertSelective(finacialVal);
			if(finaflag < 1){
				flag = 0;
			}
		}
		return flag;
	}


	private List<TCustCerti> getCertiInfoList(String certiInfo, String customId) {
		List<TCustCerti> list = new ArrayList<TCustCerti>();
		
		Map<String,Object> map = new HashMap<String,Object>();
		JSONArray jsonA = JSONArray.fromObject(certiInfo);
		Object[] obj = jsonA.toArray();
		if(obj != null && obj.length>0){
			for(int i=0; i<obj.length; i++){
				String str = jsonA.getString(i);
				String[] arr = str.replace("\"", "").replace("{", "").replace("}", "").split(",");
				for(String str1 : arr){
					String[] value1 = str1.split(":");
					String key ;
					String value ;
					if(value1.length == 1){
						 key = value1[0] == null ?"":value1[0];
						 value = "";
					}else{
						key = value1[0] == null ?"":value1[0];
						value = value1[1];
					}
					map.put(key, value);
				}
				TCustCerti certi = mapToCustCerti(map,customId);
				list.add(certi);
			}
		}
		return list;
	}

	private TCustCerti mapToCustCerti(Map<String, Object> map, String customId) {
		TCustCerti certi = new TCustCerti();
		certi.setId(UuidUtil.getUuid());
		certi.setCustomerid(customId);
		certi.setNation((String)map.get("nation"));
		certi.setIdtype((String)map.get("idtype"));
		certi.setIdno((String)map.get("idno"));
		Date Idtefdate;
		if(map.get("idTefdate") != null && map.get("idTefdate") != ""){
			Idtefdate = DateUtil.tranObj2Date(map.get("idTefdate").toString(),"yyyy-MM-dd");
		}else{
			Idtefdate = null;
		}
		certi.setIdtefdate(Idtefdate);
		Date Idlefdate ;
		if(map.get("idLefdate") != null && map.get("idLefdate") != ""){
			Idlefdate = DateUtil.tranObj2Date(map.get("idLefdate").toString(), null);
		}else{
			Idlefdate = null;
		}
		certi.setIdlefdate(Idlefdate);
		Date Idasdate;
		if(map.get("idAsdate") != null && map.get("idAsdate") != ""){
			Idasdate = DateUtil.tranObj2Date(map.get("idAsdate").toString(),"yyyy-MM-dd");
		}else{
			Idasdate = null;
		}
		certi.setIdasdate(Idasdate);
		certi.setCtime(new Date());
		certi.setStatus("0");
		return certi;
	}

	private List<TCustAcct> getAcctInfoList(String acctStr, String customId) {
		List<TCustAcct> list = new ArrayList<TCustAcct>();
		
		Map<String,Object> map = new HashMap<String,Object>();
		JSONArray jsonA = JSONArray.fromObject(acctStr);
		Object[] obj = jsonA.toArray();
		if(obj != null && obj.length>0){
			for(int i=0; i<obj.length; i++){
				String str = jsonA.getString(i);
				String[] arr = str.replace("\"", "").replace("{", "").replace("}", "").split(",");
				for(String str1 : arr){
					String[] value1 = str1.split(":");
					String key ;
					String value ;
					if(value1.length == 1){
						 key = value1[0] == null ?"":value1[0];
						 value = "";
					}else{
						key = value1[0] == null ?"":value1[0];
						value = value1[1];
					}
					map.put(key, value);
				}
				TCustAcct acct = mapToCustAcct(map,customId);
				list.add(acct);
			}
			
		}
		return list;
	}

	private TCustAcct mapToCustAcct(Map<String, Object> map, String customId) {
		TCustAcct acct = new TCustAcct();
		acct.setId(UuidUtil.getUuid());
		acct.setAcctname((String)map.get("acctName"));
		acct.setBankacct((String)map.get("bankAcct"));
		acct.setOpenbank((String)map.get("openBank"));
		acct.setCtime(new Date());
		acct.setStatus("0");
		acct.setCustomerid(customId);
		return acct;
	}

	
	private List<FinacialVal> getDataInfoList(String dataInfo, String customId) {
		List<FinacialVal> list = new ArrayList<FinacialVal>();
		
		Map<String,Object> map = new HashMap<String,Object>();
		StringBuffer data1 = new StringBuffer();
		if(StringUtil.isNotEmpty(dataInfo)){
			data1.append("[");
			data1.append(dataInfo);
			data1.append("]");
			JSONArray jsonA = JSONArray.fromObject(data1.toString());
			Object[] obj = jsonA.toArray();
			if(obj != null && obj.length>0){
				for(int i=0; i<obj.length; i++){
					String str = jsonA.getString(i);
					String[] arr = str.replace("\"", "").replace("{", "").replace("}", "").split(",");
					for(String str1 : arr){
						String[] value1 = str1.split(":");
						String key ;
						String value ;
						if(value1.length == 1){
							 key = value1[0] == null ?"":value1[0];
							 value = "";
						}else{
							key = value1[0] == null ?"":value1[0];
							value = value1[1];
						}
						map.put(key, value);
					}
					FinacialVal fina = mapToCustFina(map,customId);
					list.add(fina);
				}
			}
		}
		
		return list;
	}

	private FinacialVal mapToCustFina(Map<String, Object> map, String customId) {
		FinacialVal finacialVal = new FinacialVal();
		finacialVal.setId(UuidUtil.getUuid());
		finacialVal.setNum((String)map.get("num"));
		finacialVal.setVal((String)map.get("val"));
		finacialVal.setAuditdt((String)map.get("auditdt"));
		finacialVal.setCustomid(customId);
		finacialVal.setInputdt(DateUtil.getDate("yyyy-MM"));
		return finacialVal;
	}
	public String getMaxCompanyNum() {
		
		return customerInfoMapper.getMaxCompanyNum();
	}

	public int insertModCustomer(CustomerInfoVo customerInfoVo,String createtime,String customId) {
		
		CustomerInfoExample example = new CustomerInfoExample();
		CustomerInfoExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(customerInfoVo.getId());
		int flag = 1;
		if(StringUtil.isNotEmpty(createtime)) {
			customerInfoVo.setCreateTime(DateUtil.formatDate(createtime));
		}
		int CustomerInfoFlag = customerInfoMapper.updateByExample(customerInfoVo, example);
		logger.info("customerInfo2 : ", customerInfoVo);
		if(CustomerInfoFlag < 1){
			flag = 0;
		}
		//保存账户信息
		logger.info("保存账户信息");
		String acctInfo = customerInfoVo.getAcctStr();
		
		List<TCustAcct> list = getAcctInfoList1(acctInfo,customId);
		for(TCustAcct tCustAcct : list){
			int tCustAcctFlag = tCustAcctService.insertSelective(tCustAcct);
			if(tCustAcctFlag < 1){
				flag = 0;
			}
		}
		
		//保存证件信息
		logger.info("保存证件信息");
		String certiInfo = customerInfoVo.getCertiStr();
		logger.info("certiInfo:",certiInfo);
		List<TCustCerti> list2 = getCertiInfoList1(certiInfo,customId);
		for(TCustCerti tCustCerti : list2){
			int tCustCertiFlag = tCustCertiService.insertSelective(tCustCerti);
			if(tCustCertiFlag < 1){
				flag = 0;
			}
		}
		
		//保存审计信息
		logger.info("保存审计信息");
		String dataInfo = customerInfoVo.getDataStr();
		logger.info(dataInfo);
		List<FinacialVal> list3 = getDataInfoList(dataInfo,customId);
		for(FinacialVal finacialVal : list3){
			int finaflag = finacialValService.insertSelective(finacialVal);
			if(finaflag < 1){
				flag = 0;
			}
		}
		return flag;
	}
	
	private List<TCustAcct> getAcctInfoList1(String acctInfo, String customId) {
		List<TCustAcct> list = new ArrayList<TCustAcct>();
		Map<String,Object> map = new HashMap<String,Object>();
		StringBuffer acctStrdata = new StringBuffer();
		if(StringUtil.isNotEmpty(acctInfo)){
			acctStrdata.append("[");
			acctStrdata.append(acctInfo);
			acctStrdata.append("]");
			JSONArray jsonA = JSONArray.fromObject(acctStrdata.toString());
			Object[] obj = jsonA.toArray();
			if(obj != null && obj.length>0){
				for(int i=0; i<obj.length; i++){
					String str = jsonA.getString(i);
					String[] arr = str.replace("\"", "").replace("{", "").replace("}", "").split(",");
					for(String str1 : arr){
						String[] value1 = str1.split(":");
						String key ;
						String value ;
						if(value1.length == 1){
							 key = value1[0] == null ?"":value1[0];
							 value = "";
						}else{
							key = value1[0] == null ?"":value1[0];
							value = value1[1];
						}
						map.put(key, value);
					}
					TCustAcct acct = mapToCustAcct(map,customId);
					list.add(acct);
				}
			}
		}
		return list;
	}
	
	private List<TCustCerti> getCertiInfoList1(String certiInfo, String customId) {
		List<TCustCerti> list = new ArrayList<TCustCerti>();
		Map<String,Object> map = new HashMap<String,Object>();
		StringBuffer certdata = new StringBuffer();
		if(StringUtil.isNotEmpty(certiInfo)){
			certdata.append("[");
			certdata.append(certiInfo);
			certdata.append("]");
			JSONArray jsonA = JSONArray.fromObject(certdata.toString());
			Object[] obj = jsonA.toArray();
			if(obj != null && obj.length>0){
				for(int i=0; i<obj.length; i++){
					String str = jsonA.getString(i);
					String[] arr = str.replace("\"", "").replace("{", "").replace("}", "").split(",");
					for(String str1 : arr){
						String[] value1 = str1.split(":");
						String key ;
						String value ;
						if(value1.length == 1){
							 key = value1[0] == null ?"":value1[0];
							 value = "";
						}else{
							key = value1[0] == null ?"":value1[0];
							value = value1[1];
						}
						map.put(key, value);
					}
					TCustCerti certi = mapToCustCerti(map,customId);
					list.add(certi);
				}
			}
		}
		return list;
	}
	
	/**
	 * 获取企业客户联系人信息
	 * @author Xuj
	 */
	public PageInfo<?> getCompanyContactList(int page, int rows, CustomerInfoExample example) {
		PageHelper.startPage(page, rows);
		
		return new PageInfo<>(customerInfoMapper.selectByExample(example));
	}
}

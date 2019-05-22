package cn.net.sinodata.service.Impl;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import cn.net.sinodata.util.StringUtil;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.net.sinodata.mapper.PerCustomerInfoMapper;
import cn.net.sinodata.model.AccessoryInfo;
import cn.net.sinodata.model.AccessoryInfoExample;
import cn.net.sinodata.model.AnnexDocsExample;
import cn.net.sinodata.model.AssetInfosExample;
import cn.net.sinodata.model.AuxiliaryContact;
import cn.net.sinodata.model.AuxiliaryContactExample;
import cn.net.sinodata.model.LiabilitiesInfosExample;
import cn.net.sinodata.model.PerCustomerInfo;
import cn.net.sinodata.model.PerCustomerInfoExample;
import cn.net.sinodata.service.AccessoryInfoService;
import cn.net.sinodata.service.AnnexDocsService;
import cn.net.sinodata.service.AssetInfosService;
import cn.net.sinodata.service.AuxiliaryContactService;
import cn.net.sinodata.service.LiabilitiesInfosService;
import cn.net.sinodata.service.PerCustomerInfoService;
import cn.net.sinodata.util.DateUtil;
import cn.net.sinodata.util.UuidUtil;
import cn.net.sinodata.vo.PerCustomerInfoVo;

@Service
public class PerCustomerInfoServiceImpl implements PerCustomerInfoService {
	private static final Logger logger = LoggerFactory.getLogger(PerCustomerInfoServiceImpl.class);
	
	@Autowired
	private PerCustomerInfoMapper perCustomerInfoMapper;
	
	@Autowired
	private AssetInfosService assetInfosService;
	
	@Autowired
	private LiabilitiesInfosService liabilitiesInfosService;
	
	@Autowired
	private AuxiliaryContactService auxiliaryContactService;
	
	@Autowired
	private AnnexDocsService annexDocsService;
	
	@Autowired
	private AccessoryInfoService accessoryInfoService;
	
	
	public int countByExample(PerCustomerInfoExample example) {
		
		return perCustomerInfoMapper.countByExample(example);
	}

	public int deleteByExample(PerCustomerInfoExample example) {
		
		return perCustomerInfoMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		
		return perCustomerInfoMapper.deleteByPrimaryKey(id);
	}

	public int insert(PerCustomerInfo record) {
		
		return perCustomerInfoMapper.insert(record);
	}

	public int insertSelective(PerCustomerInfo record) {
		
		return perCustomerInfoMapper.insertSelective(record);
	}

	public List<PerCustomerInfo> selectByExample(PerCustomerInfoExample example) {
		
		return perCustomerInfoMapper.selectByExample(example);
	}

	public PerCustomerInfo selectByPrimaryKey(String id) {
		
		return perCustomerInfoMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(PerCustomerInfo record, PerCustomerInfoExample example) {
		
		return perCustomerInfoMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(PerCustomerInfo record, PerCustomerInfoExample example) {
		
		return perCustomerInfoMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(PerCustomerInfo record) {
		
		return perCustomerInfoMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(PerCustomerInfo record) {
		
		return perCustomerInfoMapper.updateByPrimaryKey(record);
	}
	
	/**
	 * 按照example连表查询PER_CUSTOMER_INFO和T_USERS
	 * @author xj
	 */
	public List<PerCustomerInfoVo> selectPerCustomerInfoVoByExample(PerCustomerInfoExample example) {
		
		return perCustomerInfoMapper.selectPerCustomerInfoVoByExample(example);
	}

	/**
	 * 查询个人客户基本信息
	 * @author xuj  
	 */
	public PageInfo<?> getCustomerInfo(int page, int rows,
			PerCustomerInfoExample example) {
		PageHelper.startPage(page, rows);
		return new PageInfo<>(perCustomerInfoMapper.selectByExample(example));
	}
	
	/**
	 * 获取个人客户列表数据
	 * @author xuj
	 */
	public PageInfo<?> getPersonCustomerList(int page, int rows, PerCustomerInfoExample example) {
		
		PageHelper.startPage(page, rows);
		
		return new PageInfo<>(perCustomerInfoMapper.selectPerCustomerInfoVoByExample(example));
	}

	/**
	 * 获取某列最大perNum值
	 * @author xuj
	 * @param col
	 * @return
	 */
	public String getMaxProjectNum() {
		return perCustomerInfoMapper.getMaxProjectNum();
	}

	/**
	 * 删除个人客户信息
	 * @author xuj
	 * @param perCustomerInfo
	 * @return
	 */
	public int deletePersonInfos(String id) {
		int flag = 1;
		
		//删除负债信息
		LiabilitiesInfosExample liabExample = new LiabilitiesInfosExample();
		LiabilitiesInfosExample.Criteria liabCriteria = liabExample.createCriteria();
		liabCriteria.andPeridEqualTo(id);
		
		if(!liabilitiesInfosService.selectByExample(liabExample).isEmpty()){
			int liabFlag = liabilitiesInfosService.deleteByExample(liabExample);
			if(liabFlag < 1){
				flag = 0;
				logger.info("删除负债信息失败");
				return flag;
			}
		}
		
		//删除资产信息
		AssetInfosExample assetExample = new AssetInfosExample();
		AssetInfosExample.Criteria assetCriteria = assetExample.createCriteria();
		assetCriteria.andPeridEqualTo(id);
		if(!assetInfosService.selectByExample(assetExample).isEmpty()){
			int assetFlag = assetInfosService.deleteByExample(assetExample);
			if(assetFlag < 1){
				flag = 0 ;
				logger.info("删除资产信息失败");
				return flag;
			}
		}
		
		//删除联系人信息
		AuxiliaryContactExample auxiliaryExample = new AuxiliaryContactExample();
		AuxiliaryContactExample.Criteria auCriteria = auxiliaryExample.createCriteria();
		auCriteria.andPeridEqualTo(id);
		if(!auxiliaryContactService.selectByExample(auxiliaryExample).isEmpty()){
			int auxiliaryFlag = auxiliaryContactService.deleteByExample(auxiliaryExample);
			if(auxiliaryFlag < 1){
				flag = 0 ;
				logger.info("删除联系人信息失败");
				return flag;
			}
		}
		
		AccessoryInfoExample accessoryExample = new AccessoryInfoExample();
		AccessoryInfoExample.Criteria accessoryCriteria = accessoryExample.createCriteria();
		accessoryCriteria.andTableidEqualTo(id);
		List<AccessoryInfo> accessorys = accessoryInfoService.selectByExample(accessoryExample);
		if(!accessorys.isEmpty()){
			for(int i=0; i<accessorys.size(); i++){
				 String url =accessorys.get(i).getAccessoryadd();
				 //删除该客户上传文件
				if(StringUtils.isNotEmpty(url)){
					File file = new File(url);
					if(file.exists()){
						file.delete();
					}
				}
			}
			//删除该客户所有附件信息
			int accessoryFlag = accessoryInfoService.deleteByExample(accessoryExample);
			if(accessoryFlag < 1){
				flag = 0;
				logger.info("删除附件信息失败");
				return flag;
			}	
		}
		
		AnnexDocsExample  annexExample = new AnnexDocsExample();
		AnnexDocsExample.Criteria annexCriteria = annexExample.createCriteria();
		annexCriteria.andPeridEqualTo(id);
		if(!annexDocsService.selectByExample(annexExample).isEmpty()){
			//删除证件信息
			int annexDocsFlag = annexDocsService.deleteByExample(annexExample);
			if(annexDocsFlag < 1){
				flag = 0;
				logger.info("删除证件信息失败");
				return flag;
			}
		}
		flag = perCustomerInfoMapper.deleteByPrimaryKey(id);
		
		
		return flag;
	}
	
	/**
	 * 添加个人客户信息
	 * @author xuj
	 * @param percustomerInfo
	 * @param auxiliaryContact
	 * @param annexDocs
	 * @return
	 */
	public int addPersonInfo(PerCustomerInfo percustomerInfo,Map<String, Object> contactsMap) {
		int flag = 1;
		percustomerInfo.setCreatetime(new Date());
		flag = perCustomerInfoMapper.insertSelective(percustomerInfo);
		
		String[] name = (String[]) contactsMap.get("contactsName");
		String[] phone = (String[]) contactsMap.get("contactsPhone");
		String[] relation = (String[]) contactsMap.get("relation");
		
		AuxiliaryContact contact = new AuxiliaryContact();
		if(name != null && !name.equals("")){
			for(int i=0; i<name.length; i++){
				if(StringUtil.isNotEmpty(name[i])){
					contact.setName(name[i]);
					contact.setId(UuidUtil.getUuid());
					contact.setPerid(percustomerInfo.getId());
					contact.setCreatetime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
					
					if(StringUtil.isNotEmpty(phone[i])){
						contact.setPhone(phone[i]);
					}
					if(StringUtil.isNotEmpty(relation[i])){
						contact.setRelation(relation[i]);
					}
					
				    int auxiFlag = auxiliaryContactService.insertSelective(contact);
				    if(auxiFlag < 1){
				    	flag = 0;
				     }
				}
			}
		}
		return flag;
	}
	
	/**
	 * 修改个人客户信息列表
	 * @author xuj
	 */   
	
	public int updatePersonInfo(PerCustomerInfo person,Map<String, Object> contactsMap) {
		String[] name = (String[]) contactsMap.get("contactsName");
		String[] phone = (String[]) contactsMap.get("contactsPhone");
		String[] relation = (String[]) contactsMap.get("relation");
		//更新辅助联系人
		AuxiliaryContactExample example = new AuxiliaryContactExample();
		AuxiliaryContactExample.Criteria criteria = example.createCriteria();
		criteria.andPeridEqualTo(person.getId());
		if(name != null && !name.equals("")){
			AuxiliaryContact contact = new AuxiliaryContact();
			auxiliaryContactService.deleteByExample(example);
			for(int i=0; i<name.length; i++){
				if(StringUtil.isNotEmpty(name[i])){
					contact.setName(name[i]);
					contact.setId(UuidUtil.getUuid());
					contact.setPerid(person.getId());
					contact.setUpdatetime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
					
					if(StringUtil.isNotEmpty(phone[i])){
						contact.setPhone(phone[i]);
					}
					if(StringUtil.isNotEmpty(relation[i])){
						contact.setRelation(relation[i]);
					}
					
				    int auxiFlag = auxiliaryContactService.insertSelective(contact);
				    if(auxiFlag < 1){
				    	int flag = 0;
				    	logger.info("更新联系人失败");
				    	return flag;
				     }
				}
			}
		}
		person.setUpdatetime(new Date());
		return perCustomerInfoMapper.updateByPrimaryKeySelective(person);
	}
	
	public PageInfo<?> getAssetMsg(int page, int rows, PerCustomerInfoExample example){
		PageHelper.startPage(page, rows);
		return new PageInfo(this.perCustomerInfoMapper.selectAssetMsgVoByExample(example));
	}

	public List<PerCustomerInfoVo> selectAssetMsgVoByExample(PerCustomerInfoExample example){
	    return this.perCustomerInfoMapper.selectAssetMsgVoByExample(example);
	}

	public PageInfo<?> getAssetReport(int page, int rows, PerCustomerInfoExample example){
	    PageHelper.startPage(page, rows);
	    return new PageInfo(this.perCustomerInfoMapper.selectAssetReportVoByExample(example));
	}

	public List<PerCustomerInfoVo> selectAssetReportVoByExample(PerCustomerInfoExample example) {
	    return this.perCustomerInfoMapper.selectAssetReportVoByExample(example);
	}
}
package cn.net.sinodata.model;

import java.util.Date;

public class CustomerInfo {
    /**
     * ID
     */
    private String id;

    /**
     * 
     */
    private String companynum;

    /**
     * 
     */
    private String companyname;

    /**
     * 企业法人
     */
    private String comanylegalperson;

    /**
     * 注册资金
     */
    private String registeredcapital;

    /**
     * 主营业务
     */
    private String mainbusiness;

    /**
     * 企业人数
     */
    private String employees;

    /**
     * 企业类型
     */
    private String companytype;

    /**
     * 企业注册地址
     */
    private String companyregisteradd;

    /**
     * 企业办公地址
     */
    private String companyofficeadd;

    /**
     * 联系人
     */
    private String contacts;

    /**
     * 职务
     */
    private String post;

    /**
     * 联系人电话
     */
    private String contactnumber;

    /**
     * 传真
     */
    private String fax;

    /**
     * 
     */
    private String phonenumber;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 企业简称
     */
    private String shortname;

    /**
     * 成立时间
     */
    private Date createTime;

    /**
     * 英文名称
     */
    private String englishname;

    /**
     * 实到资本
     */
    private String practicalcapital;

    /**
     * 行业类型
     */
    private String businesstype;

    /**
     * 区域类别划分
     */
    private String area;

    /**
     * 内外部标识
     */
    private String mark;

    /**
     * 是否高新技术企业
     */
    private String ishighindustry;

    /**
     * 客户规模
     */
    private String customersize;

    /**
     * 主要股东
     */
    private String shareholder;

    /**
     * 
     */
    private String director;

    /**
     * 主要管理者
     */
    private String managers;

    /**
     * 组织机构代码证
     */
    private String orgcode;

    /**
     * 组织机构代码证有效期
     */
    private String orgcodevaliditydate;

    /**
     * 营业执照号
     */
    private String businesslicense;

    /**
     * 营业执照有效期
     */
    private String buslicensevaldate;

    /**
     * 营业执照年检日
     */
    private String buslicensecheckdate;

    /**
     * 客户开户行
     */
    private String customerbank;

    /**
     * 账号
     */
    private String customeraccount;

    /**
     * 企业实际控制人
     */
    private String buicontrolperson;

    /**
     * 经营地址
     */
    private String operateadd;

    /**
     * 知识产权名称
     */
    private String inteproname;

    /**
     * 审计财务时间
     */
    private String auditfinancedate;

    /**
     * 资产
     */
    private String asset;

    /**
     * 净资产
     */
    private String netasset;

    /**
     * 应收
     */
    private String receivable;

    /**
     * 存货
     */
    private String inventory;

    /**
     * 总收入
     */
    private String totalincome;

    /**
     * 净利润
     */
    private String netprofit;

    /**
     * 负债
     */
    private String liabilities;

    /**
     * 备注
     */
    private String remark;

    /**
     * 
     */
    private String addtime;

    /**
     * 录入人
     */
    private String userid;

    /**
     * 
     */
    private String customerstatus;

    /**
     * 
     */
    private String subordination;

    /**
     * 
     */
    private String corporatecapacity;

    /**
     * 
     */
    private String customertype;

    /**
     * 
     */
    private String referee;

    /**
     * 
     */
    private String refereename;

    /**
     * 
     */
    private String customenterprisetype;

    /**
     * 公司规模
     */
    private String comsize;

    /**
     * 国家统计局标准客户四位行业代码
     */
    private String code;

    /**
     * 是否中关村园区
     */
    private String iszgccompany;

    /**
     * 区县
     */
    private String county;

    /**
     * 推荐状态    0 : 已推荐  1 : 未推荐
     */
    private String recommendStatus;

    /**
     * 认定情况
     */
    private String ldentifyTheSituation;

    /**
     * ID
     * @return ID ID
     */
    public String getId() {
        return id;
    }

    /**
     * ID
     * @param id ID
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 
     * @return COMPANYNUM 
     */
    public String getCompanynum() {
        return companynum;
    }

    /**
     * 
     * @param companynum 
     */
    public void setCompanynum(String companynum) {
        this.companynum = companynum == null ? null : companynum.trim();
    }

    /**
     * 
     * @return COMPANYNAME 
     */
    public String getCompanyname() {
        return companyname;
    }

    /**
     * 
     * @param companyname 
     */
    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    /**
     * 企业法人
     * @return COMANYLEGALPERSON 企业法人
     */
    public String getComanylegalperson() {
        return comanylegalperson;
    }

    /**
     * 企业法人
     * @param comanylegalperson 企业法人
     */
    public void setComanylegalperson(String comanylegalperson) {
        this.comanylegalperson = comanylegalperson == null ? null : comanylegalperson.trim();
    }

    /**
     * 注册资金
     * @return REGISTEREDCAPITAL 注册资金
     */
    public String getRegisteredcapital() {
        return registeredcapital;
    }

    /**
     * 注册资金
     * @param registeredcapital 注册资金
     */
    public void setRegisteredcapital(String registeredcapital) {
        this.registeredcapital = registeredcapital == null ? null : registeredcapital.trim();
    }

    /**
     * 主营业务
     * @return MAINBUSINESS 主营业务
     */
    public String getMainbusiness() {
        return mainbusiness;
    }

    /**
     * 主营业务
     * @param mainbusiness 主营业务
     */
    public void setMainbusiness(String mainbusiness) {
        this.mainbusiness = mainbusiness == null ? null : mainbusiness.trim();
    }

    /**
     * 企业人数
     * @return EMPLOYEES 企业人数
     */
    public String getEmployees() {
        return employees;
    }

    /**
     * 企业人数
     * @param employees 企业人数
     */
    public void setEmployees(String employees) {
        this.employees = employees == null ? null : employees.trim();
    }

    /**
     * 企业类型
     * @return COMPANYTYPE 企业类型
     */
    public String getCompanytype() {
        return companytype;
    }

    /**
     * 企业类型
     * @param companytype 企业类型
     */
    public void setCompanytype(String companytype) {
        this.companytype = companytype == null ? null : companytype.trim();
    }

    /**
     * 企业注册地址
     * @return COMPANYREGISTERADD 企业注册地址
     */
    public String getCompanyregisteradd() {
        return companyregisteradd;
    }

    /**
     * 企业注册地址
     * @param companyregisteradd 企业注册地址
     */
    public void setCompanyregisteradd(String companyregisteradd) {
        this.companyregisteradd = companyregisteradd == null ? null : companyregisteradd.trim();
    }

    /**
     * 企业办公地址
     * @return COMPANYOFFICEADD 企业办公地址
     */
    public String getCompanyofficeadd() {
        return companyofficeadd;
    }

    /**
     * 企业办公地址
     * @param companyofficeadd 企业办公地址
     */
    public void setCompanyofficeadd(String companyofficeadd) {
        this.companyofficeadd = companyofficeadd == null ? null : companyofficeadd.trim();
    }

    /**
     * 联系人
     * @return CONTACTS 联系人
     */
    public String getContacts() {
        return contacts;
    }

    /**
     * 联系人
     * @param contacts 联系人
     */
    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    /**
     * 职务
     * @return POST 职务
     */
    public String getPost() {
        return post;
    }

    /**
     * 职务
     * @param post 职务
     */
    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    /**
     * 联系人电话
     * @return CONTACTNUMBER 联系人电话
     */
    public String getContactnumber() {
        return contactnumber;
    }

    /**
     * 联系人电话
     * @param contactnumber 联系人电话
     */
    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber == null ? null : contactnumber.trim();
    }

    /**
     * 传真
     * @return FAX 传真
     */
    public String getFax() {
        return fax;
    }

    /**
     * 传真
     * @param fax 传真
     */
    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    /**
     * 
     * @return PHONENUMBER 
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     * 
     * @param phonenumber 
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    /**
     * 电子邮箱
     * @return EMAIL 电子邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 电子邮箱
     * @param email 电子邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 企业简称
     * @return SHORTNAME 企业简称
     */
    public String getShortname() {
        return shortname;
    }

    /**
     * 企业简称
     * @param shortname 企业简称
     */
    public void setShortname(String shortname) {
        this.shortname = shortname == null ? null : shortname.trim();
    }

    /**
     * 成立时间
     * @return CREATE_TIME 成立时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 成立时间
     * @param createTime 成立时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 英文名称
     * @return ENGLISHNAME 英文名称
     */
    public String getEnglishname() {
        return englishname;
    }

    /**
     * 英文名称
     * @param englishname 英文名称
     */
    public void setEnglishname(String englishname) {
        this.englishname = englishname == null ? null : englishname.trim();
    }

    /**
     * 实到资本
     * @return PRACTICALCAPITAL 实到资本
     */
    public String getPracticalcapital() {
        return practicalcapital;
    }

    /**
     * 实到资本
     * @param practicalcapital 实到资本
     */
    public void setPracticalcapital(String practicalcapital) {
        this.practicalcapital = practicalcapital == null ? null : practicalcapital.trim();
    }

    /**
     * 行业类型
     * @return BUSINESSTYPE 行业类型
     */
    public String getBusinesstype() {
        return businesstype;
    }

    /**
     * 行业类型
     * @param businesstype 行业类型
     */
    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype == null ? null : businesstype.trim();
    }

    /**
     * 区域类别划分
     * @return AREA 区域类别划分
     */
    public String getArea() {
        return area;
    }

    /**
     * 区域类别划分
     * @param area 区域类别划分
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * 内外部标识
     * @return MARK 内外部标识
     */
    public String getMark() {
        return mark;
    }

    /**
     * 内外部标识
     * @param mark 内外部标识
     */
    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    /**
     * 是否高新技术企业
     * @return ISHIGHINDUSTRY 是否高新技术企业
     */
    public String getIshighindustry() {
        return ishighindustry;
    }

    /**
     * 是否高新技术企业
     * @param ishighindustry 是否高新技术企业
     */
    public void setIshighindustry(String ishighindustry) {
        this.ishighindustry = ishighindustry == null ? null : ishighindustry.trim();
    }

    /**
     * 客户规模
     * @return CUSTOMERSIZE 客户规模
     */
    public String getCustomersize() {
        return customersize;
    }

    /**
     * 客户规模
     * @param customersize 客户规模
     */
    public void setCustomersize(String customersize) {
        this.customersize = customersize == null ? null : customersize.trim();
    }

    /**
     * 主要股东
     * @return SHAREHOLDER 主要股东
     */
    public String getShareholder() {
        return shareholder;
    }

    /**
     * 主要股东
     * @param shareholder 主要股东
     */
    public void setShareholder(String shareholder) {
        this.shareholder = shareholder == null ? null : shareholder.trim();
    }

    /**
     * 
     * @return DIRECTOR 
     */
    public String getDirector() {
        return director;
    }

    /**
     * 
     * @param director 
     */
    public void setDirector(String director) {
        this.director = director == null ? null : director.trim();
    }

    /**
     * 主要管理者
     * @return MANAGERS 主要管理者
     */
    public String getManagers() {
        return managers;
    }

    /**
     * 主要管理者
     * @param managers 主要管理者
     */
    public void setManagers(String managers) {
        this.managers = managers == null ? null : managers.trim();
    }

    /**
     * 组织机构代码证
     * @return ORGCODE 组织机构代码证
     */
    public String getOrgcode() {
        return orgcode;
    }

    /**
     * 组织机构代码证
     * @param orgcode 组织机构代码证
     */
    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode == null ? null : orgcode.trim();
    }

    /**
     * 组织机构代码证有效期
     * @return ORGCODEVALIDITYDATE 组织机构代码证有效期
     */
    public String getOrgcodevaliditydate() {
        return orgcodevaliditydate;
    }

    /**
     * 组织机构代码证有效期
     * @param orgcodevaliditydate 组织机构代码证有效期
     */
    public void setOrgcodevaliditydate(String orgcodevaliditydate) {
        this.orgcodevaliditydate = orgcodevaliditydate == null ? null : orgcodevaliditydate.trim();
    }

    /**
     * 营业执照号
     * @return BUSINESSLICENSE 营业执照号
     */
    public String getBusinesslicense() {
        return businesslicense;
    }

    /**
     * 营业执照号
     * @param businesslicense 营业执照号
     */
    public void setBusinesslicense(String businesslicense) {
        this.businesslicense = businesslicense == null ? null : businesslicense.trim();
    }

    /**
     * 营业执照有效期
     * @return BUSLICENSEVALDATE 营业执照有效期
     */
    public String getBuslicensevaldate() {
        return buslicensevaldate;
    }

    /**
     * 营业执照有效期
     * @param buslicensevaldate 营业执照有效期
     */
    public void setBuslicensevaldate(String buslicensevaldate) {
        this.buslicensevaldate = buslicensevaldate == null ? null : buslicensevaldate.trim();
    }

    /**
     * 营业执照年检日
     * @return BUSLICENSECHECKDATE 营业执照年检日
     */
    public String getBuslicensecheckdate() {
        return buslicensecheckdate;
    }

    /**
     * 营业执照年检日
     * @param buslicensecheckdate 营业执照年检日
     */
    public void setBuslicensecheckdate(String buslicensecheckdate) {
        this.buslicensecheckdate = buslicensecheckdate == null ? null : buslicensecheckdate.trim();
    }

    /**
     * 客户开户行
     * @return CUSTOMERBANK 客户开户行
     */
    public String getCustomerbank() {
        return customerbank;
    }

    /**
     * 客户开户行
     * @param customerbank 客户开户行
     */
    public void setCustomerbank(String customerbank) {
        this.customerbank = customerbank == null ? null : customerbank.trim();
    }

    /**
     * 账号
     * @return CUSTOMERACCOUNT 账号
     */
    public String getCustomeraccount() {
        return customeraccount;
    }

    /**
     * 账号
     * @param customeraccount 账号
     */
    public void setCustomeraccount(String customeraccount) {
        this.customeraccount = customeraccount == null ? null : customeraccount.trim();
    }

    /**
     * 企业实际控制人
     * @return BUICONTROLPERSON 企业实际控制人
     */
    public String getBuicontrolperson() {
        return buicontrolperson;
    }

    /**
     * 企业实际控制人
     * @param buicontrolperson 企业实际控制人
     */
    public void setBuicontrolperson(String buicontrolperson) {
        this.buicontrolperson = buicontrolperson == null ? null : buicontrolperson.trim();
    }

    /**
     * 经营地址
     * @return OPERATEADD 经营地址
     */
    public String getOperateadd() {
        return operateadd;
    }

    /**
     * 经营地址
     * @param operateadd 经营地址
     */
    public void setOperateadd(String operateadd) {
        this.operateadd = operateadd == null ? null : operateadd.trim();
    }

    /**
     * 知识产权名称
     * @return INTEPRONAME 知识产权名称
     */
    public String getInteproname() {
        return inteproname;
    }

    /**
     * 知识产权名称
     * @param inteproname 知识产权名称
     */
    public void setInteproname(String inteproname) {
        this.inteproname = inteproname == null ? null : inteproname.trim();
    }

    /**
     * 审计财务时间
     * @return AUDITFINANCEDATE 审计财务时间
     */
    public String getAuditfinancedate() {
        return auditfinancedate;
    }

    /**
     * 审计财务时间
     * @param auditfinancedate 审计财务时间
     */
    public void setAuditfinancedate(String auditfinancedate) {
        this.auditfinancedate = auditfinancedate == null ? null : auditfinancedate.trim();
    }

    /**
     * 资产
     * @return ASSET 资产
     */
    public String getAsset() {
        return asset;
    }

    /**
     * 资产
     * @param asset 资产
     */
    public void setAsset(String asset) {
        this.asset = asset == null ? null : asset.trim();
    }

    /**
     * 净资产
     * @return NETASSET 净资产
     */
    public String getNetasset() {
        return netasset;
    }

    /**
     * 净资产
     * @param netasset 净资产
     */
    public void setNetasset(String netasset) {
        this.netasset = netasset == null ? null : netasset.trim();
    }

    /**
     * 应收
     * @return RECEIVABLE 应收
     */
    public String getReceivable() {
        return receivable;
    }

    /**
     * 应收
     * @param receivable 应收
     */
    public void setReceivable(String receivable) {
        this.receivable = receivable == null ? null : receivable.trim();
    }

    /**
     * 存货
     * @return INVENTORY 存货
     */
    public String getInventory() {
        return inventory;
    }

    /**
     * 存货
     * @param inventory 存货
     */
    public void setInventory(String inventory) {
        this.inventory = inventory == null ? null : inventory.trim();
    }

    /**
     * 总收入
     * @return TOTALINCOME 总收入
     */
    public String getTotalincome() {
        return totalincome;
    }

    /**
     * 总收入
     * @param totalincome 总收入
     */
    public void setTotalincome(String totalincome) {
        this.totalincome = totalincome == null ? null : totalincome.trim();
    }

    /**
     * 净利润
     * @return NETPROFIT 净利润
     */
    public String getNetprofit() {
        return netprofit;
    }

    /**
     * 净利润
     * @param netprofit 净利润
     */
    public void setNetprofit(String netprofit) {
        this.netprofit = netprofit == null ? null : netprofit.trim();
    }

    /**
     * 负债
     * @return LIABILITIES 负债
     */
    public String getLiabilities() {
        return liabilities;
    }

    /**
     * 负债
     * @param liabilities 负债
     */
    public void setLiabilities(String liabilities) {
        this.liabilities = liabilities == null ? null : liabilities.trim();
    }

    /**
     * 备注
     * @return REMARK 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 
     * @return ADDTIME 
     */
    public String getAddtime() {
        return addtime;
    }

    /**
     * 
     * @param addtime 
     */
    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }

    /**
     * 录入人
     * @return USERID 录入人
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 录入人
     * @param userid 录入人
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * 
     * @return CUSTOMERSTATUS 
     */
    public String getCustomerstatus() {
        return customerstatus;
    }

    /**
     * 
     * @param customerstatus 
     */
    public void setCustomerstatus(String customerstatus) {
        this.customerstatus = customerstatus == null ? null : customerstatus.trim();
    }

    /**
     * 
     * @return SUBORDINATION 
     */
    public String getSubordination() {
        return subordination;
    }

    /**
     * 
     * @param subordination 
     */
    public void setSubordination(String subordination) {
        this.subordination = subordination == null ? null : subordination.trim();
    }

    /**
     * 
     * @return CORPORATECAPACITY 
     */
    public String getCorporatecapacity() {
        return corporatecapacity;
    }

    /**
     * 
     * @param corporatecapacity 
     */
    public void setCorporatecapacity(String corporatecapacity) {
        this.corporatecapacity = corporatecapacity == null ? null : corporatecapacity.trim();
    }

    /**
     * 
     * @return CUSTOMERTYPE 
     */
    public String getCustomertype() {
        return customertype;
    }

    /**
     * 
     * @param customertype 
     */
    public void setCustomertype(String customertype) {
        this.customertype = customertype == null ? null : customertype.trim();
    }

    /**
     * 
     * @return REFEREE 
     */
    public String getReferee() {
        return referee;
    }

    /**
     * 
     * @param referee 
     */
    public void setReferee(String referee) {
        this.referee = referee == null ? null : referee.trim();
    }

    /**
     * 
     * @return REFEREENAME 
     */
    public String getRefereename() {
        return refereename;
    }

    /**
     * 
     * @param refereename 
     */
    public void setRefereename(String refereename) {
        this.refereename = refereename == null ? null : refereename.trim();
    }

    /**
     * 
     * @return CUSTOMENTERPRISETYPE 
     */
    public String getCustomenterprisetype() {
        return customenterprisetype;
    }

    /**
     * 
     * @param customenterprisetype 
     */
    public void setCustomenterprisetype(String customenterprisetype) {
        this.customenterprisetype = customenterprisetype == null ? null : customenterprisetype.trim();
    }

    /**
     * 公司规模
     * @return COMSIZE 公司规模
     */
    public String getComsize() {
        return comsize;
    }

    /**
     * 公司规模
     * @param comsize 公司规模
     */
    public void setComsize(String comsize) {
        this.comsize = comsize == null ? null : comsize.trim();
    }

    /**
     * 国家统计局标准客户四位行业代码
     * @return CODE 国家统计局标准客户四位行业代码
     */
    public String getCode() {
        return code;
    }

    /**
     * 国家统计局标准客户四位行业代码
     * @param code 国家统计局标准客户四位行业代码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 是否中关村园区
     * @return ISZGCCOMPANY 是否中关村园区
     */
    public String getIszgccompany() {
        return iszgccompany;
    }

    /**
     * 是否中关村园区
     * @param iszgccompany 是否中关村园区
     */
    public void setIszgccompany(String iszgccompany) {
        this.iszgccompany = iszgccompany == null ? null : iszgccompany.trim();
    }

    /**
     * 区县
     * @return COUNTY 区县
     */
    public String getCounty() {
        return county;
    }

    /**
     * 区县
     * @param county 区县
     */
    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    /**
     * 推荐状态    0 : 已推荐  1 : 未推荐
     * @return RECOMMEND_STATUS 推荐状态    0 : 已推荐  1 : 未推荐
     */
    public String getRecommendStatus() {
        return recommendStatus;
    }

    /**
     * 推荐状态    0 : 已推荐  1 : 未推荐
     * @param recommendStatus 推荐状态    0 : 已推荐  1 : 未推荐
     */
    public void setRecommendStatus(String recommendStatus) {
        this.recommendStatus = recommendStatus == null ? null : recommendStatus.trim();
    }

    /**
     * 认定情况
     * @return LDENTIFY_THE_SITUATION 认定情况
     */
    public String getLdentifyTheSituation() {
        return ldentifyTheSituation;
    }

    /**
     * 认定情况
     * @param ldentifyTheSituation 认定情况
     */
    public void setLdentifyTheSituation(String ldentifyTheSituation) {
        this.ldentifyTheSituation = ldentifyTheSituation == null ? null : ldentifyTheSituation.trim();
    }
}
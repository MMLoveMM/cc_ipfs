package cn.net.sinodata.model;

import java.util.Date;

public class ProjectInfo {
    /**
     * ID
     */
    private String id;

    /**
     * 项目名称
     */
    private String projectname;

    /**
     * 项目编号
     */
    private String projectnum;

    /**
     * 项目推荐人
     */
    private String recommendperson;

    /**
     * 业务类型
     */
    private String busitype;

    /**
     * 业务来源渠道
     */
    private String businesschannel;

    /**
     * 是否确权
     */
    private String is1steva;

    /**
     * 是否是IP项目
     */
    private String isipproject;

    /**
     * 是否有基金托底等安全要素
     */
    private String issureness;

    /**
     * 托底机构名称
     */
    private String underpinorgname;

    /**
     * 项目浏览量
     */
    private String visitorvolume;

    /**
     * 贷款金额
     */
    private String loanamt;

    /**
     * 贷款期限
     */
    private String loandeadline;

    /**
     * 贷款类型
     */
    private String loantype;

    /**
     * 已融额度
     */
    private String hasloanamt;

    /**
     * 融资用途
     */
    private String loanuse;

    /**
     * 知识产权类别
     */
    private String inteprotype;

    /**
     * 费率
     */
    private String rate;

    /**
     * 其它需求
     */
    private String remark;

    /**
     * 所属部门
     */
    private String department;

    /**
     * 是否满足各业务最低门槛
     */
    private String isminsill;

    /**
     * 录入员ID
     */
    private String inputerid;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 项目来源
     */
    private String comefrom;

    /**
     * 项目状态
     */
    private String status;

    /**
     * 客户表ID
     */
    private String customerid;

    /**
     * 
     */
    private String proprogress;

    /**
     * 
     */
    private String progressdesc;

    /**
     * 
     */
    private String prioritylevel;

    /**
     * 
     */
    private String custype;

    /**
     * 
     */
    private String subprocess;

    /**
     * 
     */
    private String contractno;

    /**
     * 累计放款金额
     */
    private String countlendbalance;

    /**
     * 担保(独立)子流程状态 0-贷前  1-贷中  2-贷后
     */
    private String guaranteestatus;

    /**
     * 01-正常，02-关注，03-次级，04-可疑，05-损失
     */
    private String riskrating;

    /**
     * ä¿ç†(ç‹¬ç«‹)å­æµç¨‹çŠ¶æ€	0-ä¿å‰	1-ä¿åŽ 2-è´·ä¸­
     */
    private String factoringstatus;

    /**
     * 融资需求
     */
    private String financingneeds;

    /**
     * 实际用款企业名称
     */
    private String usemoneycompany;

    /**
     * 总资产(万元)
     */
    private String totalAssets;

    /**
     * 总负债(万元)
     */
    private String totalLiability;

    /**
     * 上年度营业收入(万元）
     */
    private String lastYearIncome;

    /**
     * 当前贷款情况(万元)
     */
    private String currentLoanSituation;

    /**
     * 贷款额度(万元)
     */
    private String loanAmount;

    /**
     * 股权融资额度(万元)
     */
    private String equityFinancingAmount;

    /**
     * 拟上市融资时间
     */
    private Date toBeListedFinancingTime;

    /**
     * 公司概况
     */
    private String companyOverview;

    /**
     * 主营业务
     */
    private String mainBusiness;

    /**
     * 产品介绍
     */
    private String productDescription;

    /**
     * 营业收入来源
     */
    private String sourceOfIncome;

    /**
     * 知识产权清单文件地址
     */
    private String filePath;

    /**
     * 核心技术
     */
    private String coreTechnology;

    /**
     * 竞争对手公司名称
     */
    private String competitrorName;

    /**
     * 持有专利
     */
    private String patent;

    /**
     * 持有软著
     */
    private String soft;

    /**
     * 持有商标
     */
    private String trademark;

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
     * 项目名称
     * @return projectName 项目名称
     */
    public String getProjectname() {
        return projectname;
    }

    /**
     * 项目名称
     * @param projectname 项目名称
     */
    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    /**
     * 项目编号
     * @return projectNum 项目编号
     */
    public String getProjectnum() {
        return projectnum;
    }

    /**
     * 项目编号
     * @param projectnum 项目编号
     */
    public void setProjectnum(String projectnum) {
        this.projectnum = projectnum == null ? null : projectnum.trim();
    }

    /**
     * 项目推荐人
     * @return recommendPerson 项目推荐人
     */
    public String getRecommendperson() {
        return recommendperson;
    }

    /**
     * 项目推荐人
     * @param recommendperson 项目推荐人
     */
    public void setRecommendperson(String recommendperson) {
        this.recommendperson = recommendperson == null ? null : recommendperson.trim();
    }

    /**
     * 业务类型
     * @return busiType 业务类型
     */
    public String getBusitype() {
        return busitype;
    }

    /**
     * 业务类型
     * @param busitype 业务类型
     */
    public void setBusitype(String busitype) {
        this.busitype = busitype == null ? null : busitype.trim();
    }

    /**
     * 业务来源渠道
     * @return businessChannel 业务来源渠道
     */
    public String getBusinesschannel() {
        return businesschannel;
    }

    /**
     * 业务来源渠道
     * @param businesschannel 业务来源渠道
     */
    public void setBusinesschannel(String businesschannel) {
        this.businesschannel = businesschannel == null ? null : businesschannel.trim();
    }

    /**
     * 是否确权
     * @return is1STEva 是否确权
     */
    public String getIs1steva() {
        return is1steva;
    }

    /**
     * 是否确权
     * @param is1steva 是否确权
     */
    public void setIs1steva(String is1steva) {
        this.is1steva = is1steva == null ? null : is1steva.trim();
    }

    /**
     * 是否是IP项目
     * @return isIpProject 是否是IP项目
     */
    public String getIsipproject() {
        return isipproject;
    }

    /**
     * 是否是IP项目
     * @param isipproject 是否是IP项目
     */
    public void setIsipproject(String isipproject) {
        this.isipproject = isipproject == null ? null : isipproject.trim();
    }

    /**
     * 是否有基金托底等安全要素
     * @return isSureness 是否有基金托底等安全要素
     */
    public String getIssureness() {
        return issureness;
    }

    /**
     * 是否有基金托底等安全要素
     * @param issureness 是否有基金托底等安全要素
     */
    public void setIssureness(String issureness) {
        this.issureness = issureness == null ? null : issureness.trim();
    }

    /**
     * 托底机构名称
     * @return underpinOrgName 托底机构名称
     */
    public String getUnderpinorgname() {
        return underpinorgname;
    }

    /**
     * 托底机构名称
     * @param underpinorgname 托底机构名称
     */
    public void setUnderpinorgname(String underpinorgname) {
        this.underpinorgname = underpinorgname == null ? null : underpinorgname.trim();
    }

    /**
     * 项目浏览量
     * @return visitorVolume 项目浏览量
     */
    public String getVisitorvolume() {
        return visitorvolume;
    }

    /**
     * 项目浏览量
     * @param visitorvolume 项目浏览量
     */
    public void setVisitorvolume(String visitorvolume) {
        this.visitorvolume = visitorvolume == null ? null : visitorvolume.trim();
    }

    /**
     * 贷款金额
     * @return loanAmt 贷款金额
     */
    public String getLoanamt() {
        return loanamt;
    }

    /**
     * 贷款金额
     * @param loanamt 贷款金额
     */
    public void setLoanamt(String loanamt) {
        this.loanamt = loanamt == null ? null : loanamt.trim();
    }

    /**
     * 贷款期限
     * @return loanDeadline 贷款期限
     */
    public String getLoandeadline() {
        return loandeadline;
    }

    /**
     * 贷款期限
     * @param loandeadline 贷款期限
     */
    public void setLoandeadline(String loandeadline) {
        this.loandeadline = loandeadline == null ? null : loandeadline.trim();
    }

    /**
     * 贷款类型
     * @return loanType 贷款类型
     */
    public String getLoantype() {
        return loantype;
    }

    /**
     * 贷款类型
     * @param loantype 贷款类型
     */
    public void setLoantype(String loantype) {
        this.loantype = loantype == null ? null : loantype.trim();
    }

    /**
     * 已融额度
     * @return hasLoanAmt 已融额度
     */
    public String getHasloanamt() {
        return hasloanamt;
    }

    /**
     * 已融额度
     * @param hasloanamt 已融额度
     */
    public void setHasloanamt(String hasloanamt) {
        this.hasloanamt = hasloanamt == null ? null : hasloanamt.trim();
    }

    /**
     * 融资用途
     * @return loanUse 融资用途
     */
    public String getLoanuse() {
        return loanuse;
    }

    /**
     * 融资用途
     * @param loanuse 融资用途
     */
    public void setLoanuse(String loanuse) {
        this.loanuse = loanuse == null ? null : loanuse.trim();
    }

    /**
     * 知识产权类别
     * @return inteProType 知识产权类别
     */
    public String getInteprotype() {
        return inteprotype;
    }

    /**
     * 知识产权类别
     * @param inteprotype 知识产权类别
     */
    public void setInteprotype(String inteprotype) {
        this.inteprotype = inteprotype == null ? null : inteprotype.trim();
    }

    /**
     * 费率
     * @return rate 费率
     */
    public String getRate() {
        return rate;
    }

    /**
     * 费率
     * @param rate 费率
     */
    public void setRate(String rate) {
        this.rate = rate == null ? null : rate.trim();
    }

    /**
     * 其它需求
     * @return remark 其它需求
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 其它需求
     * @param remark 其它需求
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 所属部门
     * @return department 所属部门
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 所属部门
     * @param department 所属部门
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    /**
     * 是否满足各业务最低门槛
     * @return isMinSill 是否满足各业务最低门槛
     */
    public String getIsminsill() {
        return isminsill;
    }

    /**
     * 是否满足各业务最低门槛
     * @param isminsill 是否满足各业务最低门槛
     */
    public void setIsminsill(String isminsill) {
        this.isminsill = isminsill == null ? null : isminsill.trim();
    }

    /**
     * 录入员ID
     * @return inputerId 录入员ID
     */
    public String getInputerid() {
        return inputerid;
    }

    /**
     * 录入员ID
     * @param inputerid 录入员ID
     */
    public void setInputerid(String inputerid) {
        this.inputerid = inputerid == null ? null : inputerid.trim();
    }

    /**
     * 创建时间
     * @return createTime 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 创建时间
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 项目来源
     * @return comeFrom 项目来源
     */
    public String getComefrom() {
        return comefrom;
    }

    /**
     * 项目来源
     * @param comefrom 项目来源
     */
    public void setComefrom(String comefrom) {
        this.comefrom = comefrom == null ? null : comefrom.trim();
    }

    /**
     * 项目状态
     * @return status 项目状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 项目状态
     * @param status 项目状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 客户表ID
     * @return customerId 客户表ID
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * 客户表ID
     * @param customerid 客户表ID
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    /**
     * 
     * @return PROPROGRESS 
     */
    public String getProprogress() {
        return proprogress;
    }

    /**
     * 
     * @param proprogress 
     */
    public void setProprogress(String proprogress) {
        this.proprogress = proprogress == null ? null : proprogress.trim();
    }

    /**
     * 
     * @return PROGRESSDESC 
     */
    public String getProgressdesc() {
        return progressdesc;
    }

    /**
     * 
     * @param progressdesc 
     */
    public void setProgressdesc(String progressdesc) {
        this.progressdesc = progressdesc == null ? null : progressdesc.trim();
    }

    /**
     * 
     * @return PRIORITYLEVEL 
     */
    public String getPrioritylevel() {
        return prioritylevel;
    }

    /**
     * 
     * @param prioritylevel 
     */
    public void setPrioritylevel(String prioritylevel) {
        this.prioritylevel = prioritylevel == null ? null : prioritylevel.trim();
    }

    /**
     * 
     * @return CUSTYPE 
     */
    public String getCustype() {
        return custype;
    }

    /**
     * 
     * @param custype 
     */
    public void setCustype(String custype) {
        this.custype = custype == null ? null : custype.trim();
    }

    /**
     * 
     * @return SUBPROCESS 
     */
    public String getSubprocess() {
        return subprocess;
    }

    /**
     * 
     * @param subprocess 
     */
    public void setSubprocess(String subprocess) {
        this.subprocess = subprocess == null ? null : subprocess.trim();
    }

    /**
     * 
     * @return CONTRACTNO 
     */
    public String getContractno() {
        return contractno;
    }

    /**
     * 
     * @param contractno 
     */
    public void setContractno(String contractno) {
        this.contractno = contractno == null ? null : contractno.trim();
    }

    /**
     * 累计放款金额
     * @return COUNTLENDBALANCE 累计放款金额
     */
    public String getCountlendbalance() {
        return countlendbalance;
    }

    /**
     * 累计放款金额
     * @param countlendbalance 累计放款金额
     */
    public void setCountlendbalance(String countlendbalance) {
        this.countlendbalance = countlendbalance == null ? null : countlendbalance.trim();
    }

    /**
     * 担保(独立)子流程状态 0-贷前  1-贷中  2-贷后
     * @return GUARANTEESTATUS 担保(独立)子流程状态 0-贷前  1-贷中  2-贷后
     */
    public String getGuaranteestatus() {
        return guaranteestatus;
    }

    /**
     * 担保(独立)子流程状态 0-贷前  1-贷中  2-贷后
     * @param guaranteestatus 担保(独立)子流程状态 0-贷前  1-贷中  2-贷后
     */
    public void setGuaranteestatus(String guaranteestatus) {
        this.guaranteestatus = guaranteestatus == null ? null : guaranteestatus.trim();
    }

    /**
     * 01-正常，02-关注，03-次级，04-可疑，05-损失
     * @return RISKRATING 01-正常，02-关注，03-次级，04-可疑，05-损失
     */
    public String getRiskrating() {
        return riskrating;
    }

    /**
     * 01-正常，02-关注，03-次级，04-可疑，05-损失
     * @param riskrating 01-正常，02-关注，03-次级，04-可疑，05-损失
     */
    public void setRiskrating(String riskrating) {
        this.riskrating = riskrating == null ? null : riskrating.trim();
    }

    /**
     * ä¿ç†(ç‹¬ç«‹)å­æµç¨‹çŠ¶æ€	0-ä¿å‰	1-ä¿åŽ 2-è´·ä¸­
     * @return FACTORINGSTATUS ä¿ç†(ç‹¬ç«‹)å­æµç¨‹çŠ¶æ€	0-ä¿å‰	1-ä¿åŽ 2-è´·ä¸­
     */
    public String getFactoringstatus() {
        return factoringstatus;
    }

    /**
     * ä¿ç†(ç‹¬ç«‹)å­æµç¨‹çŠ¶æ€	0-ä¿å‰	1-ä¿åŽ 2-è´·ä¸­
     * @param factoringstatus ä¿ç†(ç‹¬ç«‹)å­æµç¨‹çŠ¶æ€	0-ä¿å‰	1-ä¿åŽ 2-è´·ä¸­
     */
    public void setFactoringstatus(String factoringstatus) {
        this.factoringstatus = factoringstatus == null ? null : factoringstatus.trim();
    }

    /**
     * 融资需求
     * @return FINANCINGNEEDS 融资需求
     */
    public String getFinancingneeds() {
        return financingneeds;
    }

    /**
     * 融资需求
     * @param financingneeds 融资需求
     */
    public void setFinancingneeds(String financingneeds) {
        this.financingneeds = financingneeds == null ? null : financingneeds.trim();
    }

    /**
     * 实际用款企业名称
     * @return USEMONEYCOMPANY 实际用款企业名称
     */
    public String getUsemoneycompany() {
        return usemoneycompany;
    }

    /**
     * 实际用款企业名称
     * @param usemoneycompany 实际用款企业名称
     */
    public void setUsemoneycompany(String usemoneycompany) {
        this.usemoneycompany = usemoneycompany == null ? null : usemoneycompany.trim();
    }

    /**
     * 总资产(万元)
     * @return TOTAL_ASSETS 总资产(万元)
     */
    public String getTotalAssets() {
        return totalAssets;
    }

    /**
     * 总资产(万元)
     * @param totalAssets 总资产(万元)
     */
    public void setTotalAssets(String totalAssets) {
        this.totalAssets = totalAssets == null ? null : totalAssets.trim();
    }

    /**
     * 总负债(万元)
     * @return TOTAL_LIABILITY 总负债(万元)
     */
    public String getTotalLiability() {
        return totalLiability;
    }

    /**
     * 总负债(万元)
     * @param totalLiability 总负债(万元)
     */
    public void setTotalLiability(String totalLiability) {
        this.totalLiability = totalLiability == null ? null : totalLiability.trim();
    }

    /**
     * 上年度营业收入(万元）
     * @return LAST_YEAR_INCOME 上年度营业收入(万元）
     */
    public String getLastYearIncome() {
        return lastYearIncome;
    }

    /**
     * 上年度营业收入(万元）
     * @param lastYearIncome 上年度营业收入(万元）
     */
    public void setLastYearIncome(String lastYearIncome) {
        this.lastYearIncome = lastYearIncome == null ? null : lastYearIncome.trim();
    }

    /**
     * 当前贷款情况(万元)
     * @return CURRENT_LOAN_SITUATION 当前贷款情况(万元)
     */
    public String getCurrentLoanSituation() {
        return currentLoanSituation;
    }

    /**
     * 当前贷款情况(万元)
     * @param currentLoanSituation 当前贷款情况(万元)
     */
    public void setCurrentLoanSituation(String currentLoanSituation) {
        this.currentLoanSituation = currentLoanSituation == null ? null : currentLoanSituation.trim();
    }

    /**
     * 贷款额度(万元)
     * @return LOAN_AMOUNT 贷款额度(万元)
     */
    public String getLoanAmount() {
        return loanAmount;
    }

    /**
     * 贷款额度(万元)
     * @param loanAmount 贷款额度(万元)
     */
    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount == null ? null : loanAmount.trim();
    }

    /**
     * 股权融资额度(万元)
     * @return EQUITY_FINANCING_AMOUNT 股权融资额度(万元)
     */
    public String getEquityFinancingAmount() {
        return equityFinancingAmount;
    }

    /**
     * 股权融资额度(万元)
     * @param equityFinancingAmount 股权融资额度(万元)
     */
    public void setEquityFinancingAmount(String equityFinancingAmount) {
        this.equityFinancingAmount = equityFinancingAmount == null ? null : equityFinancingAmount.trim();
    }

    /**
     * 拟上市融资时间
     * @return TO_BE_LISTED_FINANCING_TIME 拟上市融资时间
     */
    public Date getToBeListedFinancingTime() {
        return toBeListedFinancingTime;
    }

    /**
     * 拟上市融资时间
     * @param toBeListedFinancingTime 拟上市融资时间
     */
    public void setToBeListedFinancingTime(Date toBeListedFinancingTime) {
        this.toBeListedFinancingTime = toBeListedFinancingTime;
    }

    /**
     * 公司概况
     * @return COMPANY_OVERVIEW 公司概况
     */
    public String getCompanyOverview() {
        return companyOverview;
    }

    /**
     * 公司概况
     * @param companyOverview 公司概况
     */
    public void setCompanyOverview(String companyOverview) {
        this.companyOverview = companyOverview == null ? null : companyOverview.trim();
    }

    /**
     * 主营业务
     * @return MAIN_BUSINESS 主营业务
     */
    public String getMainBusiness() {
        return mainBusiness;
    }

    /**
     * 主营业务
     * @param mainBusiness 主营业务
     */
    public void setMainBusiness(String mainBusiness) {
        this.mainBusiness = mainBusiness == null ? null : mainBusiness.trim();
    }

    /**
     * 产品介绍
     * @return PRODUCT_DESCRIPTION 产品介绍
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * 产品介绍
     * @param productDescription 产品介绍
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription == null ? null : productDescription.trim();
    }

    /**
     * 营业收入来源
     * @return SOURCE_OF_INCOME 营业收入来源
     */
    public String getSourceOfIncome() {
        return sourceOfIncome;
    }

    /**
     * 营业收入来源
     * @param sourceOfIncome 营业收入来源
     */
    public void setSourceOfIncome(String sourceOfIncome) {
        this.sourceOfIncome = sourceOfIncome == null ? null : sourceOfIncome.trim();
    }

    /**
     * 知识产权清单文件地址
     * @return FILE_PATH 知识产权清单文件地址
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * 知识产权清单文件地址
     * @param filePath 知识产权清单文件地址
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    /**
     * 核心技术
     * @return CORE_TECHNOLOGY 核心技术
     */
    public String getCoreTechnology() {
        return coreTechnology;
    }

    /**
     * 核心技术
     * @param coreTechnology 核心技术
     */
    public void setCoreTechnology(String coreTechnology) {
        this.coreTechnology = coreTechnology == null ? null : coreTechnology.trim();
    }

    /**
     * 竞争对手公司名称
     * @return COMPETITROR_NAME 竞争对手公司名称
     */
    public String getCompetitrorName() {
        return competitrorName;
    }

    /**
     * 竞争对手公司名称
     * @param competitrorName 竞争对手公司名称
     */
    public void setCompetitrorName(String competitrorName) {
        this.competitrorName = competitrorName == null ? null : competitrorName.trim();
    }

    /**
     * 持有专利
     * @return PATENT 持有专利
     */
    public String getPatent() {
        return patent;
    }

    /**
     * 持有专利
     * @param patent 持有专利
     */
    public void setPatent(String patent) {
        this.patent = patent == null ? null : patent.trim();
    }

    /**
     * 持有软著
     * @return SOFT 持有软著
     */
    public String getSoft() {
        return soft;
    }

    /**
     * 持有软著
     * @param soft 持有软著
     */
    public void setSoft(String soft) {
        this.soft = soft == null ? null : soft.trim();
    }

    /**
     * 持有商标
     * @return TRADEMARK 持有商标
     */
    public String getTrademark() {
        return trademark;
    }

    /**
     * 持有商标
     * @param trademark 持有商标
     */
    public void setTrademark(String trademark) {
        this.trademark = trademark == null ? null : trademark.trim();
    }
}
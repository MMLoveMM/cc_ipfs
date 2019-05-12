package cn.net.sinodata.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 企业财务情况
 */
public class EnterpriseFinance implements Serializable {
    private static final long serialVersionUID = 5222200931739631398L;

    private String id;
    private String enterpriseId;
    private String operatingIncome; //营业收入(万元)
    private String mainBusinessIncome;  //主营业务收入(万元)
    private String operatingCost;   //营业成本(万元)
    private String totalTax;    //税金总计(万元)
    private String totalProfit; //利润总额(万元)
    private String totalAssets; //资产总计(万元)
    private String totalFixedAssets;    //固定资产合计(万元)
    private String totalLiabilities;    //负债总计(万元)
    private String researchCost;    //研究开发费用(万元)
    private String governmentFunding;   //其中政府资助研发费用(万元)
    private String proportion;  //研发费用占营业收入比(%)
    private Date createDate;
    private Date updateDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getOperatingIncome() {
        return operatingIncome;
    }

    public void setOperatingIncome(String operatingIncome) {
        this.operatingIncome = operatingIncome;
    }

    public String getMainBusinessIncome() {
        return mainBusinessIncome;
    }

    public void setMainBusinessIncome(String mainBusinessIncome) {
        this.mainBusinessIncome = mainBusinessIncome;
    }

    public String getOperatingCost() {
        return operatingCost;
    }

    public void setOperatingCost(String operatingCost) {
        this.operatingCost = operatingCost;
    }

    public String getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(String totalTax) {
        this.totalTax = totalTax;
    }

    public String getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(String totalProfit) {
        this.totalProfit = totalProfit;
    }

    public String getTotalAssets() {
        return totalAssets;
    }

    public void setTotalAssets(String totalAssets) {
        this.totalAssets = totalAssets;
    }

    public String getTotalFixedAssets() {
        return totalFixedAssets;
    }

    public void setTotalFixedAssets(String totalFixedAssets) {
        this.totalFixedAssets = totalFixedAssets;
    }

    public String getTotalLiabilities() {
        return totalLiabilities;
    }

    public void setTotalLiabilities(String totalLiabilities) {
        this.totalLiabilities = totalLiabilities;
    }

    public String getResearchCost() {
        return researchCost;
    }

    public void setResearchCost(String researchCost) {
        this.researchCost = researchCost;
    }

    public String getGovernmentFunding() {
        return governmentFunding;
    }

    public void setGovernmentFunding(String governmentFunding) {
        this.governmentFunding = governmentFunding;
    }

    public String getProportion() {
        return proportion;
    }

    public void setProportion(String proportion) {
        this.proportion = proportion;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}

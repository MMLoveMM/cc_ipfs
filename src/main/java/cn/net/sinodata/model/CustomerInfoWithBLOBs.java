package cn.net.sinodata.model;

public class CustomerInfoWithBLOBs extends CustomerInfo {
    /**
     * 主营业务
     */
    private String mainbusiness;

    /**
     * 主要股东
     */
    private String shareholder;

    /**
     * 知识产权名称
     */
    private String inteproname;

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
}
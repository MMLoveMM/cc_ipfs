package cn.net.sinodata.vo;

import cn.net.sinodata.model.ServiceCompanyInfo;
import java.io.Serializable;

public class ServiceCompanyInfoVo extends ServiceCompanyInfo implements Serializable{
private static final long serialVersionUID = 1L;

private String orgname;

  public String getOrgname()
  {
    return this.orgname;
  }
  public void setOrgname(String orgname) {
    this.orgname = orgname;
  }
}
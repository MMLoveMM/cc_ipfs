package cn.net.sinodata.mapper;

import cn.net.sinodata.model.EnterpriseFinance;

public interface EnterpriseFinanceMapper {
    EnterpriseFinance selectByEnterpriseId(String enterpriseId);
    int insert(EnterpriseFinance enterpriseFinance);
    int update(EnterpriseFinance enterpriseFinance);
    int deleteByEnterpriseId(String enterpriseId);
}

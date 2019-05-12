package cn.net.sinodata.mapper;

import cn.net.sinodata.model.EnterpriseFinance;

public interface EnterpriseFinanceMapper {
    int insert(EnterpriseFinance enterpriseFinance);
    int update(EnterpriseFinance enterpriseFinance);
    int delete(EnterpriseFinance enterpriseFinance);
    EnterpriseFinance selectByEnterpriseId(String enterpriseId);
}

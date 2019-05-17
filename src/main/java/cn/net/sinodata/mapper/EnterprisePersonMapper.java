package cn.net.sinodata.mapper;

import cn.net.sinodata.model.EnterprisePerson;

public interface EnterprisePersonMapper {
    EnterprisePerson selectByEnterpriseId(String enterpriseId);
    int insert(EnterprisePerson enterprisePerson);
    int update(EnterprisePerson enterprisePerson);
    int deleteByEnterpriseId(String enterpriseId);
}

package cn.net.sinodata.mapper;

import cn.net.sinodata.model.EnterprisePerson;

public interface EnterprisePersonMapper {
    int insert(EnterprisePerson enterprisePerson);
    int update(EnterprisePerson enterprisePerson);
    int delete(EnterprisePerson enterprisePerson);
    EnterprisePerson selectByEnterpriseId(String enterpriseId);
}

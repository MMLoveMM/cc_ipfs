package cn.net.sinodata.mapper;

import cn.net.sinodata.model.EnterpriseInfo;

public interface EnterpriseInfoMapper {
    int insert(EnterpriseInfo enterpriseInfo);
    int update(EnterpriseInfo enterpriseInfo);
    int delete(String id);
    EnterpriseInfo selectById(String id);
}

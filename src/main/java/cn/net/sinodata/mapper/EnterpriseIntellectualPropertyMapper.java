package cn.net.sinodata.mapper;

import cn.net.sinodata.model.EnterpriseIntellectualProperty;

public interface EnterpriseIntellectualPropertyMapper {
    EnterpriseIntellectualProperty selectByEnterpriseId(String enterpriseId);
    int insert(EnterpriseIntellectualProperty enterpriseIntellectualProperty);
    int update(EnterpriseIntellectualProperty enterpriseIntellectualProperty);
    int deleteByEnterpriseId(String enterpriseId);
}

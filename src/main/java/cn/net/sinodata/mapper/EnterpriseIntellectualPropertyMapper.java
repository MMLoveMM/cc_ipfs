package cn.net.sinodata.mapper;

import cn.net.sinodata.model.EnterpriseIntellectualProperty;

public interface EnterpriseIntellectualPropertyMapper {
    int insert(EnterpriseIntellectualProperty enterpriseIntellectualProperty);
    int update(EnterpriseIntellectualProperty enterpriseIntellectualProperty);
    int deleteByEnterpriseId(String enterpriseId);
}

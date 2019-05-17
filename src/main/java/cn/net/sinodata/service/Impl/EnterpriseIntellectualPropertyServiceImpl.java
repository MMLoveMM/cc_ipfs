package cn.net.sinodata.service.Impl;

import cn.net.sinodata.mapper.EnterpriseIntellectualPropertyMapper;
import cn.net.sinodata.model.EnterpriseIntellectualProperty;
import cn.net.sinodata.service.EnterpriseIntellectualPropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnterpriseIntellectualPropertyServiceImpl implements EnterpriseIntellectualPropertyService {

    @Autowired
    private EnterpriseIntellectualPropertyMapper enterpriseIntellectualPropertyMapper;


    @Override
    public EnterpriseIntellectualProperty selectByEnterpriseId(String enterpriseId) {
        return enterpriseIntellectualPropertyMapper.selectByEnterpriseId(enterpriseId);
    }

    @Override
    public int insert(EnterpriseIntellectualProperty enterpriseIntellectualProperty) {
        return enterpriseIntellectualPropertyMapper.insert(enterpriseIntellectualProperty);
    }

    @Override
    public int update(EnterpriseIntellectualProperty enterpriseIntellectualProperty) {
        return enterpriseIntellectualPropertyMapper.update(enterpriseIntellectualProperty);
    }

    @Override
    public int deleteByEnterpriseId(String enterpriseId) {
        return enterpriseIntellectualPropertyMapper.deleteByEnterpriseId(enterpriseId);
    }
}

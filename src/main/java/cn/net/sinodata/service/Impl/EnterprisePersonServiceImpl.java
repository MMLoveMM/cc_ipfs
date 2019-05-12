package cn.net.sinodata.service.Impl;

import cn.net.sinodata.mapper.EnterprisePersonMapper;
import cn.net.sinodata.model.EnterprisePerson;
import cn.net.sinodata.service.EnterprisePersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnterprisePersonServiceImpl implements EnterprisePersonService {

    @Autowired
    private EnterprisePersonMapper enterprisePersonMapper;


    @Override
    public int insert(EnterprisePerson enterprisePerson) {
        return enterprisePersonMapper.insert(enterprisePerson);
    }

    @Override
    public int update(EnterprisePerson enterprisePerson) {
        return enterprisePersonMapper.update(enterprisePerson);
    }

    @Override
    public int deleteByEnterpriseId(String enterpriseId) {
        return enterprisePersonMapper.deleteByEnterpriseId(enterpriseId);
    }
}

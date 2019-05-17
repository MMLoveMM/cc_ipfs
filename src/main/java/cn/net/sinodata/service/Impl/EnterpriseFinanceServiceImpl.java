package cn.net.sinodata.service.Impl;

import cn.net.sinodata.mapper.EnterpriseFinanceMapper;
import cn.net.sinodata.model.EnterpriseFinance;
import cn.net.sinodata.service.EnterpriseFinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnterpriseFinanceServiceImpl implements EnterpriseFinanceService {

    @Autowired
    private EnterpriseFinanceMapper enterpriseFinanceMapper;

    @Override
    public EnterpriseFinance selectByEnterpriseId(String enterpriseId) {
        return enterpriseFinanceMapper.selectByEnterpriseId(enterpriseId);
    }

    @Override
    public int insert(EnterpriseFinance enterpriseFinance) {
        return enterpriseFinanceMapper.insert(enterpriseFinance);
    }

    @Override
    public int update(EnterpriseFinance enterpriseFinance) {
        return enterpriseFinanceMapper.update(enterpriseFinance);
    }

    @Override
    public int deleteByEnterpriseId(String enterpriseId) {
        return enterpriseFinanceMapper.deleteByEnterpriseId(enterpriseId);
    }
}

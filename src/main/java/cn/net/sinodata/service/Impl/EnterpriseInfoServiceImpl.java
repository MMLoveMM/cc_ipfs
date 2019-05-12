package cn.net.sinodata.service.Impl;

import cn.net.sinodata.mapper.EnterpriseInfoMapper;
import cn.net.sinodata.model.EnterpriseInfo;
import cn.net.sinodata.service.EnterpriseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnterpriseInfoServiceImpl implements EnterpriseInfoService {

    @Autowired
    private EnterpriseInfoMapper enterpriseInfoMapper;


    @Override
    public int insert(EnterpriseInfo enterpriseInfo) {
        return enterpriseInfoMapper.insert(enterpriseInfo);
    }

    @Override
    public int update(EnterpriseInfo enterpriseInfo) {
        return enterpriseInfoMapper.update(enterpriseInfo);
    }

    @Override
    public int delete(String id) {
        return enterpriseInfoMapper.delete(id);
    }

    @Override
    public EnterpriseInfo selectById(String id) {
        return enterpriseInfoMapper.selectById(id);
    }
}

package cn.net.sinodata.service.Impl;

import cn.net.sinodata.mapper.EnterpriseFilePdfMapper;
import cn.net.sinodata.model.EnterpriseFilePdf;
import cn.net.sinodata.service.EnterpriseFilePdfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnterpriseFilePdfServiceImpl implements EnterpriseFilePdfService {

    @Autowired
    private EnterpriseFilePdfMapper enterpriseFilePdfMapper;


    @Override
    public int insert(EnterpriseFilePdf enterpriseFilePdf) {
        return enterpriseFilePdfMapper.insert(enterpriseFilePdf);
    }

    @Override
    public int update(EnterpriseFilePdf enterpriseFilePdf) {
        return enterpriseFilePdfMapper.update(enterpriseFilePdf);
    }

    @Override
    public int deleteByEnterpriseId(String enterpriseId) {
        return enterpriseFilePdfMapper.deleteByEnterpriseId(enterpriseId);
    }
}

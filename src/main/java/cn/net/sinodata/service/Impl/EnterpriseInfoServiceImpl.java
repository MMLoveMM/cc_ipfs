package cn.net.sinodata.service.Impl;

import cn.net.sinodata.mapper.*;
import cn.net.sinodata.model.*;
import cn.net.sinodata.service.EnterpriseFinanceService;
import cn.net.sinodata.service.EnterpriseInfoService;
import cn.net.sinodata.service.EnterprisePersonService;
import cn.net.sinodata.util.UuidUtil;
import cn.net.sinodata.vo.EnterpriseInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class EnterpriseInfoServiceImpl implements EnterpriseInfoService {

    private final EnterpriseInfoMapper enterpriseInfoMapper;

    private final EnterpriseFinanceMapper enterpriseFinanceMapper;

    private final EnterprisePersonMapper enterprisePersonMapper;

    private final EnterpriseIntellectualPropertyMapper enterpriseIntellectualPropertyMapper;

    private final EnterpriseFilePdfMapper enterpriseFilePdfMapper;

    public EnterpriseInfoServiceImpl(EnterpriseInfoMapper enterpriseInfoMapper,
                                     EnterpriseFinanceMapper enterpriseFinanceMapper,
                                     EnterprisePersonMapper enterprisePersonMapper,
                                     EnterpriseIntellectualPropertyMapper enterpriseIntellectualPropertyMapper,
                                     EnterpriseFilePdfMapper enterpriseFilePdfMapper) {
        this.enterpriseInfoMapper = enterpriseInfoMapper;
        this.enterpriseFinanceMapper = enterpriseFinanceMapper;
        this.enterprisePersonMapper = enterprisePersonMapper;
        this.enterpriseIntellectualPropertyMapper = enterpriseIntellectualPropertyMapper;
        this.enterpriseFilePdfMapper = enterpriseFilePdfMapper;
    }

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

    @Override
    public void saveEnterprise(EnterpriseInfoVo enterpriseInfoVo) {
        if (enterpriseInfoVo != null) {
            EnterpriseInfo enterpriseInfo = enterpriseInfoVo.getEnterpriseInfo();

            if (enterpriseInfoVo.getEnterpriseFinance() != null) {
                EnterpriseFinance enterpriseFinance = enterpriseInfoVo.getEnterpriseFinance();
                enterpriseFinance.setCreateDate(new Date());
                enterpriseFinance.setUpdateDate(new Date());
                enterpriseFinance.setId(UuidUtil.getUuid());
                enterpriseFinanceMapper.insert(enterpriseFinance);
                enterpriseInfo.setFinanceId(enterpriseFinance.getId());
            }

            if (enterpriseInfoVo.getEnterprisePerson() != null) {
                EnterprisePerson enterprisePerson = enterpriseInfoVo.getEnterprisePerson();
                enterprisePerson.setCreateDate(new Date());
                enterprisePerson.setUpdateDate(new Date());
                enterprisePerson.setId(UuidUtil.getUuid());
                enterprisePersonMapper.insert(enterprisePerson);
                enterpriseInfo.setPersonId(enterprisePerson.getId());
            }

            if (enterpriseInfoVo.getEnterpriseIntellectualProperty() != null) {
                EnterpriseIntellectualProperty enterpriseIntellectualProperty = enterpriseInfoVo.getEnterpriseIntellectualProperty();
                enterpriseIntellectualProperty.setCreateDate(new Date());
                enterpriseIntellectualProperty.setUpdateDate(new Date());
                enterpriseIntellectualProperty.setId(UuidUtil.getUuid());
                enterpriseIntellectualPropertyMapper.insert(enterpriseIntellectualProperty);
                enterpriseInfo.setPersonId(enterpriseIntellectualProperty.getId());
            }

            if (enterpriseInfoVo.getEnterpriseFilePdf() != null) {
                EnterpriseFilePdf enterpriseFilePdf = enterpriseInfoVo.getEnterpriseFilePdf();
                enterpriseFilePdf.setCreateDate(new Date());
                enterpriseFilePdf.setUpdateDate(new Date());
                enterpriseFilePdf.setId(UuidUtil.getUuid());
                enterpriseFilePdfMapper.insert(enterpriseFilePdf);
                enterpriseInfo.setPersonId(enterpriseFilePdf.getId());
            }

            if (enterpriseInfo != null) {
                enterpriseInfo.setCreateDate(new Date());
                enterpriseInfo.setUpdateDate(new Date());
                enterpriseInfo.setId(UuidUtil.getUuid());
                enterpriseInfoMapper.insert(enterpriseInfo);
            }
        }
    }
}

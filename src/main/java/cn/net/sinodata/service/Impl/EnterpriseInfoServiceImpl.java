package cn.net.sinodata.service.Impl;

import cn.net.sinodata.mapper.*;
import cn.net.sinodata.model.*;
import cn.net.sinodata.service.EnterpriseFinanceService;
import cn.net.sinodata.service.EnterpriseInfoService;
import cn.net.sinodata.service.EnterprisePersonService;
import cn.net.sinodata.service.TUsersService;
import cn.net.sinodata.util.UuidUtil;
import cn.net.sinodata.vo.EnterpriseInfoVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EnterpriseInfoServiceImpl implements EnterpriseInfoService {

    private final EnterpriseInfoMapper enterpriseInfoMapper;

    private final EnterpriseFinanceMapper enterpriseFinanceMapper;

    private final EnterprisePersonMapper enterprisePersonMapper;

    private final EnterpriseIntellectualPropertyMapper enterpriseIntellectualPropertyMapper;

    private final EnterpriseFilePdfMapper enterpriseFilePdfMapper;

    private final TUsersService tUsersService;

    public EnterpriseInfoServiceImpl(EnterpriseInfoMapper enterpriseInfoMapper,
                                     EnterpriseFinanceMapper enterpriseFinanceMapper,
                                     EnterprisePersonMapper enterprisePersonMapper,
                                     EnterpriseIntellectualPropertyMapper enterpriseIntellectualPropertyMapper,
                                     EnterpriseFilePdfMapper enterpriseFilePdfMapper, TUsersService tUsersService) {
        this.enterpriseInfoMapper = enterpriseInfoMapper;
        this.enterpriseFinanceMapper = enterpriseFinanceMapper;
        this.enterprisePersonMapper = enterprisePersonMapper;
        this.enterpriseIntellectualPropertyMapper = enterpriseIntellectualPropertyMapper;
        this.enterpriseFilePdfMapper = enterpriseFilePdfMapper;
        this.tUsersService = tUsersService;
    }

    @Override
    public List<EnterpriseInfoVo> selectAll() {

        return enterpriseInfoMapper.selectAll();
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
            enterpriseInfo.setId(UuidUtil.getUuid());

            if (enterpriseInfoVo.getEnterpriseFinance() != null) {
                EnterpriseFinance enterpriseFinance = enterpriseInfoVo.getEnterpriseFinance();
                enterpriseFinance.setCreateDate(new Date());
                enterpriseFinance.setUpdateDate(new Date());
                enterpriseFinance.setId(UuidUtil.getUuid());
                enterpriseFinance.setEnterpriseId(enterpriseInfo.getId());
                enterpriseFinanceMapper.insert(enterpriseFinance);
                enterpriseInfo.setFinanceId(enterpriseFinance.getId());
            }

            if (enterpriseInfoVo.getEnterprisePerson() != null) {
                EnterprisePerson enterprisePerson = enterpriseInfoVo.getEnterprisePerson();
                enterprisePerson.setCreateDate(new Date());
                enterprisePerson.setUpdateDate(new Date());
                enterprisePerson.setId(UuidUtil.getUuid());
                enterprisePerson.setEnterpriseId(enterpriseInfo.getId());
                enterprisePersonMapper.insert(enterprisePerson);
                enterpriseInfo.setPersonId(enterprisePerson.getId());
            }

            if (enterpriseInfoVo.getEnterpriseIntellectualProperty() != null) {
                EnterpriseIntellectualProperty enterpriseIntellectualProperty = enterpriseInfoVo.getEnterpriseIntellectualProperty();
                enterpriseIntellectualProperty.setCreateDate(new Date());
                enterpriseIntellectualProperty.setUpdateDate(new Date());
                enterpriseIntellectualProperty.setId(UuidUtil.getUuid());
                enterpriseIntellectualProperty.setEnterpriseId(enterpriseInfo.getId());
                enterpriseIntellectualPropertyMapper.insert(enterpriseIntellectualProperty);
                enterpriseInfo.setPersonId(enterpriseIntellectualProperty.getId());
            }

            if (enterpriseInfoVo.getEnterpriseFilePdf() != null) {
                EnterpriseFilePdf enterpriseFilePdf = enterpriseInfoVo.getEnterpriseFilePdf();
                enterpriseFilePdf.setCreateDate(new Date());
                enterpriseFilePdf.setUpdateDate(new Date());
                enterpriseFilePdf.setId(UuidUtil.getUuid());
                enterpriseFilePdf.setEnterpriseId(enterpriseInfo.getId());
                enterpriseFilePdfMapper.insert(enterpriseFilePdf);
                enterpriseInfo.setPersonId(enterpriseFilePdf.getId());
            }

            enterpriseInfo.setCreateDate(new Date());
            enterpriseInfo.setUpdateDate(new Date());
            enterpriseInfoMapper.insert(enterpriseInfo);

            TUsers user = (TUsers) SecurityUtils.getSubject().getPrincipal();
            user.setCustomerInfoId(enterpriseInfo.getId());
            tUsersService.updateByPrimaryKey(user);
        }
    }

    @Override
    public void updateEnterprise(EnterpriseInfoVo enterpriseInfoVo) {
        if (enterpriseInfoVo != null) {
            EnterpriseInfo enterpriseInfo = enterpriseInfoVo.getEnterpriseInfo();
            enterpriseInfo.setUpdateDate(new Date());
            enterpriseInfoMapper.update(enterpriseInfo);

            if (enterpriseInfoVo.getEnterpriseFinance() != null) {
                EnterpriseFinance enterpriseFinance = enterpriseInfoVo.getEnterpriseFinance();
                enterpriseFinance.setUpdateDate(new Date());
                enterpriseFinanceMapper.update(enterpriseFinance);
            }

            if (enterpriseInfoVo.getEnterprisePerson() != null) {
                EnterprisePerson enterprisePerson = enterpriseInfoVo.getEnterprisePerson();
                enterprisePerson.setUpdateDate(new Date());
                enterprisePersonMapper.update(enterprisePerson);
            }

            if (enterpriseInfoVo.getEnterpriseIntellectualProperty() != null) {
                EnterpriseIntellectualProperty enterpriseIntellectualProperty = enterpriseInfoVo.getEnterpriseIntellectualProperty();
                enterpriseIntellectualProperty.setUpdateDate(new Date());
                enterpriseIntellectualPropertyMapper.update(enterpriseIntellectualProperty);
            }

            if (enterpriseInfoVo.getEnterpriseFilePdf() != null) {
                EnterpriseFilePdf enterpriseFilePdf = enterpriseInfoVo.getEnterpriseFilePdf();
                enterpriseFilePdf.setUpdateDate(new Date());
                enterpriseFilePdfMapper.update(enterpriseFilePdf);
            }
        }
    }

    @Override
    public PageInfo<?> getPageEnterprise(int page, int rows) {
        PageHelper.startPage(page, rows);

        return new PageInfo<>(enterpriseInfoMapper.selectAll());
    }
}

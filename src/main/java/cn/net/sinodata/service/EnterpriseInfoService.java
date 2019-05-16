package cn.net.sinodata.service;

import cn.net.sinodata.mapper.EnterpriseInfoMapper;
import cn.net.sinodata.vo.EnterpriseInfoVo;

public interface EnterpriseInfoService extends EnterpriseInfoMapper {
    void saveEnterprise(EnterpriseInfoVo enterpriseInfoVo);
}

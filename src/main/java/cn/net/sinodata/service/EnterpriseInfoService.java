package cn.net.sinodata.service;

import cn.net.sinodata.mapper.EnterpriseInfoMapper;
import cn.net.sinodata.vo.EnterpriseInfoVo;
import com.github.pagehelper.PageInfo;

public interface EnterpriseInfoService extends EnterpriseInfoMapper {
    void saveEnterprise(EnterpriseInfoVo enterpriseInfoVo);

    void updateEnterprise(EnterpriseInfoVo enterpriseInfoVo);

    PageInfo<?> getPageEnterprise(int page, int rows);
}

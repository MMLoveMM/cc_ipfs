package cn.net.sinodata.mapper;

import cn.net.sinodata.model.EnterpriseInfo;
import cn.net.sinodata.vo.EnterpriseInfoVo;

import java.util.List;

public interface EnterpriseInfoMapper {
    List<EnterpriseInfoVo> selectAll();
    int insert(EnterpriseInfo enterpriseInfo);
    int update(EnterpriseInfo enterpriseInfo);
    int delete(String id);
    EnterpriseInfo selectById(String id);
}

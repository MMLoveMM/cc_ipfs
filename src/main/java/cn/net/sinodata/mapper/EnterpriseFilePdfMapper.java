package cn.net.sinodata.mapper;

import cn.net.sinodata.model.EnterpriseFilePdf;


public interface EnterpriseFilePdfMapper {
    EnterpriseFilePdf selectByEnterpriseId(String enterpriseId);
    int insert(EnterpriseFilePdf enterpriseFilePdf);
    int update(EnterpriseFilePdf enterpriseFilePdf);
    int deleteByEnterpriseId(String enterpriseId);
}

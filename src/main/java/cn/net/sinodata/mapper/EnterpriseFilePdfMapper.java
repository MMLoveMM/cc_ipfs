package cn.net.sinodata.mapper;

import cn.net.sinodata.model.EnterpriseFilePdf;


public interface EnterpriseFilePdfMapper {
    int insert(EnterpriseFilePdf enterpriseFilePdf);
    int update(EnterpriseFilePdf enterpriseFilePdf);
    int delete(EnterpriseFilePdf enterpriseFilePdf);
    EnterpriseFilePdf selectByEnterpriseId(String enterpriseId);
}

package cn.net.sinodata.mapper;

import cn.net.sinodata.model.ServiceCompanyInfo;
import cn.net.sinodata.model.ServiceCompanyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceCompanyInfoMapper {
    /**
     *
     * @mbggenerated 2017-09-15
     */
    int countByExample(ServiceCompanyInfoExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByExample(ServiceCompanyInfoExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insert(ServiceCompanyInfo record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insertSelective(ServiceCompanyInfo record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    List<ServiceCompanyInfo> selectByExample(ServiceCompanyInfoExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    ServiceCompanyInfo selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExampleSelective(@Param("record") ServiceCompanyInfo record, @Param("example") ServiceCompanyInfoExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExample(@Param("record") ServiceCompanyInfo record, @Param("example") ServiceCompanyInfoExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKeySelective(ServiceCompanyInfo record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKey(ServiceCompanyInfo record);
}
package cn.net.sinodata.mapper;

import cn.net.sinodata.model.CustomerInfo;
import cn.net.sinodata.model.CustomerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerInfoMapper {
    /**
     *
     * @mbggenerated 2017-10-23
     */
    int countByExample(CustomerInfoExample example);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    int deleteByExample(CustomerInfoExample example);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    int insert(CustomerInfo record);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    int insertSelective(CustomerInfo record);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    List<CustomerInfo> selectByExample(CustomerInfoExample example);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    CustomerInfo selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    int updateByExampleSelective(@Param("record") CustomerInfo record, @Param("example") CustomerInfoExample example);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    int updateByExample(@Param("record") CustomerInfo record, @Param("example") CustomerInfoExample example);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    int updateByPrimaryKeySelective(CustomerInfo record);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    int updateByPrimaryKey(CustomerInfo record);
    
    /**
	 * 获取最大列的值
	 */
    String getMaxCompanyNum();
}
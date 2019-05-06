package cn.net.sinodata.mapper;

import cn.net.sinodata.model.PerCustomerInfo;
import cn.net.sinodata.model.PerCustomerInfoExample;
import cn.net.sinodata.vo.PerCustomerInfoVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerCustomerInfoMapper {
    /**
     *
     * @mbggenerated 2017-09-15
     */
    int countByExample(PerCustomerInfoExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByExample(PerCustomerInfoExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insert(PerCustomerInfo record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insertSelective(PerCustomerInfo record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    List<PerCustomerInfo> selectByExample(PerCustomerInfoExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    PerCustomerInfo selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExampleSelective(@Param("record") PerCustomerInfo record, @Param("example") PerCustomerInfoExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExample(@Param("record") PerCustomerInfo record, @Param("example") PerCustomerInfoExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKeySelective(PerCustomerInfo record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKey(PerCustomerInfo record);
    
    /**
     * 按照example连表查询PER_CUSTOMER_INFO和T_USERS
     * 
     * @author xuj 
     * @param example
     * @return
     */
    List<PerCustomerInfoVo> selectPerCustomerInfoVoByExample(PerCustomerInfoExample example);
    
    /**
	 * 获取某列最大perNum值
	 * @author xuj
	 * @param col
	 * @return
	 */
	public String getMaxProjectNum();
	
	public List<PerCustomerInfoVo> selectAssetMsgVoByExample(PerCustomerInfoExample paramPerCustomerInfoExample);

	public List<PerCustomerInfoVo> selectAssetReportVoByExample(PerCustomerInfoExample paramPerCustomerInfoExample);
}
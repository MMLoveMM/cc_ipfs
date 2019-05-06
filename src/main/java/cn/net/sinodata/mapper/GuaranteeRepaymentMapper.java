package cn.net.sinodata.mapper;

import cn.net.sinodata.model.GuaranteeRepayment;
import cn.net.sinodata.model.GuaranteeRepaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GuaranteeRepaymentMapper {
    /**
     *
     * @mbggenerated 2017-11-20
     */
    int countByExample(GuaranteeRepaymentExample example);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    int deleteByExample(GuaranteeRepaymentExample example);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    int insert(GuaranteeRepayment record);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    int insertSelective(GuaranteeRepayment record);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    List<GuaranteeRepayment> selectByExample(GuaranteeRepaymentExample example);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    GuaranteeRepayment selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    int updateByExampleSelective(@Param("record") GuaranteeRepayment record, @Param("example") GuaranteeRepaymentExample example);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    int updateByExample(@Param("record") GuaranteeRepayment record, @Param("example") GuaranteeRepaymentExample example);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    int updateByPrimaryKeySelective(GuaranteeRepayment record);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    int updateByPrimaryKey(GuaranteeRepayment record);
}
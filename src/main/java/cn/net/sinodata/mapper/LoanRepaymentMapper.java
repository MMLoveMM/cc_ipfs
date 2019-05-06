package cn.net.sinodata.mapper;

import cn.net.sinodata.model.LoanRepayment;
import cn.net.sinodata.model.LoanRepaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanRepaymentMapper {
    /**
     *
     * @mbggenerated 2017-11-16
     */
    int countByExample(LoanRepaymentExample example);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    int deleteByExample(LoanRepaymentExample example);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    int insert(LoanRepayment record);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    int insertSelective(LoanRepayment record);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    List<LoanRepayment> selectByExampleWithBLOBs(LoanRepaymentExample example);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    List<LoanRepayment> selectByExample(LoanRepaymentExample example);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    LoanRepayment selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    int updateByExampleSelective(@Param("record") LoanRepayment record, @Param("example") LoanRepaymentExample example);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    int updateByExampleWithBLOBs(@Param("record") LoanRepayment record, @Param("example") LoanRepaymentExample example);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    int updateByExample(@Param("record") LoanRepayment record, @Param("example") LoanRepaymentExample example);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    int updateByPrimaryKeySelective(LoanRepayment record);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    int updateByPrimaryKeyWithBLOBs(LoanRepayment record);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    int updateByPrimaryKey(LoanRepayment record);
}
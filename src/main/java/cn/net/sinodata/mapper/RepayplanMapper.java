package cn.net.sinodata.mapper;

import cn.net.sinodata.model.Repayplan;
import cn.net.sinodata.model.RepayplanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepayplanMapper {
    /**
     *
     * @mbggenerated 2017-11-16
     */
    int countByExample(RepayplanExample example);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    int deleteByExample(RepayplanExample example);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    int insert(Repayplan record);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    int insertSelective(Repayplan record);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    List<Repayplan> selectByExample(RepayplanExample example);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    Repayplan selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    int updateByExampleSelective(@Param("record") Repayplan record, @Param("example") RepayplanExample example);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    int updateByExample(@Param("record") Repayplan record, @Param("example") RepayplanExample example);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    int updateByPrimaryKeySelective(Repayplan record);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    int updateByPrimaryKey(Repayplan record);
}
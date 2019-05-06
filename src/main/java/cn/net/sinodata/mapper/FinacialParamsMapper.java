package cn.net.sinodata.mapper;

import cn.net.sinodata.model.FinacialParams;
import cn.net.sinodata.model.FinacialParamsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinacialParamsMapper {
    /**
     *
     * @mbggenerated 2017-10-24
     */
    int countByExample(FinacialParamsExample example);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    int deleteByExample(FinacialParamsExample example);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    int insert(FinacialParams record);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    int insertSelective(FinacialParams record);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    List<FinacialParams> selectByExample(FinacialParamsExample example);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    FinacialParams selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    int updateByExampleSelective(@Param("record") FinacialParams record, @Param("example") FinacialParamsExample example);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    int updateByExample(@Param("record") FinacialParams record, @Param("example") FinacialParamsExample example);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    int updateByPrimaryKeySelective(FinacialParams record);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    int updateByPrimaryKey(FinacialParams record);
}
package cn.net.sinodata.mapper;

import cn.net.sinodata.model.RepayplanDetail;
import cn.net.sinodata.model.RepayplanDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepayplanDetailMapper {
    /**
     *
     * @mbggenerated 2017-11-16
     */
    int countByExample(RepayplanDetailExample example);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    int deleteByExample(RepayplanDetailExample example);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    int insert(RepayplanDetail record);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    int insertSelective(RepayplanDetail record);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    List<RepayplanDetail> selectByExample(RepayplanDetailExample example);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    RepayplanDetail selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    int updateByExampleSelective(@Param("record") RepayplanDetail record, @Param("example") RepayplanDetailExample example);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    int updateByExample(@Param("record") RepayplanDetail record, @Param("example") RepayplanDetailExample example);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    int updateByPrimaryKeySelective(RepayplanDetail record);

    /**
     *
     * @mbggenerated 2017-11-16
     */
    int updateByPrimaryKey(RepayplanDetail record);
}
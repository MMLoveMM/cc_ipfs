package cn.net.sinodata.mapper;

import cn.net.sinodata.model.TAnnexTemplet;
import cn.net.sinodata.model.TAnnexTempletExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAnnexTempletMapper {
    /**
     *
     * @mbggenerated 2017-09-15
     */
    int countByExample(TAnnexTempletExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByExample(TAnnexTempletExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insert(TAnnexTemplet record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insertSelective(TAnnexTemplet record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    List<TAnnexTemplet> selectByExample(TAnnexTempletExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    TAnnexTemplet selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExampleSelective(@Param("record") TAnnexTemplet record, @Param("example") TAnnexTempletExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExample(@Param("record") TAnnexTemplet record, @Param("example") TAnnexTempletExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKeySelective(TAnnexTemplet record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKey(TAnnexTemplet record);
}
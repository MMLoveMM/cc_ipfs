package cn.net.sinodata.mapper;

import cn.net.sinodata.model.TDataDict;
import cn.net.sinodata.model.TDataDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDataDictMapper {
    /**
     *
     * @mbggenerated 2017-09-15
     */
    int countByExample(TDataDictExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByExample(TDataDictExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insert(TDataDict record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insertSelective(TDataDict record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    List<TDataDict> selectByExample(TDataDictExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    TDataDict selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExampleSelective(@Param("record") TDataDict record, @Param("example") TDataDictExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExample(@Param("record") TDataDict record, @Param("example") TDataDictExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKeySelective(TDataDict record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKey(TDataDict record);
}
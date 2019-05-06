package cn.net.sinodata.mapper;

import cn.net.sinodata.model.TSystem;
import cn.net.sinodata.model.TSystemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSystemMapper {
    /**
     *
     * @mbggenerated 2017-09-15
     */
    int countByExample(TSystemExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByExample(TSystemExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insert(TSystem record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insertSelective(TSystem record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    List<TSystem> selectByExample(TSystemExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    TSystem selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExampleSelective(@Param("record") TSystem record, @Param("example") TSystemExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExample(@Param("record") TSystem record, @Param("example") TSystemExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKeySelective(TSystem record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKey(TSystem record);
}
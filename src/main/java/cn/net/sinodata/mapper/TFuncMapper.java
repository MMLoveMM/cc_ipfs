package cn.net.sinodata.mapper;

import cn.net.sinodata.model.TFunc;
import cn.net.sinodata.model.TFuncExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TFuncMapper {
    /**
     *
     * @mbggenerated 2017-09-15
     */
    int countByExample(TFuncExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByExample(TFuncExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insert(TFunc record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insertSelective(TFunc record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    List<TFunc> selectByExample(TFuncExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    TFunc selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExampleSelective(@Param("record") TFunc record, @Param("example") TFuncExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExample(@Param("record") TFunc record, @Param("example") TFuncExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKeySelective(TFunc record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKey(TFunc record);
    
    List<TFunc> getResourcesByUserId(String userId);
}
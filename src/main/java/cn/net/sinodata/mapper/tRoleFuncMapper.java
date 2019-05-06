package cn.net.sinodata.mapper;

import cn.net.sinodata.model.tRoleFuncExample;
import cn.net.sinodata.model.tRoleFuncKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface tRoleFuncMapper {
    /**
     *
     * @mbggenerated 2017-09-15
     */
    int countByExample(tRoleFuncExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByExample(tRoleFuncExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByPrimaryKey(tRoleFuncKey key);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insert(tRoleFuncKey record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insertSelective(tRoleFuncKey record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    List<tRoleFuncKey> selectByExample(tRoleFuncExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExampleSelective(@Param("record") tRoleFuncKey record, @Param("example") tRoleFuncExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExample(@Param("record") tRoleFuncKey record, @Param("example") tRoleFuncExample example);
}
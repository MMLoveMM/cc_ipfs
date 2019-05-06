package cn.net.sinodata.mapper;

import cn.net.sinodata.model.LiabilitiesInfos;
import cn.net.sinodata.model.LiabilitiesInfosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LiabilitiesInfosMapper {
    /**
     *
     * @mbggenerated 2017-09-15
     */
    int countByExample(LiabilitiesInfosExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByExample(LiabilitiesInfosExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insert(LiabilitiesInfos record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insertSelective(LiabilitiesInfos record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    List<LiabilitiesInfos> selectByExample(LiabilitiesInfosExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    LiabilitiesInfos selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExampleSelective(@Param("record") LiabilitiesInfos record, @Param("example") LiabilitiesInfosExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExample(@Param("record") LiabilitiesInfos record, @Param("example") LiabilitiesInfosExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKeySelective(LiabilitiesInfos record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKey(LiabilitiesInfos record);
}
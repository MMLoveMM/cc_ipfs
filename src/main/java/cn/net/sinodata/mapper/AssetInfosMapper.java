package cn.net.sinodata.mapper;

import cn.net.sinodata.model.AssetInfos;
import cn.net.sinodata.model.AssetInfosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetInfosMapper {
    /**
     *
     * @mbggenerated 2017-09-15
     */
    int countByExample(AssetInfosExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByExample(AssetInfosExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insert(AssetInfos record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insertSelective(AssetInfos record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    List<AssetInfos> selectByExample(AssetInfosExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    AssetInfos selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExampleSelective(@Param("record") AssetInfos record, @Param("example") AssetInfosExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExample(@Param("record") AssetInfos record, @Param("example") AssetInfosExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKeySelective(AssetInfos record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKey(AssetInfos record);
}
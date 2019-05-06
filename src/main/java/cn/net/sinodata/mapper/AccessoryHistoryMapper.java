package cn.net.sinodata.mapper;

import cn.net.sinodata.model.AccessoryHistory;
import cn.net.sinodata.model.AccessoryHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccessoryHistoryMapper {
    /**
     *
     * @mbggenerated 2017-10-24
     */
    int countByExample(AccessoryHistoryExample example);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    int deleteByExample(AccessoryHistoryExample example);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    int insert(AccessoryHistory record);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    int insertSelective(AccessoryHistory record);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    List<AccessoryHistory> selectByExample(AccessoryHistoryExample example);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    AccessoryHistory selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    int updateByExampleSelective(@Param("record") AccessoryHistory record, @Param("example") AccessoryHistoryExample example);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    int updateByExample(@Param("record") AccessoryHistory record, @Param("example") AccessoryHistoryExample example);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    int updateByPrimaryKeySelective(AccessoryHistory record);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    int updateByPrimaryKey(AccessoryHistory record);
}
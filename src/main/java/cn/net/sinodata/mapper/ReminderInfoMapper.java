package cn.net.sinodata.mapper;

import cn.net.sinodata.model.ReminderInfo;
import cn.net.sinodata.model.ReminderInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReminderInfoMapper {
    /**
     *
     * @mbggenerated 2017-09-15
     */
    int countByExample(ReminderInfoExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByExample(ReminderInfoExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insert(ReminderInfo record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insertSelective(ReminderInfo record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    List<ReminderInfo> selectByExample(ReminderInfoExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    ReminderInfo selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExampleSelective(@Param("record") ReminderInfo record, @Param("example") ReminderInfoExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExample(@Param("record") ReminderInfo record, @Param("example") ReminderInfoExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKeySelective(ReminderInfo record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKey(ReminderInfo record);
}
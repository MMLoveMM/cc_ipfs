package cn.net.sinodata.mapper;

import cn.net.sinodata.model.ProjectAttention;
import cn.net.sinodata.model.ProjectAttentionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectAttentionMapper {
    /**
     *
     * @mbggenerated 2017-09-15
     */
    int countByExample(ProjectAttentionExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByExample(ProjectAttentionExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insert(ProjectAttention record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insertSelective(ProjectAttention record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    List<ProjectAttention> selectByExample(ProjectAttentionExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    ProjectAttention selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExampleSelective(@Param("record") ProjectAttention record, @Param("example") ProjectAttentionExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExample(@Param("record") ProjectAttention record, @Param("example") ProjectAttentionExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKeySelective(ProjectAttention record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKey(ProjectAttention record);
}
package cn.net.sinodata.mapper;

import cn.net.sinodata.model.ProjectEvaluate;
import cn.net.sinodata.model.ProjectEvaluateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectEvaluateMapper {
    /**
     *
     * @mbggenerated 2017-09-15
     */
    int countByExample(ProjectEvaluateExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByExample(ProjectEvaluateExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insert(ProjectEvaluate record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insertSelective(ProjectEvaluate record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    List<ProjectEvaluate> selectByExample(ProjectEvaluateExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    ProjectEvaluate selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExampleSelective(@Param("record") ProjectEvaluate record, @Param("example") ProjectEvaluateExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExample(@Param("record") ProjectEvaluate record, @Param("example") ProjectEvaluateExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKeySelective(ProjectEvaluate record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKey(ProjectEvaluate record);
}
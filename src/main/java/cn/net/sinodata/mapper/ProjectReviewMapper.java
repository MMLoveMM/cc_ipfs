package cn.net.sinodata.mapper;

import cn.net.sinodata.model.ProjectReview;
import cn.net.sinodata.model.ProjectReviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectReviewMapper {
    /**
     *
     * @mbggenerated 2017-11-20
     */
    int countByExample(ProjectReviewExample example);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    int deleteByExample(ProjectReviewExample example);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    int insert(ProjectReview record);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    int insertSelective(ProjectReview record);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    List<ProjectReview> selectByExample(ProjectReviewExample example);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    ProjectReview selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    int updateByExampleSelective(@Param("record") ProjectReview record, @Param("example") ProjectReviewExample example);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    int updateByExample(@Param("record") ProjectReview record, @Param("example") ProjectReviewExample example);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    int updateByPrimaryKeySelective(ProjectReview record);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    int updateByPrimaryKey(ProjectReview record);
}
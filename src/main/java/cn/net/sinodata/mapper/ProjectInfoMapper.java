package cn.net.sinodata.mapper;

import cn.net.sinodata.model.ProjectInfo;
import cn.net.sinodata.model.ProjectInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectInfoMapper {
    /**
     *
     * @mbggenerated 2017-09-15
     */
    int countByExample(ProjectInfoExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByExample(ProjectInfoExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insert(ProjectInfo record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insertSelective(ProjectInfo record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    List<ProjectInfo> selectByExample(ProjectInfoExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    ProjectInfo selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExampleSelective(@Param("record") ProjectInfo record, @Param("example") ProjectInfoExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExample(@Param("record") ProjectInfo record, @Param("example") ProjectInfoExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKeySelective(ProjectInfo record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKey(ProjectInfo record);
    
    /**
     * 获取某列最大值
     * @author xuj
     * @return
     */
    String getMaxProjectNum();
  
    
   
}
package cn.net.sinodata.mapper;

import cn.net.sinodata.model.TUsersRoles;
import cn.net.sinodata.model.TUsersRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUsersRolesMapper {
    /**
     *
     * @mbggenerated 2017-09-15
     */
    int countByExample(TUsersRolesExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByExample(TUsersRolesExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insert(TUsersRoles record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insertSelective(TUsersRoles record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    List<TUsersRoles> selectByExample(TUsersRolesExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    TUsersRoles selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExampleSelective(@Param("record") TUsersRoles record, @Param("example") TUsersRolesExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExample(@Param("record") TUsersRoles record, @Param("example") TUsersRolesExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKeySelective(TUsersRoles record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKey(TUsersRoles record);
    
    /**
     * 
     * @param projectId
     * @param userId
     * @author xuj 2017年9月28日15:04:40
     * @return
     */
    TUsersRoles selectByPidAndUid(String projectId,String userId);
}
package cn.net.sinodata.mapper;

import cn.net.sinodata.model.TRoles;
import cn.net.sinodata.model.TRolesExample;
import cn.net.sinodata.vo.TRolesVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRolesMapper {
    /**
     *
     * @mbggenerated 2017-09-15
     */
    int countByExample(TRolesExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByExample(TRolesExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insert(TRoles record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insertSelective(TRoles record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    List<TRoles> selectByExample(TRolesExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    TRoles selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExampleSelective(@Param("record") TRoles record, @Param("example") TRolesExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExample(@Param("record") TRoles record, @Param("example") TRolesExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKeySelective(TRoles record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKey(TRoles record);
    
    List<TRoles> getRolesByUserId(String userId);
    
    /**
     * 联合查询troles和t_data_dict表
     * @author xuj 
     */
    List<TRolesVo> selectRolesVoByExample(TRolesExample example);
}
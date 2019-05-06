package cn.net.sinodata.mapper;

import cn.net.sinodata.model.tUserRoleExample;
import cn.net.sinodata.model.tUserRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface tUserRoleMapper {
    /**
     *
     * @mbggenerated 2017-09-15
     */
    int countByExample(tUserRoleExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByExample(tUserRoleExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByPrimaryKey(tUserRoleKey key);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insert(tUserRoleKey record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insertSelective(tUserRoleKey record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    List<tUserRoleKey> selectByExample(tUserRoleExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExampleSelective(@Param("record") tUserRoleKey record, @Param("example") tUserRoleExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExample(@Param("record") tUserRoleKey record, @Param("example") tUserRoleExample example);
}
package cn.net.sinodata.mapper;

import cn.net.sinodata.model.TUsers;
import cn.net.sinodata.model.TUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUsersMapper {
    /**
     *
     * @mbggenerated 2017-09-15
     */
    int countByExample(TUsersExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByExample(TUsersExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insert(TUsers record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insertSelective(TUsers record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    List<TUsers> selectByExample(TUsersExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    TUsers selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExampleSelective(@Param("record") TUsers record, @Param("example") TUsersExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExample(@Param("record") TUsers record, @Param("example") TUsersExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKeySelective(TUsers record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKey(TUsers record);
    
    TUsers getUserById(String username);
    
    
}
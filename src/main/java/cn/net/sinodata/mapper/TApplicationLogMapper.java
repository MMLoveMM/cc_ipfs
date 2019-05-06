package cn.net.sinodata.mapper;

import cn.net.sinodata.model.TApplicationLog;
import cn.net.sinodata.model.TApplicationLogExample;
import cn.net.sinodata.vo.TApplicationLogVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TApplicationLogMapper {
    /**
     *
     * @mbggenerated 2017-09-15
     */
    int countByExample(TApplicationLogExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByExample(TApplicationLogExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insert(TApplicationLog record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insertSelective(TApplicationLog record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    List<TApplicationLog> selectByExample(TApplicationLogExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    TApplicationLog selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExampleSelective(@Param("record") TApplicationLog record, @Param("example") TApplicationLogExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExample(@Param("record") TApplicationLog record, @Param("example") TApplicationLogExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKeySelective(TApplicationLog record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKey(TApplicationLog record);
    
    /**
     * 按照example连表查询T_APPLICATION_LOG和T_ORGANS
     * 
     * @author Pangpj 2017年9月18日10:42:50
     * @param example
     * @return
     */
    List<TApplicationLogVo> selectTApplicationLogVOByExample(TApplicationLogExample example);
}
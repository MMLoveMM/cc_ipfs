package cn.net.sinodata.mapper;

import cn.net.sinodata.model.TProclamation;
import cn.net.sinodata.model.TProclamationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TProclamationMapper {
    /**
     *
     * @mbggenerated 2017-09-15
     */
    int countByExample(TProclamationExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByExample(TProclamationExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insert(TProclamation record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insertSelective(TProclamation record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    List<TProclamation> selectByExample(TProclamationExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    TProclamation selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExampleSelective(@Param("record") TProclamation record, @Param("example") TProclamationExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExample(@Param("record") TProclamation record, @Param("example") TProclamationExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKeySelective(TProclamation record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKey(TProclamation record);
}
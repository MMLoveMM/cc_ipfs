package cn.net.sinodata.mapper;

import cn.net.sinodata.model.TOrgans;
import cn.net.sinodata.model.TOrgansExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOrgansMapper {
    /**
     *
     * @mbggenerated 2017-09-15
     */
    int countByExample(TOrgansExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByExample(TOrgansExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insert(TOrgans record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insertSelective(TOrgans record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    List<TOrgans> selectByExample(TOrgansExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    TOrgans selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExampleSelective(@Param("record") TOrgans record, @Param("example") TOrgansExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExample(@Param("record") TOrgans record, @Param("example") TOrgansExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKeySelective(TOrgans record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKey(TOrgans record);

    String getOrgCount();
}
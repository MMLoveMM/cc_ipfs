package cn.net.sinodata.mapper;

import cn.net.sinodata.model.FinacialVal;
import cn.net.sinodata.model.FinacialValExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinacialValMapper {
    /**
     *
     * @mbggenerated 2017-09-15
     */
    int countByExample(FinacialValExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByExample(FinacialValExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insert(FinacialVal record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insertSelective(FinacialVal record);

    /**
     * 2017年10月11日13:40:56
     */
    List<FinacialVal> find(String auditDt,String num,String customId);
    
    /**
     *
     * @mbggenerated 2017-09-15
     */
    List<FinacialVal> selectByExample(FinacialValExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    FinacialVal selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExampleSelective(@Param("record") FinacialVal record, @Param("example") FinacialValExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExample(@Param("record") FinacialVal record, @Param("example") FinacialValExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKeySelective(FinacialVal record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKey(FinacialVal record);
}
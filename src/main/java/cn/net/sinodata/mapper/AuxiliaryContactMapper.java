package cn.net.sinodata.mapper;

import cn.net.sinodata.model.AuxiliaryContact;
import cn.net.sinodata.model.AuxiliaryContactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuxiliaryContactMapper {
    /**
     *
     * @mbggenerated 2017-10-23
     */
    int countByExample(AuxiliaryContactExample example);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    int deleteByExample(AuxiliaryContactExample example);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    int insert(AuxiliaryContact record);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    int insertSelective(AuxiliaryContact record);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    List<AuxiliaryContact> selectByExample(AuxiliaryContactExample example);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    AuxiliaryContact selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    int updateByExampleSelective(@Param("record") AuxiliaryContact record, @Param("example") AuxiliaryContactExample example);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    int updateByExample(@Param("record") AuxiliaryContact record, @Param("example") AuxiliaryContactExample example);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    int updateByPrimaryKeySelective(AuxiliaryContact record);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    int updateByPrimaryKey(AuxiliaryContact record);
}
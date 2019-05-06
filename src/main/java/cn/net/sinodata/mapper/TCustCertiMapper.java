package cn.net.sinodata.mapper;

import cn.net.sinodata.model.TCustCerti;
import cn.net.sinodata.model.TCustCertiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCustCertiMapper {
    /**
     *
     * @mbggenerated 2017-09-15
     */
    int countByExample(TCustCertiExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByExample(TCustCertiExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insert(TCustCerti record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insertSelective(TCustCerti record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    List<TCustCerti> selectByExample(TCustCertiExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    TCustCerti selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExampleSelective(@Param("record") TCustCerti record, @Param("example") TCustCertiExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExample(@Param("record") TCustCerti record, @Param("example") TCustCertiExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKeySelective(TCustCerti record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKey(TCustCerti record);
}
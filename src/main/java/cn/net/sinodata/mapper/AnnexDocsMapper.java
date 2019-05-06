package cn.net.sinodata.mapper;

import cn.net.sinodata.model.AnnexDocs;
import cn.net.sinodata.model.AnnexDocsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnnexDocsMapper {
    /**
     *
     * @mbggenerated 2017-10-23
     */
    int countByExample(AnnexDocsExample example);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    int deleteByExample(AnnexDocsExample example);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    int insert(AnnexDocs record);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    int insertSelective(AnnexDocs record);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    List<AnnexDocs> selectByExample(AnnexDocsExample example);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    AnnexDocs selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    int updateByExampleSelective(@Param("record") AnnexDocs record, @Param("example") AnnexDocsExample example);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    int updateByExample(@Param("record") AnnexDocs record, @Param("example") AnnexDocsExample example);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    int updateByPrimaryKeySelective(AnnexDocs record);

    /**
     *
     * @mbggenerated 2017-10-23
     */
    int updateByPrimaryKey(AnnexDocs record);
}
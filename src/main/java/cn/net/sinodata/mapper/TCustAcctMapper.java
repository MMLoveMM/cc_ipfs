package cn.net.sinodata.mapper;

import cn.net.sinodata.model.TCustAcct;
import cn.net.sinodata.model.TCustAcctExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCustAcctMapper {
    /**
     *
     * @mbggenerated 2017-09-15
     */
    int countByExample(TCustAcctExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByExample(TCustAcctExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insert(TCustAcct record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int insertSelective(TCustAcct record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    List<TCustAcct> selectByExample(TCustAcctExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    TCustAcct selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExampleSelective(@Param("record") TCustAcct record, @Param("example") TCustAcctExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByExample(@Param("record") TCustAcct record, @Param("example") TCustAcctExample example);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKeySelective(TCustAcct record);

    /**
     *
     * @mbggenerated 2017-09-15
     */
    int updateByPrimaryKey(TCustAcct record);
}
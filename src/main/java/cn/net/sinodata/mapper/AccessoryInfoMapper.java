package cn.net.sinodata.mapper;

import cn.net.sinodata.model.AccessoryInfo;
import cn.net.sinodata.model.AccessoryInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccessoryInfoMapper {
    /**
     *
     * @mbggenerated 2017-10-24
     */
    int countByExample(AccessoryInfoExample example);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    int deleteByExample(AccessoryInfoExample example);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    int insert(AccessoryInfo record);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    int insertSelective(AccessoryInfo record);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    List<AccessoryInfo> selectByExample(AccessoryInfoExample example);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    AccessoryInfo selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    int updateByExampleSelective(@Param("record") AccessoryInfo record, @Param("example") AccessoryInfoExample example);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    int updateByExample(@Param("record") AccessoryInfo record, @Param("example") AccessoryInfoExample example);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    int updateByPrimaryKeySelective(AccessoryInfo record);

    /**
     *
     * @mbggenerated 2017-10-24
     */
    int updateByPrimaryKey(AccessoryInfo record);
    
    /**
     * 获取accessoryInfo表id最大值
     * @author xuj
     * @return
     */
    String  getMaxId();
    
}
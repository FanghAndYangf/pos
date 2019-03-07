package com.fanghong.pos.Dao;

import com.fanghong.pos.Model.PosCashier;
import com.fanghong.pos.Model.PosCashierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PosCashierMapper {
    long countByExample(PosCashierExample example);

    int deleteByExample(PosCashierExample example);

    int deleteByPrimaryKey(Integer cashierKey);

    int insert(PosCashier record);

    int insertSelective(PosCashier record);

    List<PosCashier> selectByExample(PosCashierExample example);

    PosCashier selectByPrimaryKey(Integer cashierKey);

    int updateByExampleSelective(@Param("record") PosCashier record, @Param("example") PosCashierExample example);

    int updateByExample(@Param("record") PosCashier record, @Param("example") PosCashierExample example);

    int updateByPrimaryKeySelective(PosCashier record);

    int updateByPrimaryKey(PosCashier record);
}
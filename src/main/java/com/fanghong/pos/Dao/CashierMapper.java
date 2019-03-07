package com.fanghong.pos.Dao;

import com.fanghong.pos.Model.Cashier;
import com.fanghong.pos.Model.CashierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CashierMapper {
    long countByExample(CashierExample example);

    int deleteByExample(CashierExample example);

    int insert(Cashier record);

    int insertSelective(Cashier record);

    List<Cashier> selectByExample(CashierExample example);

    int updateByExampleSelective(@Param("record") Cashier record, @Param("example") CashierExample example);

    int updateByExample(@Param("record") Cashier record, @Param("example") CashierExample example);
}
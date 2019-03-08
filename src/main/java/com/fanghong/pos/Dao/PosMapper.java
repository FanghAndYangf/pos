package com.fanghong.pos.Dao;

import com.fanghong.pos.Model.Pos;
import com.fanghong.pos.Model.PosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PosMapper {
    long countByExample(PosExample example);

    int deleteByExample(PosExample example);

    int insert(Pos record);

    int insertSelective(Pos record);

    List<Pos> selectByExample(PosExample example);

    int updateByExampleSelective(@Param("record") Pos record, @Param("example") PosExample example);

    int updateByExample(@Param("record") Pos record, @Param("example") PosExample example);
}
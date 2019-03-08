package com.fanghong.pos.ServiceImpl;

import com.fanghong.pos.Dao.PosMapper;
import com.fanghong.pos.Model.Pos;
import com.fanghong.pos.Service.PosService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "posService")
public class PosServiceImpl implements PosService {

    @Resource
    private PosMapper posMapper;

    @Override
    public int addPos(Pos pos) {
        return posMapper.insert(pos);
    }
}

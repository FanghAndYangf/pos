package com.fanghong.pos.serviceImpl;

import com.fanghong.pos.dao.PosMapper;
import com.fanghong.pos.model.Pos;
import com.fanghong.pos.service.PosService;
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

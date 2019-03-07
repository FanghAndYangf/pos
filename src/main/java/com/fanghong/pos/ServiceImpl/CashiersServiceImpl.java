package com.fanghong.pos.ServiceImpl;

import com.fanghong.pos.Dao.PosCashiersMapper;
import com.fanghong.pos.Model.PosCashiers;
import com.fanghong.pos.Service.CashiersService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "userService")
public class CashiersServiceImpl implements CashiersService {

    @Resource
    private PosCashiersMapper posCashiersMapper;

    @Override
    public int addCashier(PosCashiers posCashiers) {

        return posCashiersMapper.insert(posCashiers);
    }

    @Override
    public PageInfo<PosCashiers> listAllUser(int pageNum, int pageSize) {

        //PageHelper.startPage(pageNum, pageSize);
        //List<AsUser> userList = asUserMapper.selectByPrimaryKey()
        return null;
    }
}

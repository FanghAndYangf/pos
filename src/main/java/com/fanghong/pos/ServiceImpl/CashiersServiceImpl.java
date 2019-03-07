package com.fanghong.pos.ServiceImpl;

import com.fanghong.pos.Dao.PosCashierMapper;
import com.fanghong.pos.Model.PosCashier;
import com.fanghong.pos.Service.CashiersService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "userService")
public class CashiersServiceImpl implements CashiersService {

    @Resource
    private PosCashierMapper posCashiersMapper;

    @Override
    public int addCashier(PosCashier posCashier) {

        return posCashiersMapper.insert(posCashier);
    }

    @Override
    public PageInfo<PosCashier> listAllUser(int pageNum, int pageSize) {

        //PageHelper.startPage(pageNum, pageSize);
        //List<AsUser> userList = asUserMapper.selectByPrimaryKey()
        return null;
    }
}

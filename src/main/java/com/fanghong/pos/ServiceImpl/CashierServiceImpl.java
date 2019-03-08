package com.fanghong.pos.ServiceImpl;

import com.fanghong.pos.Dao.CashierMapper;
import com.fanghong.pos.Model.Cashier;
import com.fanghong.pos.Service.CashierService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "userService")
public class CashierServiceImpl implements CashierService {

    @Resource
    private CashierMapper cashierMapper;

    @Override
    public int addCashier(Cashier cashier) {

        return cashierMapper.insert(cashier);
    }

    @Override
    public PageInfo<Cashier> listAllUser(int pageNum, int pageSize) {

        //PageHelper.startPage(pageNum, pageSize);
        //List<AsUser> userList = asUserMapper.selectByPrimaryKey()
        return null;
    }
}

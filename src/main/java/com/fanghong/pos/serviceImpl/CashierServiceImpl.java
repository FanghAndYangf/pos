package com.fanghong.pos.serviceImpl;

import com.fanghong.pos.dao.CashierMapper;
import com.fanghong.pos.model.Cashier;
import com.fanghong.pos.service.CashierService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "cashierService")
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

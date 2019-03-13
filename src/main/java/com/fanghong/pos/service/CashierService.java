package com.fanghong.pos.service;

import com.fanghong.pos.model.Cashier;
import com.github.pagehelper.PageInfo;

public interface CashierService {

    int addCashier(Cashier cashier);

    PageInfo<Cashier> listAllUser(int pageNum, int pageSize);
}

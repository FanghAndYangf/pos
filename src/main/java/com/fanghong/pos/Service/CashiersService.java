package com.fanghong.pos.Service;

import com.fanghong.pos.Model.Cashier;
import com.github.pagehelper.PageInfo;

public interface CashiersService {

    int addCashier(Cashier cashier);

    PageInfo<Cashier> listAllUser(int pageNum, int pageSize);
}

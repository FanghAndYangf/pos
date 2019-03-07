package com.fanghong.pos.Service;

import com.fanghong.pos.Model.PosCashier;
import com.github.pagehelper.PageInfo;

public interface CashiersService {

    int addCashier(PosCashier posCashiers);

    PageInfo<PosCashier> listAllUser(int pageNum, int pageSize);
}

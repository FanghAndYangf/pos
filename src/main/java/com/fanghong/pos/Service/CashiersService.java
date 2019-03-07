package com.fanghong.pos.Service;

import com.fanghong.pos.Model.PosCashiers;
import com.github.pagehelper.PageInfo;

public interface CashiersService {

    int addCashier(PosCashiers posCashiers);

    PageInfo<PosCashiers> listAllUser(int pageNum, int pageSize);
}

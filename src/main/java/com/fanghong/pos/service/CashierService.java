package com.fanghong.pos.service;

import com.fanghong.pos.domain.SearchPageInfo;
import com.fanghong.pos.model.Cashier;
import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface CashierService {

    int addCashier(Cashier cashier);
    PageInfo<Cashier> selectBySearchForm(Integer page, Integer limit, Map<String, String> paramMap);
}

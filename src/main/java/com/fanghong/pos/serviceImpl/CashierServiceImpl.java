package com.fanghong.pos.serviceImpl;

import com.fanghong.pos.dao.CashierMapper;
import com.fanghong.pos.domain.SearchPageInfo;
import com.fanghong.pos.model.Cashier;
import com.fanghong.pos.model.CashierExample;
import com.fanghong.pos.service.CashierService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service(value = "cashierService")
public class CashierServiceImpl implements CashierService {

    @Resource
    private CashierMapper cashierMapper;

    @Override
    public int addCashier(Cashier cashier) {

        return cashierMapper.insert(cashier);
    }

    @Override
    public PageInfo<Cashier> selectBySearchForm(Integer page,Integer limit, Map<String, String> paramMap) {
        CashierExample cashierExample = new CashierExample();
        PageHelper.startPage(page, limit);
        List<Cashier> list = cashierMapper.selectByExample(cashierExample);
        PageInfo<Cashier> pageInfo = new PageInfo<Cashier>(list);
        return pageInfo;
    }
}

package com.fanghong.pos.controller;

import com.fanghong.pos.domain.SearchPageInfo;
import com.fanghong.pos.model.Cashier;
import com.fanghong.pos.result.JsonPageResult;
import com.fanghong.pos.result.JsonResult;
import com.fanghong.pos.result.ResponseBody.RegisterCashierBody;
import com.fanghong.pos.serviceImpl.CashierServiceImpl;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@Api(value = "收银员Cotroller", tags = {"收银员操作接口"})
public class CashierController {

    @Resource
    private CashierServiceImpl cashierService;

    private static final Logger logger= LoggerFactory.getLogger(CashierController.class);

    /**
     * 注册管理员
     * @param cashier
     * @return LOGIN_ID
     **/
    @ApiOperation(value = "注册管理员用户", notes = "根据 Cashier 对象创建管理员用户",response = RegisterCashierBody.class)
    @ApiImplicitParam(name = "Cashier", value = "收银员详细实体", required = true, dataType = "Cashier")
    @RequestMapping(value = "cashier", method = RequestMethod.POST)
    public ResponseEntity<JsonResult> add(@RequestBody Cashier cashier){
        JsonResult r = new JsonResult();
        cashier.setCreatets(new Date());     //获取当前时间
        cashier.setCashierStatus("1");       //默认启用状态
        cashier.setRegistType("0");          //个体收银
        if(null == cashier.getCashierDiscountLevel()) cashier.setCashierDiscountLevel(new BigDecimal(1));
        int loginId = cashierService.addCashier(cashier);
        RegisterCashierBody registerCashierBody = new RegisterCashierBody();
        registerCashierBody.setLoginId(String.valueOf(cashier.getCashierKey()));
        registerCashierBody.setCashierStatus(cashier.getCashierStatus());
        //registerCashierBody.setCashierDiscountLevel(cashier.getCashierDiscountLevel());
        r.setData(registerCashierBody);
        r.setMessage("管理员创建成功!");
        return ResponseEntity.ok(r);
    }

    /**
     * 查询收银员列表信息
     * @param page 分页信息
     * @param search 查询表单
     * @return
     */
    @ApiOperation(value = "查询收银员信息", notes = "根据分页对象及搜索条件查询收银员用户")
    @RequestMapping(value = "cashier", method = RequestMethod.GET)
    public ResponseEntity<JsonResult> listByMap(@RequestParam(name = "page") Integer page,
            @RequestParam(name = "limit") Integer limit, Map<String,String> search){
        JsonPageResult r = new JsonPageResult();
        PageInfo<Cashier> pageInfo = cashierService.selectBySearchForm(page, limit, search);
        r.setMessage("查询收银员列表成功!");
        r.setData(pageInfo.getList());
        r.setTotal(pageInfo.getTotal());
        r.setPageNum(pageInfo.getPageNum());
        r.setPageSize(pageInfo.getSize());
        return ResponseEntity.ok(r);
    }
}

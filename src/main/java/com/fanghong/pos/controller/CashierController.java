package com.fanghong.pos.controller;

import com.fanghong.pos.model.Cashier;
import com.fanghong.pos.result.JsonResult;
import com.fanghong.pos.result.ResponseBody.RegisterCashierBody;
import com.fanghong.pos.serviceImpl.CashierServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;

@RestController
@RequestMapping("/api")
@Api("收银员相关 Cotroller")
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
        registerCashierBody.setCashierDiscountLevel(cashier.getCashierDiscountLevel());
        r.setStatus("success");
        r.setData(registerCashierBody);
        r.setMessage("管理员创建成功!");
        return ResponseEntity.ok(r);
    }
}

package com.fanghong.pos.Controller;

import com.fanghong.pos.Model.PosCashier;
import com.fanghong.pos.Result.JsonResult;
import com.fanghong.pos.Result.ResponseBody.RegisterCashierBody;
import com.fanghong.pos.ServiceImpl.CashiersServiceImpl;
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
import java.util.Date;

@RestController
@RequestMapping("/api")
@Api("收银员相关 Cotroller")
public class CashierController {

    @Resource
    private CashiersServiceImpl cashiersService;

    private static final Logger logger= LoggerFactory.getLogger(CashierController.class);

    /**
     * 注册管理员
     * @param posCashier
     * @return LOGIN_ID
     **/
    @ApiOperation(value = "注册管理员用户", notes = "根据 PosCashier 对象创建管理员用户",response = RegisterCashierBody.class)
    @ApiImplicitParam(name = "PosCashier", value = "收银员详细实体", required = true, dataType = "PosCashier")
    @RequestMapping(value = "cashier", method = RequestMethod.POST)
    public ResponseEntity<JsonResult> add(@RequestBody PosCashier posCashier){
        JsonResult r = new JsonResult();
        posCashier.setCreatets(new Date());     //获取当前时间
        posCashier.setCashierStatus("1");       //默认启用状态
        posCashier.setRegistType("0");          //个体收银
        int loginId = cashiersService.addCashier(posCashier);
        RegisterCashierBody registerCashierBody = new RegisterCashierBody();
        registerCashierBody.setLoginId(String.valueOf(loginId));
        r.setStatus("success");
        r.setData(registerCashierBody);
        r.setMessage("管理员创建成功!");
        return ResponseEntity.ok(r);
    }
}

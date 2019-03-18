package com.fanghong.pos.result.ResponseBody;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class RegisterCashierBody {

    @ApiModelProperty(name = "loginId", value = "收银员登陆id")
    private String loginId;

    @ApiModelProperty(name = "cashierStatus", value = "收银员状态", notes = "默认1 启用")
    private String cashierStatus;

    @ApiModelProperty(name = "cashierDiscountLevel", value = "默认折扣权限", notes = "0~1范围区间折扣")
    private BigDecimal cashierDiscountLevel;
}

package com.fanghong.pos.result.ResponseBody;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class RegisterCashierBody {

    @ApiModelProperty(name = "loginId", value = "收银员登陆id")
    private String loginId;

    @ApiModelProperty(name = "cashierStatus", value = "收银员状态", notes = "默认1 启用")
    private String cashierStatus;
}

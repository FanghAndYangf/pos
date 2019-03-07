package com.fanghong.pos.Result;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class JsonResult {

    private String status = null;

    @ApiModelProperty(name = "message", value = "状态信息", notes = "返回信息的内容")
    private String message = "";
    private Object result = null;
}

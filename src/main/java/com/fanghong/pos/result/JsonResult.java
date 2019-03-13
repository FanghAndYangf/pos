package com.fanghong.pos.result;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class JsonResult {

    @ApiModelProperty(name="status", value = "状态值", notes = "返回状态")
    private String status = null;

    @ApiModelProperty(name = "message", value = "状态信息", notes = "返回信息的内容")
    private String message = "";

    @ApiModelProperty(name = "data", value = "数据", notes = "返回的数据结果对象")
    private Object data = null;
}

package com.fanghong.pos.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "SearchPageInfo对象", description = "通用分页传参")
public class SearchPageInfo {

    @ApiModelProperty(value = "页码", notes = "pageSize", example = "1", required = false)
    private int pageNum;
    @ApiModelProperty(value = "页大小", notes = "pageCount", example = "10", required = false)
    private int pageSize;
}

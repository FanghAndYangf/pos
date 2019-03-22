package com.fanghong.pos.result;

import lombok.Data;

@Data
public class JsonPageResult extends JsonResult{

    private int pageSize;
    private int pageNum;
    private long total;
}

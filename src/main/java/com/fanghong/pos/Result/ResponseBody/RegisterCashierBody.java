package com.fanghong.pos.Result.ResponseBody;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RegisterCashierBody {

    @JsonProperty("LOGIN_ID")
    private String loginId;
}

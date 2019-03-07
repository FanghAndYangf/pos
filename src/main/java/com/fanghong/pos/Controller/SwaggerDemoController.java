package com.fanghong.pos.Controller;

import com.fanghong.pos.Model.AsUser;
import com.fanghong.pos.Result.JsonResult;
import com.fanghong.pos.Service.UserService;
import com.fanghong.pos.ServiceImpl.UserServiceImpl;
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

@RestController
@RequestMapping("api")
@Api("swaggerDemoController相关的api")
public class SwaggerDemoController {

    @Resource
    private UserServiceImpl userService;

    private static final Logger logger= LoggerFactory.getLogger(SwaggerDemoController.class);

    /**
     * 注册用户
     * @param asUser
     * @return Login_ID
     **/
    @ApiOperation(value = "注册管理员用户", notes = "根据AsUser对象创建用户")
    @ApiImplicitParam(name = "AsUser", value = "用户详细实体asuser", required = true, dataType = "AsUser")
    @RequestMapping(value = "AsUser", method = RequestMethod.POST)
    public ResponseEntity<JsonResult> add(@RequestBody AsUser asUser){
        JsonResult r = new JsonResult();
        int loginId = userService.addUser(asUser);
        r.setResult(loginId);
        r.setStatus("success");
        return ResponseEntity.ok(r);
    }
}

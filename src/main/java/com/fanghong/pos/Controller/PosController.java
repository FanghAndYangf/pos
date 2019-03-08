package com.fanghong.pos.Controller;

import com.fanghong.pos.Model.Pos;
import com.fanghong.pos.Result.JsonResult;
import com.fanghong.pos.ServiceImpl.PosServiceImpl;
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
@Api("收银机 Controller")
public class PosController {

    @Resource
    private PosServiceImpl posService;

    private static final Logger logger= LoggerFactory.getLogger(PosController.class);

    /**
     * 注册收银机
     * @Param
     * @Return
     */
    @ApiOperation(value = "注册收银机", nickname = "根据收银机实体 Pos 注册收银机")
    @ApiImplicitParam(name = "Pos", value = "收银机详细实体", required = true, dataType = "Pos")
    @RequestMapping(value = "pos", method = RequestMethod.POST)
    public ResponseEntity<JsonResult> add(@RequestBody Pos pos){
        JsonResult r = new JsonResult();
        pos.setCreatets(new Date());        //创建日期
        int posKey = posService.addPos(pos);
        r.setStatus("success");
        r.setMessage("收银机注册成功!");
        return ResponseEntity.ok(r);
    }
}

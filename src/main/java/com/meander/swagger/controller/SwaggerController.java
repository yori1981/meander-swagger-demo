package com.meander.swagger.controller;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Description:
 *
 * @author sage
 * @date 2020/10/1 14:13
 */
@Api(value = "SwaggerController")
@RestController
public class SwaggerController {
    @ApiOperation(notes = "导航页",value = "index")
    @GetMapping("/index")
    public String index( HttpServletRequest request,@ApiParam(name = "userName",value = "用户名",required = true) @RequestParam("userName") String userName){
        System.out.println(request.getServerPort());
        return "欢迎"+userName+"进入首页，请求地址："+request.getRequestURL();
    }

    @ApiOperation("获取用户名")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userName",value = "用户名",required = true,paramType="string"),
            @ApiImplicitParam(name="password",value="密码",required=true,paramType="string")
    })
    @PostMapping("/getName")
    public String getName( @RequestParam("userName") String userName,
                           @RequestParam("password") String password){
        return "欢迎你，" + userName;
    }
}

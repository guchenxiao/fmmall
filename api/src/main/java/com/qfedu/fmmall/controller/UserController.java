package com.qfedu.fmmall.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qfedu.fmmall.entity.Users;
import com.qfedu.fmmall.service.UserService;
import com.qfedu.fmmall.utils.Base64Utils;
import com.qfedu.fmmall.vo.ResStatus;
import com.qfedu.fmmall.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.catalina.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
@Api(value = "提供用户的登录和注册接口", tags = "用户管理")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * ⽤户注册
     *
     * @param username 用户名
     * @param password 密码
     * @return
     */
    @ApiOperation("⽤户注册接⼝")
    @PostMapping("/regist")
    public ResultVO regist(@RequestParam String username, @RequestParam String password) {
        return userService.userResgit(username, password);
    }


    /**
     * 用户登录
     *
     * @param username 用户名
     * @param password 密码
     * @return
     */
    @ApiOperation("用户登录接口")
    @GetMapping("/login")
    public ResultVO login(@RequestParam String username, @RequestParam String password) {
        return userService.checkLogin(username, password);
    }
}

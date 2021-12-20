package com.qfedu.fmmall.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.qfedu.fmmall.entity.Users;
import com.qfedu.fmmall.vo.ResultVO;

import javax.annotation.Resource;
import java.util.List;

public interface UserService extends IService<Users> {

    /**
     * 用户注册
     *
     * @param username
     * @param password
     * @return
     */
    ResultVO userResgit(String username, String password);

    /**
     * 用户登录
     *
     * @param username
     * @param password
     * @return
     */
    ResultVO checkLogin(String username, String password);
}

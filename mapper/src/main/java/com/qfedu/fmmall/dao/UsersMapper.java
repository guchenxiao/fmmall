package com.qfedu.fmmall.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qfedu.fmmall.entity.Users;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersMapper extends BaseMapper<Users> {

    //用户注册
    int insertUser(Users users);

    //根据用户名查询用户信息
    Users queryUserByName(String username);
}
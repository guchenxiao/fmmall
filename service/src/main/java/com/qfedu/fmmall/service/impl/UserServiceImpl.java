package com.qfedu.fmmall.service.impl;

import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qfedu.fmmall.dao.UsersMapper;
import com.qfedu.fmmall.entity.Users;
import com.qfedu.fmmall.service.UserService;
import com.qfedu.fmmall.utils.Base64Utils;
import com.qfedu.fmmall.utils.MD5Utils;
import com.qfedu.fmmall.vo.ResStatus;
import com.qfedu.fmmall.vo.ResultVO;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.security.provider.MD5;

import java.util.Date;
import java.util.HashMap;

@Service
public class UserServiceImpl extends ServiceImpl<UsersMapper, Users> implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public ResultVO userResgit(String username, String password) {
        //1.根据⽤户查询这个⽤户是否已经被注册
        Users users = usersMapper.queryUserByName(username);
        //2.如果没有被注册则进⾏保存操作
        if (users == null) {
            String md5pwd = MD5Utils.md5(password);
            users = new Users();
            users.setUsername(username);
            users.setPassword(md5pwd);
            users.setUserImg("img/default.png");
            users.setUserRegtime(new Date());
            users.setUserModtime(new Date());
            int i = usersMapper.insertUser(users);
            if (i > 0) {
                return new ResultVO(10000, "注册成功！", null);
            } else {
                return new ResultVO(10002, "注册失败！", null);
            }
        } else {
            return new ResultVO(10001, "用户名已经被注册！", null);
        }
    }

    @Override
    public ResultVO checkLogin(String username, String password) {
        Users users = usersMapper.queryUserByName(username);
        if (users == null) {
            return new ResultVO(ResStatus.OK, "登录失败，用户名不存在！", null);
        } else {
            String md5Pwd = MD5Utils.md5(password);
            if (md5Pwd.equals(users.getPassword())) {
                //如果登录验证成功则需要⽣成令牌token（token就是按照特定规则⽣成的字符串
                //使用jwt规则生成token字符串
                JwtBuilder builder = Jwts.builder();
                HashMap<String, Object> map = new HashMap<>();
                String token = builder.setSubject(username) //主题，就是token中携带的数据
                        .setIssuedAt(new Date()) //设置token的⽣成时间
                        .setId(users.getUserId() + "") //设置⽤户id为token id
                        .setClaims(map) //map中可以存放⽤户的⻆⾊权限信息
                        .setExpiration(new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000)) //设置过期时间
                        .signWith(SignatureAlgorithm.HS256, "guchenxiao") //设置加密⽅式和加密密码
                        .compact();
                return new ResultVO(ResStatus.OK, token, users);
            } else {
                return new ResultVO(ResStatus.NO, "登录失败，密码错误！", null);
            }
        }
    }
}

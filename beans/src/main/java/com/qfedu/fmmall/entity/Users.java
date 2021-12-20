package com.qfedu.fmmall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "User对象", description = "⽤户/买家信息")
public class Users {
    /**
     * 主键id 用户id
     */
    @TableField(value = "user_id")
    private Integer userId;

    /**
     * 用户名 用户名
     */
    private String username;

    /**
     * 密码 密码
     */
    private String password;

    /**
     * 昵称 昵称
     */
    private String nickname;

    /**
     * 真实姓名 真实姓名
     */
    private String realname;

    /**
     * 头像 头像
     */
    @TableField(value = "user_img")
    private String userImg;

    /**
     * 手机号 手机号
     */
    @TableField(value = "user_mobile")
    private String userMobile;

    /**
     * 邮箱地址 邮箱地址
     */
    @TableField(value = "user_email")
    private String userEmail;

    /**
     * 性别 M(男) or F(女)
     */
    @TableField(value = "user_sex")
    private String userSex;

    /**
     * 生日 生日
     */
    @TableField(value = "user_birth")
    private Date userBirth;

    /**
     * 注册时间 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @TableField(value = "user_regtime")
    private Date userRegtime;

    /**
     * 更新时间 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @TableField(value = "user_modtime")
    private Date userModtime;
}
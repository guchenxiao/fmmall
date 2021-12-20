package com.qfedu.fmmall.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class UserLoginHistory {
    /**
     * ID
     */
    @TableField(value = "ID")
    private Integer id;

    /**
     * 地区
     */
    @TableField(value = "AREA")
    private String area;

    /**
     * 国家
     */
    @TableField(value = "COUNTRY")
    private String country;

    /**
     * 用户id
     */
    @TableField(value = "USER_ID")
    private String userId;

    /**
     * IP
     */
    @TableField(value = "IP")
    private String ip;

    /**
     * 时间
     */
    @TableField(value = "LOGIN_TIME")
    private String loginTime;
}
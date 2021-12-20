package com.qfedu.fmmall.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;

@Data
public class UserAddr {
    /**
     * 地址主键id
     */
    @TableField(value = "addr_id")
    private String addrId;

    /**
     * 用户ID
     */
    @TableField(value = "user_id")
    private String userId;

    /**
     * 收件人姓名
     */
    @TableField(value = "receiver_name")
    private String receiverName;

    /**
     * 收件人手机号
     */
    @TableField(value = "receiver_mobile")
    private String receiverMobile;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 区县
     */
    private String area;

    /**
     * 详细地址
     */
    private String addr;

    /**
     * 邮编
     */
    @TableField(value = "post_code")
    private String postCode;

    /**
     * 状态,1正常，0无效
     */
    private Integer status;

    /**
     * 是否默认地址 1是 1:是  0:否
     */
    @TableField(value = "common_addr")
    private Integer commonAddr;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

}
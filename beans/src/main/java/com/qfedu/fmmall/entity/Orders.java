package com.qfedu.fmmall.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;


@Data
public class Orders {
    /**
     * 订单ID 同时也是订单编号
     */
    @TableId(value = "order_id")
    private String orderId;

    /**
     * 用户ID
     */
    @TableField(value = "user_id")
    private String userId;

    /**
     * 产品名称（多个产品用,隔开）
     */
    private String untitled;

    /**
     * 收货人快照
     */
    @TableField(value = "receiver_name")
    private String receiverName;

    /**
     * 收货人手机号快照
     */
    @TableField(value = "receiver_mobile")
    private String receiverMobile;

    /**
     * 收货地址快照
     */
    @TableField(value = "receiver_address")
    private String receiverAddress;

    /**
     * 订单总价格
     */
    @TableField(value = "total_amount")
    private BigDecimal totalAmount;

    /**
     * 实际支付总价格
     */
    @TableField(value = "actual_amount")
    private Integer actualAmount;

    /**
     * 支付方式 1:微信 2:支付宝
     */
    @TableField(value = "pay_type")
    private Integer payType;

    /**
     * 订单备注
     */
    @TableField(value = "order_remark")
    private String orderRemark;

    /**
     * 订单状态 1:待付款 2:待发货 3:待收货 4:待评价 5:已完成 6:已关闭
     */
    private String status;

    /**
     * 配送方式
     */
    @TableField(value = "delivery_type")
    private String deliveryType;

    /**
     * 物流单号
     */
    @TableField(value = "delivery_flow_id")
    private String deliveryFlowId;

    /**
     * 订单运费 默认可以为零，代表包邮
     */
    @TableField(value = "order_freight")
    private BigDecimal orderFreight;

    /**
     * 逻辑删除状态 1: 删除 0:未删除
     */
    @TableField(value = "delete_status")
    private Integer deleteStatus;

    /**
     * 创建时间（成交时间）
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 付款时间
     */
    @TableField(value = "pay_time")
    private Date payTime;

    /**
     * 发货时间
     */
    @TableField(value = "delivery_time")
    private Date deliveryTime;

    /**
     * 完成时间
     */
    @TableField(value = "flish_time")
    private Date flishTime;

    /**
     * 取消时间
     */
    @TableField(value = "cancel_time")
    private Date cancelTime;

    /**
     * 订单关闭类型1-超时未支付 2-退款关闭 4-买家取消 15-已通过货到付款交易
     */
    @TableField(value = "close_type")
    private Integer closeType;

}
package com.qfedu.fmmall.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class OrderItem {
    /**
     * 订单项ID
     */
    @TableField(value = "item_id")
    private String itemId;

    /**
     * 订单ID
     */
    @TableField(value = "order_id")
    private String orderId;

    /**
     * 商品ID
     */
    @TableField(value = "product_id")
    private String productId;

    /**
     * 商品名称
     */
    @TableField(value = "product_value")
    private String productvalue;

    /**
     * 商品图片
     */
    @TableField(value = "product_img")
    private String productImg;

    /**
     * skuID
     */
    @TableField(value = "sku_id")
    private String skuId;

    /**
     * sku名称
     */
    @TableField(value = "sku_value")
    private String skuvalue;

    /**
     * 商品价格
     */
    @TableField(value = "product_price")
    private BigDecimal productPrice;

    /**
     * 购买数量
     */
    @TableField(value = "buy_counts")
    private Integer buyCounts;

    /**
     * 商品总金额
     */
    @TableField(value = "total_amount")
    private BigDecimal totalAmount;

    /**
     * 加入购物车时间
     */
    @TableField(value = "basket_date")
    private Date basketDate;

    /**
     * 购买时间
     */
    @TableField(value = "buy_time")
    private Date buyTime;

    /**
     * 评论状态： 0 未评价  1 已评价
     */
    @TableField(value = "is_comment")
    private Integer isComment;

}
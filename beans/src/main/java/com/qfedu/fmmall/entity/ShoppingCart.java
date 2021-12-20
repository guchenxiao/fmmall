package com.qfedu.fmmall.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ShoppingCart {
    /**
     * 主键
     */
    @TableField(value = "cart_id")
    private Integer cartId;

    /**
     * 商品ID
     */
    @TableField(value = "product_id")
    private String productId;

    /**
     * skuID
     */
    @TableField(value = "sku_id")
    private String skuId;

    /**
     * 用户ID
     */
    @TableField(value = "user_id")
    private String userId;

    /**
     * 购物车商品数量
     */
    @TableField(value = "cart_num")
    private String cartNum;

    /**
     * 添加购物车时间
     */
    @TableField(value = "cart_time")
    private String cartTime;

    /**
     * 添加购物车时商品价格
     */
    @TableField(value = "product_price")
    private BigDecimal productPrice;

    /**
     * 选择的套餐的属性
     */
    @TableField(value = "sku_props")
    private String skuProps;

}
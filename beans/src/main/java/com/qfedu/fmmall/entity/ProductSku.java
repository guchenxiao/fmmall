package com.qfedu.fmmall.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;


@Data
public class ProductSku {
    /**
     * sku编号
     */
    @TableField(value = "sku_id")
    private String skuId;

    /**
     * 商品id
     */
    @TableField(value = "product_id")
    private String productId;

    /**
     * sku名称
     */
    @TableField(value = "sku_name")
    private String skuName;

    /**
     * sku图片
     */
    @TableField(value = "sku_img")
    private String skuImg;

    /**
     * 属性组合（格式是p1:v1;p2:v2）
     */
    private String untitled;

    /**
     * 原价
     */
    @TableField(value = "original_price")
    private Integer originalPrice;

    /**
     * 销售价格
     */
    @TableField(value = "sell_price")
    private Integer sellPrice;

    /**
     * 折扣力度
     */
    private BigDecimal discounts;

    /**
     * 库存
     */
    private Integer stock;

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

    /**
     * sku状态(1启用，0禁用，-1删除)
     */
    private Integer status;

}
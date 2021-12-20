package com.qfedu.fmmall.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;
import java.util.List;


@Data
public class ProductVO {
    /**
     * 商品主键id
     */

    @TableField(value = "product_id")
    private String productId;

    /**
     * 商品名称 商品名称
     */
    @TableField(value = "product_name")
    private String productName;

    /**
     * 分类外键id 分类id
     */
    @TableField(value = "category_id")
    private Integer categoryId;

    /**
     * 一级分类外键id 一级分类id，用于优化查询
     */
    @TableField(value = "root_category_id")
    private Integer rootCategoryId;

    /**
     * 销量 累计销售
     */
    @TableField(value = "sold_num")
    private Integer soldNum;

    /**
     * 默认是1，表示正常状态, -1表示删除, 0下架 默认是1，表示正常状态, -1表示删除, 0下架
     */
    @TableField(value = "product_status")
    private Integer productStatus;

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
     * 商品内容 商品内容
     */
    private String content;

    /**
     * 存储商品图⽚
     */
    List<ProductImg> imgs;

}
package com.qfedu.fmmall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;


@Data
public class IndexImg {
    /**
     * 主键
     */
    @TableId(value = "img_id", type = IdType.AUTO)
    private String imgId;

    /**
     * 图片 图片地址
     */
    @TableField(value = "img_url")
    private String imgUrl;

    /**
     * 背景色 背景颜色
     */
    @TableField(value = "img_bg_color")
    private String imgBgColor;

    /**
     * 商品id 商品id
     */
    @TableField(value = "prod_id")
    private String prodId;

    /**
     * 商品分类id 商品分类id
     */
    @TableField(value = "category_id")
    private String categoryId;

    /**
     * 轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类
     */
    @TableField(value = "index_type")
    private Integer indexType;

    /**
     * 轮播图展示顺序 轮播图展示顺序，从小到大
     */
    private Integer seq;

    /**
     * 是否展示:1表示正常显示，0表示下线 是否展示，1：展示    0：不展示
     */
    private Integer status;

    /**
     * 创建时间 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新时间 更新
     */
    @TableField(value = "update_time")
    private Date updateTime;

}
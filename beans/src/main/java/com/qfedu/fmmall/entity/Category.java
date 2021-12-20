package com.qfedu.fmmall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;


@Data
public class Category {
    /**
     * 主键 分类id主键
     */
    @TableId(value = "category_id", type = IdType.AUTO)
    private Integer categoryId;

    /**
     * 分类名称 分类名称
     */
    @TableField(value = "category_name")
    private String categoryName;

    /**
     * 分类层级 分类得类型，
     * 1:一级大分类
     * 2:二级分类
     * 3:三级小分类
     */
    @TableField(value = "category_level")
    private Integer categoryLevel;

    /**
     * 父层级id 父id 上一级依赖的id，1级分类则为0，二级三级分别依赖上一级
     */
    @TableField(value = "parent_id")
    private Integer parentId;

    /**
     * 图标 logo
     */
    @TableField(value = "category_icon")
    private String categoryIcon;

    /**
     * 口号
     */
    @TableField(value = "category_slogan")
    private String categorySlogan;

    /**
     * 分类图
     */
    @TableField(value = "category_pic")
    private String categoryPic;

    /**
     * 背景颜色
     */
    @TableField(value = "category_bg_color")
    private String categoryBgColor;

}
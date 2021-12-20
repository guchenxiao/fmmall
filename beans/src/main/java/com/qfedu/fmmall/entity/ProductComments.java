package com.qfedu.fmmall.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;

@Data
public class ProductComments {


    @TableField(value = "comm_id")
    private String commId;

    @TableField(value = "product_id")
    private String productId;

    @TableField(value = "product_name")
    private String productName;

    @TableField(value = "order_item_id")
    private String orderItemId;

    @TableField(value = "user_id")
    private String userId;

    @TableField(value = "is_anonymous")
    private Integer isAnonymous;

    @TableField(value = "comm_type")
    private Integer commType;

    @TableField(value = "comm_level")
    private Integer commLevel;

    @TableField(value = "comm_content")
    private String commContent;

    @TableField(value = "comm_imgs")
    private String commImgs;

    @TableField(value = "sepc_name")
    private Date sepcName;

    @TableField(value = "reply_status")
    private Integer replyStatus;

    @TableField(value = "reply_content")
    private String replyContent;

    @TableField(value = "reply_time")
    private Date replyTime;

    @TableField(value = "is_show")
    private Integer isShow;

}
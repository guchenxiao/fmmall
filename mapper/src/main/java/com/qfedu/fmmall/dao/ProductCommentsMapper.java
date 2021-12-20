package com.qfedu.fmmall.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qfedu.fmmall.entity.ProductComments;
import com.qfedu.fmmall.entity.ProductCommentsVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductCommentsMapper extends BaseMapper<ProductComments> {

    /**
     * 商品评论信息查询接⼝
     *
     * @param productId
     * @return
     */
    Page getProductCommonts(Page page, String productId);

}

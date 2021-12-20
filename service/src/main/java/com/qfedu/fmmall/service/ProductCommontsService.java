package com.qfedu.fmmall.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.qfedu.fmmall.entity.ProductComments;
import com.qfedu.fmmall.entity.ProductCommentsVO;
import com.qfedu.fmmall.vo.ResultVO;

import java.util.List;

public interface ProductCommontsService extends IService<ProductComments> {

    /**
     * 商品评论信息查询接⼝
     *
     * @param productId
     * @return
     */
    Page getProductCommonts(Page page, String productId);


    /**
     * 统计当前商品的总记录数
     * 统计当前商品的好评/中评/差评
     *
     * @param productId
     * @return
     */
    ResultVO getCommentsCountByProductId(String productId);

}

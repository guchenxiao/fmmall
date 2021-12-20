package com.qfedu.fmmall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qfedu.fmmall.entity.Product;
import com.qfedu.fmmall.vo.ResultVO;

public interface ProductService extends IService<Product> {

    /**
     * 查询推荐商品
     *
     * @return
     */
    ResultVO selectRecommendProducts();


    /**
     * 商品详情展示
     *
     * @param productId
     * @return
     */
    ResultVO getProductBasicInfo(String productId);

}


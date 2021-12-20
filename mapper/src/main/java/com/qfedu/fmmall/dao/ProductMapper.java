package com.qfedu.fmmall.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qfedu.fmmall.entity.Product;
import com.qfedu.fmmall.entity.ProductVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper extends BaseMapper<Product> {

    /**
     * 查询推荐商品
     */
    List<ProductVO> selectRecommendProducts();

    //查询销量最高的6个商品
    List<ProductVO> selectTop6ByCategory(int cid);
}


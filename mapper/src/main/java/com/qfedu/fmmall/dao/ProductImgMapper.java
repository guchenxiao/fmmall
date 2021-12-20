package com.qfedu.fmmall.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qfedu.fmmall.entity.ProductImg;
import com.qfedu.fmmall.entity.ProductVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductImgMapper extends BaseMapper<ProductImg> {

    //根据商品id查询当前商品的图⽚信息
    List<ProductImg> selectProductImgByProductId(int itemId);




}
package com.qfedu.fmmall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qfedu.fmmall.dao.ProductImgMapper;
import com.qfedu.fmmall.dao.ProductMapper;
import com.qfedu.fmmall.dao.ProductSkuMapper;
import com.qfedu.fmmall.entity.*;
import com.qfedu.fmmall.service.ProductService;
import com.qfedu.fmmall.vo.ResStatus;
import com.qfedu.fmmall.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductImgMapper productImgMapper;

    @Autowired
    private ProductSkuMapper productSkuMapper;


    @Override
    public ResultVO selectRecommendProducts() {
        List<ProductVO> productVOS = productMapper.selectRecommendProducts();
        return new ResultVO(ResStatus.OK, "查询成功！", productVOS);
    }

    @Override
    public ResultVO getProductBasicInfo(String productId) {
        // 根据id查询商品基本信息
        QueryWrapper<Product> productQueryWrapper = new QueryWrapper<>();
        productQueryWrapper.eq("product_id", productId).eq("product_status", 1);
        List<Product> products = productMapper.selectList(productQueryWrapper);
        if (products.size() > 0) {
            //根据商品id查询当前商品的图片
            QueryWrapper<ProductImg> productImgQueryWrapper = new QueryWrapper<>();
            productImgQueryWrapper.eq("item_id", productId);
            List<ProductImg> productImgs = productImgMapper.selectList(productImgQueryWrapper);

            //根据商品id查询当前商品的套餐
            QueryWrapper<ProductSku> productSkuQueryWrapper = new QueryWrapper<>();
            productSkuQueryWrapper.eq("product_id", productId);
            List<ProductSku> productSkus = productSkuMapper.selectList(productSkuQueryWrapper);

            //将查询到的数据封装进map里
            HashMap<String, Object> map = new HashMap<>();
            map.put("product", products);
            map.put("productImgs", productImgs);
            map.put("productSkus", productSkus);

            return new ResultVO(ResStatus.OK, "查询成功！", map);
        } else {
            return new ResultVO(ResStatus.NO, "查询的商品不存在!", null);
        }


    }
}

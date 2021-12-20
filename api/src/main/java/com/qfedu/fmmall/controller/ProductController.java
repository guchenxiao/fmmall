package com.qfedu.fmmall.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qfedu.fmmall.service.ProductCommontsService;
import com.qfedu.fmmall.service.ProductService;
import com.qfedu.fmmall.vo.ResStatus;
import com.qfedu.fmmall.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;

@RestController
@CrossOrigin
@RequestMapping("/product")
@Api(value = "提供商品信息相关的接口", tags = "商品管理")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductCommontsService productCommontsService;


    @ApiOperation("商品基本信息查询接口")
    @GetMapping("/getProductBasicInfo")
    public ResultVO getProductBasicInfo(String productId) {
        return productService.getProductBasicInfo(productId);
    }

    @ApiOperation("商品评论信息查询接口")
    @GetMapping("/getProductCommonts")
    public ResultVO getProductCommonts(Long current, Long size, String productId) {
        Page productCommonts = productCommontsService.getProductCommonts(new Page(current, size), productId);
        return new ResultVO(ResStatus.OK, "查询成功！", productCommonts);
    }

    @ApiOperation("商品评价统计接口")
    @GetMapping("/getCommentsCountByProductId")
    public ResultVO getCommentsCountByProductId(String productId) {
        return productCommontsService.getCommentsCountByProductId(productId);
    }
}


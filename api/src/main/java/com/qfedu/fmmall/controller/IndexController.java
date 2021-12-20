package com.qfedu.fmmall.controller;

import com.qfedu.fmmall.entity.IndexImg;
import com.qfedu.fmmall.service.CategoryService;
import com.qfedu.fmmall.service.IndexImgService;
import com.qfedu.fmmall.service.ProductService;
import com.qfedu.fmmall.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/index")
@Api(value = "提供首页数据显示所需的接口", tags = "首页管理")
public class IndexController {

    @Autowired
    private IndexImgService indexImgService;

    @Autowired
    private CategoryService categoryService;

    /**
     * 查询轮播图信息
     *
     * @return
     */
    @ApiOperation("查询轮播图接口")
    @GetMapping("/listIndexImgs")
    public ResultVO listIndexImgs() {
        return indexImgService.listIndexImgs();
    }

    /**
     * 商品分类查询
     *
     * @return
     */
    @ApiOperation("商品分类查询接口")
    @GetMapping("/listCategories")
    public ResultVO listCategories() {
        return categoryService.listCategories();
    }

    @Autowired
    private ProductService productService;

    @ApiOperation("查询推荐商品接口")
    @GetMapping("/selectRecommendProducts")
    public ResultVO selectRecommendProducts() {
        return productService.selectRecommendProducts();
    }

    @ApiOperation("分类商品推荐接口")
    @GetMapping("/selectFirstLevelCategorys")
    public ResultVO selectFirstLevelCategorys() {
        return categoryService.selectFirstLevelCategorys();
    }
}

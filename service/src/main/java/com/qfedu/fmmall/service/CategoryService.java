package com.qfedu.fmmall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qfedu.fmmall.entity.Category;
import com.qfedu.fmmall.vo.ResultVO;

public interface CategoryService extends IService<Category> {

    /**
     * 商品分类查询
     *
     * @return
     */
    ResultVO listCategories();

    /**
     * 按照商品的分类（⼀级分类）推荐销量最⾼的6个商品
     */
    ResultVO selectFirstLevelCategorys();
}

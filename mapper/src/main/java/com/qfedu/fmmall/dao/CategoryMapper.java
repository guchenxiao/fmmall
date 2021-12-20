package com.qfedu.fmmall.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qfedu.fmmall.entity.Category;
import com.qfedu.fmmall.entity.CategoryVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryMapper extends BaseMapper<Category> {

    /**
     * 商品分类查询 ⼦查询：根据parentId查询⼦分类
     */
    List<CategoryVO> listCategories(int parentId);

    /**
     * 查询一级类别
     */
    List<CategoryVO> selectFirstLevelCategorys();
}

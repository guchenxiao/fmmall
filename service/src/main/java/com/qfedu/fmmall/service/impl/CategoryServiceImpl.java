package com.qfedu.fmmall.service.impl;

import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qfedu.fmmall.dao.CategoryMapper;
import com.qfedu.fmmall.entity.Category;
import com.qfedu.fmmall.entity.CategoryVO;
import com.qfedu.fmmall.service.CategoryService;
import com.qfedu.fmmall.vo.ResStatus;
import com.qfedu.fmmall.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public ResultVO listCategories() {
        List<CategoryVO> categoryVOS = categoryMapper.listCategories(0);
        return new ResultVO(ResStatus.OK, "查询成功！", categoryVOS);
    }

    @Override
    public ResultVO selectFirstLevelCategorys() {
        List<CategoryVO> categoryVOS = categoryMapper.selectFirstLevelCategorys();
        return new ResultVO(ResStatus.OK, "查询成功！", categoryVOS);
    }
}

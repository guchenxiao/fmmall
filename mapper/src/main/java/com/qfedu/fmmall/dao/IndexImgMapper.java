package com.qfedu.fmmall.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qfedu.fmmall.entity.IndexImg;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IndexImgMapper extends BaseMapper<IndexImg> {

    /**
     * 查询轮播图信息
     */
    List<IndexImg> listIndexImgs();

}
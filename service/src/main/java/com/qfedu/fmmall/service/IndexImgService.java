package com.qfedu.fmmall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qfedu.fmmall.entity.IndexImg;
import com.qfedu.fmmall.vo.ResultVO;

import java.util.List;

public interface IndexImgService extends IService<IndexImg> {

    /**
     * 查询轮播图信息
     */
    ResultVO listIndexImgs();
}

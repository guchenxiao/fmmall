package com.qfedu.fmmall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qfedu.fmmall.dao.ProductCommentsMapper;
import com.qfedu.fmmall.entity.ProductComments;
import com.qfedu.fmmall.entity.ProductCommentsVO;
import com.qfedu.fmmall.service.ProductCommontsService;
import com.qfedu.fmmall.vo.ResStatus;
import com.qfedu.fmmall.vo.ResultVO;
import org.omg.CORBA.INTERNAL;
import org.omg.CORBA.OBJECT_NOT_EXIST;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class ProductCommontsServiceImpl extends ServiceImpl<ProductCommentsMapper, ProductComments> implements ProductCommontsService {

    @Autowired
    private ProductCommentsMapper productCommentsMapper;

    @Override
    public Page getProductCommonts(Page page, String productId) {
        return productCommentsMapper.getProductCommonts(page, productId);
    }

    @Override
    public ResultVO getCommentsCountByProductId(String productId) {
        //1.查询当前商品评价的总数
        QueryWrapper<ProductComments> totalQueryWrapper = new QueryWrapper<>();
        totalQueryWrapper.eq("product_id", productId);
        Integer total = productCommentsMapper.selectCount(totalQueryWrapper);

        //2.查询好评评价数
        totalQueryWrapper.eq("comm_type", 1);
        Integer goodTotal = productCommentsMapper.selectCount(totalQueryWrapper);

        //3.查询中评评价数
        QueryWrapper<ProductComments> midTotalQueryWrapper = new QueryWrapper<>();
        midTotalQueryWrapper.eq("comm_type", 0);
        Integer midTotal = productCommentsMapper.selectCount(midTotalQueryWrapper);

        //4.查询差评评价数
        QueryWrapper<ProductComments> badTotalQueryWrapper = new QueryWrapper<>();
        badTotalQueryWrapper.eq("comm_type", -1);
        Integer badTotal = productCommentsMapper.selectCount(badTotalQueryWrapper);

        //5.计算好评率 好评/总条数*100
        double percent = (Double.parseDouble(goodTotal + "")) / (Double.parseDouble(total + "")) * 100;
        String percentValue = (percent + "").substring(0, (percent + "").lastIndexOf(".") + 3);

        HashMap<String, Object> map = new HashMap<>();
        map.put("total", total);
        map.put("goodTotal", goodTotal);
        map.put("midTotal", midTotal);
        map.put("badTotal", badTotal);
        map.put("percent", percent);
        map.put("percentValue", percentValue);

        return new ResultVO(ResStatus.OK, "查询成功！", map);
    }
}

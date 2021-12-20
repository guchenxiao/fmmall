package com.qfedu.fmmall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qfedu.fmmall.dao.ShoppingCartMapper;
import com.qfedu.fmmall.entity.ShoppingCart;
import com.qfedu.fmmall.service.ShoppingCartService;
import com.qfedu.fmmall.vo.ResStatus;
import com.qfedu.fmmall.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

    @Autowired
    private ShoppingCartMapper shoppingCartMapper;

    @Override
    public ResultVO insertShoppingCart(ShoppingCart shoppingCart) {
        int i = shoppingCartMapper.insert(shoppingCart);
        if (i > 0) {
            return new ResultVO(ResStatus.OK, "添加成功！", i);
        }
        return new ResultVO(ResStatus.NO, "添加失败！", null);
    }
}


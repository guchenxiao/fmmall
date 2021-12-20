package com.qfedu.fmmall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qfedu.fmmall.entity.ShoppingCart;
import com.qfedu.fmmall.vo.ResultVO;

import java.util.List;

public interface ShoppingCartService extends IService<ShoppingCart> {


    /**
     * 添加购物车
     * @param shoppingCart
     * @return
     */
    ResultVO insertShoppingCart(ShoppingCart shoppingCart);
}

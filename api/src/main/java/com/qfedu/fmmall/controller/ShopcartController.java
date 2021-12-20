package com.qfedu.fmmall.controller;

import com.qfedu.fmmall.dao.ShoppingCartMapper;
import com.qfedu.fmmall.entity.ShoppingCart;
import com.qfedu.fmmall.service.ShoppingCartService;
import com.qfedu.fmmall.vo.ResStatus;
import com.qfedu.fmmall.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shopcart")
@CrossOrigin
@Api(value = "提供购物车业务相关接口", tags = "购物车管理")
public class ShopcartController {

    @Autowired
    private ShoppingCartService shoppingCartService;

    @GetMapping("/list")
    @ApiOperation("解析token")

    public ResultVO listCarts(@RequestHeader String token) {
        return new ResultVO(10000, "token验证成功", null);
    }

    /**
     * 添加购物车
     *
     * @param shoppingCart
     * @return
     */
    @ApiOperation("添加购物车")
    @PostMapping("/insertShoppingCart")
    public ResultVO insertShoppingCart(@RequestHeader("token") String token, @RequestBody ShoppingCart shoppingCart) {
        return shoppingCartService.insertShoppingCart(shoppingCart);
    }
}

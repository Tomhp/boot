package com.lee.boot.mapper;


import com.lee.model.Goods;

public interface GoodsMapper {

    Goods selectGoodsByCode(Integer code);

}

package com.lee.boot.service.impl;

import com.lee.boot.mapper.GoodsMapper;
import com.lee.boot.service.IGoodsService;
import com.lee.model.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements IGoodsService {

    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public Goods selectGoodsByCode(Integer code) {
        return goodsMapper.selectGoodsByCode(code);
    }
}

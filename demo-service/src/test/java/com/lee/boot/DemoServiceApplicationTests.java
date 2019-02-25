package com.lee.boot;

import com.lee.boot.service.IGoodsService;
import com.lee.model.Goods;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoServiceApplicationTests {

    @Autowired
    private IGoodsService goodsService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void test1() {

        Goods goods = goodsService.selectGoodsByCode(1);
        System.out.println(goods.getGoodsCode());
    }
}

package com.tong.sell.repository;

import com.tong.sell.dataobject.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository rep;

    @Test
    public void saveTest(){
        ProductInfo pi = new ProductInfo();
        pi.setProductId("123424");
        pi.setProductName("西瓜粥2");
        pi.setProductPrice(new BigDecimal(3.45));
        pi.setCategoryType(2);
        pi.setProductDescription("好喝2");
        pi.setProductIcon("https://fd22sfds.jpg");
        pi.setProductStatus(0);
        pi.setProductStock(2333);
        ProductInfo afterPi = rep.save(pi);
        System.err.println(afterPi);
    }

    @Test
    public void findByProductStatus(){
        List<ProductInfo> pis = rep.findByProductStatus(1);
        System.err.println(pis);
    }
}
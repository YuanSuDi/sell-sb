package com.tong.sell.service.impl;

import com.tong.sell.dataobject.ProductInfo;
import com.tong.sell.service.ProductInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

    /**
     *   商品信息service层测试
     * @author 元素滴
     * @date 2018/6/6 18:10
     */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {

    @Autowired
    private ProductInfoService service;

    @Test
    public void findOne() {
        ProductInfo pi = service.findOne("123424");
        System.err.println(pi);
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> pis = service.findUpAll();
        System.err.println(pis);
    }

    @Test
    public void findAll() {
        Pageable pageable = new PageRequest(0,10);
        Page<ProductInfo> pis = service.findAll(pageable);
        List<ProductInfo> piList = pis.getContent();
        System.err.println(piList);
    }

    /*@Test
    public void save() {
        ProductInfo info = new ProductInfo();
        info.setProductStock(3);
        info.setProductIcon("https://");
        service.save(info);
    }*/
}
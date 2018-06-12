package com.tong.sell.repository;

import com.tong.sell.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.*;
import java.awt.print.Pageable;
import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;


    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("21323232684646");
        orderDetail.setOrderId("201806121054565421231");
        orderDetail.setProductIcon("http://www.jpg");
        orderDetail.setProductId("1234");
        orderDetail.setProductName("水煮鱼片");
        orderDetail.setProductPrice(new BigDecimal(55));
        orderDetail.setProductQuantity(1);
        repository.save(orderDetail);
    }


    @Test
    public void findByOrderId() {

        List<OrderDetail> result = repository.findByOrderId("201806121054565421231");
        Assert.assertNotEquals(0,result.size());
    }
}
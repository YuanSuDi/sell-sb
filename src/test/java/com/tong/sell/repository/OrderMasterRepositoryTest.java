package com.tong.sell.repository;

import com.tong.sell.dataobject.OrderMaster;
import com.tong.sell.enums.OrderStatusEnum;
import com.tong.sell.enums.PayStatusEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**  
 *   订单的持久层测试类
 * @author 元素滴
 * @date 2018/6/11 17:24
 */ 
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {


    @Autowired
    private OrderMasterRepository repository;


    @Test
    public void saveTest(){

        OrderMaster master = new OrderMaster();
        master.setBuyerAddress("安徽省合肥市包河区");
        master.setBuyerName("历史");
        master.setBuyerOpenid("213458110");
        master.setBuyerPhone("789456123");
        master.setOrderAmount(new BigDecimal(4.5));
        master.setOrderId("201806121054565421231");
        master.setOrderStatus(OrderStatusEnum.NEW.getCode());
        master.setPayStatus(PayStatusEnum.WAIT.getCode());

        repository.save(master);
    }



    @Test
    public void findByBuyerOpenid() {

        Pageable pageable = new PageRequest(1,1);

        Page<OrderMaster> result = repository.findByBuyerOpenid("213458110",pageable);
        System.err.println(result.getTotalElements());
        System.err.println(result.getContent());
    }
}
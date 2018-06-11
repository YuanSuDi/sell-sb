package com.tong.sell.repository;

import com.tong.sell.dataobject.OrderMaster;
import com.tong.sell.enums.OrderStatusEnum;
import com.tong.sell.enums.PayStatusEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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
        master.setBuyerAddress("安徽省合肥市蜀山区");
        master.setBuyerName("张三");
        master.setBuyerOpenid("122423423423");
        master.setBuyerPhone("15685631542");
        master.setOrderAmount(new BigDecimal(34.23));
        master.setOrderId("201806111727565421542");
        master.setOrderStatus(OrderStatusEnum.NEW.getCode());
        master.setPayStatus(PayStatusEnum.WAIT.getCode());

        repository.save(master);
    }


    @Test
    public void findByBuyerOpenid() {

    }
}
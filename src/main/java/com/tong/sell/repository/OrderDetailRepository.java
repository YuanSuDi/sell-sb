package com.tong.sell.repository;

import com.tong.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 *   订单详情
 * @author 元素滴
 * @date 2018/6/12 10:24
 */ 
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {


    /**
     * 根据订单id查找订单详情列表
     * @param orderId
     * @return
     */

    List<OrderDetail> findByOrderId(String orderId);


}

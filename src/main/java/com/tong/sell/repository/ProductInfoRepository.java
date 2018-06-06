package com.tong.sell.repository;


import com.tong.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 *
 * @author 元素滴
 * @date 2018/6/6 17:28
 */
public interface ProductInfoRepository  extends JpaRepository<ProductInfo,String> {


    /**
     * 根据商品状态查找商品列表
     * @param productStatus
     * @return
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);

}

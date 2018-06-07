package com.tong.sell.service;

import com.tong.sell.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 商品信息业务层
 * @author 元素滴
 * @date 2018/6/6 17:39
 */
public interface ProductInfoService {

    /**
     * 查找单个商品
     * @param productId
     * @return
     */
    ProductInfo findOne(String productId);

    /**
     * 查询上架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 查找所有并分页
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    /**
     * 保存商品
     * @param productInfo
     * @return
     */
    ProductInfo save(ProductInfo productInfo);



}

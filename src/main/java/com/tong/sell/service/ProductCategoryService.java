package com.tong.sell.service;

import com.tong.sell.dataobject.ProductCategory;

import java.util.List;

/**
 *   类目业务层
 * @author 元素滴
 * @date 2018/6/1 15:42
 */
public interface ProductCategoryService {

    /**
     * 查找一条类目
     * @param categoryId
     * @return
     */
    ProductCategory findOne(Integer categoryId);

    /**
     * 查找全部类目
     * @return
     */
    List<ProductCategory> findAll();

    /**
     * 根据类目类型查找类目列表
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    /**
     * 添加或者更新类目，有主键时更新，没有则添加
     * @param pc
     * @return
     */
    ProductCategory save(ProductCategory pc);


}

package com.tong.sell.repository;

import com.tong.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 *
 * @author 元素滴
 * @date 2018/6/1 14:56
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {


    /**
     * 更新类目类型查找类目列表
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}

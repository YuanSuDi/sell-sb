package com.tong.sell.repository;

import com.tong.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    /**
     * 查找一条数据
     */
    @Test
    public void findOneTest(){
        ProductCategory pc  = repository.findOne(1);
        System.out.println(pc);
        System.out.println("");

    }



    @Test
    @Transactional //完全回滚，无论是否成功
    public void saveTest(){
        ProductCategory pc = new ProductCategory();
        pc.setCategoryName("新增类目3");
        pc.setCategoryType(3);
        ProductCategory savepc = repository.save(pc);
        System.out.println(savepc);
    }


    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(1,2,3);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        System.out.println(result);
        Assert.assertNotEquals(0,result.size());
    }
}
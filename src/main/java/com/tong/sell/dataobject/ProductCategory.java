package com.tong.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**  
 *   
 * @author 元素滴
 * @date 2018/5/31 17:46
 * 类目
 */ 
//@Table(name = "s_product_category")
//如果不是按照规则定的表名（product_category），需要加上以上注解
@Entity
@DynamicUpdate //动态更新
@Data //包含Get，Set和toString
public class ProductCategory{


    /**类目id*/
    @GeneratedValue
    @Id
    private Integer categoryId;
    /**类目名字*/
    private String categoryName;
    /**类目编号*/
    private Integer categoryType;
    /**创建时间*/
    private Date createTime;
    /**更新时间*/
    private Date updateTime;
}

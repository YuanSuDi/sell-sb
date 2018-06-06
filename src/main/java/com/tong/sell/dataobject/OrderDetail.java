package com.tong.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author 元素滴
 * @date 2018/6/1 11:05
 * 订单详情
 */
@Entity
@DynamicUpdate
@Data
public class OrderDetail implements Serializable {

    /**订单详情id*/
    @Id
    private String detailId;
    /**订单id*/
    private String orderId;
    /**商品id*/
    private String productId;
    /**商品名称*/
    private String productName;
    /**商品价格*/
    private BigDecimal productPrice;
    /**商品数量*/
    private Integer productQuantity;
    /**商品小图*/
    private String productIcon;
    /**创建时间*/
    private Date createTime;
    /**更新时间*/
    private Date updateTime;

}

package com.tong.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *  订单主表
 * @author 元素滴
 * @date 2018/6/1 11:11
 */
@Entity
@DynamicUpdate
@Data
public class OrderMaster implements Serializable {

    /**订单id*/
    @Id
    private String orderId;
    /**买家名称*/
    private String buyerName;
    /**买家电话*/
    private String buyerPhone;
    /**买家地址*/
    private String buyerAddress;
    /**买家微信openid*/
    private String buyerOpenid;
    /**订单总金额*/
    private BigDecimal orderAmount;
    /**订单状态，0：已下单*/
    private Integer orderStatus;
    /**支付状态，0：未支付*/
    private Integer payStatus;
    /**创建时间*/
    private Date createTime;
    /**更新时间*/
    private Date updateTime;

}

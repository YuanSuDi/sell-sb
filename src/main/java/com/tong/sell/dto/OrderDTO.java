package com.tong.sell.dto;

import com.tong.sell.dataobject.OrderDetail;
import com.tong.sell.enums.OrderStatusEnum;
import com.tong.sell.enums.PayStatusEnum;
import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
@Data
public class OrderDTO {

    /**订单id. */
    private String orderId;
    /**买家名称. */
    private String buyerName;
    /**买家电话. */
    private String buyerPhone;
    /**买家地址. */
    private String buyerAddress;
    /**买家微信openid. */
    private String buyerOpenid;
    /**订单总金额. */
    private BigDecimal orderAmount;
    /**订单状态，0：已下单(默认). */
    private Integer orderStatus ;
    /**支付状态，0：未支付. */
    private Integer payStatus;
    /**创建时间. */
    private Date createTime;
    /**更新时间. */
    private Date updateTime;
    /**订单详情列表*/
    //@Transient //忽略数据库字段查询
    private List<OrderDetail> orderDetailList;
}

package com.tong.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *  商品
 *  BangDreamバンドリ　ガールズ　パーティー
 * @author 元素滴
 * @date 2018/6/1 11:17
 */
@Entity
@Data
@DynamicUpdate
public class ProductInfo implements Serializable {

    @Id
    /**商品id*/
    private String productId;
    /**商品名称*/
    private String productName;
    /**商品价格*/
    private BigDecimal productPrice;
    /**库存*/
    private Integer productStock;
    /**商品描述*/
    private String productDescription;
    /**商品小图*/
    private String productIcon;
    /**商品状态,0正常1下架*/
    private Integer productStatus;
    /**类目编号*/
    private Integer categoryType;
    /**创建时间*/
    private Date createTime;
    /**更新时间*/
    private Date updateTime;


}

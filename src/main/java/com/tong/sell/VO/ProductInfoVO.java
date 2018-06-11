package com.tong.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 *   商品详情的扩展类
 * @author 元素滴
 * @date 2018/6/9 15:17
 */
@Data
public class ProductInfoVO {

    /**商品id*/
    @JsonProperty("id")
    private String productId;

    /**商品名称*/
    @JsonProperty("name")
    private String productName;

    /**商品价格*/
    @JsonProperty("price")
    private BigDecimal productPrice;

    /**商品描述*/
    @JsonProperty("description")
    private String productDescription;

    /**商品的图标*/
    @JsonProperty("icon")
    private String productIcon;

}

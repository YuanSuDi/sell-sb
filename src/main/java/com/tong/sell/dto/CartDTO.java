package com.tong.sell.dto;

import lombok.Data;

/**
 *   购物车
 * @author 元素滴
 * @date 2018/6/12 17:45
 */
@Data
public class CartDTO {

    /**商品id*/
    private String productId;

    /**数量*/
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}

package com.tong.sell.enums;

import lombok.Getter;

/**
 *   商品状态枚举
 * @author 元素滴
 * @date 2018/6/6 18:11
 */
@Getter
public enum ProductStatusEnum {

    UP(0,"在架"),
    DOWN(1,"下架");

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }

    ProductStatusEnum(){}
}

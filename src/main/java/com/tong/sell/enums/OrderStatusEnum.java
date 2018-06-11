package com.tong.sell.enums;

import lombok.Getter;

/**
 *   订单状态枚举
 * @author 元素滴
 * @date 2018/6/11 15:49
 */
@Getter
public enum OrderStatusEnum {

    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消");

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }

}

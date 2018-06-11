package com.tong.sell.enums;

import lombok.Getter;

/**
 *   支付状态枚举
 * @author 元素滴
 * @date 2018/6/11 15:53
 */
@Getter
public enum PayStatusEnum {

    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功"),
    ;


    private Integer code;

    private String message;

    PayStatusEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}

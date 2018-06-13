package com.tong.sell.enums;

import lombok.Getter;

/**  
 *   WEB定义错误码
 * @author 元素滴
 * @date 2018/6/12 17:23
 */ 
@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(10,"商品不存在"),

    PRODUCT_STOCK_ERROR( 11  ,"库存不正确"),
        ;

    private String message;
    private Integer code;

    ResultEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }


    ResultEnum(){}

}

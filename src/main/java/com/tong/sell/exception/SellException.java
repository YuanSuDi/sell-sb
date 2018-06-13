package com.tong.sell.exception;

import com.tong.sell.enums.ResultEnum;

/**
 *   自定义异常
 * @author 元素滴
 * @date 2018/6/12 17:21
 */ 
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}

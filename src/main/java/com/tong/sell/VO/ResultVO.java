package com.tong.sell.VO;

import lombok.Data;

/**
 *   http请求返回的最外层的对象
 * @author 元素滴
 * @date 2018/6/9 15:06
 */
@Data
public class ResultVO<T> {

    /**错误码*/
    private Integer code;
    /**提示信息.*/
    private String msg;
    /**具体内容*/
    private T data;
}

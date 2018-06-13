package com.tong.sell.utils;

import java.util.Random;

/**
 *
 * @author 元素滴
 * @date 2018/6/12 17:33
 */ 
public class KeyUtil {

    /**
     * 生成唯一主键
     * 格式：时间+随机数
     * 添加同步锁
     * @return
     */
    public static synchronized String genUniqueKey(){
        Random random = new Random();
        System.currentTimeMillis();//当前毫秒数
        Integer number = random.nextInt(900000)+100000;
        return System.currentTimeMillis()+String.valueOf(number);
    }

}

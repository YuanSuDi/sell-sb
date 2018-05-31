package com.tong.service;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//这个Application必须放在这个类的父包下才能省略不写
//@SpringBootTest(classes = SellApplication.class)
@SpringBootTest
@Slf4j//该注解会自动生成一下的log变量的定义，但需要配合idea的lombak插件实现
public class LoggerTest {

    //private Logger log = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1(){
        log.debug("debug 0000000000");
        log.info("info 00000000000");
        log.error("error 000000000000");
    }

}

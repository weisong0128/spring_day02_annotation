package com.java.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * description: 切面(前置通知)
 * author: ws
 * time: 2020/2/27 22:21
 */
@Component
@Aspect
@Order(1)
public class Logger {

    @After("execution(* com.java.aop.BanDaoImpl.*(..))")
    public void  log() {
        System.out.println("Logger...log()");
    }
}

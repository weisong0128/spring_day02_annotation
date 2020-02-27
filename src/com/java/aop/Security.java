package com.java.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * description: 切面(前置通知)
 * author: ws
 * time: 2020/2/27 22:20
 */
@Component
@Aspect //当前类为切面
@Order(1)
public class Security {
    //切入点之前
    @Before("execution(* com.java.aop.BanDaoImpl.*(..))")
    public void isSecurity(){   //作为前置通知
        System.out.println("Security...isSecurity()....当前环境安全");
    }

}

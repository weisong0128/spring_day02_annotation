package com.java.ioc.annotation;

import com.java.pojo.Monkey;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description:
 * author: ws
 * time: 2020/2/26 21:10
 */
public class IocTest {

    @Test
    public void Test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Monkey mk1 = context.getBean("mk", Monkey.class);
        mk1.behavior();
        System.out.println(mk1);
    }
}

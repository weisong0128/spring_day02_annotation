package com.java.aop;

import com.java.servlet.StudentServlet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description:
 * author: ws
 * time: 2020/2/27 22:26
 */
public class AopTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BanDaoImpl bd = context.getBean("bd", BanDaoImpl.class);
        bd.selectMoney();
        ((ClassPathXmlApplicationContext)context).close();
    }
}

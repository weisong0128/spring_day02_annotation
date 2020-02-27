package com.java.test;

import com.java.pojo.Monkey;
import com.java.service.StudentService;
import com.java.servlet.StudentServlet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description:
 * author: ws
 * time: 2020/2/26 22:30
 */
public class MVCTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentServlet stuServlet = context.getBean("stuServlet", StudentServlet.class);
        stuServlet.doGet();
    }
}

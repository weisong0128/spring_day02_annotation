package com.java.pojo;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * description:
 * author: ws
 * time: 2020/2/26 21:08
 */
//将Monkey类的对象创建过程交给spring容器，用到@Component注解
@Component(value = "mk")
//相当于<bean id="mk" class="com.java.pojo.Monkey">
@Scope("singleton")//作用域
//@Lazy
public class Monkey {

    //将master对象中的属性赋值注入到这个类
    @Autowired //等价于<property name="master" ref="com.java.pojo.Master">
    //或者用@Resource(name="id值")表示，两种方式一样
    private Master master;  //猴子对应的主人
    //理解，上面声明的属性master有了@Autowired注解后，就根本不用new对象，注解已经帮做了
    //该注解会从spring容器中找到Master类型的对象，然后把这个对象的值赋给master属性

    public Monkey() {
        System.out.println("Money....被创建了");
    }

    public void behavior(){
        System.out.println("Monkey...behavior()....喜欢吃香蕉..." + master);
    }


}

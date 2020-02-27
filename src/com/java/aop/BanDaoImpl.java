package com.java.aop;

import org.springframework.stereotype.Component;

/**
 * description: 核心类
 * author: ws
 * time: 2020/2/27 22:16
 */
@Component("bd")  //根据id=bd获取到这个对象，在AopTest中要用到
public class BanDaoImpl {

    public void selectMoney(){
        System.out.println("BanDaoImpl...selectMoney()...余额为 1000万");
    }

    public void updateMoney(){
        System.out.println("BanDaoImpl...updateMoney()...转账成功");
    }

    public void invest(){
        System.out.println("BanDaoImpl...invest()...恭喜投资失败");
    }

}

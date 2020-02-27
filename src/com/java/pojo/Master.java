package com.java.pojo;

import org.springframework.stereotype.Component;

/**
 * description: 主人
 * author: ws
 * time: 2020/2/26 21:31
 */
//将Master类的对象创建过程交给spring容器，用到@Component注解
@Component
public class Master {
    private String uName="王二麻子";
    private String gender="男";

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Master{" +
                "uName='" + uName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

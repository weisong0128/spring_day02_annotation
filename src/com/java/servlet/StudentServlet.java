package com.java.servlet;

import com.java.service.StudentService;
import com.java.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * description:
 * author: ws
 * time: 2020/2/26 22:22
 */
@Controller("stuServlet")
public class StudentServlet {
    @Autowired
    private StudentService studentService;


    public void doGet(){
        List<String> stuList = studentService.findStudent();
        stuList.forEach(temp-> System.out.println(temp));
    }

    public void doPost(){
        studentService.saveStudent();
    }


}

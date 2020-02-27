package com.java.service.impl;

import com.java.dao.StudentDao;
import com.java.dao.impl.StudentDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * description: 业务层
 * author: ws
 * time: 2020/2/26 22:16
 */
@Service
public class StudentServiceImpl implements com.java.service.StudentService {

//    @Autowired  //下面的属性（studentDao）就不能new对象就可以获取到studentDao中的值了
    @Autowired
    private StudentDao studentDao;

    @Override
    public List<String> findStudent(){
        return studentDao.selectStudent();
    }

    @Override
    public boolean saveStudent(){

        return studentDao.insertStudent()==1 ? true:false;
    }


}

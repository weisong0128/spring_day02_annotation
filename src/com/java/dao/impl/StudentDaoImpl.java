package com.java.dao.impl;

import com.java.dao.StudentDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * description: 数据库访问层实现类
 * author: ws
 * time: 2020/2/26 22:10
 */
@Repository
public class StudentDaoImpl implements StudentDao {

    @Override
    public List<String> selectStudent(){
        return Arrays.asList("王二麻子","张三","李四","王五");
    }

    @Override
    public int insertStudent(){
        System.out.println("StudentDaoImpl...insertStudent....添加成功");
        return 1;
    }

}

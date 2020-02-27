package com.java.dao;

import java.util.List;

/**
 * description:
 * author: ws
 * time: 2020/2/26 22:15
 */
public interface StudentDao {
    List<String> selectStudent();

    int insertStudent();
}

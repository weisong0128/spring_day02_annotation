package com.java.service;

import java.util.List;

/**
 * description:
 * author: ws
 * time: 2020/2/26 22:21
 */
public interface StudentService {
    List<String> findStudent();

    boolean saveStudent();
}

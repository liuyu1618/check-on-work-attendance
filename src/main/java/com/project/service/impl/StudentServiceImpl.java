package com.project.service.impl;

import com.project.mapper.StudentMapper;
import com.project.pojo.Student;
import com.project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description
 *
 * @Author：阿牛
 * @Date：Created in 2023/9/11 19:42
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> findAll() {
        List<Student> students = studentMapper.queryAll();
        return students;
    }
}

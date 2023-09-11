package com.project.controller;

import com.project.pojo.Student;
import com.project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description
 * @Author：阿牛
 * @Date：Created in 2023/9/11 13:04
 */
@RestController
@RequestMapping("user")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("find")
    public List<Student> findAll(){
        List<Student> all = studentService.findAll();
        return all;
    }
}

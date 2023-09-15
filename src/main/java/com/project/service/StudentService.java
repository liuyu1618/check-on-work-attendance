package com.project.service;

import com.project.pojo.Student;
import com.project.utils.R;

import java.util.List;

/**
 * Description
 *
 * @Author：阿牛
 * @Date：Created in 2023/9/11 19:41
 */
public interface StudentService {
    List<Student> findAll();

    R page(int pageSize, int currentPage);

    R remove(int id);

    R save(Student student);

    R update(Student student);
}

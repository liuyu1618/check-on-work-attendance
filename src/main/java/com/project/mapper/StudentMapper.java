package com.project.mapper;

import com.project.pojo.Student;
import com.project.utils.R;

import java.util.List;

/**
 * Description
 * @Author：阿牛
 * @Date：Created in 2023/9/11 19:40
 */
public interface StudentMapper {

    List<Student> queryAll();

    List<Student> queryList();

    int delete(int id);

    int insert(Student student);

    int update(Student student);
}

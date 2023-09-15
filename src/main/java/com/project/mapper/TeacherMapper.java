package com.project.mapper;

import com.project.pojo.Teacher;

/**
 * Description
 *
 * @Author：阿牛
 * @Date：Created in 2023/9/15 13:34
 */
public interface TeacherMapper {

    int insert(Teacher teacher);

    int delete(int id);

    int update(Teacher teacher);
}

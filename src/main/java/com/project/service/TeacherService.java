package com.project.service;

import com.project.pojo.Teacher;
import com.project.utils.R;

/**
 * Description
 *
 * @Author：阿牛
 * @Date：Created in 2023/9/15 13:32
 */
public interface TeacherService {
    R save(Teacher teacher);

    R remove(int id);

    R update(Teacher teacher);
}

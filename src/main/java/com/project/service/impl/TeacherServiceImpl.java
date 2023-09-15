package com.project.service.impl;

import com.project.mapper.TeacherMapper;
import com.project.pojo.Teacher;
import com.project.service.TeacherService;
import com.project.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description
 *
 * @Author：阿牛
 * @Date：Created in 2023/9/15 13:33
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public R save(Teacher teacher) {
       int rows =  teacherMapper.insert(teacher);
        if (rows > 0){
            return R.ok(null);
        }
        return R.fail(null);
    }

    @Override
    public R remove(int id) {
       int rows = teacherMapper.delete(id);
       if (rows > 0){
           return R.ok(null);
       }
        return R.fail(null);
    }

    @Override
    public R update(Teacher teacher) {
        if (teacher.gettId() == null){
            return R.fail("老师id不能为空");
        }
       int rows = teacherMapper.update(teacher);
        if (rows > 0){
            return R.ok(null);
        }
        return R.fail(null);
    }
}

package com.project.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.project.mapper.StudentMapper;
import com.project.pojo.Student;
import com.project.service.StudentService;
import com.project.utils.PageBean;
import com.project.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

    /**
     * 插件查询学生信息实现
     * @param pageSize
     * @param currentPage
     * @return
     */
    @Override
    public R page(int pageSize, int currentPage) {
        //分页
        PageHelper.startPage(currentPage,pageSize);
        //查询
        List<Student> list = studentMapper.queryList();
        //分页数据装配
        PageInfo<Student> info = new PageInfo<>(list);

        //装配pageBean
        PageBean<Student> bean = new PageBean<>(currentPage,pageSize, info.getTotal(),info.getList());

        R ok = R.ok(bean);
        return ok;
    }

    /**
     * 根据id删除学生实现
     * @param
     * @return
     */
    @Override
    public R remove(int id) {
      int rows = studentMapper.delete(id);
      if (rows > 0 ){
          return R.ok(null);
      }
      return R.fail(null);
    }

    /**
     * 添加学生信息
     * @param student
     * @param
     * @return
     */
    @Override
    public R save(Student student) {
      int rows = studentMapper.insert(student);
        if (rows > 0 ){
            return R.ok(null);
        }
        return R.fail(null);
    }

    @Override
    public R update(Student student) {
        if (student.getsId() == null){
            return R.fail("学号不能为空!");
        }
       int rows =  studentMapper.update(student);
        if (rows > 0){
            return R.ok(null);
        }
        return R.fail(null);
    }
}

package com.project.controller;

import com.project.pojo.Teacher;
import com.project.service.TeacherService;
import com.project.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

/**
 * Description
 *
 * @Author：阿牛
 * @Date：Created in 2023/9/15 13:32
 */
@RestController
@Slf4j
@RequestMapping("teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    /**
     * 添加老师方法
     * @param teacher
     * @param result
     * @return
     */
    @PostMapping
    public R saveTeacher(@RequestBody Teacher teacher, BindingResult result){
        if (result.hasErrors()){
            return R.fail("传入的参数不符合!");
        }
       R r = teacherService.save(teacher);
       return  R.ok(r);
    }

    @DeleteMapping({"/{id}"})
    public R removeTeacher(@PathVariable int id){
       R r =  teacherService.remove(id);
       return  r;
    }

    /**
     * 修改老师信息
     * @param teacher
     * @param result
     * @return
     */
    @PutMapping
    public R updateTeacher(@RequestBody Teacher teacher,BindingResult result){
        if (result.hasErrors()){
            return R.fail("老师id不能为空");
        }
      R r = teacherService.update(teacher);
      return R.ok(r);
    }
}

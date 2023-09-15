package com.project.controller;

import com.project.pojo.Student;
import com.project.service.StudentService;
import com.project.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Description
 * 学生信息操作
 * @Author：阿牛
 * @Date：Created in 2023/9/11 13:04
 */
@RestController
@RequestMapping("student")
@Slf4j
public class StudentController {

    @Autowired
    private StudentService studentService;

    //查询所有学生
    @GetMapping("find")
    public List<Student> findAll(){
        List<Student> all = studentService.findAll();
        //使用sj4fj日志输出结果
        log.info("查询的数据为：{}",all);
        return all;
    }

    /**
     * 分页查询学生信息
     * @param pageSize  一页几条数据
     * @param currentPage   当前是第几页
     * @return
     */
    @GetMapping("{pageSize}/{currentPage}")
    public R Page(@PathVariable int pageSize,
                  @PathVariable int currentPage){
       R r =  studentService.page(pageSize,currentPage);
       log.info("查询的数据为：{}" ,r);
       return r;
    }

    //删除学生
    @DeleteMapping("/{id}")
    public R remove(@PathVariable int id){
        R r =  studentService.remove(id);
        return r;
    }

    //添加学生
    @PostMapping
    public R save(@RequestBody Student student, BindingResult result){
//        System.out.println(student.toString());
        if (result.hasErrors()){
            return R.fail("输入的参数不符合！");
        }
        R r = studentService.save(student);
        return R.ok(r);
    }

    @PutMapping
    public R update(@Validated @RequestBody Student student,BindingResult result){
        if (result.hasErrors()){
            return R.fail("学生的学号不能为空！");
        }
        R r= studentService.update(student);
        return R.ok(r);
    }

}

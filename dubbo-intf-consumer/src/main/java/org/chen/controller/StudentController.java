package org.chen.controller;

import org.chen.entity.Student;
import org.chen.intf.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Description
 * @ClassName StudentController
 * @Author chengui
 * @date 2021.05.04 23:19
 */

public class StudentController {

    @Autowired
    private StudentService studentService;


    public List<Student> getStuInfo(String stuNo){
        List<Student> stuList = studentService.getStuInfo("1");
        return stuList;
    }



}

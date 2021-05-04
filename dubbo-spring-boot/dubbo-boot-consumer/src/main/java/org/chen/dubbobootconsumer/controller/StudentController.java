package org.chen.dubbobootconsumer.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.chen.entity.Student;
import org.chen.intf.StudentService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @ClassName StudentController
 * @Author chengui
 * @date 2021.05.04 23:19
 */

@RestController
public class StudentController {

    @DubboReference(version = "1.0.0")
    private StudentService studentService;


    @RequestMapping(value = "/getStuInfo/{stuNo}",method= RequestMethod.GET)
    public List<Student> getStuInfo(@PathVariable("stuNo") String stuNo){
        List<Student> stuList = studentService.getStuInfo("1");
        return stuList;
    }



}

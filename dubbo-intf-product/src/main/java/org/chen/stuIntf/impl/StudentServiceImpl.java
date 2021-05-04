package org.chen.stuIntf.impl;

import org.chen.entity.Student;
import org.chen.intf.StudentService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @ClassName StudentServiceImpl
 * @Author chengui
 * @date 2021.05.04 22:57
 */

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> getStuInfo(String stuNo) {
        Student xiaoming = new Student("1","xiaoming","15","男");
        Student xiaohong = new Student("2","xiaohong","16","男");
        return Arrays.asList(xiaoming,xiaohong);
    }
}

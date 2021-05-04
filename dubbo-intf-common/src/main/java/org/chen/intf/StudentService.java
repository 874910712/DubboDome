package org.chen.intf;

import org.chen.entity.Student;

import java.util.List;

/**
 * @Description
 * @ClassName StudentService
 * @Author chengui
 * @date 2021.05.04 22:51
 */
public interface StudentService {

    List<Student> getStuInfo(String stuNo);

}

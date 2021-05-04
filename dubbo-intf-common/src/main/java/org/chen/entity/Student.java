package org.chen.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description
 * @ClassName Student
 * @Author chengui
 * @date 2021.05.04 22:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
    private String stuNo;
    private String stuName;
    private String age;
    private String sex;
}

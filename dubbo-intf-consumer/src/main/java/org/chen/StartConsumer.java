package org.chen;

import org.chen.controller.StudentController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 */
public class StartConsumer {
    public static void main(String[] args) throws IOException {

        //获取IOC容器对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("./consumer.xml");
        //启动IOC容器
        context.start();
        //获取服务Bean
        StudentController studentController = context.getBean(StudentController.class);
        System.out.println(studentController.getStuInfo("1"));
        // 按任意键退出
        System.in.read();


    }
}

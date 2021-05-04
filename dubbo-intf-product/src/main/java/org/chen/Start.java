package org.chen;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 */
public class Start {
    public static void main(String[] args) throws IOException {
        //获取IOC容器对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("./provider.xml");
        //启动IOC容器
        context.start();
        // 按任意键退出
        System.in.read();
    }
}

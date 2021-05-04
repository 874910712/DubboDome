Springboot整合dubbo流程：
1.导入依赖：
dubbo-spring-boot-starter的版本由使用的dubbo版本决定，如果使用的dubbo版本低于2.7.0则按下面规则选取版本号
Dubbo Spring Boot	Dubbo	Spring Boot
0.2.1.RELEASE	   2.6.5+	2.x
0.1.2.RELEASE	  2.6.5+	1.x


<dependency>
    <groupId>org.apache.dubbo</groupId>
    <artifactId>dubbo-spring-boot-starter</artifactId>
    <version>2.7.10</version>
</dependency>


2.配置dubbo相关配置项
3.在启动类上加上@EnableDubbo注解，标识开启Dubbo相关注解的使用

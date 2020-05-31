package com.example.java.interview.guide.part2.car.spring.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : zhouguanya
 * @Project : java-interview-guide-part2
 * @Date : 2020-05-22 17:33
 * @Version : V1.0
 * @Description : Spring IoC使用方式演示
 */
public class SpringIocDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext
                = new ClassPathXmlApplicationContext("car.xml");
        Car car = classPathXmlApplicationContext.getBean("car", Car.class);
        car.drive();
    }
}

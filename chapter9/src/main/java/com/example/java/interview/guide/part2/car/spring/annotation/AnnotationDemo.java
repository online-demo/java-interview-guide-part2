package com.example.java.interview.guide.part2.car.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author : zhouguanya
 * @Project : java-interview-guide-part2
 * @Date : 2020-05-23 17:50
 * @Version : V1.0
 * @Description : 注解使用方式演示
 */
public class AnnotationDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MovieConfiguration.class);
        Director director = applicationContext.getBean(Director.class);
        director.make();
    }
}

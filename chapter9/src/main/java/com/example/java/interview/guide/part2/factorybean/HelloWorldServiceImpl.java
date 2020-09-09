package com.example.java.interview.guide.part2.factorybean;

/**
 * @Author : zhouguanya
 * @Project : java-interview-guide-part2
 * @Date : 2020-09-07 11:34
 * @Version : V1.0
 * @Description : HelloWorldService接口实现类
 */
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public void sayHello() {
        System.out.println("HelloWorldServiceImpl#sayHello()方法输出：Hello World");
    }
}

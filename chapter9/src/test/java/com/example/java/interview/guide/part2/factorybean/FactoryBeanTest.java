package com.example.java.interview.guide.part2.factorybean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author : zhouguanya
 * @Project : java-interview-guide-part2
 * @Date : 2020-09-07 12:03
 * @Version : V1.0
 * @Description : FactoryBean测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:factorybean.xml"})
public class FactoryBeanTest {
    @Autowired
    private ApplicationContext context;

    @Test
    public void test() {
        // 从Spring上下文中获取LogFactoryBean对象
        // 因为LogFactoryBean返回的是getObject()方法返回的对象
        // 因此得到的其实是一个代理对象
        // 代理对象其实代理的是HelloWorldServiceImpl对象
        HelloWorldService helloWordService = (HelloWorldService) context
                .getBean("logFactoryBean");
        // 调用代理对象的sayHello()方法
        helloWordService.sayHello();
    }
}

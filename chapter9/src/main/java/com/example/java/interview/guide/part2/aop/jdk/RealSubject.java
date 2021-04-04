package com.example.java.interview.guide.part2.aop.jdk;

/**
 * @Author : zhouguanya
 * @Project : java-interview-guide-part2
 * @Date : 2021-01-24 17:39
 * @Version : V1.0
 * @Description : 被代理的真实对象
 */
public class RealSubject implements Subject {
    /**
     * 你好
     *
     * @param name 姓名
     * @return
     */
    @Override
    public void sayHello(String name) {
        System.out.println(name + "你好");
    }

    /**
     * 再见
     *
     * @param name 姓名
     * @return
     */
    @Override
    public void sayGoodBye(String name) {
        System.out.println(name + "再见 ");
    }
}

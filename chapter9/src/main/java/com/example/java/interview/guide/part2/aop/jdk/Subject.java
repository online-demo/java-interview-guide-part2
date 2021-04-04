package com.example.java.interview.guide.part2.aop.jdk;

/**
 * @Author : zhouguanya
 * @Project : java-interview-guide-part2
 * @Date : 2021-01-24 17:36
 * @Version : V1.0
 * @Description : 被代理的接口
 */
public interface Subject {

    /**
     * 你好
     *
     * @param name 姓名
     * @return
     */
    void sayHello(String name);

    /**
     * 再见
     *
     * @param name 姓名
     * @return
     */
    void sayGoodBye(String name);
}

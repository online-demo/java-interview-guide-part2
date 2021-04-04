package com.example.java.interview.guide.part2.aop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author : zhouguanya
 * @Project : java-interview-guide-part2
 * @Date : 2021-01-24 17:40
 * @Version : V1.0
 * @Description : InvocationHandler实现类
 */
public class MyInvocationHandler implements InvocationHandler {
    /**
     * 被代理的对象
     */
    private Object subject;

    /**
     * 构造器，给subject对象赋值
     *
     * @param subject 被代理的对象
     */
    public MyInvocationHandler(Object subject) {
        this.subject = subject;
    }

    /**
     * 该方法负责集中处理动态代理类上的所有方法调用。
     * 调用处理器根据以下这三个参数进行预处理或分派到委托类实例上反射执行。
     *
     * @param proxy 代理对象
     * @param method 被调用的方法对象
     * @param args 被调用的方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 在被调用的方法执行之前可以加入一些自定义逻辑
        System.out.println(method.getName() + "方法执行开始");
        // 调用目标方法
        Object result = method.invoke(subject, args);
        // 在被调用的方法执行之后可以加入一些自定义逻辑
        System.out.println(method.getName() + "方法执行结束");
        return result;
    }
}

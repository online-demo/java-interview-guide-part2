package com.example.java.interview.guide.part2.aop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author : zhouguanya
 * @Project : java-interview-guide-part2
 * @Date : 2021-01-24 17:49
 * @Version : V1.0
 * @Description : JDK动态代理demo
 */
public class JdkDynamicProxyDemo {
    public static void main(String[] args) {
        // 代理的真实对象
        Subject realSubject = new RealSubject();
        InvocationHandler handler = new MyInvocationHandler(realSubject);
        // 获取RealSubject的类加载器
        ClassLoader loader = realSubject.getClass().getClassLoader();
        // 获取RealSubject类实现的接口
        Class<?>[] interfaces = realSubject.getClass().getInterfaces();
        // 设置系统属性
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        // 创建代理对象
        Subject proxyInstance = (Subject) Proxy.newProxyInstance(loader, interfaces, handler);
        // 打印代理对象的类型
        System.out.println("动态代理对象的类型：" + proxyInstance.getClass().getName());
        // 执行代理对象的sayHello()方法
        proxyInstance.sayHello("Michael");
        // 执行代理对象的sayGoodBye()方法
        proxyInstance.sayGoodBye("Michael");
    }
}

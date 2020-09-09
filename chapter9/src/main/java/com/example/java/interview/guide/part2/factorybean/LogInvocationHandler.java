package com.example.java.interview.guide.part2.factorybean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author : zhouguanya
 * @Project : java-interview-guide-part2
 * @Date : 2020-09-07 11:22
 * @Version : V1.0
 * @Description : InvocationHandler实现类
 */
public class LogInvocationHandler implements InvocationHandler {
    /**
     * 被代理的对象
     */
    private Object target;

    /**
     * 构造器
     */
    public LogInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * 重写invoke方法
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入LogInvocationHandler#invoke()方法。");
        InvocationHandler invocationHandler = Proxy.getInvocationHandler(proxy);
        System.out.println("获取代理对象proxy的invocationHandler属性：" + invocationHandler);
        // 如果代理对象proxy的invocationHandler属性与当前对象是同一个对象
        if (invocationHandler == this) {
            System.out.println("代理类proxy的invocationHandler属性与当前对象是同一个对象。");
            System.out.println("当前调用的是" + this.target + "对象的方法。");
        }
        System.out.println("调用" + method.getDeclaringClass().getCanonicalName()
                + "#" + method.getName() + "()方法之前。" );
        Object result = method.invoke(target, args);
        System.out.println("调用" + method.getDeclaringClass().getCanonicalName()
                + "#" + method.getName() + "()方法之后。" );
        return result;
    }
}

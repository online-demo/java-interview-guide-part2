package com.example.java.interview.guide.part2.factorybean;

import java.lang.reflect.InvocationHandler;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import java.lang.reflect.Proxy;

/**
 * @Author : zhouguanya
 * @Project : java-interview-guide-part2
 * @Date : 2020-09-07 11:14
 * @Version : V1.0
 * @Description : 代理一个类，拦截该类的所有方法，在方法的调用前后进行日志的输出
 */
public class LogFactoryBean implements FactoryBean<Object>, InitializingBean, DisposableBean {
    /**
     * 接口名
     */
    private String interfaceName;
    /**
     * 代理对象
     */
    private Object proxyObj;
    /**
     * InvocationHandler对象
     */
    private InvocationHandler invocationHandler;

    /**
     * 重写DisposableBean接口的destroy()方法
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("调用LogFactoryBean#destroy()方法。");
    }

    /**
     * 重写FactoryBean接口的getObject()方法
     */
    @Override
    public Object getObject() throws Exception {
        System.out.println("调用LogFactoryBean#getObject()方法。");
        return proxyObj;
    }

    /**
     * 重写FactoryBean接口的getObjectType()方法
     */
    @Override
    public Class<?> getObjectType() {
        return proxyObj == null ? Object.class : proxyObj.getClass();
    }

    /**
     * 重写InitializingBean接口的afterPropertiesSet()方法
     * 通过JDK动态代理生成一个代理对象
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("调用LogFactoryBean#afterPropertiesSet()方法。");
        proxyObj = Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{Class.forName(interfaceName)}, invocationHandler);
    }

    /**
     * 设置interfaceName属性
     */
    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    /**
     * 设置invocationHandler属性
     */
    public void setInvocationHandler(InvocationHandler invocationHandler) {
        this.invocationHandler = invocationHandler;
    }
}

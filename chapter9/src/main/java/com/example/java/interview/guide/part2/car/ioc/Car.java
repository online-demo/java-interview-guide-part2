package com.example.java.interview.guide.part2.car.ioc;


/**
 * @Author : zhouguanya
 * @Project : java-interview-guide-part2
 * @Date : 2020-05-19 06:22
 * @Version : V1.0
 * @Description : 汽车类
 */
public class Car {
    /**
     * 每一辆汽车都有一个车身属性
     */
    private Bodywork bodywork;

    /**
     * 构造器
     *
     * @param bodywork 注入Bodywork属性
     */
    public Car(Bodywork bodywork) {
        this.bodywork = bodywork;
    }

    /**
     * 驾驶方法
     */
    public void drive() {

    }
}

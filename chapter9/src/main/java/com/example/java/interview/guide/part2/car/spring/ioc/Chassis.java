package com.example.java.interview.guide.part2.car.spring.ioc;


import java.util.List;

/**
 * @Author : zhouguanya
 * @Project : java-interview-guide-part2
 * @Date : 2020-05-22 17:07
 * @Version : V1.0
 * @Description : 底盘类
 */
public class Chassis {
    /**
     * 每个底盘有若干个车轮属性
     */
    private List<Wheel> wheels;

    /**
     * 注入时使用
     *
     * @param wheels 底盘类
     */
    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return "Chassis{" +
                "wheels=" + wheels +
                '}';
    }
}

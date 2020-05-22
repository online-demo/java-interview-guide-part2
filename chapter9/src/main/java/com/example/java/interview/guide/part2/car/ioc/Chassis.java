package com.example.java.interview.guide.part2.car.ioc;


import java.util.List;

/**
 * @Author : zhouguanya
 * @Project : java-interview-guide-part2
 * @Date : 2020-05-19 06:29
 * @Version : V1.0
 * @Description : 底盘类
 */
public class Chassis {
    /**
     * 每个底盘有若干个车轮属性
     */
    private List<Wheel> wheels;

    /**
     * 底盘类构造器
     *
     * @param wheels 注入车轮
     */
    public Chassis(List<Wheel> wheels) {
        this.wheels = wheels;
    }
}

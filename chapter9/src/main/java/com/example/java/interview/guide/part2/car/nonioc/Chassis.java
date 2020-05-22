package com.example.java.interview.guide.part2.car.nonioc;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : zhouguanya
 * @Project : java-interview-guide-part2
 * @Date : 2020-05-17 23:10
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
     */
    public Chassis() {
        List<Wheel> wheels = new ArrayList<Wheel>();
        for (int i = 0; i < 4; i++) {
            Wheel wheel = new Wheel();
            wheels.add(wheel);
        }
        this.wheels = wheels;
    }

    /**
     * 底盘类构造器，因车轮尺寸变动而做修改
     *
     * @param size 车轮尺寸
     */
    public Chassis(int size) {
        List<Wheel> wheels = new ArrayList<Wheel>();
        for (int i = 0; i < 4; i++) {
            Wheel wheel = new Wheel(size);
            wheels.add(wheel);
        }
        this.wheels = wheels;
    }
}

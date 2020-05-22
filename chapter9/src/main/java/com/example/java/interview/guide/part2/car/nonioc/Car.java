package com.example.java.interview.guide.part2.car.nonioc;

/**
 * @Author : zhouguanya
 * @Project : java-interview-guide-part2
 * @Date : 2020-05-17 23:00
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
     */
    public Car() {
        this.bodywork = new Bodywork();
    }

    /**
     * 汽车类构造器，因车轮尺寸变动而做修改
     *
     * @param size 车轮尺寸
     */
    public Car(int size) {
        this.bodywork = new Bodywork(size);
    }

    /**
     * 驾驶方法
     */
    public void drive() {

    }
}

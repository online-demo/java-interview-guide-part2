package com.example.java.interview.guide.part2.car.nonioc;

/**
 * @Author : zhouguanya
 * @Project : java-interview-guide-part2
 * @Date : 2020-05-17 23:12
 * @Version : V1.0
 * @Description : 车轮类
 */
public class Wheel {
    /**
     * 尺寸
     */
    private int size;

    /**
     * 车轮构造器
     */
    public Wheel() {
        this.size = 50;
    }

    /**
     * 车轮类构造器，因车轮尺寸变动而做修改
     *
     * @param size 车轮尺寸
     */
    public Wheel(int size) {
        this.size = size;
    }
}

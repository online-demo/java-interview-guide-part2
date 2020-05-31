package com.example.java.interview.guide.part2.car.spring.ioc;

/**
 * @Author : zhouguanya
 * @Project : java-interview-guide-part2
 * @Date : 2020-05-22 17:07
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
    public Wheel(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "size=" + size +
                '}';
    }
}

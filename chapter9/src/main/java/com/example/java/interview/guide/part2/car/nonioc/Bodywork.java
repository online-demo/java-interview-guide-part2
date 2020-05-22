package com.example.java.interview.guide.part2.car.nonioc;

/**
 * @Author : zhouguanya
 * @Project : java-interview-guide-part2
 * @Date : 2020-05-17 23:04
 * @Version : V1.0
 * @Description : 车身类
 */
public class Bodywork {
    /**
     * 每个车身都有一个底盘属性
     */
    private Chassis chassis;

    /**
     * 车身类构造器
     */
    public Bodywork() {
        this.chassis = new Chassis();
    }

    /**
     * 车身类构造器，因车轮尺寸变动而做修改
     *
     * @param size 车轮尺寸
     */
    public Bodywork(int size) {
        this.chassis = new Chassis(size);
    }
}

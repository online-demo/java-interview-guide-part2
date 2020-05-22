package com.example.java.interview.guide.part2.car.ioc;


/**
 * @Author : zhouguanya
 * @Project : java-interview-guide-part2
 * @Date : 2020-05-19 06:24
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
     * @param chassis 注入底盘
     */
    public Bodywork(Chassis chassis) {
        this.chassis = chassis;
    }
}

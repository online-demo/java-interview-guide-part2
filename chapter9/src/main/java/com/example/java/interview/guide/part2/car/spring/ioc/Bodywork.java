package com.example.java.interview.guide.part2.car.spring.ioc;


/**
 * @Author : zhouguanya
 * @Project : java-interview-guide-part2
 * @Date : 2020-05-22 17:06
 * @Version : V1.0
 * @Description : 车身类
 */
public class Bodywork {
    /**
     * 每个车身都有一个底盘属性
     */
    private Chassis chassis;

    /**
     * 注入时使用
     *
     * @param chassis 底盘属性
     */
    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    /**
     * 返回底盘
     *
     * @return 底盘属性
     */
    public Chassis getChassis() {
        return chassis;
    }

    @Override
    public String toString() {
        return "Bodywork{" +
                "chassis=" + chassis +
                '}';
    }
}

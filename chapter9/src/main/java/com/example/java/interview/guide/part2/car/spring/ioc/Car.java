package com.example.java.interview.guide.part2.car.spring.ioc;


import java.util.List;

/**
 * @Author : zhouguanya
 * @Project : java-interview-guide-part2
 * @Date : 2020-05-22 10:38
 * @Version : V1.0
 * @Description : 汽车类
 */
public class Car {
    /**
     * 每一辆汽车都有一个车身属性
     * 通过Spring IoC注入
     */
    private Bodywork bodywork;

    /**
     * 驾驶方法
     */
    public void drive() {
        System.out.println("驾驶汽车中。。。");
        System.out.println("汽车的车身是：" + bodywork);
        Chassis chassis = bodywork.getChassis();
        System.out.println("汽车的底盘是：" + chassis);
        List<Wheel> wheels = chassis.getWheels();
        System.out.println("汽车的车轮是：" + wheels);
        System.out.print("汽车车轮的尺寸分别是：");
        for (int i = 0; i < wheels.size(); i++) {
            System.out.print(wheels.get(i).getSize() + " ");
        }
    }

    /**
     * 注入时使用
     *
     * @param bodywork 车身属性
     */
    public void setBodywork(Bodywork bodywork) {
        this.bodywork = bodywork;
    }

    @Override
    public String toString() {
        return "Car{" +
                "bodywork=" + bodywork +
                '}';
    }
}

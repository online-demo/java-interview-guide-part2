package com.example.java.interview.guide.part2.car.spring.annotation;

import org.springframework.stereotype.Component;

/**
 * @Author : zhouguanya
 * @Project : java-interview-guide-part2
 * @Date : 2020-05-23 17:40
 * @Version : V1.0
 * @Description : 演员类
 */
@Component
public class Actor {
    /**
     * 演员表演
     */
    public void act() {
        System.out.println("演员按剧本开始表演");
    }
}

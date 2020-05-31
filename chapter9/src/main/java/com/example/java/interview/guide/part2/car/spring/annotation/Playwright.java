package com.example.java.interview.guide.part2.car.spring.annotation;

import org.springframework.stereotype.Component;

/**
 * @Author : zhouguanya
 * @Project : java-interview-guide-part2
 * @Date : 2020-05-23 17:37
 * @Version : V1.0
 * @Description : 编剧类
 */
@Component
public class Playwright {
    /**
     * 编剧创建剧本
     */
    public void wright() {
        System.out.println("编剧创作一个剧本");
    }
}

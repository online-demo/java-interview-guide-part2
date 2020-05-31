package com.example.java.interview.guide.part2.car.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author : zhouguanya
 * @Project : java-interview-guide-part2
 * @Date : 2020-05-23 17:40
 * @Version : V1.0
 * @Description : 导演类
 */
@Component
public class Director {

    @Autowired
    private Playwright playwright;

    @Autowired
    private Actor actor;

    /**
     * 导演拍电影
     */
    public void make() {
        System.out.println("导演打算拍一部电影");
        playwright.wright();
        actor.act();
    }
}

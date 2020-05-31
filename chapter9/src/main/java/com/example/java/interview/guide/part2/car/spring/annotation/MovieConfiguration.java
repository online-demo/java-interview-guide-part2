package com.example.java.interview.guide.part2.car.spring.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author : zhouguanya
 * @Project : java-interview-guide-part2
 * @Date : 2020-05-23 17:56
 * @Version : V1.0
 * @Description : 配置类
 * 扫描com.example.java.interview.guide.part2.car.spring.annotation
 * 包路径下的Bean
 */
@Configuration
@ComponentScan("com.example.java.interview.guide.part2.car.spring.annotation")
public class MovieConfiguration {

}

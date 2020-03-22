package com.hanhj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void  main(String[] args){

        // 大工厂 Context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 调用 xml 配置文件中的 bean 的 id
//        Driver d = (Driver) context.getBean("driver01");

        Tank t = (Tank) context.getBean("Tank");
    }

}

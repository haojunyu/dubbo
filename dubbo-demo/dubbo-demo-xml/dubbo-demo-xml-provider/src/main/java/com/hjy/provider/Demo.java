package com.hjy.provider;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;

/**
 * @author a11080355
 */
public class Demo {

    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/hjy-provider.xml");
        System.out.println("提供者启动成功...");
        // 为了让提供者不退出
        System.in.read();
    }

}

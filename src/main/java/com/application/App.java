package com.application;

import com.application.config.SpringConfig;
import com.application.service.TestBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.text.StringContent;
import java.lang.annotation.Annotation;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        TestBean bean = context.getBean(TestBean.class);
        String name = bean.getName();
        System.out.println("Hello world, " + name);
    }
}

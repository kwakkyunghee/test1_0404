package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

        TestBean1 obj1 = ctx.getBean("java1", TestBean1.class);
        System.out.println(obj1.getNum1());

        TestBean1 obj2 = ctx.getBean("java2", TestBean1.class);
        System.out.println(obj2.getNum1());
    }
}
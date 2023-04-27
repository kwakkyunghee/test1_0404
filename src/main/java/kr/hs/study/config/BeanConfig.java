package kr.hs.study.config;

import kr.hs.study.beans.TestBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

public class BeanConfig {
    @Bean
    public TestBean1 java1(){
        TestBean1 t = new TestBean1(1, 10);
        return t;
    }

    @Bean
    @Lazy
    @Scope("prototype")
    public TestBean1 java2(){
        TestBean1 t2 = new TestBean1();
        t2.setNum1(1);
        t2.setNum2(20);

        return t2;
    }
}

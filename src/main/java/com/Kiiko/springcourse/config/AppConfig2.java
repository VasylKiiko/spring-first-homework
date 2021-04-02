package com.Kiiko.springcourse.config;

import com.Kiiko.springcourse.beans2.CatAnimal;
import com.Kiiko.springcourse.beans3.BeanD;
import com.Kiiko.springcourse.beans3.BeanF;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = CatAnimal.class)
public class AppConfig2 {
    @Bean
    public BeanD beanD() {
        return new BeanD();
    }

    @Bean
    public BeanF beanF() {
        return new BeanF();
    }
}

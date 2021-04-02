package com.Kiiko.springcourse.config;

import com.Kiiko.springcourse.otherbeans.OtherBeanA;
import com.Kiiko.springcourse.otherbeans.OtherBeanB;
import com.Kiiko.springcourse.otherbeans.OtherBeanC;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.Kiiko.springcourse.di_beans")
public class DIExampleConfig {
    @Bean
    public OtherBeanA otherBeanA(){
        return new OtherBeanA("bean A");
    }

    @Bean
    public OtherBeanB otherBeanB(){
        return new OtherBeanB("bean B");
    }

    @Bean
    public OtherBeanC otherBeanC1(){
        return new OtherBeanC("bean C - first");
    }

    @Bean
    public OtherBeanC otherBeanC2(){
        return new OtherBeanC("bean C - second");
    }
}

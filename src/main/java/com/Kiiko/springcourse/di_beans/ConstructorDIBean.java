package com.Kiiko.springcourse.di_beans;

import com.Kiiko.springcourse.otherbeans.OtherBeanA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorDIBean {
    private OtherBeanA otherBeanA;

    @Autowired
    public ConstructorDIBean(OtherBeanA otherBeanA){
        this.otherBeanA = otherBeanA;
    }

    public void printValue() {
        System.out.println(otherBeanA);
    }
}

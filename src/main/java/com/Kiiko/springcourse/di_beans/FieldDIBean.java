package com.Kiiko.springcourse.di_beans;

import com.Kiiko.springcourse.otherbeans.OtherBeanC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FieldDIBean {
    @Autowired
    @Qualifier("otherBeanC2")
    private OtherBeanC beanC;

    public void printValue() {
        System.out.println(beanC);
    }
}

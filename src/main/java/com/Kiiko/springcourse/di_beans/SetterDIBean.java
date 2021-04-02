package com.Kiiko.springcourse.di_beans;

import com.Kiiko.springcourse.otherbeans.OtherBeanA;
import com.Kiiko.springcourse.otherbeans.OtherBeanB;
import com.Kiiko.springcourse.otherbeans.OtherBeanC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterDIBean {
    private OtherBeanA otherBeanA;
    private OtherBeanB otherBeanB;

    @Autowired
    public void setOtherBeanA(OtherBeanA otherBeanA) {
        this.otherBeanA = otherBeanA;
    }

    @Autowired
    public void setOtherBeanB(OtherBeanB otherBeanB) {
        this.otherBeanB = otherBeanB;
    }

    public void printValue() {
        System.out.println(otherBeanA + ", " + otherBeanB);
    }
}

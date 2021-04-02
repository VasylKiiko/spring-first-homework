package com.Kiiko.springcourse.otherbeans;

import org.springframework.stereotype.Component;

@Component
public class OtherBeanA {
    private String value;

    public OtherBeanA(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}

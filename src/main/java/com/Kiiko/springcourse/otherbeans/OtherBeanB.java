package com.Kiiko.springcourse.otherbeans;

import org.springframework.stereotype.Component;

@Component
public class OtherBeanB {
    private String value;

    public OtherBeanB(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}

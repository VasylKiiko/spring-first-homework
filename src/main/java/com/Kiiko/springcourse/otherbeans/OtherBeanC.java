package com.Kiiko.springcourse.otherbeans;

import org.springframework.stereotype.Component;

@Component
public class OtherBeanC {
    private String value;

    public OtherBeanC(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}

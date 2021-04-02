package com.Kiiko.springcourse.book_beans;

import org.springframework.context.annotation.Primary;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
@Primary
public class RomanceBook implements Book {
    @Override
    public String getName() {
        return "Romance genre";
    }
}

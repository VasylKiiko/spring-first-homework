package com.Kiiko.springcourse.book_beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.LOWEST_PRECEDENCE)
@Qualifier("sci-fi")
public class SciFiBook implements Book {
    @Override
    public String getName() {
        return "Sci-Fi genre";
    }
}

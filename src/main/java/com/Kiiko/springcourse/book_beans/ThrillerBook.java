package com.Kiiko.springcourse.book_beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
@Qualifier("thriller")
public class ThrillerBook implements Book {
    @Override
    public String getName() {
        return "Thriller genre";
    }
}

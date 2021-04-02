package com.Kiiko.springcourse.book_beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
@Qualifier("mystery")
public class MysteryBook implements Book {
    @Override
    public String getName() {
        return "Mystery genre";
    }
}

package com.Kiiko.springcourse.book_beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BooksPresent {
    private Book present1;
    private Book present2;
    private Book present3;
    private Book present4;

    @Autowired
    @Qualifier("mystery")
    public void setPresent1(Book present1) {
        this.present1 = present1;
    }

    @Autowired
    @Qualifier("sci-fi")
    public void setPresent2(Book present2) {
        this.present2 = present2;
    }

    @Autowired
    public void setPresent3(Book present3) {
        this.present3 = present3;
    }

    @Autowired
    @Qualifier("thriller")
    public void setPresent4(Book present4) {
        this.present4 = present4;
    }

    public void printPresents() {
        System.out.println("present1 : " + present1.getName() + ", present2 : " + present2.getName() +
                ", present3 : " + present3.getName() + ", present4 : " + present4.getName());
    }

}

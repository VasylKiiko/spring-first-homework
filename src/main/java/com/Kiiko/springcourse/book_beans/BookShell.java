package com.Kiiko.springcourse.book_beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookShell {
    @Autowired
    private List<Book> books;

    public void printBooks(){
        for (Book book: books) {
            System.out.println(book.getName());;
        }
    }
}

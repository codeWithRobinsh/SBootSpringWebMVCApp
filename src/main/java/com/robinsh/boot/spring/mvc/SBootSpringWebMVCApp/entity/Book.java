package com.robinsh.boot.spring.mvc.SBootSpringWebMVCApp.entity;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Book extends Bookmark{
    public Book () {
        System.out.println("I am sub type Book of super type Bookmark !");
        System.out.println("------------------------------------------------------------------------------------------");
    }
}

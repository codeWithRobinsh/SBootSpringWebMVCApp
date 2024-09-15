package com.robinsh.boot.spring.mvc.SBootSpringWebMVCApp.entity;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Movie extends Bookmark {
    private String movieGenre;

    public Movie () {
        System.out.println("I am subtype Movie of super type Bookmark !");
        System.out.println("------------------------------------------------------------------------------------------");
    }
}

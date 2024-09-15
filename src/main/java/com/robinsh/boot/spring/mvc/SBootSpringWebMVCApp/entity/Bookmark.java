package com.robinsh.boot.spring.mvc.SBootSpringWebMVCApp.entity;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Bookmark {
    public static int counter = 0;

    public Bookmark () {
        counter++;
        System.out.println("Bookmark class - Counter: " + counter);
        System.out.println("------------------------------------------------------------------------------------------");
    }
}

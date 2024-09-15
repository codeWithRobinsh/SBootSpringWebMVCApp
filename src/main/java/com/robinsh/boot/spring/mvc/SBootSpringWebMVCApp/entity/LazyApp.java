package com.robinsh.boot.spring.mvc.SBootSpringWebMVCApp.entity;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class LazyApp {
    private String definition;

    public LazyApp () {
        System.out.println("I am Lazy App !");
        System.out.println("------------------------------------------------------------------------------------------");
    }
}

package com.robinsh.boot.spring.mvc.SBootSpringWebMVCApp.entity;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class AnotherLazyApp {
    private String description;

    public AnotherLazyApp () {
        System.out.println("I am AnotherLazyApp !");
        System.out.println("------------------------------------------------------------------------------------------");
    }
}

package com.robinsh.boot.spring.mvc.SBootSpringWebMVCApp.entity;

import org.springframework.stereotype.Component;

@Component
public class SuperLazyApp {
    private int lazinessScore;

    public SuperLazyApp () {
        System.out.println("I am Super Lazy App !");
        System.out.println("------------------------------------------------------------------------------------------");
    }
}

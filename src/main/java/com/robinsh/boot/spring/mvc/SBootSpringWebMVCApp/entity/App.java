package com.robinsh.boot.spring.mvc.SBootSpringWebMVCApp.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class App {
    private LazyApp lazyApp;

    private SuperLazyApp superLazyApp;

    @Lazy
    @Autowired
    private AnotherLazyApp anotherLazyApp;

    // When we use constructor dependency injection, then dependency is resolved first followed by initialization....
    // .... of the class which contains the dependency unlike setter and field injection. But if we annotate it with @Lazy then...
    //.... reverse happened.
    // If there is only one constructor which is acting as dependency injector, @Autowired is not needed explicitly.
    // @Lazy or annotated the constructor parameter with @Lazy.
    public App (@Lazy SuperLazyApp superLazyApp) {
        this.superLazyApp = superLazyApp;
        System.out.println("I am eager app having LazyApp and AnotherLazyApp");
        System.out.println("------------------------------------------------------------------------------------------");
    }

    public LazyApp getLazyApp() {
        return lazyApp;
    }

    // We may annotate method parameter with @Lazy.
    // or we may annotate method itself with @Lazy by putting @Lazy above @Autowired.
    @Autowired
    public void setLazyApp(@Lazy LazyApp lazyApp) {
        this.lazyApp = lazyApp;
    }
}

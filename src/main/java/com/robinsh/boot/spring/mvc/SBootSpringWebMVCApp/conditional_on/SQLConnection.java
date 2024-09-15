package com.robinsh.boot.spring.mvc.SBootSpringWebMVCApp.conditional_on;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "sqlconnection", value = "enabled", havingValue = "true", matchIfMissing = true)
public class SQLConnection implements DBConnection {
    public SQLConnection () {
        System.out.println("I'm a SQL Connection Constructor !");
        System.out.println("-----------------------------------------------------------------------------------------");
    }
    @Override
    public void connect() {
        System.out.println("I'm connecting to sql db !");
    }
}

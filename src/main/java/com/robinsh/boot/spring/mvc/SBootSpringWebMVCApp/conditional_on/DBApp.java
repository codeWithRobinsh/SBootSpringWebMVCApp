package com.robinsh.boot.spring.mvc.SBootSpringWebMVCApp.conditional_on;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class DBApp {
    private String definition;

    private DBConnection dbConnection;

    public DBApp (DBConnection dbConnection) {
        this.dbConnection = dbConnection;
        System.out.println("I'm DBApp connecting to database");
        System.out.println("Is dbConnection null ? " + Objects.isNull(dbConnection));
        System.out.println("I am using db of type: " + dbConnection.getClass());
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}

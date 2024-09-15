package com.robinsh.boot.spring.mvc.SBootSpringWebMVCApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TripController {
    @Autowired
    ModelAndView mv;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "index";
    }

    @RequestMapping(value = "/pay", method = RequestMethod.GET)
    public ModelAndView travel(@RequestParam("fn") String fn, @RequestParam("destination") String destination) {
        String message = "Welcome, " + fn + ", Your Next Destination is: " + destination;

        mv.addObject("fn", fn);
        mv.addObject("destination", destination);
        mv.addObject("message", message);
        mv.setViewName("display");
        return mv;
    }

    @RequestMapping(value = "/bay", method = RequestMethod.GET)
    public ResponseEntity<String> bay() {
        return ResponseEntity.ok("display");
    }

    @GetMapping
    void call() {
        System.out.println("calling....");
    }

}

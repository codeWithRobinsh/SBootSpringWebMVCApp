package com.robinsh.boot.spring.mvc.SBootSpringWebMVCApp.util;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

@Component
public class ConfigurationUtil {
    @Bean
    ModelAndView modelAndViewCreator() {
        return new ModelAndView();
    }
}

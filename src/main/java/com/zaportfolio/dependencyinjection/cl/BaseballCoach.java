package com.zaportfolio.dependencyinjection.cl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class BaseballCoach implements Coach{
    @Override
    public String doWorkout() {
        return "let's practice baseball together";
    }
}

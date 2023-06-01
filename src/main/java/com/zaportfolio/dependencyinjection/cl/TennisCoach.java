package com.zaportfolio.dependencyinjection.cl;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String doWorkout() {
        return "let's practice tennis together";
    }
}

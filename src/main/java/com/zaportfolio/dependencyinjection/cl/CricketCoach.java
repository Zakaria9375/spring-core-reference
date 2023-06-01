package com.zaportfolio.dependencyinjection.cl;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String doWorkout() {
        return "Do some push ups, now please !!!!!";
    }

}

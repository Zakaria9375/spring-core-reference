package com.zaportfolio.dependencyinjection.controller;

import com.zaportfolio.dependencyinjection.cl.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    //dependency injection by constructor autowired is optional as you only have one constructor
    // use it when you have required dependency
    // setter injection when you have optional dependencies (if dependency not provided your app can provide reasonable default logic
    private final Coach coach;
    @Autowired
    public AppController(Coach coach) {
        this.coach = coach;
    }
    @GetMapping("/workout")
    public String getWorkout(){
        return coach.doWorkout();
    }

}

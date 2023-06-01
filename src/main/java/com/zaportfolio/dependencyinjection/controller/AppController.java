package com.zaportfolio.dependencyinjection.controller;

import com.zaportfolio.dependencyinjection.cl.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    private final Coach coach;
    private final Coach coach2;

   @Autowired
    public AppController(@Qualifier("swimCoach") Coach coach,@Qualifier("tennisCoach") Coach coach2) {
        this.coach = coach;
       this.coach2 = coach2;
   }
    @GetMapping("/check")
    public String check(){
        return"comparing beans "+ (coach == coach2);
    }
    @GetMapping("/swim")
    public String getSwim(){
       return coach.doWorkout();
    }

    @GetMapping("/workout")
    public String getWorkout(){
        return coach2.doWorkout();
    }

}

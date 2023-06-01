package com.zaportfolio.dependencyinjection;

import com.zaportfolio.dependencyinjection.cl.Coach;
import com.zaportfolio.dependencyinjection.cl.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}

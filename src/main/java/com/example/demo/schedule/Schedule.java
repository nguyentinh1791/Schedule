package com.example.demo.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {

    @Scheduled(fixedRate = 10000)
    public void fixedRate(){
        System.out.println("fixe rate");
    }


}

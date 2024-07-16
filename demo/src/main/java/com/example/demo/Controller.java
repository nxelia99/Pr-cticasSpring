package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    private List<Challenge> challenges = 
    new ArrayList<>();

    @GetMapping("/challenges")
    public List<Challenge> getAllChallenges(){
        return challenges;
    }
}

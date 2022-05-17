package com.viruta.controllers;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MathController {


    public MathController() {
    }

    @CrossOrigin
    @GetMapping("/isPrime/{number}")
    public boolean isPrime(@PathVariable("number") Integer number) {

        if (number <= 1) {
            return false;
        }

        if (number <= 3) {
            return  true;
        }

        for(int i =2 ; i < number; i++ ) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

}

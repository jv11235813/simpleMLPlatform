package com.jv.linearregression.simplemlplatform.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PredictionController {

    @GetMapping("welcome")
    public String getPrediction(){
        return "Hello World";
    }
}

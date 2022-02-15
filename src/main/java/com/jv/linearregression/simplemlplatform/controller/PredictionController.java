package com.jv.linearregression.simplemlplatform.controller;

import com.jv.linearregression.simplemlplatform.bean.Country;
import com.jv.linearregression.simplemlplatform.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class PredictionController {
    @Autowired
    CountryService countryService;

    @GetMapping("country")
    public @ResponseBody Country getPrediction(@RequestParam String countryName){
        System.out.println("RECEIVED: "+countryName);
        return countryService.getCountry(countryName);
    }
}

package com.jv.linearregression.simplemlplatform.service;

import com.jv.linearregression.simplemlplatform.bean.Country;
import com.jv.linearregression.simplemlplatform.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    CountryRepository repo;

    /**
     * retrieve from db country entities by name
     * @param countryName the country name (common usage name)
     * @return country entity
     */
    public Country getCountry(String countryName){
        return repo.findByCountryName(countryName);
    }
}

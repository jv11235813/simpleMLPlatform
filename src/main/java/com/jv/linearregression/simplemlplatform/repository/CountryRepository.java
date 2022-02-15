package com.jv.linearregression.simplemlplatform.repository;

import com.jv.linearregression.simplemlplatform.bean.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {

    Country findByCountryName(String countryName);
}

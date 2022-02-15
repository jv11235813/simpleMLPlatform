package com.jv.linearregression.simplemlplatform.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "country")
public class Country {
    @Id
    @Column(name = "iso_code")
    private int isoCode;

    @Column(name = "country_name")
    private String countryName;

    public Country() {
        //default constructor
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;
        Country country = (Country) o;
        return isoCode == country.isoCode && countryName.equals(country.countryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isoCode, countryName);
    }

    public int getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(int isoCode) {
        this.isoCode = isoCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}

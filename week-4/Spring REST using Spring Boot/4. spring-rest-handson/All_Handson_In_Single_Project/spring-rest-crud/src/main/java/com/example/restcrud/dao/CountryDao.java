package com.example.restcrud.dao;

import com.example.restcrud.model.Country;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CountryDao {
    private static final Map<String, Country> countries = new HashMap<>();

    public List<Country> getAllCountries() {
        return new ArrayList<>(countries.values());
    }

    public Country getCountry(String code) {
        return countries.get(code);
    }

    public Country addCountry(Country country) {
        countries.put(country.getCode(), country);
        return country;
    }

    public Country updateCountry(Country country) {
        countries.put(country.getCode(), country);
        return country;
    }

    public void deleteCountry(String code) {
        countries.remove(code);
    }
}

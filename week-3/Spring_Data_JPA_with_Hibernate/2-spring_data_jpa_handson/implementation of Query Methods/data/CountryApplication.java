package com.data;

import com.data.model.Country;
import com.data.repo.CountryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CountryApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryApplication.class);

    @Autowired
    private CountryRepository countryRepository;

    public static void main(String[] args) {
        SpringApplication.run(CountryApplication.class, args);
    }

    @Override
    public void run(String... args) {
        testCountryQueries();
    }

    private void testCountryQueries() {
        LOGGER.info("Start - searchCountriesByPartialName");
        List<Country> list1 = countryRepository.findByNameContaining("ou");
        list1.forEach(c -> LOGGER.info("{} - {}", c.getCode(), c.getName()));
        LOGGER.info("End");

        LOGGER.info("Start - searchCountriesByPartialNameSorted");
        List<Country> list2 = countryRepository.findByNameContainingOrderByNameAsc("ou");
        list2.forEach(c -> LOGGER.info("{} - {}", c.getCode(), c.getName()));
        LOGGER.info("End");

        LOGGER.info("Start - searchCountriesByStartingAlphabet");
        List<Country> list3 = countryRepository.findByNameStartingWith("Z");
        list3.forEach(c -> LOGGER.info("{} - {}", c.getCode(), c.getName()));
        LOGGER.info("End");
    }
}
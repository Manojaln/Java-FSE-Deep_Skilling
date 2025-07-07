package com.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.data.country.Country;
import com.data.service.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/{code}")
    public ResponseEntity<Country> getCountry(@PathVariable String code) {
        Country country = countryService.findByCode(code);
        return country != null ? ResponseEntity.ok(country) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Country> createCountry(@RequestBody Country country) {
        return ResponseEntity.ok(countryService.addCountry(country));
    }

    @PutMapping
    public ResponseEntity<Country> updateCountry(@RequestBody Country country) {
        Country updated = countryService.updateCountry(country);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{code}")
    public ResponseEntity<Void> deleteCountry(@PathVariable String code) {
        countryService.deleteCountry(code);
        return ResponseEntity.noContent().build();
    }

}
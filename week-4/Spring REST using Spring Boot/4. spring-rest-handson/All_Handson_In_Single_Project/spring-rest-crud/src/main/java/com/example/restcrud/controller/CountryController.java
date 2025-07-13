package com.example.restcrud.controller;

import com.example.restcrud.dao.CountryDao;
import com.example.restcrud.model.Country;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {
    @Autowired
    private CountryDao dao;

    @GetMapping
    public List<Country> getAll() {
        return dao.getAllCountries();
    }

    @GetMapping("/{code}")
    public Country get(@PathVariable String code) {
        return dao.getCountry(code);
    }

    @PostMapping
    public Country add(@RequestBody @Valid Country country) {
        return dao.addCountry(country);
    }

    @PutMapping
    public Country update(@RequestBody @Valid Country country) {
        return dao.updateCountry(country);
    }

    @DeleteMapping("/{code}")
    public void delete(@PathVariable String code) {
        dao.deleteCountry(code);
    }
}

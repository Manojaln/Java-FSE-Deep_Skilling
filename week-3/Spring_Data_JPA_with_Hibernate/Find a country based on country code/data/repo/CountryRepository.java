package com.data.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.country.Country;

import jakarta.persistence.*;
@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    // Find list of countries by partial match
    List<Country> findByNameContainingIgnoreCase(String partialName);
}

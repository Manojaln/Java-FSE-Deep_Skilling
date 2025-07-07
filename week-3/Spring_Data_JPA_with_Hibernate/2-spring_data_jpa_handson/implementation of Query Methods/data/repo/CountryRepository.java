package com.data.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.model.Country;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    // 1. Find countries where name contains specific string
    List<Country> findByNameContaining(String keyword);
    // 2. Find countries where name contains string, ordered by name
    List<Country> findByNameContainingOrderByNameAsc(String keyword);
    // 3. Find countries where name starts with a specific letter
    List<Country> findByNameStartingWith(String prefix);
}
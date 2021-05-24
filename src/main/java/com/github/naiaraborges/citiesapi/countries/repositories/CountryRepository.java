package com.github.naiaraborges.citiesapi.countries.repositories;

import com.github.naiaraborges.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
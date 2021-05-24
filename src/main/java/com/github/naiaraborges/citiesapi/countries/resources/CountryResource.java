package com.github.naiaraborges.citiesapi.countries.resources;

import com.github.naiaraborges.citiesapi.countries.entities.Country;
import com.github.naiaraborges.citiesapi.countries.repositories.CountryRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryResource {

    private final CountryRepository repository;

    public CountryResource(final CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/countries")
    public List<Country> cities() {

        return repository.findAll();
    }
}
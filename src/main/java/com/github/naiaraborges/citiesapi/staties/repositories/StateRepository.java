package com.github.naiaraborges.citiesapi.staties.repositories;

import com.github.naiaraborges.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
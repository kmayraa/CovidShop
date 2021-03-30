package com.covid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.models.Allergie;

public interface AllergieRepository extends JpaRepository<Allergie, Long> {

}

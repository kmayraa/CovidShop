package com.covid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.models.Maladie;

public interface MaladieRepository extends JpaRepository<Maladie, Long> {

}

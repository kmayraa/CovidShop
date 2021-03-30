package com.covid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.models.Medicament;

public interface MedicamentRepository extends JpaRepository<Medicament, Long> {

}

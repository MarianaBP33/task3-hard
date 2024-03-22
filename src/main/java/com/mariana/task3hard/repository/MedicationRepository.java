package com.mariana.task3hard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariana.task3hard.model.Medication;

public interface MedicationRepository extends JpaRepository<Medication, Long> {

}

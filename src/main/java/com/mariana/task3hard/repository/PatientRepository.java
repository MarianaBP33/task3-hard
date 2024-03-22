package com.mariana.task3hard.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariana.task3hard.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    Optional<Patient> findById(Long id);

}

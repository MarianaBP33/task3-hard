package com.mariana.task3hard.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mariana.task3hard.model.Patient;
import com.mariana.task3hard.repository.PatientRepository;

@Service
public class PatientService {
    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    // Implement patient-related business logic here
    public Optional<Patient> getPatientById(Long id) {
        return patientRepository.findById(id);
    }

}
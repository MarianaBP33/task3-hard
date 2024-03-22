package com.mariana.task3hard.service;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.mariana.task3hard.repository.PatientRepository;
import com.mariana.task3hard.model.Patient;

@ExtendWith(MockitoExtension.class)
public class PatientServiceUnitTest {

    @Mock
    private PatientRepository patientRepository;

    @InjectMocks
    private PatientService patientService;

    @Test
    void testGetPatientById() {
        // Mock data
        Long patientId = 1L;
        Patient patient = new Patient();
        patient.setId(patientId);
        patient.setName("John Doe");

        // Mocking repository behavior
        when(patientRepository.findById(patientId)).thenReturn(Optional.of(patient));

        // Test
        Optional<Patient> retrievedPatientOptional = patientService.getPatientById(patientId);
        assertTrue(retrievedPatientOptional.isPresent());
        assertEquals(patient.getName(), retrievedPatientOptional.get().getName());
    }

    @Test
    void testGetPatientById_NotFound() {
        // Mock data
        Long patientId = 1L;

        // Mocking repository behavior
        when(patientRepository.findById(patientId)).thenReturn(Optional.empty());

        // Test
        Optional<Patient> retrievedPatientOptional = patientService.getPatientById(patientId);
        assertFalse(retrievedPatientOptional.isPresent());
    }

}

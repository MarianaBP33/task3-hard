package com.mariana.task3hard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariana.task3hard.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}

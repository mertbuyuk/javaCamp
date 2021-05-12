package com.mbdev.Hrsm.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbdev.Hrsm.entities.concretes.EmployerVerificationEmployee;

public interface EmployerVerificationEmployeeDao extends JpaRepository<EmployerVerificationEmployee, Integer> {

}

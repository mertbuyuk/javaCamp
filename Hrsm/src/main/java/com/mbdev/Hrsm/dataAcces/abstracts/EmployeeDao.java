package com.mbdev.Hrsm.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbdev.Hrsm.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}

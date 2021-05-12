package com.mbdev.Hrsm.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbdev.Hrsm.entities.concretes.Employers;

public interface EmployeersDao extends JpaRepository<Employers, Integer>{

}

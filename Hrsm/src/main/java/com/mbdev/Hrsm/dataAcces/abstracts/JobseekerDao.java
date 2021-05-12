package com.mbdev.Hrsm.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbdev.Hrsm.entities.concretes.Jobseeker;

public interface JobseekerDao extends JpaRepository<Jobseeker, Integer> {

}

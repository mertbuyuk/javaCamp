package com.mbdev.Hrsm.dataAcces.abstracts;

import com.mbdev.Hrsm.entities.concretes.JobPosition;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {

}

package com.mbdev.Hrsm.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbdev.Hrsm.entities.concretes.EmployerVerifyCode;

public interface EmployerVerifyCodeDao extends JpaRepository<EmployerVerifyCode, Integer> {

}

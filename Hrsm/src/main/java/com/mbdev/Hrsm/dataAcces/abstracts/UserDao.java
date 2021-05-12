package com.mbdev.Hrsm.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbdev.Hrsm.entities.concretes.Users;

public interface UserDao extends JpaRepository<Users, Integer> {

}

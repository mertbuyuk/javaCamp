package com.mbdev.Hrsm.entities.concretes;

import javax.persistence.Column;

import javax.persistence.PrimaryKeyJoinColumn;

import javax.persistence.Table;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
@Table(name = "employees")
@PrimaryKeyJoinColumn(name = "user_id")
public class Employee extends Users{
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
}

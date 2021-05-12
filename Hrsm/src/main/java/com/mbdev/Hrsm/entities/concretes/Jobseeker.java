package com.mbdev.Hrsm.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "jobseekers")
@Data
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id")
public class Jobseeker extends Users{

	@Column(name= "first_name")
	private String firstName;
	
	@Column(name= "last_name")
	private String lastName;
	
	@Column(name= "national_id")
	private String nationalId;
	
	@Column(name= "date_of_birth")
	private LocalDate dateOfBirth;
	
	@Column(name = "is_verified")
	private boolean isVerified;
	
	public Jobseeker(String firstName, String lastName, String nationalId, LocalDate dateOfBirth, boolean isVerified) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalId = nationalId;
		this.dateOfBirth = dateOfBirth;
		this.isVerified = isVerified;
	}
}
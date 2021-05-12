package com.mbdev.Hrsm.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name ="employers_verification_codes")
public class EmployerVerifyCode {
	
	@Id
	@GeneratedValue
	@Column(name = " id")
	private int id;
	
	@Column(name= "employer_id")
	private int employerId;
	
	@Column(name= "verification_code")
	private String verificationCode;
	
	@Column(name= "created_at")
	private LocalDate createdAt;
	
	@Column(name= "is_confirmed")
	private boolean IsConfirmed;

	public EmployerVerifyCode(int employerId, String verificationCode, LocalDate createdAt, boolean isConfirmed) {
		super();
		this.employerId = employerId;
		this.verificationCode = verificationCode;
		this.createdAt = createdAt;
		IsConfirmed = isConfirmed;
	}

	public EmployerVerifyCode() {
		
	}

}

package com.mbdev.Hrsm.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;

import java.time.LocalDate;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "job_positions")
@NoArgsConstructor
public class JobPosition {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="job_title")
	private String jobTitle;
	
	@Column(name= "created_at")
	private LocalDate createdDate;
	
	@Column(name= "is_active")
	private boolean isActive;
	
	@Column(name= "is_deleted")
	private boolean isDeleted;

	public JobPosition(int id, String jobTitle, LocalDate createdDate, boolean isActive, boolean isDeleted) {
		super();
		this.id = id;
		this.jobTitle = jobTitle;
		this.createdDate = createdDate;
		this.isActive = isActive;
		this.isDeleted = isDeleted;
	}
}

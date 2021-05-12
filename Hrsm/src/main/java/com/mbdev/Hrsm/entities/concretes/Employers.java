package com.mbdev.Hrsm.entities.concretes;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "employers")
@PrimaryKeyJoinColumn(name = "user_id")//foreign key bağlantısını sağlamak için gerekli//yani buranın idsi usersdan geldi
public class Employers extends Users  {
	
	@Column(name= "company_name")
	private String companyName;
	
	@Column(name= "website")
	private String website;
	
	@Column(name= "phone_number")
	private String phoneNumber;
	
	@Column(name = "is_verified")
	private boolean isVerified;
	
	public Employers() {
		
	}

	public Employers(String companyName, String website, String phoneNumber, boolean isVerified) {
		
		this.companyName = companyName;
		this.website = website;
		this.phoneNumber = phoneNumber;
		this.isVerified = isVerified;
	}
	

}

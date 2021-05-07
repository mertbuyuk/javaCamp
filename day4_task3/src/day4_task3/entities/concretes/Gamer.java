package day4_task3.entities.concretes;

import day4_task3.entities.abstracts.Entities;

public class Gamer implements Entities {
	private int id;
	private String name;
	private String surname;
	private String dateOfBirth;
	private String nationalID;
	
	
	public Gamer(int id ,String name, String surname, String dateOfBirth, String nationalID) {
		
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.nationalID = nationalID;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getNationalID() {
		return nationalID;
	}


	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}
	
	

}

package day5_task1.entities.concretes;

import day5_task1.entities.abstracts.Entity;

public class User implements Entity{
	private String name;
	private String surname;
	private String mail;
	private String password;
	
	
	public User(String name, String surname, String mail, String password) {
		this.name = name;
		this.surname = surname;
		this.mail = mail;
		this.password = password;
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}

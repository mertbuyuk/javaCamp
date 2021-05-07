package day4_task3.entities.concretes;

import day4_task3.entities.abstracts.Entities;

public class Game implements Entities{
	private String name;
	private int price;
	
	
	public Game(String name, int price) {
		super();
		this.name = name;
		this.price = price;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
	
	
	
	
	
}

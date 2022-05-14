package com.qa.main.inheritence;

public class Cat extends Animals {
	
	
	private String food;
	private String home;
	private String givebirth;
	
	
	public Cat(String food, String home, String givebirth) {
		super();
		this.food = food;
		this.home = home;
		this.givebirth = givebirth;
	}
	public String getGivebirth() {
		return givebirth;
			
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public void setGivebirth(String givebirth) {
		this.givebirth = givebirth;
	}
	
	}
	


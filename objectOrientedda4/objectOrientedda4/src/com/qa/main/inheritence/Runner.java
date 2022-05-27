package com.qa.main.inheritence;

public class Runner {
	
	public static void main(String[] args) {
		
		Cat cattle = new Cat(" home", "food", "watchtv");
		
		@SuppressWarnings("unused")
		Lion Lione = new Lion("forest", "eat other animals" ,"givebirth");
		
		System.out.println(cattle.getHome());
		System.out.println(cattle.getFood());
	}
	
		
	
}





package com.qa.main.day4;

import java.util.concurrent.Callable;

public class Runner {

	public static void drinkExample() {
		Drink drink1 = new Drink("Latte", (float) 13.28, false,321);
		System.out.println(drink1.getType());
		drink1.setCost(12);
		drink1.setDairyFree(true);
		
		System.out.println(drink1.gets);
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Drink latte = new Drink("Latte", (float) 13.28, false, 321);
		setTea(new Drink("French Tea", 3.43f, true, 99));
	}

	private static void setTea(Drink drink) {
		System.out.println(Callable.setTeaDrink)();
		System.out.println(Callable.getFrenchTea();
		
	}

	private static char[] Callable() {
		// TODO Auto-generated method stub
		return null;
	}
}


	
	



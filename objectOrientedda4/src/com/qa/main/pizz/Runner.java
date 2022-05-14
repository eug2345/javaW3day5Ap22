package com.qa.main.pizz;

public class Runner {

	public static void main(String[] args) {
		
pizzaExample();
	}
	public static void pizzaExample() {
		Pizza pizza1 = new Pizza("pepperoni", true);
		System.out.println(pizza1.getType());
		pizza1.setSize(100);
}
}
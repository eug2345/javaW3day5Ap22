package com.qa.JDBCproject;


public class Runner {
	
public static void main(String[] args) {
	JDBCpro jdbc = new JDBCpro();
	jdbc.connect();
	Drink drink1 = new Drink("Tea", "Coffe", false,1.50f);
	Cafe cafe = new Cafe();
	cafe.addDrink(drink1);
}
}

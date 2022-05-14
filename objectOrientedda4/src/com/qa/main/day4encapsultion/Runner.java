package com.qa.main.day4encapsultion;

import com.qa.main.pizz.Pizza;

public class Runner {

	private static final String Jsmith = null;

	public static void main(String[] args) {
		
	BankDetail user1 = new 	BankDetail(100, "837639072028", Jsmith, 2567 );
		System.out.print(user1.setPassword("mango"));
		user1.setBalance(90);
		System.out.println(user1.getBalance());
		System.out.println(user1.getPassword());
		user1.setBalance(80);
	}



}







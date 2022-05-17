package com.qa.main;

public class SayHello {
	public SayHello() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void printMessage(String message) {
	System.out.println(message);
	}	
	
	public static void main(String[] args) {
	System.out.println("Hello World");
System.out.println(printMessage());	
	}
	public static String printMessage() {
	System.out.println("say hello");
	return "Say hello";
	}
	}



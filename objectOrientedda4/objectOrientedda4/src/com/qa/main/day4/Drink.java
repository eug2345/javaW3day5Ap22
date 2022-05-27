package com.qa.main.day4;

public class Drink {
	
private String type;
private float cost;
private boolean dairyFree;
private int colories;
public char[] gets;

public Drink(String type, float cost, boolean dairyFree, int colories) {
	super();
	this.type = type;
	this.cost = cost;
	this.dairyFree = dairyFree;
	this.colories = colories;
	
	DrinkExample();
}

private void DrinkExample() {
	// TODO Auto-generated method stub
	
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public float getCost() {
	return cost;
}

public void setCost(float cost) {
	this.cost = cost;
}

public boolean isDairyFree() {
	return dairyFree;
}

public void setDairyFree(boolean dairyFree) {
	this.dairyFree = dairyFree;
}

public int getColories() {
	return colories;
}

public void setColories(int colories) {
	this.colories = colories;
}




}



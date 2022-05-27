package com.qa.main.Abstract;

public abstract class Bird {

	@SuppressWarnings("unused")
	private String featherColour;
	@SuppressWarnings("unused")
	private int wingspan;

	public Bird(int wingspan, String featherColour) {
		super();
		this.wingspan = wingspan;
		this.featherColour = featherColour;
		
	}
	public abstract String layEgg();
	public Bird(String featherColour, int wingspan) {
		super();
		this.featherColour = featherColour;
		this.wingspan = wingspan;
	}
	public int getSwimSpeed() {
		return swimSpeed;
	}
	public void setSwimSpeed(int swimSpeed) {
		this.swimSpeed = swimSpeed;
	}
	private int swimSpeed;

	public String getFeatherColour() {
		return featherColour;
	}
	public void setFeatherColour(String featherColour) {
		this.featherColour = featherColour;
	}
	public int getWingspan() {
		return wingspan;
	}
	public void setWingspan(int wingspan) {
		this.wingspan = wingspan;
	}
	
}

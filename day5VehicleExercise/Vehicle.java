package day5VehicleExercise;

public abstract class Vehicle {
	//Attributes field
	private String doors;
	private String model;
	private boolean electric;
	
	//Constructor
	public Vehicle(String doors2, String model, boolean electric) {
		super();
		this.doors = doors2;
		this.model = model;
		this.electric = electric;
	}
	public void Vehicles(int doors2, String model2, boolean electric2) {
		// TODO Auto-generated constructor stub
	}
	//Abstract method
	public abstract String fixVehicle();

	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public boolean isElectric() {
		return electric;
	}

	public void setElectric(boolean electric) {
		this.electric = electric;
	}
	
	
	
	
		
	}


	

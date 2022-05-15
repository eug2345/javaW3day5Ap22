package day5VehicleExercise;

public  class Car extends Vehicle {

	private String wheels;
	private float price;
	private boolean Insurance;
	
	
	public Car(String doors, String model, boolean electric, String wheels, float price, boolean insurance) {
		super(doors, model, electric);
		this.wheels = wheels;
		this.price = price;
		Insurance = insurance;
	}

		@Override
		public String fixVehicle() {
			// TODO Auto-generated method stub
			return " check the insurance documents";	
	}

	public String getWheels() {
		return wheels;
	}

	public void setWheels(String wheels) {
		this.wheels = wheels;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isInsurance() {
		return Insurance;
	}

	public void setInsurance(boolean insurance) {
		Insurance = insurance;
	}

	
	}
	
	

	

	
	
package day5VehicleExercise;

public  class Motobike extends Vehicle {

	// field
	private String mirror;
	private boolean passangerSit;
	private int wheels;
	
	public Motobike(String doors, String model, boolean electric, String mirror, boolean passangerSit, int wheels) {
		super(doors, model, electric);
		this.mirror = mirror;
		this.passangerSit = passangerSit;
		this.wheels = wheels;
		
		
	}
	@Override
	public String fixVehicle() {
		// TODO Auto-generated method stub
		return "driving a motobike";
}

	public String getMirror() {
		return mirror;
	}

	public void setMirror(String mirror) {
		this.mirror = mirror;
	}

	public boolean isPassangerSit() {
		return passangerSit;
	}

	public void setPassangerSit(boolean passangerSit) {
		this.passangerSit = passangerSit;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	
	}
	
	




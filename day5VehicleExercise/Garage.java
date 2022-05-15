package day5VehicleExercise;

import java.util.ArrayList;

public  class Garage {
	
	public static ArrayList<Vehicle> newGarage1 = new ArrayList<Vehicle>();

	@SuppressWarnings("static-access")
	public Garage() {
		super();
		this.newGarage1 = newGarage;
	}
	
	public ArrayList<Vehicle> newGarage = new ArrayList<Vehicle>();
	
	public boolean addVehicle(Vehicle vehicle) {
		System.out.println("add vehicle");
		return newGarage1.add(vehicle);
		}
	
	public boolean removeVehicle(Vehicle vehicle) {
		System.out.println("Removed vehicle");
		return newGarage1.remove(vehicle);
	}
	public Vehicle getVehicle(int vehicle) {
		System.out.println("Got vehicle");
		System.out.println(newGarage1.get(vehicle));
		return newGarage1.get(vehicle);
	}
	public static String fixVehicle(int vehicle) {
		System.out.println("Fixed vehicle");
		return newGarage1.get(vehicle).fixVehicle();
	}
	public String emptyGarage() {
		newGarage1.clear();
		System.out.println("is expensive for new drivers");
		return "Drivers are all unhappy";
	}

	public static void setCost(String string) {
		// TODO Auto-generated method stub
		
	}

	public static void getcolour1(String string) {
		// TODO Auto-generated method stub
		
	}

	public static void updateOrder(String string) {
		// TODO Auto-generated method stub
		
	}

	public static void fixdoors(int i) {
		// TODO Auto-generated method stub
		
	}

	public static char[] getorder(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void getcolour(String string) {
		// TODO Auto-generated method stub
		
	}

	public static void updateOrder1(String string) {
		// TODO Auto-generated method stub
		
	}

	public static void updateOrder11(String string) {
		// TODO Auto-generated method stub
		
	}

	public static void getorder(String string) {
		// TODO Auto-generated method stub
		
	}

	
}
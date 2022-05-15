package day5VehicleExercise;

public class Van extends Vehicle{

	private String weight;
	private float motCost;
	private boolean category;
	
	

	public Van(String string, String model, boolean electric, String weight, float motCost, boolean t) {
		super(string, model, electric);
		
		this.setWeight(weight);
		this.setMotCost(motCost);
		this.setCategory(category);
	}


	@Override
	public String fixVehicle() {
		// TODO Auto-generated method stub
		return fixVehicle();
		
	}


	public float getMotCost() {
		return motCost;
	}

	@SuppressWarnings("unused")
	public void setMotCost(float motCost) {
		this.motCost = motCost;
		
		float fixCost = 0;
		
		if (getMotPrice()  == 654) {
			fixCost += 1000;
		} else if (getMotCost() == 723) {
			fixCost += 200;
		} else { 
			System.out.println(" this is expensive, ask for reduction, make it between 654 - 723!!!");
		}
	}


	private int getMotPrice() {
		// TODO Auto-generated method stub
		return 0;
	}


	public boolean isCategory() {
		return category;
	}



	public void setCategory(boolean category) {
		this.category = category;
	}



	public String getWeight() {
		return weight;
	}


	public void setWeight(String weight) {
		this.weight = weight;
	}
}

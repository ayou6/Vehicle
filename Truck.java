package Vehcle;

public class Truck {
	private int bnumberOfAxles;
	private int capacityInTons;
	
	
	public int getBnumberOfAxles() {
		return bnumberOfAxles;
	}


	public void setBnumberOfAxles(int bnumberOfAxles) {
		this.bnumberOfAxles = bnumberOfAxles;
	}


	public int getCapacityInTons() {
		return capacityInTons;
	}


	public void setCapacityInTons(int capacityInTons) {
		this.capacityInTons = capacityInTons;
	}


	


	public void load(int weight) {
		System.out.println("Loaded" + weight +"tons");
		
	}


}

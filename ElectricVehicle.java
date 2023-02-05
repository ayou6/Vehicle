package Vehcle;

public class ElectricVehicle extends Vehicle {
	private int batteryCapacity;
	private int chargeLevel;
	
	
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public int getChargeLevel() {
		return chargeLevel;
	}
	public void setChargeLevel(int chargeLevel) {
		this.chargeLevel = chargeLevel;
	}
	public void charge () {
		System.out.println("Charging...!");
		chargeLevel++;
		

}
	@Override
	public void Drive(int noOfMiles) {
		System.out.println("Electric vehicle driven" + noOfMiles +"miles");
	}
}
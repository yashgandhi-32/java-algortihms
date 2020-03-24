package l11;

public class Vehicle {
	private int numberOfWheels;
	private String companyName;
	

	
	public Vehicle(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	
	public void print() {
		System.out.println(numberOfWheels + " " + companyName);
	}
	
}

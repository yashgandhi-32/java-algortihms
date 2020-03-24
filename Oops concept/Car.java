package l11;

public class Car extends Vehicle{
	private String plateNumber;
	
	public Car() {
		super(4);
	}
	
	public String getPlateNumber() {
		return plateNumber;
	}
	
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	public void print() {
		System.out.println(this.getCompanyName() + " " + this.plateNumber);
	}
	
}

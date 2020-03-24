package l11;

import java.util.Scanner;

public class VehicleUse {

	public static int f(Vehicle v) {
		return 0;
	}
	
	public static int abc() {
		return 0;
	}
	
	public static int abc(int a) {
		return 0;
	}
	
	
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.setCompanyName("ABC");
		v.setNumberOfWheels(4);
		v.print();
		
		Car car = new Car();
		car.setCompanyName("def");
		car.setNumberOfWheels(4);
		car.print();
	
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		Vehicle v1;
		if (n < 50) {
			v1 = new Car();
		} else {
			v1 = new Vehicle(10);
		}
		v1 = new Car();
		v1.print();
		Car c3 = (Car)v1;
		
		
		//v1.setPlateNumber();
		
		Car c2 = new BMW();
		f(c2);
		
		Cycle cycle = new Cycle();
		cycle.setCompanyName("ghi");
		cycle.setNumberOfWheels(2);
		cycle.print();
		
		
	}

}

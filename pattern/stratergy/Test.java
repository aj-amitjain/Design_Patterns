package pattern.stratergy;

import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		
		Vector<Vehicle> listOfVehicles = new Vector<>(); 
		
		Vehicle A345 = new Airplane();
		Vehicle i20 = new Car();
		
		A345.setCategory("Flight");
		A345.setBrand("GoAir");
		A345.setTopSpeed(600);
		A345.setPrice(120000000);
		
		i20.setCategory("Car");
		i20.setBrand("Hyundai");
		i20.setTopSpeed(180);
		i20.setPrice(600000);
		
		listOfVehicles.add(A345);
		listOfVehicles.add(i20);
		
		System.out.println("List of vehicles :");
		
		for(Vehicle v : listOfVehicles) {
			System.out.println("");
			System.out.println("Category : " + v.getCategory());
			System.out.println("Brand : " + v.getBrand());
			System.out.println("Top Speed : " + v.getTopSpeed());
			System.out.println("Price : " + v.getPrice());
			System.out.println("Can you Fly ? : " + v.tryToFly());
		}
		
	}

}
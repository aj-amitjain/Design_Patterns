package pattern.stratergy;

public class Car extends Vehicle{

	public Car() {
		super();
		setCategory("Car");
		
		flytype = new itCantFly();
	}
	
}

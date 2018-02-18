package decorator;

public class Dell implements Laptop{

	/* Taking base model of Dell */
	public Dell() {
		System.out.println("Modifying Dell Laptop...");
	}
	
	@Override
	public String getDescription() {
		return "Model : Dell 509" ;
	}

	@Override
	public double getCost() {
		return 150;
	}

}

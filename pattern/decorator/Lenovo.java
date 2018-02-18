package decorator;

public class Lenovo implements Laptop{

	/* Taking base model of Lenovo */
	public Lenovo() {
		System.out.println("Modifying Lenovo Laptop...");
	}
	
	@Override
	public String getDescription() {
		return "Model : Lenovo 388";
	}

	@Override
	public double getCost() {
		return 140;
	}


}


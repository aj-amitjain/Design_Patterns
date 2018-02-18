package decorator;

public class DellDecorator implements Laptop{

	Laptop dell = null;
	
	public DellDecorator(Laptop newDell) {
		dell = newDell;
	}
		
	@Override
	public String getDescription() {
		return dell.getDescription();
	}
	
	@Override
	public double getCost() {
		return dell.getCost();
	}
}

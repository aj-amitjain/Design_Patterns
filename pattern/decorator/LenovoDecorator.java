package decorator;

public class LenovoDecorator implements Laptop{

	Laptop lenovo = null;
	
	public LenovoDecorator(Laptop newLenovo) {
		lenovo = newLenovo;
	}
		
	@Override
	public String getDescription() {
		return lenovo.getDescription();
	}
	
	@Override
	public double getCost() {
		return lenovo.getCost();
	}
}

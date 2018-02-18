package builder;

public class PepperPaneer implements PizzaBuilder{

	Pizza pizza = null;
	
	public PepperPaneer() {
		pizza = new Pizza();
	}
	
	@Override
	public void buildBase() {
		pizza.setBase("Soft Bread");
		
	}

	@Override
	public void buildCheese() {
		pizza.setCheese("Liquid Cheese");
		
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("Tomato Sauce");
		
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("Pepper & Paneer");
		
	}

	@Override
	public Pizza getPizza() {
		return pizza;
	}

}

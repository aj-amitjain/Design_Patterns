package builder;

public interface PizzaBuilder {
	
	public void buildBase();
	public void buildCheese();
	public void buildSauce();
	public void buildTopping();
	public Pizza getPizza();
	

}

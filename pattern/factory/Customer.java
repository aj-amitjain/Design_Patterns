package factory;

public class Customer {

	private String name;
	
	public Customer(String name ) {
		this.setName(name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		DrinkFactory DF = new DrinkFactory();
		Customer C1 = new Customer("Mr.Harry");
		Customer C2 = new Customer("Ms.Mary");
		
		/* Customer One */
		Drink C1_D = DF.orderDrink("Cold Drink", "M");
		if(C1_D != null) {
			C1_D.getDrink(C1.getName());
		}
		
		
		/* Customer One */
		Drink C2_D = DF.orderDrink("Juice", "L");
		if(C2_D != null) {
			C2_D.getDrink(C2.getName());
		}
		
	}
}

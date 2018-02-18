package builder;

public class OrderPizza {

	public static void main(String[] args) {
		
		PizzaMaker pM = new PizzaMaker();
		pM.makePizza();
		
		System.out.println("Here is your Pizza with :" 
								+ pM.pizza.getBase() + ", "
								+ pM.pizza.getCheese() + ", "
								+ pM.pizza.getSauce() + ", "
								+pM.pizza.getTopping());

	}

}

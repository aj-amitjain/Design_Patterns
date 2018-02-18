package factory;

public class DrinkFactory {

	private Drink d = null;
	
	public Drink orderDrink(String DrinkName, String Size) {
		
		if(DrinkName == "Juice") {
			d  = new Juice(Size);
		} else if(DrinkName == "Cold Drink") {
			d  = new ColdDrink(Size);
		} else {
			System.out.println("Sorry!! We don't offer " + DrinkName);
		}
		
		return d;
	}
	
}

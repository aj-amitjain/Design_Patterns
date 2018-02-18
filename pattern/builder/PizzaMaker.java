package builder;


public class PizzaMaker {

	PepperPaneer pP = new PepperPaneer();
	Pizza pizza  = pP.getPizza();
	
	public void makePizza() {
		pP.buildBase();
		pP.buildCheese();
		pP.buildSauce(); 
		pP.buildTopping();
	}
	
	
}

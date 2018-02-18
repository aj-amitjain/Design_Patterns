package factory;

public class ColdDrink extends Drink {

	public ColdDrink(String Size) {
		setName("Coca Cola");
		
		if (Size == "R") {
			setSize("REGULAR");
		} else if (Size == "M") {
			setSize("MEDIUM");
		} else if (Size == "L"){
			setSize("LARGE");
		}
	}
	
	@Override
	public void getDrink(String CustomerName) {
		System.out.println("Here is your " + "\""+  getName() + "\"" + " " + CustomerName + " " + getSize() + " size as you asked");
	}

}

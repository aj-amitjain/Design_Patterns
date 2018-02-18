package factory;

public class Juice extends Drink{

	public Juice(String Size) {
		setName("Apple Juice");
		
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

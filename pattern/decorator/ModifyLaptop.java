package decorator;

public class ModifyLaptop {

	public static void main(String[] args) {
		Laptop newDell = new SixGBRAM(new OneTB(new DellDecorator(new Dell())));
		System.out.println("Description :" + newDell.getDescription());
		System.out.println("Cost :" + newDell.getCost());
		
		System.out.println("\n");
		
		Laptop newLenovo = new EightGBRAM(new HalfTB(new LenovoDecorator(new Lenovo())));
		System.out.println("Description :" + newLenovo.getDescription());
		System.out.println("Cost :" + newLenovo.getCost());		
		
		
		
	}
}

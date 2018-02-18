package decorator;

public class SixGBRAM implements RAM{

	Laptop laptop;
	
	public SixGBRAM(Laptop laptopDeco) {
		laptop = laptopDeco;
	}
	
	@Override
	public String getDescription() {
		return laptop.getDescription() + "\nAdding RAM : " + getRAM();
		
	}

	@Override
	public double getCost() {
		return laptop.getCost() + 40.00;
	}

	@Override
	public String getRAM() {
		
		return "6 GB";
	}

}

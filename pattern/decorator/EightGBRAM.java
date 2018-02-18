package decorator;

public class EightGBRAM implements RAM{

	Laptop laptop;
	
	public EightGBRAM(Laptop laptopDeco) {
		laptop = laptopDeco;
	}
	
	@Override
	public String  getDescription() {
		return laptop.getDescription()  + "\nAdding RAM : " + getRAM();
		
	}

	@Override
	public double getCost() {
		return laptop.getCost() + 60.20;
	}

	@Override
	public String getRAM() {
		return "8 GB";
	}

	
}

package decorator;

public class HalfTB implements HardDisk{
	
	Laptop laptop;
	
	public HalfTB(Laptop laptopDeco) {
		laptop = laptopDeco;
	}
	
	@Override
	public String getStorage() {
		return "1 TB";
		
	}

	@Override
	public String getDescription() {
		return laptop.getDescription() + "\nAdding Storage :" + getStorage();
		
	}

	@Override
	public double getCost() {
		return laptop.getCost() + 90.80;
	}
}
